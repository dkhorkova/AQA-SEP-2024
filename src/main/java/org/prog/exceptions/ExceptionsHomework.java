package org.prog.exceptions;
import java.io.File;
import java.io. FileNotFoundException;
import java.io.FileReader;
import java.io. IOException;
import java.io.LineNumberReader;

//TODO: write method that will count text file lines and print it (put it in separate method)
// (you can use ChatGPT to generate this part)
// Trasnform FileNotFoundException into RuntimeException
// Catch this exception in main method call this method once for existing file
// second time for non-existing file
// print "YAY!" after file reading is done

public class ExceptionsHomework {


    public static void main(String[] args) throws IOException  {

        File file = new File("C:/Users/ljudmila/Documents/08.10.docx");
        FileReader fr = new FileReader(file);
        LineNumberReader lr = new LineNumberReader(fr);
        int lineNumberCount = 0;
        try {
            while (lr.readLine() != null) {
                lineNumberCount++;
            }
            System.out.println("Total lines in a file"  +  lineNumberCount);

        } catch ( FileNotFoundException  e) {
            throw new RuntimeException (e);

        }
        System.out.println ("Yay");
    }
}