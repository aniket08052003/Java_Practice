
import java.util.Arrays;



public class string2 {
    public static boolean ispal(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static String longest(String str){
        String longg="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                if(ispal(sub) && sub.length() > longg.length()){
                    longg = sub;
                }
            }
        }
        return longg;
    }
    public static void unique(int arr[]){
        System.out.print("Unique elements are: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println("");
    }
    public static int unique1(int arr[]){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        String str[] = {"banana","cana","car"};
        // String str = "banana";
        // System.out.println(longest(str));

        // System.out.println(ispal(str));
        // for(String st: str){
        //     String longpal = longest(st);
        //     if(longpal.length()>1){
        //         System.out.println(st+" -> "+longpal);
        //     }
        //     else{
        //         System.out.println(st+" -> no");
        //     }

        // }
        int arr[] = {1,2,2,3,4,5,6,3};
        unique(arr);
        System.out.print("New Elements are: ");
        int len = unique1(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        

        
    }
}
