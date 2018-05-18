import java.util.HashMap;
public class unique {
    public static boolean unique(String s) {
       HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
       for(int i=0;i<s.length();i++)
       {
        if(hm.containsValue(s.charAt(i)))
            return false;
        hm.put(i,s.charAt(i));
       }
        return true;
    }
    public static void main(String[] args)
	{
		String p="uni";
		System.out.println(unique(p));	
	}
}
