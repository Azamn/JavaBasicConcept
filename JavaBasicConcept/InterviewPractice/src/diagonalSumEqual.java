
public class diagonalSumEqual {
	
	public static int sumOfDiagonal(int arr[][], int n) {
		
		// for storing sum of diagonal values
		int d1 = 0, d2 = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<n; j++) {
				
				// sum of primary diagonal matrix
				if(i == j) {
					d1 += arr[i][j];
				}
				
				// sum of secondary diagonal matrix
				if(i == n-j-1) {
					d2 += arr[i][j];
				}
			}
		}
		
		if(d1 == d2)
			return 1;
		else
			return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		int arr[][] = {
				{11,2,5},
				{4,5,6},
				{10,8,4}
		};
		
		System.out.println(sumOfDiagonal(arr, n));
		
	}

}
