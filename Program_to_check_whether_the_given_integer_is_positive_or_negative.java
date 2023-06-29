import java.util.*;
public class CheckPositiveOrNegativeExample1  
{  
public static void main(String[] args)
{  
    Scanner sc=new Scanner(System.in);
int num;
num=sc.nextInt();
if(num>0)  
{  
System.out.println("Positive Number");  
}  
else if(num<0)  
{  
System.out.println("Negative Number");  
}   
else  
{  
System.out.println("Zero");  
}  
}  
}  