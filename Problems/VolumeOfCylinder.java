package Problems;

public class VolumeOfCylinder {
    public static double volumeOfCylender(double radius, double height){
        return Math.PI * radius * radius * height;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter radius of cylender: ");
        double radius = Double.parseDouble(br.readLine());
        System.out.println("Enter height of cylender: ");
        double height = Double.parseDouble(br.readLine());
        double volume = volumeOfCylender(radius, height);
        System.out.println("Volume of cylender with radius " + radius + " and height " + height + " is " + volume);
    }
    
}
