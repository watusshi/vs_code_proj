package app;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ZodiacSign {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) throws Exception {
        String RED = "\u001B[31m";
        String WHITE = "\u001B[0m";
        String YELLOW = "\u001B[33m";
        LocalDateTime now = LocalDateTime.now();
        System.out.println(YELLOW+ dtf.format(now));
        
        System.out.print(YELLOW+ "Hi there! May I know your name please?\n" +WHITE);
        Scanner username = new Scanner(System.in);
        String name = username.nextLine();
        System.out.print("Welcome "+name+"!\n");

        System.out.print(YELLOW+ "Do you want to know your Zodiac Signs today?\n" +WHITE);
        Scanner YESNO = new Scanner(System.in);
        String YESNOANSWER = YESNO.nextLine();
        while ("yes".equals(YESNOANSWER) || "Yes".equals(YESNOANSWER))
        {
        System.out.print(YELLOW+"Hi "+name+", Please enter your birthday for Zodiac Signs!"+ 
                    " (Ex: 525 for birthday on May 25th)\n"+WHITE);
        Scanner userInput = new Scanner(System.in);
        int Zodiac = userInput.nextInt();
        if (101 <= Zodiac && Zodiac <= 119 || 1222 <= Zodiac && Zodiac <= 1231)
        {System.out.print(YELLOW+ "You're Capricon!\n"+ 
        "Your strengths are responsible, disciplined, self-control, good managers\n"+ 
        "Your weaknesses are know-it-all, unforgiving, condescending, expecting the worst\n"+ WHITE);}
        else if (120 <= Zodiac && Zodiac <= 131 || 201 <= Zodiac && Zodiac <= 218)
        {System.out.print(YELLOW+ "You're Aquarius!\n"+ 
        "Your strengths are rogressive, original, independent, humanitarian\n"+ 
        "Your weaknesses are runs from emotional expression, temperamental, uncompromising, aloof\n"+ WHITE);}
        else if (219 <= Zodiac && Zodiac <= 229 || 301 <= Zodiac && Zodiac <= 320)
        {System.out.print(YELLOW+ "You're Pisces!\n"+ 
        "Your strengths are compassionate, artistic, intuitive, gentle, wise, musical\n"+
        "Your weakknesses are fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n"+ WHITE);}
        else if (321 <= Zodiac && Zodiac <= 331 || 401 <= Zodiac && Zodiac <= 419)
        {System.out.print(YELLOW+ "You're Aries!\n"+ 
        "Your strengths are ourageous, determined, confident, enthusiastic, "+ 
        "optimistic, honest, passionate\n"+ 
        "Your weaknesses are mpatient, moody, short-tempered, impulsive, aggressive\n"+ WHITE);}
        else if (420 <= Zodiac && Zodiac <= 430 || 501 <= Zodiac && Zodiac <= 520)
        {System.out.print(YELLOW+ "You're Taurus!\n"+ 
        "Your strengths are reliable, patient, practical, devoted, "+ 
        "responsible, stable\n"+ "Your weaknesses are stubborn, possessive, uncompromising\n"+ WHITE);}
        else if (521 <= Zodiac && Zodiac <= 531 || 601 <= Zodiac && Zodiac <= 620)
        {System.out.print(YELLOW+ "You're Gemini!\n"+ 
        "Your strengths are gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n"+
        "Your weaknesses are nervous, inconsistent, indecisive\n"+ WHITE);}
        else if (621 <= Zodiac && Zodiac <= 630 || 701 <= Zodiac && Zodiac <= 722)
        {System.out.print(YELLOW+ "You're Cancer!\n"+ 
        "Your strengths are tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n"+
        "Your weaknesses are moody, pessimistic, suspicious, manipulative, insecure\n"+ WHITE);}
        else if (723 <= Zodiac && Zodiac <= 731 || 801 <= Zodiac && Zodiac <= 822)
        {System.out.print(YELLOW+ "You're Leo!\n"+
        "Your strengths are creative, passionate, generous, warm-hearted, cheerful, humorous\n"+
        "Your weaknesses are arrogant, stubborn, self-centered, lazy, inflexible\n"+ WHITE);}
        else if (823 <= Zodiac && Zodiac <= 831 || 901 <= Zodiac && Zodiac <= 922)
        {System.out.print(YELLOW+ "You're Virgo!\n"+
        "Your strengths are loyal, analytical, kind, hardworking, practical\n"+
        "Your weaknesses are shyness, worry, overly critical of self and others, all work and no play\n"+ WHITE);}
        else if (923 <= Zodiac && Zodiac <= 930 || 1001 <= Zodiac && Zodiac <= 1022)
        {System.out.print(YELLOW+ "You're Libra!\n"+
        "Your strengths are cooperative,diplomatic, gracious, fair-minded, social\n"+
        "Your weaknesses are indecisive, avoids confrontations, will carry a grudge, self-pity\n"+ WHITE);}
        else if (1023 <= Zodiac && Zodiac <= 1031 || 1101 <= Zodiac && Zodiac <= 1121)
        {System.out.print(YELLOW+ "You're Scorpio!\n"+
        "Your strengths are resourceful, brave, passionate, stubborn, a true friend\n"+
        "Your weaknesses are distrusting, jealous, secretive, violent\n"+ WHITE);}
        else if (1122 <= Zodiac && Zodiac <= 1130 || 1201 <= Zodiac && Zodiac <= 1221)
        {System.out.print(YELLOW+ "You're Sagittarius!\n"+
        "Your strengths are generous, idealistic, great sense of humor\n"+
        "Your weaknesses are promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n"+ WHITE);}
        else
        {System.out.print(RED +"Error Invalid Birthday\n"+ 
        "Please check if there's any error and re-type your birthday based on the given format!\n"+ 
        "EX: 308 for birthday on March 8th\n"+ WHITE);}
        
        System.out.println(YELLOW+ "Thank you for playing!"+ WHITE); break;
        } 
    }
}