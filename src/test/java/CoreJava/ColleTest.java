package CoreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ColleTest {

	public static void main(String[] args) {


		int x[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<x.length;i++)
		{
			int k=0;
			if(!a.contains(x[i]))
			{
				a.add(x[i]);
				k++;
				for(int j=i+1;j<x.length;j++)
				{
				
					if(x[i]==x[j])
					{
						k++;
					}
					
				}
				System.out.print(x[i]+"  "+k);
				System.out.println();
			}
			
			
			
		}
		
		
		
		/*a.sort(null);
		
		
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.addAll(a);
		System.out.println(hashSet);*/
		
	}

}
