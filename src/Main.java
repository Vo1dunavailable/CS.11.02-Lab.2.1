/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int sum = add(1,2);
        int newsum = newadd(1,2,3,4);
        String Greeting = morningGreeting("Connor");
        String afternoon = afternoonGreeting("Connor");
        String tripleT = triple("Nice");
        double cutinHalf = half(8);
        double roundingUp = roundPositiveValueToNearestInteger(8.7);
        double negativeRnding = roundNegativeValueToNearestInteger(-1.9);
        System.out.println(sum);
        System.out.println(newsum);
        System.out.println(Greeting);
        System.out.println(afternoon);
        System.out.println(tripleT);
        System.out.println(cutinHalf);
        System.out.println(roundingUp);
        System.out.println(negativeRnding);
    }

    // 1. add
    public static int add(int a,int b) {
        return a+b;
    }
    // 2. add
    public static int newadd(int a,int b,int c,int d){
        return add(add(add(a,b),c),d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好" + name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String n){
        return "下午好" + n;
    }
    // 5. triple
    public static String triple(String x){
        return x+x+x;
    }
    // 6. half
    public static double half(double num){
        return num/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double z){
        return (int)(z+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double negz){
        return (int)(negz-0.5);
    }
}
