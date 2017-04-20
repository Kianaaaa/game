import java.util.*;
import java.io.*;

public class Collect2{
	public static void main(String []args){
		HashSet<String>dictionary = new HashSet<String>();
		try{
			Scanner inFile = new Scanner(new BufferedReader(new FileReader("dictionary.txt")));	
	 		while(inFile.hasNext()){
				dictionary.add(inFile.next());
			}
			inFile.close();

			for(String w: args){
				if(!dictionary.contains(w.toLowerCase())){
					System.out.println(w);
				}
			}
		}
		catch(IOException ex){
			System.out.println("Now, where did I put that darned file?");
		}
	}

}
