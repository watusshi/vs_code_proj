import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> binary = new ArrayList<String>();
		
		System.out.println("Enter a decimal number: ");
		number = sc.nextInt();				
		
		while(number != 0){
			binary.add(String.valueOf(number%2));
			number /= 2;
		}
		
		Collections.reverse(binary);
		System.out.print("Binary number is ");
		
		for(String s : binary){
			System.out.print(s);
		}
    }
}
