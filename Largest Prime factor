import java.util.Scanner;
public class large_prime_fact
{
       public static void main()
       {
               int num,large=2;
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter any number ::");
               num=sc.nextInt();
               for(int i=2;i<num;i++)
               {
                     while(num%i==0)
                     {
                           if(large<num)
                                large=num;
                           num=num/i;
                      }
                }
                System.out.println("The largest prime factorial of the number "+num+"is "+large);
         }
}
