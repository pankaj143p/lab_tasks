package PracticeProblems;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Sum{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[2];
        System.out.println("Enter first number: ");
        inputs[0] = br.readLine();
        System.out.println("Enter second number: ");
        inputs[1] = br.readLine();
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = add(a, b);
        System.out.println("Addition of " + a + " and " + b + " is " + c);
    }
    public static int add(int a, int b){
        return a + b;
    }
}