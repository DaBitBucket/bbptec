import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class WordGen {

	public static void main(String[] args) {
		Scanner dataIn = new Scanner(System.in);
		String filename = "";
		String currWord = "";
		String prevWord = "";
		int length = 0;
		HashMap<String, HashSet<String>> db = new HashMap<String, HashSet<String>>();
		Random rand = new Random(System.currentTimeMillis());

		System.out.print("Enter filename: ");
		filename = dataIn.nextLine();

		try {
			dataIn = new Scanner(new File(filename));
			dataIn.useDelimiter("\\W+");
		} catch (FileNotFoundException e) {
			System.out.println("Could not file specified file.");
			System.exit(-1);
		}

		if(dataIn.hasNext()) {
			prevWord = dataIn.next();
			db.put(prevWord, new HashSet<String>());
		}

		while(dataIn.hasNext()) {
			currWord = dataIn.next();
			if(!db.containsKey(currWord)) {
				db.put(currWord, new HashSet<String>());
			}
			db.get(prevWord).add(currWord);
			prevWord = currWord;
		}

		dataIn = new Scanner(System.in);
		System.out.print("Enter sentence length: ");
		length = dataIn.nextInt();

		prevWord = (String) db.keySet().toArray()[rand.nextInt(db.keySet().size())];
		System.out.print("\n" + prevWord.substring(0, 1).toUpperCase() + prevWord.substring(1));

		for(int i = 0; i < length; i++) {
			if(db.get(prevWord).size() < 1) {
				i--;
				continue;
			}
			currWord = (String) db.get(prevWord).toArray()[rand.nextInt(db.get(prevWord).size())];
			System.out.print(" " + currWord.toLowerCase());
			prevWord = currWord;
		}
		System.out.println(".");
	}
}
