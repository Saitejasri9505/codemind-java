import java.util.*;
public class VowelorConsonant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.nextLine().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        System.out.printf("Vowel");
        else
        System.out.printf("Consonant");
    }
}