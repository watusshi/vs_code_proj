import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ZodiacSign_Experimental {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) throws Exception {
        String RED = "\u001B[31m";
        String WHITE = "\u001B[0m";
        String YELLOW = "\u001B[33m";

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        int month, day, year;
        boolean result;
        String zodiac;
        String name;
        

        Scanner userinput = new Scanner(System.in);

        System.out.print(YELLOW+"Compiling success! Program is now running...\n"+WHITE);
        
        System.out.print(YELLOW+"Please enter your name or q to quit: "+WHITE);
        name = userinput.nextLine();
        if ("q".equals(name)) 
        {   
            System.out.println(YELLOW+"Thank you!"+WHITE);
            System.exit(0);
        }
    
        else
        {
        System.out.print(YELLOW+name+", Please enter the month of your birthday: "+WHITE);
        month = userinput.nextInt();

        System.out.print(YELLOW+name+", Please enter the day of your birthday: "+WHITE);
        day = userinput.nextInt();

        System.out.print(YELLOW+name+", Please enter the year of your birthday: "+WHITE);
        year = userinput.nextInt();
        int age = 2020 - year;

        switch (month) 
        {
            case 1: zodiac = (day <= 19) ? "Capricon" : "Aquarius";
                break;
            case 2: zodiac = (day <= 18) ? "Aquarius" : "Pisces";
                break;
            case 3: zodiac = (day <= 20) ? "Pisces" : "Aries";
                break;
            case 4: zodiac = (day <= 19) ? "Aries" : "Taurus";
                break;
            case 5: zodiac = (day <= 20) ? "Taurus" : "Gemini";
                break;
            case 6: zodiac = (day <= 20) ? "Gemini" : "Cancer";
                break;
            case 7: zodiac = (day <= 22) ? "Cancer" : "Leo";
                break;
            case 8: zodiac = (day <= 22) ? "Leo" : "Virgo";
                break;
            case 9: zodiac = (day <= 22) ? "Virgo" : "Libra";
                break;
            case 10: zodiac = (day <= 22) ? "Libra" : "Scorpio";
                break;
            case 11: zodiac = (day <= 21) ? "Scorpio" : "Sagittarius";
                break;
            case 12: zodiac = (day <= 21) ? "Sagittarius" : "Capricon";
                break;
            default: zodiac = "Check your typo! The value you entered"+
                " wasn't quiet understood by our system!";
        }
        
        System.out.println("You're "+age);
        System.out.println(YELLOW+"\nYou're "+RED +zodiac+YELLOW);

        if (zodiac == "Capricon")
        {System.out.print("Strengths: Responsible, disciplined, self-control, good managers\n"+
            "Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n");}
        else if (zodiac == "Aquarius")
        {System.out.print("Strengths: Progressive, original, independent, humanitarian\n"+
            "Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof");}
        else if (zodiac == "Pisces")
        {System.out.print("Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n"+
            "Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n");}
        else if (zodiac == "Aries")
        {System.out.print("Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n"+
            "Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n");}
        else if (zodiac == "Taurus")
        {System.out.print("Strengths: Reliable, patient, practical, devoted, responsible, stable\n"+
            "Weaknesses: Stubborn, possessive, uncompromising\n");}
        else if (zodiac == "Gemini")
        {System.out.print("Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n"+
            "Weaknesses: Nervous, inconsistent, indecisive\n");}
        else if (zodiac == "Cancer")
        {System.out.print("Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n"+
            "Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n");}
        else if (zodiac == "Leo")
        {System.out.print("Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n"+
            "Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n");}
        else if (zodiac == "Virgo")
        {System.out.print("Strengths: Loyal, analytical, kind, hardworking, practical\n"+
            "Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n");}
        else if (zodiac == "Libra")
        {System.out.print("Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n"+
            "Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n");}
        else if (zodiac == "Scorpio")
        {System.out.print("Strengths: Resourceful, brave, passionate, stubborn, a true friend\n"+
            "Weaknesses: Distrusting, jealous, secretive, violent\n");}
        else if (zodiac == "Sagittarius")
        {System.out.print("Strengths: Generous, idealistic, great sense of humor\n"+
            "Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n");}

        System.out.println("\nThank you "+RED+name+YELLOW+", hope you enjoy your zodiac signs!");
        }
    }
}
