import java.util.Scanner;

public class gcd {
    public static int gcd(int a,int b){
        for(int i=Math.min(a,b);i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }

        }
        return 1; // If no common divisor found, return 1 (GCD of any number with 1 is 1)
    }

    public static int hcf(int a,int b){
        if(b%a==0){
            return a;
        }
        return hcf (b%a,b);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = hcf(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}
