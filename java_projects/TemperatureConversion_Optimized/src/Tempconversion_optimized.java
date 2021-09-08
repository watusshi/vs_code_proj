import java.util.Scanner;

public class Tempconversion_optimized {
    public static void main(String[] args) throws Exception {
        int UserChoiceAnswer;
        double UserTemperature;
        Scanner UserChoice, TemperatureValue, askforname;
        String UserName;
        
        System.out.println("Hiya! May I have your name please?");
        askforname = new Scanner(System.in);
        UserName = askforname.nextLine();
        System.out.println("\nThank you " +UserName+ "!\n");

        System.out.print("How can I help you today?\n\n"+
        "Type 1 for Farenheit -> Celsius\n"+
        "Type 2 for Farenheit -> Kelvin\n"+
        "Type 3 for Celsius -> Farenheit\n"+
        "Type 4 for Celsius -> Kelvin\n"+
        "Type 5 for Kelvin -> Celsius\n"+
        "Type 6 for Kelvin -> Farenheit\n\n"+
        "Your choice is ");
        UserChoice = new Scanner(System.in);
        UserChoiceAnswer = UserChoice.nextInt();

        if (UserChoiceAnswer == 1 || UserChoiceAnswer == 2 || UserChoiceAnswer == 3 || 
        UserChoiceAnswer == 4 || UserChoiceAnswer == 5 || UserChoiceAnswer == 6)
        {System.out.print("\nPlease enter your temperature (without the unit): ");
        TemperatureValue = new Scanner(System.in);
        UserTemperature = TemperatureValue.nextDouble();

        double answer = 0;

        switch (UserChoiceAnswer) {
            case 1: answer = ((UserTemperature - 32)/1.8);
                break;
            case 2: answer = (((UserTemperature - 32)/1.8)+273);
                break;
            case 3: answer = ((UserTemperature * 1.8)+32);
                break;
            case 4: answer = (UserTemperature + 273);
                break;
            case 5: answer = (UserTemperature - 273);
                break;
            case 6: answer = (((UserTemperature - 273)*1.8)+32);
                break;}
        System.out.println("The new temperature is "+answer);
        }
        else
            System.out.println("ERROR! There's a typo in choice selection (WATCH YOUR FINGERS)!");
    }
}

