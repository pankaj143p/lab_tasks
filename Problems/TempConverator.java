package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TempConverator {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

   public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter temperature in fahrenheit: ");
            try {
                double celsius = Double.parseDouble(br.readLine());
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " fahrenheit is equal to " + fahrenheit  + " celsius");
            } catch (Exception e) {
                System.err.println("Invalid input");
            }
            
   }
}
