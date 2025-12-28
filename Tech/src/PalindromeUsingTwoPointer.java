
public class PalindromeUsingTwoPointer {
	public static void main(String[] args) {
		String str = "Saurav";
		char [] ch =str.toCharArray();
		int  i=0,j=str.length()-1;
		
			while(i<j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;j--;
				
			}
			System.out.println(ch);
			String ap = new String(ch);
			System.out.println(str.equals(ap));
		}
		
				
		}
