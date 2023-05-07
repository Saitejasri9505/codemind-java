import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;
        float pi=3.14f;
        r=sc.nextInt();
        area=pi*r*r;
        System.out.printf("%.2f",area);
    }
}