import java.util.Scanner;

public class UnitConversion 
{
    public static void main(String[] args) throws Exception 
    {
        int choice; 
        double mass, area, force, length, temp; 
        double volume, time, pressure, power, energy;

        Scanner userinput = new Scanner(System.in);
        
        System.out.println("--- Unit Conversion Program ---");
        System.out.print(
            "Type 1 for mass\n"+
            "Type 2 for area\n"+
            "Type 3 for force\n"+
            "Type 4 for length\n"+
            "Type 5 for temp\n"+
            "Type 6 for volume\n"+
            "Type 7 for time\n"+
            "Type 8 for power\n"+
            "Type 9 for energy\n"+
            "Input: ");
        choice = userinput.nextInt();
        
        double answer = 0;
        
        switch (choice) 
        {
            case 1:
            System.out.print("\nConverting kg -> lb-mass: ");
            mass = userinput.nextDouble();
            answer = mass * 2.205;
            
            case 2:
            System.out.print("\nArea Conversion\n"+
                "Type 1 for acre -> m3\n"+
                "Type 2 for acre -> ft3\n"+
                "Type 3 for acre -> mi3\n"+
                "Input: ");
            int areachoice = userinput.nextInt();
            System.out.print("Value input: ");
            area = userinput.nextDouble();
            if (areachoice == 1) 
            {
                answer = area * 4047;
            }
            else if (areachoice == 2)
            {
                answer = area * 43560;
            }
            else if (areachoice == 2)
            {
                answer = area * 0.00156;
            }

            case 3:
            System.out.print("\nConverting N -> lb-force: ");
            force = userinput.nextDouble();
            answer = force * 0.225;
            
            case 4:
            System.out.print("\nLength Conversion\n"+
                "Type 1 for m -> ft\n"+
                "Type 2 for m -> mi\n"+
                "Type 3 for m -> inch\n"+
                
                "\nType 4 for km -> ft\n"+
                "Type 5 for km -> mi\n"+
                "Type 6 for km -> inch\n"+
                
                "\nType 7 for inch -> km\n"+
                "Type 8 for inch -> m\n"+
                "Type 9 for inch -> ft\n"+
                "Type 10 for inch -> mi\n"+
                
                "\nType 11 for mi -> km\n"+
                "Type 12 for mi -> m\n"+
                "Type 13 for mi -> ft\n"+
                "Type 14 for mi -> inch\n"+

                "\nType 15 for yd -> km\n"+
                "Type 16 for yd -> m\n"+
                "Type 17 for yd -> ft\n"+
                "Type 18 for yd -> mi\n"+
                "Input: ");
            int lengthchoice = userinput.nextInt();
            System.out.print("Value input: ");
            length = userinput.nextDouble();
            switch (lengthchoice)
            {
                case 1: answer = length * 3.28;
                case 2: answer = (length / 1000) * 0.621;
                case 3: answer = (length * 3.28) / 3;
                case 4: answer = (length * 1000) * 3.28;
                case 5: answer = length * 0.621;
                case 6: answer = (length * 10000) / 2.54;
                case 7: answer = (length * 2.54) / 100000;
                case 8: answer = (length * 2.54) / 100;
                case 9: answer = length / 12;
                case 10: answer = (length / 12) / 5280;
                case 11: answer = length / 0.621;
                case 12: answer = (length / 0.621) * 1000;
                case 13: answer = length * 5280;
                case 14: answer = (length * 5280) * 12;
                case 15: answer = (length * 0.914) / 1000;
                case 16: answer = length * 0.914;
                case 17: answer = length * 3;
                case 18: answer = ((length * 0.914) / 1000) / 1.61;
            }

            case 5: 
            System.out.print("\nTemperature Conversion\n"+
                "Type 1 for Farenheit -> Celsius\n"+
                "Type 2 for Farenheit -> Kelvin\n"+
                "Type 3 for Celsius -> Farenheit\n"+
                "Type 4 for Celsius -> Kelvin\n"+
                "Type 5 for Kelvin -> Celsius\n"+
                "Type 6 for Kelvin -> Farenheit\n\n"+
                "Your choice is ");
            int tempchoice = userinput.nextInt();
            System.out.print("Value input: ");
            temp = userinput.nextDouble();
            switch (tempchoice)
            {
                case 1: answer = ((temp - 32)/1.8);
                case 2: answer = (((temp - 32)/1.8)+273);                
                case 3: answer = ((temp * 1.8)+32);                
                case 4: answer = (temp + 273);                
                case 5: answer = (temp - 273);                
                case 6: answer = (((temp - 273)*1.8)+32);
            }

            case 6:
            System.out.print("\nVolume Conversion\n"+
                "Type 1 for Liter -> Gallon\n"+
                "Type 2 for Liter -> Quart\n"+
                "Type 3 for Gallon -> Quart\n"+
                "Type 4 for Gallon -> Ounces\n"+
                "Type 5 for Quart -> Pints\n"+
                "Type 6 for Cup -> Ounces\n"+
                "Yur choice is ");
            int volumechoice = userinput.nextInt();
            System.out.print("Value input: ");
            volume = userinput.nextDouble();
            switch (volumechoice)
            {
                case 1: answer = volume * 0.264;
                case 2: answer = volume * 1.057;
                case 3: answer = volume * 4;
                case 4: answer = volume * 128;
                case 5: answer = volume * 2;
                case 6: answer = volume * 8;
            }
        }
        System.out.println("Answer: "+answer);
    }
}
