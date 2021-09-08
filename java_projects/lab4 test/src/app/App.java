package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String shDataLn = "";
        String lName = "";
        String fName = "";
        String shName = "";
        int cYr = 0;
        int mYr = 0;
        File shData = new File("D:\\DOWNLOADS\\SuperheroDataApr2020.txt");
        Scanner inFile = new Scanner(System.in);
        try
        {
            inFile = new Scanner(shData);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("No input file found");
        }
        Scanner inshLn = new Scanner(System.in);
        // Reading data from a file
        // one line at a time 
        // by data type
        // as strings with conversion
        int count = 1;
        String temp = "";
        Pattern origDelim;
        while (inFile.hasNext())
        {
            shDataLn = inFile.nextLine();
            inshLn = new Scanner(shDataLn);
            System.out.println("\nLine "+ count++ + " : "+shDataLn);
            inshLn.useDelimiter(",");  // stop when you reach a comma
            lName = inshLn.next();   //  .next() reads ONE word
            //System.out.println("lName read *"+lName+"*");
            inshLn.reset();
            temp = inshLn.next();   // reads the comma out of the file           
            //origDelim = inFile.delimiter();
            inshLn.useDelimiter("[:!]"); // stop when you reach a colon
            fName = inshLn.next();
            inshLn.reset();
            //inFile.useDelimiter(origDelim);
            temp = inshLn.next();   // reads the colon
            inshLn.useDelimiter("[0-9]");  // stop when reach a digit
            shName = inshLn.next();  // to solve problem when there are 2 words
            inshLn.reset();
            temp = inshLn.next();  // check to see if this is cYr
            try
            {
                cYr = Integer.parseInt(temp);
            }
            catch (NumberFormatException nfe)
            {
                cYr = 0;
            }
            temp = inshLn.next();  // check to see if this is cYr
            try
            {
                mYr = Integer.parseInt(temp);
            }
            catch (NumberFormatException nfe)
            {
                mYr = 0;
            }
            /*
            try
            {
                cYr = inshLn.nextInt();
                mYr = inshLn.nextInt();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("ERROR: Invalid integer data in file ");
                temp = inshLn.next();
                cYr = 0;
                mYr = 0;
            }
            */
            System.out.println("Last: "+lName);
            System.out.println("First: "+fName+"*");
            System.out.println("Superhero: "+shName);
            System.out.println("Comic: "+cYr);
            System.out.println("Movie: "+mYr);
        }
    }
}
