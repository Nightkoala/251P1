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
import java.util.concurrent.Semaphore;
import java.util.AbstractQueue;
import java.io.*;

public class Search {

//	private String[] files;
//	private String[] words;

	private static class group1Thread implements Runnable {
	
	}//end group1

	private static class group2Thread implements Runnable {
		private String fname;
		private AbstractQueue sharedQueue;
		private Semaphore semaphore;

		public group2Thread(String fname, AbstractQueue queue, 
			Semaphore semaphore) {
			this.fname = fname;
			this.sharedQueue = queue;
			this.semaphore = semaphore;
		}//end group2Thread constructor

		public getFname() { return this.fname; }
		public getSharedQueue() { return this.sharedQueue }


	}//end group2

	/** prevent construction */
	private Search() {}
	
	public static void main(String[] args) {

		usage( args );

		String[] files = args[0].split(",");
		String[] words = args[1].split(",");
		for( String file : files ) {
			System.out.println(file);
		}//end for
		ArrayList<String> newWords = new ArrayList();
		for( String word : words ) {
			String temp = word.toLowerCase();
			newWords.add(temp);
		}//end for
		for( String word : newWords ) {
			System.out.println(word);
		}//end for
	}//end main

	private static void usage(String[] args) {
		if( args.length != 2 ) {
			System.err.println("Usage: java Search <files> " +
				"<words");
			System.exit(1);
		}//end if
	}//end usage
}//end search
