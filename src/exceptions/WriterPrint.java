package exceptions;

import java.io.PrintWriter; 
import java.io.File;
import java.time.LocalDateTime;

public class WriterPrint {
	
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new File("datum.txt"), "UTF-8")) {
            writer.println(LocalDateTime.now());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}