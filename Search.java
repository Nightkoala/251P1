/**
* Search.java
*
* @author Derek Brown <djb3718@rit.edu>
*
* Basic thread program.  Takes in a sequence of files and words to search for. 
* One group of threads reads the files and flags any found words, another group
* of threads will then print the word and which file it was found in.
*/
import java.util.ArrayList;

public class Search {

//	private String[] files;
//	private String[] words;

	/** prevent construction */
	private Search() {}
	
	public static void main(String[] args) {

		usage( args );

		String[] files = args[0].split(",");
		String[] words = args[1].split(",");
		for( String file : files ) {
			System.out.println(file);
		}//end for
		for( String word : words ) {
			System.out.println(word);
		}//end for
	}//end main

	private static void usage(String[] args) {
		if( args.length != 2 ) {
			System.err.println("Usage: java Search <files> " +
				"<words");
			System.exit(1);
		}//end if
	}//end error message
}//end search
