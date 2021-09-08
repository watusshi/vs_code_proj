package app;

import java.util.Scanner;

public class Thai {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi mate, May I know your name please?");
        Scanner macbook = new Scanner(System.in);
        String supreme = macbook.nextLine();
        if ("Thai".equals(supreme))
        {System.out.println("Yup, the true god is here!");}
        else if ("Izzy".equals(supreme) || "Sammie".equals(supreme) || "JJ".equals(supreme))
        {System.out.println("Thank you, that's a nice name!");}
        else
        {System.out.println("Who invited this fucker?");
        while(true){
            System.out.println("Moving on, May I know your name please?");
            Scanner iphone = new Scanner(System.in);
            String anti = iphone.nextLine();
            if ("Thai".equals(anti))
            {System.out.println("Yup, the true god is here!"); break;}
            else if ("Izzy".equals(anti) || "Sammie".equals(anti) || "JJ".equals(anti))
            {System.out.println("Thank you, that's nice name!"); break;}
            else
            {System.out.print("Who invited this fucker?\n");}
            }
        }  
    }
}