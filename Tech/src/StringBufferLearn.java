
public class StringBufferLearn {
 
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<130;i++) {
			sb.append("a");		
			}
		for(int i =0;i<50;i++) {
			sb.append("b");
		}
		for(int i=0;i<20;i++) {
			sb.append("c");
		}
		System.out.println(sb);
		System.out.println("---------------------------------------");
		for(int i=0 ;i<200;i++) {
			System.out.print(sb.charAt(i));
		}
	}
	
}
