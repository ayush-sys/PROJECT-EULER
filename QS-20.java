public class Sum_fact
{
       public int fact(int num) 
       {
               int n=num;
               int fac=1;
               for(int i=1;i<=n;i++) 
                    fac*=1;
               return fac;
        }
        public static void main() 
        {
                int s=fact(100);
                int sum=0;
                while(s!=0)
                {
                      int d=s%10;
                      sum+=d;
                      s/=10;
                }
                System.out.println("Sum of factorial of 100 :"+sum);
         }
}
