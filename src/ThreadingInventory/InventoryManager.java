package ThreadingInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	//we can't use ArrayList as a multithreading because they are not Synchronized  
	// if we want to use multithreading in ArrayList then we can use CopyOnWriteArrayList because in this all the method are Synchronized so Thread Safe
	// and implement the multiThreading
	// How to use multithreading in collection
	
	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProductList = new ArrayList<Product>();
	
	public void populateSoldProduct() {
		for(int i =0; i<1000; i++) {
			Product product = new Product(i,"test_product_" + i);
			soldProductList.add(product);
			System.out.println("Added: " + product);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	
	public void displaySoldProduct() {
		for(Product products : soldProductList) {
			System.out.println("Printing Sold Product : "+ products	);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
