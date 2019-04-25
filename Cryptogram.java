package crypto;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Cryptogram {
	String[][] alphabet = new String[26][2];
	ArrayList<String> dict = new ArrayList<String>();
	Cryptogram() {
		char[] alphabet2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0; i<alphabet.length ; i++) {
			alphabet[i][0] = String.valueOf(alphabet2[i]);
		}
		/*
		for(int i = 0; i<alphabet.length ; i++) {
			System.out.print(alphabet[i][0] + " ");
		}
		*/
	}
	public static void main(String [] args) {
		Cryptogram cry = new Cryptogram();
		Scanner sc  = new Scanner(System.in).useDelimiter("\\n");
		String in = sc.next();
		/*
		while((in = sc.next()) != null) {
			input += in;
		}
		*/
		sc.close();
		String[] split;
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"));
			String line = "";
			while((line = reader.readLine()) != null) {
				//System.out.println(line);
				cry.dict.add(line);
			}
			System.out.println(in);
		}
		catch(Exception e) {
			System.err.format("Exception occurred trying to read'%s'.", "dictionary.txt");
	        e.printStackTrace();
		}
		System.out.println(cry.dict);
	}
}
