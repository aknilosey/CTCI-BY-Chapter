import java.util.HashMap;
import java.util.Collection;
public class PalindromePermutation{
	public static boolean PalindromePermutation(String s)
	{
		int c=1;
		//HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				c=hm.get(s.charAt(i));
				c+=1;
				hm.put(s.charAt(i),c);
				
			}
			else hm.put(s.charAt(i),1);
		}
		boolean odd=false;
		//Collection<Character> collectionValues = hm.values();
		//for(Character v : collectionValues)
		for(Character ch: hm.keySet())
		{
			if(hm.get(ch)%2==1)
			{
				if(odd==false)
					odd=true;
				else
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String p="popaat";
		System.out.println(PalindromePermutation(p));
	}
			
}