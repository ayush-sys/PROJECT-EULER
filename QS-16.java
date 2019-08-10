import java.lang.*;
public class power_digit_sum
{
        public static void main()
        {
                int sum=0;
                int bp=(int)Math.pow(2,1000);
                while(bp!=0)
                {
                     int d=bp%10;
                     sum+=d;
                     bp/10;
                 }
                 System.out.println("Sum of power of digits :"+sum);
         }
}
