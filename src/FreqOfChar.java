import java.util.Scanner;

public class FreqOfChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count;
        //System.out.println("Enter");
        char arr[] = str.toCharArray();
        //System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            //System.out.println("str");

            for (int j = i + 1; j < arr.length; j++) {
                //System.out.println("str");

                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    count++;
                }

            }
            if(arr[i]!=0)
            System.out.println(arr[i] + " : " + count);
        }

    }
}
