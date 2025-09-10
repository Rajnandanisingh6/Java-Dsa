package Practice_Ques;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        //Celsius → Fahrenheit conversion
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        double celsius=sc.nextDouble();
        // Conversion formula
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
    }
    
}
