
public class Test {

	public static void main(String[] args)
	{
		int temp,i,j;
		int arr[]= {50,30,10,20,60,40};
		System.out.print("Ascending order: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+",");
		}	
	} 

}
