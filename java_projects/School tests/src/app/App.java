package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int feb = 28;
        if (((year % 4) == 0) && ((year % 100) != 0)) //assume that year is an integer with a valid year value
        {
                        System.out.println("This is a leap year");
                        feb = 29;
        }

    }
}