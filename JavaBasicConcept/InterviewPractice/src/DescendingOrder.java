import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of element you insert : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		
//		int temp;
//		for(int i=0; i<a.length-1;i++) {
//			for(int j=i+1; j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		
		
		Arrays.sort(a);
		
		
		for (int value : a){
			System.out.println(value + " ");
		}
		
	}

}
