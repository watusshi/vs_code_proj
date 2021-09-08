package app;
import java.util.EventListener;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while(true)
        {
        System.out.println("What is your name?\n");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if("Thai".equals(name))
        {
            System.out.println("hello Sir. How are you today?\n");
        }

        else if("Sammie".equals(name))
        {
            System.out.println("Uh oh, a minority");
        }
        else if("JJ".equals(name))
        {
            System.out.println("JJ is overlord and super hot lmao");
        }
        else
        {
            System.out.println("Who invited this clown?");
        }
    }

    }
}