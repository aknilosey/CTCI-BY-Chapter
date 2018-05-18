public class RotateMatrix{
	public static boolean RotateMatrix(int[][] m,int row,int col)
	{
		int n=m.length;
		int level=0;
		int last=n-1;
		int totallevel=n/2;
		while(level<totallevel)
		{
		  for(int i=level;i<last;i++)
			  {
				  Swap(m[level][i],m[i][last]);
				  Swap(m[level][i],m[last][last-i+level]);
				  Swap(m[level][i],m[last-i+level][level]);
				
			  }	
			  level++;
			  last++;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		int q[][]={{1,2},{4,5}};
		
		for(int i=0; i<q.length;i++)
		{
			for(int j=0; i<q.length;j++)
		    {
			
			System.out.println(RotateMatrix(q,i,j));
		     }
	    }
	}
	public static void Swap(int i,int j)
	{
		int temp=i;
		i=j;
		j=temp;
	}
}