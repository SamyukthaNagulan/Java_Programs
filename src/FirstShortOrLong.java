import java.util.ArrayList;
import java.util.Scanner;

public class FirstShortOrLong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int max=0,maxIndex=0,minIndex=0,min= Integer.MAX_VALUE;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            String str=sc.nextLine();
            list.add(str);
            if(list.get(i).length()>max)
            {
                max=list.get(i).length();
                maxIndex=i;
            }
            if(list.get(i).length()<min)
            {
                min=list.get(i).length();
                minIndex=i;
            }

        }
        if(minIndex>maxIndex)
            System.out.println(list.get(maxIndex));
        else
            System.out.println(list.get(minIndex));
    }
}
