import java.util.ArrayList;

public class BuySellStock {
	
	// result structure to store the value
	class Interval{
		int buy, sell;
	}
	
	// function to find the sell buy value
	public void stockBuySell(int price[], int n) {
		// prices must be given atleast for two days
		if(n==1)
			return;
		
		
		int count = 0;
		
		// result array
		
		ArrayList<Interval> result = new ArrayList<BuySellStock.Interval>();
		
		int i = 0;
		while(i<n-1) {
			while((i<n-1) && (price[i+1]<=price[i]))
				i++;
				
				// if we reached the end then no further solution
				if(i == n-1) 
					break;
				
				
				Interval e = new Interval();
				e.buy = i++; // store the local minima
				
				// find the local maxima
				while((i<n)&&(price[i]>=price[i-1]))
					i++;
				
					e.sell = i-1;
					result.add(e);
				
				
				count ++;
			}
			
			// print solution
			if(count == 0) 
				System.out.println("There is no day when buying the stock will make profit");
			else 
				for(int j = 0;j<count;j++)
					System.out.println("buy on day :"+result.get(j).buy+"   "+"Sell on day :"+result.get(j).sell);
				

			return;
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuySellStock stock = new BuySellStock();
		int price[] = {100,180,260,310,40,535,695};
		int n =price.length;
		
		stock.stockBuySell(price, n);

	}

}
