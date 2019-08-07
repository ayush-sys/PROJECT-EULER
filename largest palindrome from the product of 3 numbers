public class find_palindrome
{
	public int check_pali(int num)
	{
		int temp=num,sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			return sum;
	}

	public static void main(String args[])
	{
		int big=101;
		for(int i=100;i<=999;i++)
		{
			for(int j=i;j<=999;j++)
			{
				int num=i*j;
				int temp=check_pali(num);
				if(temp>big)
					big=temp;
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is"+big);
	}
}
