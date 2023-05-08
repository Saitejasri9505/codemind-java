import java.util.*;
public class HandShakes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=n*(n-1)/2;
        System.out.printf("%d",s);
    }
}