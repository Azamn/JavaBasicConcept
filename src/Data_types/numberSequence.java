package Data_types;

public class numberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=150;i++) {
			if(i>=20) {
				break;
			}
			else if(i%2==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		
	}

}
