
import java.util.Arrays;

public class codeString1 {
    public static boolean endsWithVowels(String str){
        char lastchar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastchar=='a' || lastchar=='e' || lastchar=='i' || lastchar=='o' || lastchar=='u';
    }

    public static boolean startsWithVowels(String str){
        char firstchar = Character.toLowerCase(str.charAt(0));
        return firstchar=='a' || firstchar=='e' || firstchar=='i' || firstchar=='o' || firstchar=='u';
    }

    public static boolean ispal(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return str.equals(rev);
    }

    public static String longest(String str){
        String longg="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                if(ispal(sub) && sub.length()>longg.length()){
                    // System.out.print(sub);
                    longg = sub;
                }
            }
        }
        return longg;
    }
    public static void main(String[] args) {


        // String str = "hello";
        // String st = "";
        // for(int i=str.length()-1;i>=0;i--){
        //     st+=str.charAt(i);
        // }
        // System.out.println(st);

        // String str = "My Name Is Aniket.";
        // String result = str.replace(" ","");
        // System.out.println(result);
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<result.length();i++){
        //     char ch = result.charAt(i);
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // String str = "My,Name. Is Aniket.";
        // String result = str.replaceAll("[^a-zA-Z]","");
        // System.out.println(result);

        // String str[] = {"Aniket","Hello","Car","Apple"};
        // for(String st: str){
        //     if(endsWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }
        // for(String sr: str){
        //     if(startsWithVowels(sr)){
        //         System.out.println(sr);
        //     }
        // }

        // String str[] = {"Aniket","bnb","ana"};
        // for(String st: str){
        //     if(ispal(st)){
        //         System.out.println(st);
        //     }
        // }

        // String str[] = {"banana","cana","car"};
        // longest(str);
        // for(String st: str){
        //     String longString = longest(st);
        //     if(longString.length() > 1){
        //         System.out.println(st+" -> "+longString);
        //     }
        //     else{
        //         System.out.println(st+" -> No Pal");
        //     }
        // }
        // String longword = str[0];
        // for(String st: str){
        //     if(st.length()>longword.length()){
        //         longword = st;
        //     }
        // }
        // System.out.println(longword);
        // String minword = longword;
        // for(String sr: str){
        //     if(sr.length() < minword.length()){
        //         minword = sr;
        //     }
        // }
        // System.out.println(minword);
        String str = "This is Aniket. This is, is Pune.";
        str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        String words[] = str.split("\\s+");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("Repeated words are: ");
        // for(int i=1;i<words.length;i++){
        //     if(words[i].equals(words[i-1])){
        //         System.out.println(words[i]);
        //     }
        // }
        // boolean visited[] = new boolean[words.length];
        // for(int i=0;i<words.length;i++){
        //     if(!visited[i]){
        //         int count=1;
        //         for(int j=i+1;j<words.length;j++){
        //             if(words[i].equals(words[j])){
        //                 visited[j] = true;
        //                 count++;
        //             }
        //         }
        //         if(count>1){
        //             System.out.println(words[i]+": "+count);
        //         }
        //     }
        // }

        int count = 1;  // Start count from 1, as the word itself counts as 1
        for (int i = 0; i < words.length; i++) {
            // Print count of each word as we go
            if (i == 0 || !words[i].equals(words[i-1])) {
                // Print the previous word count before moving to the next unique word
                if (i != 0) {
                    System.out.println(words[i-1] + ": " + count);
                }
                count = 1;  // Reset the count for the new word
            } else {
                count++;  // Increment the count for repeated words
            }
        }
        
        // Print the count for the last word
        System.out.println(words[words.length-1] + ": " + count);


    }
}
