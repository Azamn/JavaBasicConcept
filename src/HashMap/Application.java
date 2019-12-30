package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		// using hashMap order of insertion not get in output
		// In LinkedHashMap u get the items in insertion order.
		// If we use TreeMap the the sort the key in Alphabetical order. TreeMap not store the duplicate 
		
		// HashMap<String, String> dictionary = new HashMap<String, String>(); // In every hshMap we passed the key value pair in in < > this bracket 
																			// which type of data passed or get what type of data-type u passed in key value pair
		
		// LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		
		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Briliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		dictionary.put("Trust", "firm belief in the reliability, truth, or ability of someone or something.");
		
//		for(String words : dictionary.keySet()) { // keySet() Method is used for getting the key from the dictionary. 
//			String word = dictionary.get(words); // using this we get the value of the key. and pass the key in this method
//			System.out.println(words);
//			System.out.println(word);
//		}
		
		// if you want to get the key and value both the we use entrySet() method
		// Map.Entry<K, V> Interface we used to get the value both key and value for that use and then we declare a variable to store that key and value
		
		for(Map.Entry<String, String> value : dictionary.entrySet()) {
			System.out.println(value.getKey());
			System.out.println(value.getValue());
			
		}
		
	}

}
