import java.io.*;
import java.util.*;

class fiforep
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k,x,temp,loc,tloc;
		boolean flag;
		int cache_size;
		System.out.println("Enter cache size");
		cache_size = sc.nextInt();
		ArrayList<Integer> cache = new ArrayList<Integer>(10);
		System.out.print("Element \t");
		System.out.print("Description \t");
		System.out.print("Cache \n");
		while(true)
		{
			x = sc.nextInt();
			flag = cache.contains(x);
			if(flag == true)
				System.out.print("\t \tcache hit \t");
			else if(x == -1)
				break;
			else
			{
				System.out.print("\t \tpage fault \t");
				if(cache.size() == cache_size)
				{
					cache.remove(0);
					cache.add(x);
				}
				else
					cache.add(x);

			}
			for (Integer number : cache) 
   				System.out.print(number + " ");
   			System.out.println();

   		}
   	}
}
