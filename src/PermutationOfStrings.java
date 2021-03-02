import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfStrings {
    public void permute(char []arr,int first,int last)
    {
        //char []arr=str.toCharArray();
        if(first==last)
        {
            System.out.println(String .valueOf(arr));
        }
        else {
            for (int i = first; i <=last; i++) {

                //System.out.println(String .valueOf(arr));
                permute(arr, first+1, last);
                char tmp = arr[first];
                arr[first] = arr[last];
                arr[last] = tmp;
                System.out.println(String .valueOf(arr));
            }
           // return String.valueOf(arr);
        }

    }
    public String swap(char []arr,int first,int last)
    {
        char temp= arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        return String .valueOf(arr);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char []arr=str.toCharArray();
        PermutationOfStrings permutation=new PermutationOfStrings();
        permutation.permute(arr,0,str.length()-1);
    }
}
