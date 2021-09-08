package app;

public class App {
    public static void main(String[] args) throws Exception {
        int i1;
        int iFin;
        //int count = 1;
        int repeats = 0;  // Number of digits the user wants
        System.out.println("Hey Netbeans");
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("How many digits should the output have? Choose between 1 and 7 digits:");
        
        // ** What if the user enters a double or a word?
        try   // Exception handling for inputs that are not integers
        {
           repeats = input.nextInt();
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Your input was not an integer");
            System.out.println("Setting your input to 7");
            repeats = 7;
        }
        
        
        // Input is integer but outside valid range
        if ((repeats < 1) || (repeats > 7))
        {
            System.out.println("I'm sorry, your input value is out of range");
            System.out.println("Setting your input to 1");
            repeats = 1;
        }
        */

        for (int i=0; i<=30; i++)
        {        
            repeats = 1;
        i1 = (int) (Math.random()*10);

        System.out.println("The random values are:");
        System.out.println("orig i1 = "+i1);
        iFin = i1;
        
        // ** Repetition structures - while loop, 
        //while (count < repeats)  // ** indefinite loop structure vs. definite loop structure
        for (int c = 1; c < repeats; c++ )
        {
            i1 = (int) (Math.random()*10);
            System.out.println("new i1 in while = "+i1);
            iFin = (iFin * 10)+i1;
            //count++;
        }


            System.out.println("iFin = "+iFin);
            switch (iFin)
            {
                case 5: 
                    System.out.println("Johnny "+iFin+" is alive!");
                    break;
                case 3:
                    System.out.println(iFin+" licks to the center of a Tootsie Pop");
                    break;
                case 7:
                    System.out.println(iFin+"th heaven");
                    break;
                case 1:
                    System.out.println(iFin+" is the loneliest number");
                    break;
                default:
                    System.out.println(iFin+" bottles of beer on the wall");
                    break;
            }      
        }
        // ** Selection structure
        /*
        if (iFin == 66)
            System.out.println("Get your kicks on Route "+iFin);
        else if (iFin == 3)
            System.out.println(iFin+" licks to the center of a Tootsie Pop");      
        else if (iFin == 99)
            System.out.println("Party like it's 19"+iFin);
        else if (iFin == 7)
            System.out.println(iFin+"th heaven");       
        else if (iFin == 5)
            System.out.println("Johnny "+iFin+" is alive!");
        else if (iFin == 16)
            System.out.println("Sweet "+iFin);
        else if (iFin == 1)
            System.out.println(iFin+" is the loneliest number");
        else if (iFin == 30)
            System.out.println(iFin+" hath September");
        else
            System.out.println(iFin+" bottles of beer on the wall");
        */
        
        
        // read input data from a file
        
    }
}