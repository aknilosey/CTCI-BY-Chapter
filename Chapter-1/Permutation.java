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
}