public class RM{
	public static boolean RM(int[][] m,int row,int col)
	{
		int n=m.length;
		if (m.length == 0 || m.length != m[0].length) return false;
		for(int i=0;i<n/2;i++)
		 { 
		 int last=n-i-1;
		 for(int j=i;j<last;j++)
			{
			int offset=j-i;
			int top=m[i][j];
			m[i][j]=m[last-offset][i];
			m[last-offset][i]=m[last][last-offset];
			m[last][last-offset]=m[j][last];
			m[j][last]=top;
			}
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
			
			System.out.println(RM(q,i,j));
		     }
	    }
		
	
      }
}