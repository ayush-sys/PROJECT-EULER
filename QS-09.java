public class Spcl_pythagorean_triplet
{
	public static void main()
	{
		int a=0,b=0,c=0,num=0;
		int s = 1000;
		boolean found = false;
		for (a=1;a<s/3;a++)
		{
	   	 	for (b=a;b<s/2;b++)
			{
        			c=s-a-b;
 
 	       			if (a*a+b*b==c*c)
				{
					num=(a*b*c);
        	    			found = true;
         	   			break;
        			}
    			}
 
   	 		if (found)
			{
        			break;
    			}
		}
		System.out.println("The product abc for which exactly one Pythagorean triplet for which a + b + c = 1000 is "+num);
	}
}
