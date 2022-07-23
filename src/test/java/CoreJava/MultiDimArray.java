package CoreJava;

public class MultiDimArray {

	public static void main(String[] args) {
		

		int a[][]= {{4,20,6},{5,2,3},{7,1,5}};
		
		int x = a[0][0];
		int m=0,n=0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(x>a[i][j])
				{
					x=a[i][j];
					m=i;
					n=j;					
				}
				
			}
		}
		
		System.out.println(x);
		System.out.println(m);
		System.out.println(n);
		
		for (int i=0;i<=m;i++)
		{
			for (int j=n;j<=n;j++)
			{
				if(x<a[i][j])
				{
					x=a[i][j];
				}
			}
			
	}
		System.out.println(x);	
}
}
