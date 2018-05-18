public class StringRotation{
public static boolean StringRotation(String s1,String s2)
{
	if(s1.length()!=s2.length()) return false;
	else{
		String conc=s1+s1;
		return isSubstring(conc,s2);
	}
}
public static void main(String[] args)
{
	String s1="waterbottle";
	String s2="bottlewater";
	System.out.println(StringRotation(s1,s2));
}

public static boolean isSubstring(String s1,String s2)
{
	if(s1.contains(s2.substring(0,s2.length()-1)))
		return true;
	else return false;
}
 }