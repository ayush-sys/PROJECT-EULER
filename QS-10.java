public class sum_prime
{
        public static void main() 
        {
                long n=2000000;
                long sum=0;
                for(int i=2;i<n;i++) 
                {
                    for(int j=2;j<i;j++) 
                    {
                         if(i%j==0)
                          break;
                     }
                      if(i==j) 
                         sum+=i;
                 }
                 System.out.println("Sum of primes under 2 million: "+sum) ;
          }
}
