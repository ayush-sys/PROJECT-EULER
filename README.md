# QS-01
Multiples of 3 & 5

public class demo
{
        public static void main() 
        {
               int sum=0;
               for(int i=1, i<=1000, i++) 
               {
                    if(i%3==0 || i%5==0) 
                       sum+=i;
               }
               System.out.println("Sum of multiples of 3&5 is" + sum) ;
         }
}
