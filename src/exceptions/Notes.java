package exceptions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Notes {

    public static void main(String[] args) {
    	Scanner sc;
    	try {
    		sc = new Scanner(Paths.get("file.txt"));
    		while(sc.hasNextLine());{
    			System.out.println(sc.nextLine() + " ");
    		}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}