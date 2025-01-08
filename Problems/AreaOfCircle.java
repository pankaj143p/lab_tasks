package Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AreaOfCircle {
    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius of circle: ");
        double radius = Double.parseDouble(br.readLine());
        double area = areaOfCircle(radius);
        System.out.println("Area of circle with radius " + radius + " is " + area);
    }
    
}
