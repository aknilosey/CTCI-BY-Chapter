String compress (String str) {
1* Check final length and return input string if it would be longer. *1 int finalLength = countCompression(str);
if (finalLength )= str.length(» return str;
StringBuilder compressed = new StringBuilder(finalLength); II initial capacity int countConsecutive = 0;
for (int i = 0; i < str.length(); i++) {
countConsecutive++;
1* If next character is different than current, append this char to result. *1 if (i + 1 >= str.lengthO II str.charAt(i) != str.charAt(i + 1» {
compressed.append(str.charAt(i»; compressed.append(countConsecutive); countConsecutive = 0;
} }
return compressed.toString(); }
int countCompression(String str) {
int compressedLength = 0;
int countConsecutive = 0;
for (int i = 0; i < str.length(); i++) {
countConsecutive++;
1* If next character is different than current, increase the length.*1 if (i + 1 )= str.lengthO II str.charAt(i) != str.charAt(i + 1» {
compressedLength += 1 + String.valueOf(countConsecutive).length();
countConsecutive = 0; }
}
return compressedLength; }
public class StringCompression{
public static String StringCompression(String p) 
{
	int j=0;
	
	StringBuilder q=new StringBuilder();
	for(int i=0;i<p.length();i++)
	{ 
		int count=1;
		j=i+1;
		while(p.charAt(i)==p.charAt(j))
			{
				
					count++;
					j++;
				
			} 
		q.append(p.charAt(i));
		q.append(Integer.toString(count));
		System.out.println(q);
		i=j;
		
	}
	return q.toString();
	

}

public static void main(String[] args)
{
	String a="aabbccdaa";
	System.out.println(StringCompression(a));
}
}