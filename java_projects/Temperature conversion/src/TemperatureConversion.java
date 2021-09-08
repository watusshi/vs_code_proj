import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) throws Exception {
        System.out.println("Hiya! I'm Jenny, your temperature conversion program!"+
        "\nMay I know your name please: ");
        Scanner askforname = new Scanner(System.in);
        String UserName = askforname.nextLine();
        System.out.println("\nThank you " +UserName+ "!\n");

        System.out.print("How can I help you today?\n\n"+
        "Type 1 for Farenheit -> Celsius\n"+
        "Type 2 for Farenheit -> Kelvin\n"+
        "Type 3 for Celsius -> Farenheit\n"+
        "Type 4 for Celsius -> Kelvin\n"+
        "Type 5 for Kelvin -> Celsius\n"+
        "Type 6 for Kelvin -> Farenheit\n\n"+
        "Your choice is ");
        Scanner UserChoice = new Scanner(System.in);
        double UserChoiceAnswer = UserChoice.nextDouble();
        
        if (UserChoiceAnswer == 1 || UserChoiceAnswer == 2 || UserChoiceAnswer == 3 || 
        UserChoiceAnswer == 4 || UserChoiceAnswer == 5 || UserChoiceAnswer == 6)
        {System.out.print("\nNow next, please insert your temperature without the units "+
        "\nThe temperature is ");
        Scanner TemperatureValue = new Scanner(System.in);
        double UserTemperature = TemperatureValue.nextDouble();
        
        double answer;

        if (UserChoiceAnswer == 1)
        {answer = ((UserTemperature - 32)/1.8);
            System.out.println("The new temperature is "+answer);}
        
        else if (UserChoiceAnswer == 2)
        {answer = (((UserTemperature - 32)/1.8)+273);
            System.out.println("The new temperature is "+answer);}
        
        else if (UserChoiceAnswer == 3)
        {answer = ((UserTemperature * 1.8)+32);
            System.out.println("The new temperature is "+answer);}
        
        else if (UserChoiceAnswer == 4)
        {answer = (UserTemperature + 273);
            System.out.println("The new temperature is "+answer);}
        
        else if (UserChoiceAnswer == 5)
        {answer = (UserTemperature - 273);
            System.out.println("The new temperature is "+answer);}

        else if (UserChoiceAnswer == 6)
        {answer = (((UserTemperature - 273)*1.8)+32);
            System.out.println("The new temperature is "+answer);}
        } 
    }               
}
