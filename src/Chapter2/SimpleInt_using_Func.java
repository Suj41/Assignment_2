package Chapter2;
import java.util.Scanner;
public class SimpleInt_using_Func {
    public static void main(String[] args) {
        Scanner Saag = new Scanner(System.in);
        System.out.println("Principle: Rs.");
        float principle= Saag.nextFloat();
        System.out.println("Time :");
        float time= Saag.nextInt();
        System.out.println("Rate :");
        float rate= Saag.nextFloat();
        float result=simpleInterest(principle,time, rate);
        System.out.println("Simple Interest is Rs."+ result);

    }
    public static float simpleInterest(float principle, float time, float rate)
    {
        return principle*time*rate/100;
    }
}
