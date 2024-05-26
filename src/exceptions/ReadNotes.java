package exceptions;

import java.io.IOException; 
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadNotes {

	public void readNotes() {
		
	}
	
    public static void main(String[] args) {
    	Scanner sc;
    	try {
    		sc = new Scanner(Paths.get("TestNotes.txt"));
    		while(sc.hasNextLine());{
    			System.out.println(sc.nextLine() + " ");
    		}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}