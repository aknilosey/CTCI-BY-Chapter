public class Urlify
{
	public static String Urlify(String p)
	{  
		String q=p.trim();
				
		StringBuilder url=new StringBuilder(q.length());
		
		for(int i=0;i<q.length();i++)
		{
			if(q.charAt(i)==' ')
			{
				url.append("%20");
			}
			else
				url.append(q.charAt(i));
		}
		return url.toString();
	}
	public static void main(String[] args)
	{
		String a="hi john smith";
		System.out.println(Urlify(a));
	}
}