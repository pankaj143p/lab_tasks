package SelfProblem;

public class SimpleInterest {
    public static double simpleInterest(double principal, double rate, double time){
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter principal amount: ");
        double principal = Double.parseDouble(br.readLine());
        System.out.println("Enter rate of interest: ");
        double rate = Double.parseDouble(br.readLine());
        System.out.println("Enter time in years: ");
        double time = Double.parseDouble(br.readLine());
        double simpleInterest = simpleInterest(principal, rate, time);
        System.out.println("Simple interest on principal amount " + principal + " with rate of interest " + rate + " and time " + time + " years is " + simpleInterest);
    } 
}
