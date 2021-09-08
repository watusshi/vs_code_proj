package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String pp="";
       double n1,n2;
       try {
           File file = new File("D:\\SCHOOL\\UTA\\Spring 2020\\CSE 1310\\NETBEANS PROJECTS\\Lab4LaiT\\USCOVID19Data.txt");
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine())
               System.out.println(sc.nextLine());
       }
       catch (FileNotFoundException e) {
           System.out.println("The file does not exist");
       }
    }
}