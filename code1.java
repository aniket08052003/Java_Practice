import java.util.Scanner;

public class code1{
public static void fib(int n){
    int first =0;
    int second =1;
    for(int i=0;i<n;i++){
        System.out.print(first+" ");
        int next = first+second;
        first = second;
        second = next;
    }
}

public static boolean prime(int n){
    if(n==1){
        return false;
    }
    if(n==2 || n==3){
        return true;
    }
    if(n%2==0 || n%3==0){
        return false;
    }
    for(int i=5;i*i<=n;i=i+6){
        if(n%i==0 || n%(i+2)==0){
            return false;
        }
    }
    return true;
}

    public static void print(int n){
        boolean prime[] = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }

    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0){
            return a;
        }
        else{
            return b;
        }
    }

    public static boolean ispal(int n){
        int num=n;
        int remainder;
        int reverse=0;
        while(n!=0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return  num==reverse;
    }

    public static boolean arm(int n){
        int num = n;
        int noOfDigit=String.valueOf(n).length();
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,noOfDigit);
            n /= 10;
        }
        return num==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n=10;
        // fib(n);

        // int n=31;
        // System.out.println(prime(n));

        // int n=20;
        // print(n);

        // int a=15;
        // int b=20;
        // System.out.println(gcd(a, b));
        // System.out.println("LCM: "+a*b/gcd(a, b));

        // int n=123;
        // System.out.println(ispal(n));

        // int n=153;
        // System.out.println(arm(n));
    }
}