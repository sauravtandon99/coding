
public class PalindromeUsingTwoPointer {
	public static void main(String[] args) {
		//String str = "Saurav";
		//String s = 
		char [] ch = new char[900];
        for(int i=0;i<300;i++){
            ch[i] = 'a';
        }
        for(int i=300;i<600;i++){
            ch[i] = 'b';
        }
        for(int i=600;i<900;i++){
            ch[i] = 'c';
        }
        String str = new String(ch);
        System.out.println(str);
		char [] ch1 =str.toCharArray();
		int  i=0,j=str.length()-1;
		
			while(i<j) {
				char temp = ch[i];
				ch1[i] = ch[j];
				ch1[j] = temp;
				i++;j--;
				
			}
			System.out.println(ch1);
			String ap = new String(ch1);
			System.out.println(str.equals(ap));
		    System.out.println("This is a new line ");
		}
		}

