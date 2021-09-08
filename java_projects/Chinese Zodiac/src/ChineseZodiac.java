import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChineseZodiac {
  
  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

  public static void main(String[] args) throws Exception {
    String YELLOW = "\u001B[33m";
    String WHITE = "\u001B[0m";
    LocalDateTime now = LocalDateTime.now();
    System.out.println(YELLOW+ dtf.format(now)+ WHITE);
    
    
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter your birth year: ");
    int remainder = input.nextInt();
    int zodiac = remainder % 12;
    int age = (2020 - remainder);
    System.out.print("You're "+age+" years old!\n");

    String animal = null;

    switch (zodiac) 
    {
      case (0): animal = "Monkey";
        break;
      case (1): animal = "Rooster";
        break;
      case (2): animal = "Dog";
        break;
      case (3): animal = "Pig";
        break;
      case (4): animal = "Rat";
        break;
      case (5): animal = "Ox";
        break;
      case (6): animal = "Tiger";
        break;
      case (7): animal = "Rabbit";
        break;
      case (8): animal = "Dragon";
        break;
      case (9): animal = "Snake";
        break;
      case (10): animal = "Horse";
        break;
      case (11): animal = "Ram";
        break;
    }
    System.out.println("You are the year of the " + animal);
    System.out.println("Thank you, hope you like your Zodiac animal!");
       }
}