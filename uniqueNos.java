import java.util.Arrays;

public class uniqueNos {
    public static void unique(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i] != arr[i-1]){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        System.out.print(arr[i]+" ");
                        break;
                    }
                }
            }
        }
    }
    public static void unique1(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i] != arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void occur(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                System.out.println(arr[i]+": "+count+" times");
            }
        }
    }

    public static void rev(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Rev: "+Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending: "+Arrays.toString(arr));
    }

    
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,2,4,5};
        System.out.print("Unique Elements are: ");
        unique(arr);
        System.out.println();
        System.out.print("Nos: ");
        unique1(arr);
        System.out.println();
        occur(arr);
    }
}
