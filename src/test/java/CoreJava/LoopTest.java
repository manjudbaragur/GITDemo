package CoreJava;

import org.testng.annotations.Test;

public class LoopTest {
	
	@Test
	public void ForLoop()
	{
		int x=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=0;j<i;j++)
			{
			
			System.out.print(x+" ");	
				x++;
			}
			System.out.println();
		}
	
	}
	

}
