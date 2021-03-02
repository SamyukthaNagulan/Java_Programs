import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {

        double breadth,length,height;
        Scanner sc=new Scanner(System.in);
        try {
            length = sc.nextDouble();
            breadth = sc.nextDouble();
            height = sc.nextDouble();
            Box b = new Box();
            System.out.println("Area is " +b.area(length, breadth, height));
            System.out.println("Volume is "+b.volume(length, breadth, height));
        }
        catch(Exception e)
        {

        }

    }
}
