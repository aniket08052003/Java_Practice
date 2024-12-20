
import java.util.Arrays;
import java.util.Scanner;

public class st {
    public static boolean ispal(String str){
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static String longest(String str){
        String longg = "";
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

    public static void occur(String str[]){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(i==0 || !str[i].equals(str[i-1])){
                int count=1;
                for(int j=i+1;j<str.length;j++){
                    if(str[i].equals(str[j])){
                        count++;
                    }
                }
                System.out.println(str[i]+": "+count+" times");
            }
        }
    }

    public static void repeat(String str[]){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(i==0 || !str[i].equals(str[i-1])){
                for(int j=i+1;j<str.length;j++){
                    if(str[i].equals(str[j])){

                        System.out.println(str[i]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Size of Array: ");
        // int n=sc.nextInt();
        // System.out.print("Enter words of array: ");
        // String str[] = new String[n];
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.nextLine();
        // }
        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]);
        // }

        // String str = "banana";
        // System.out.println(ispal(str));
        // System.out.println(longest(str));

        // String str[] = {"ana","car","cac"};
        // for(String st: str){
        //     if(ispal(st)){
        //         System.out.println(st);
        //     }
        // }

        // long word
        // String str[] = {"ana","carr","caccc","banana"};
        // String longg = str[0];
        // for(String st: str){
        //     if(st.length() >longg.length() ){
        //         longg = st;
        //     }
        // }
        // System.out.println(longg);
        // Short
        // String small = longg;
        // for(String st: str){
        //     if(st.length() < small.length()){
        //         small = st;
        //     }
        // }
        // System.out.println(small);

        // String str[] = {"Apple","Apple","Car","Bike"};
        // occur(str);

        String str ="This is Aniket . , I this this  am from Pune .";
        str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        String words[] = str.split("\\s+");
        Arrays.sort(words);

        // System.out.println(Arrays.toString(words));
        // occur(words);
        repeat(words);

    }
}
