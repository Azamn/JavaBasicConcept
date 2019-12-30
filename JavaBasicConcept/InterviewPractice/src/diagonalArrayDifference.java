
public class diagonalArrayDifference {
	
	// methods function to find difference of n x n matrix
	public static int difference(int arr[][], int n) {
		
		// Initialize sums of diagonals
		
		int d1 = 0, d2 = 0;
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j<n ; j++) {
				
				// finding some of primary diagonal matrix
				
				if(i == j) {
					d1 += arr[i][j]; 
				}
					
				// finding sum of secondary diagonal matrix
					
				if(i == n-j-1) {
					d2 += arr[i][j];
				}
				
			}
		}
		
		
		return Math.abs(d1 - d2);
		
	}

	public static void main(String[] args) {
		
		int n=3;
		int arr[][]={
			
			{11,2,4},
			{4,5,6},
			{10,8,-12}
			
		};
		
		System.out.println(difference(arr, n));

	}

}
