import java.utils.hashmap;
public class OneAway{
	public static boolean OneAway(String p, String s)
	{
		if(abs((p.length()-q.length()>1)))
			return false;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		if(p.length()>s.length())
		{
			for(int i=0;i<s.length();i++)
			{
				if(hm.containsKey(s.charAt(i)))
				{	co=hm.get(s.charAt(i));
					co+=1;
					hm.put(s.charAt(i),co);
				
				}
				else hm.put(s.charAt(i),1);
			}
			int count=0;	
			for(int i=0;i<p.length();i++)
				{
					if(!hm.containsKey(p.charAt(i)))
					{
						count++;
					}
					else if(hm.containsKey(p.charAt(i))
					{
						c=hm.get(p.charAt(i))
						c--;
						hm.put(p.charAt(i),c); 
					}
					else if((hm.containsKey(p.charAt(i)) & hm.get(p.charAt(i))<=-1) ||(count>=2) )
						return false;
					return true;
				}	
		}
			else
			{
				for(int i=0;i<p.length();i++)
				{
					if(hm.containsKey(p.charAt(i)))
					{	cou=hm.get(p.charAt(i));
						cou+=1;
						hm.put(p.charAt(i),cou);
				
					}
					else hm.put(s.charAt(i),1);
				}
				int count=0;	
				for(int i=0;i<s.length();i++)
					{
						if(!hm.containsKey(s.charAt(i)))
							{
								count++;
							}
						else if(hm.containsKey(s.charAt(i))
							{
								c=hm.get(s.charAt(i))
								c--;
								hm.put(s.charAt(i),c); 
							}
						else if((hm.containsKey(s.charAt(i)) & hm.get(s.charAt(i))<=-1) ||(count>=2) )
							return false;
						return true;
					}
		    }
		
	 }
	 
	 public static void main(String[] args)
	 {
 		String a="ple";
		String b="pale"
 		System.out.println(OneAway(a,b));
	 }
	  
    }
}
	
	  