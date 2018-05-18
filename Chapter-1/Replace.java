import java.util.HashMap;
public class Permutation{
	public static boolean Permutation(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		HashMap<Integer,Character> hm= new HashMap<Integer,Character>();
		for(int i=0;i<a.length();i++)
		{
			hm.put(i,a.charAt(i));
			
		}
		
		for(int i=0;i<b.length();i++)
		{
			if(!hm.containsValue(b.charAt(i)))
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{
		String p="abcde";
		String q="tommo";
		System.out.println(Permutation(p,q));
	}
}public class Replace{
	public static char[] Replace(char[] str,int length)
	{
		int spacecounter=0;
		for(int i=0;i<a.length();i++)
	    {
	    	if(str[i]==' ')
				spacecounter++;
	    }
		int newlength=length+2*spacecounter;
		char[] newarray=new char[newlength+1];
		newarray[newlength]='\0';
		
	}
	public static void main(String[] args)
	{
		char[] p={'a','b','','c','d','p'.' '};
		
		System.out.println(Replace(p,p.length));
	}
}
	
