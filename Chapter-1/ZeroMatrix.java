public class ZeroMatrix{
public static boolean ZeroMatrix(int[][]m,int row,int col)
{
	int n=m.length;
	int p=m[0].length;
	boolean vert[]=new boolean[p];
	boolean hor[]=new boolean[n];
	for(int i=0; i<p;i++)
	{
		for(int j=0; j<n;j++)
	    {
			if(m[i][j]==0)
			{
				vert[i]=true;
				hor[j]=true;
			}
		
	    }
    }
	for(int i=0;i<n;i++)
	{
		if(hor[i]==true)
		{
			for(int j=0; j<p;j++)
				m[j][i]=0;
		}
		
    }
	for(int i=0;i<p;i++)
	{
		if(vert[i]==true)
		{
			for(int j=0; j<n;j++)
				m[i][j]=0;
		}
	}
	return true;
}

public static void main(String[] args)
{
	int q[][]={{1,2,6},{3,4,8},{5,0,2}};
	for(int i=0; i<q.length;i++)
	{
		for(int j=0; j<q.length;j++)
	    {
		
		System.out.println(ZeroMatrix(q,i,j));
	    }
    }
	
}
}