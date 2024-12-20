import java.util.Arrays;
import java.util.Scanner;

public class codeArray1{
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

    public static void reverse(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void unique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println(" ");
    }

    public static int unique1(int arr[]){
        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
                System.out.print(j+" ");
            }
        }
        // System.out.println(j+1);
        return j+1;
    }

    public static void reversenew(int arr[],int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[],int k){
        k=k%arr.length;
        reversenew(arr, 0, arr.length-1);
        reversenew(arr, 0, k-1);
        reversenew(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of Array: ");
        // int n=sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter Array: ");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // int arr[] = {1,2,3,4,5,6,7,8,9,10,67};
        // int k=sc.nextInt();
        // int small = arr[k-1];
        // int large = arr[arr.length-k];
        // System.out.println(small+" , "+large);
        // for(int i=0;i<arr.length;i++){
        //     if(prime(arr[i])){
        //         System.out.println(arr[i]);
        //     }
        // }
        // reverse(arr);

        // int arr[] = {5,3,4,1,2};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // sort(arr);

        // int arr[] = {1,2,3,3,3,4,5,5,6};
        // // unique(arr);
        // // System.out.println(unique1(arr));
        // int target =50;
        // boolean b=false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         b=true;
        //     }
        // }
        // if(b){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // int []arr = {1,2,3,4,5,6};
        // int k=4;
        // rotate(arr, k);

        // int arr[] = {22,21,23,31,7,5,4};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     if(prime(arr[i])){
        //         System.out.println(arr[i]);
        //         sum+=arr[i];
        //     }
        // }
        // System.out.println(sum);
        // System.out.println(prime(sum));
        
    }
} 