package LeetCode;
public class str1 {
	public static int LongestSubstring(String s) {
		char ch[]=s.toCharArray();
		String sub="";
		int len=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && ch[j]==ch[i] && i<j)
					sub=s.substring(i,j);
					System.out.println(i+" "+ch[i]+" "+j+" "+ch[j]);
					len=sub.length();
				}
			}
		return len;
		}
	public static void main(String[] args) {
		int longest=LongestSubstring("abcabcbb");
		System.out.println(longest);
	}
}
