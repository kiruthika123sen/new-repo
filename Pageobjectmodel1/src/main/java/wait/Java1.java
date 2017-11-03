package wait;

public class Java1 {

	public static void main(String[] args)
	{
	/*	String text="I am the winner today";
		String[] data=text.split(" ");
		System.out.println("The array size is :"+data.length);*/
		
		/*String text1="wow ! it is fun to do this.";
	
		int src=text1.length();
		System.out.println("length of string is:"+src);
		int i;
		for(i=src-1;i>=0;i--)
		{
		System.out.println(text1.charAt(i));
		}*/
		
		
		String text2="I am smart learner";
		int src1=text2.length();
		System.out.println("The array size is:"+src1);
		int j = 0;
		for(int i=0;i<=src1-1;i++)
		{
			
			if(text2.charAt(i)=='e')
			
			{
				j++;
				
			}
				
		}
		System.out.println(j);
	}

}
