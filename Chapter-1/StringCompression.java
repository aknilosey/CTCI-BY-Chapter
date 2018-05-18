public class StringCompression{
public static String StringCompression(String p) 
{
	int finallength=compressendcount(p);
	if(finallength>p.length()) {return p;}
	StringBuilder strcmp=new StringBuilder(finallength);
	int count=0;
	for(int i=0;i<p.length();i++)
	{
		count++;
		if(i+1>=p.length()|| p.charAt(i)!=p.charAt(i+1))
		{
			strcmp.append(p.charAt(i));
			strcmp.append(Integer.toString(count));
			count=0;
		}
	}
	return strcmp.toString();
		
}
public static int compressendcount(String q)
{
	int compressedlength=0;
	int count1=0;
	for(int i=0;i<q.length();i++)
	{
		count1++;
		if(i+1>=q.length()|| q.charAt(i)!=q.charAt(i+1))
		{
			compressedlength+=2;
			//compressedlength+=1+String.valueOf(count1).length();
			count1=0;
		}
	}
	return compressedlength;
}

public static void main(String[] args)
{
	String a="aabcccccaaa";
	System.out.println(StringCompression(a));
}
}
