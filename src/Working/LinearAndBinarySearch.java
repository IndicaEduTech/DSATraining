package Working;

public class LinearAndBinarySearch {
	
	
	public static int linearSearch(int[] num, int target)
	{
		for(int i=0; i<num.length; i++)
		{
			if(num[i] == target)
			{
				return i;
				
			}
			
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args)
	{
		int[] num = {34, 45, 23, 78, 56, 67};
		
		int target = 30;
		
		int result = linearSearch(num, target);
		
		if(result != -1)
		{
			System.out.println("The index value of result is : " + result );
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}

	

}
