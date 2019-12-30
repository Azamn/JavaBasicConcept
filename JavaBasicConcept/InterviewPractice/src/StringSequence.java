
public class StringSequence {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String s = "3A2B5C";
		char c[] = s.toCharArray();
		
		for(int i = 0; i<c.length;i+=2) {
			int num = c[i]-48;
			int j=i+1;
			char c1 = c[j];
			while(num>0) {
				System.out.println(c1+" ");
				num--;
			}
		}

	}

}
