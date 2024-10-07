package ex1student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex1App {
	public static void main(String[] args) {
		// HashMap
		Map<String, Customer> hm = new HashMap<>();

		hm.put("11111111", new Customer("11111111", "12121212", "Bob", "Kennedy"));
		hm.put("22222222", new Customer("22222222", "23232323", "Alice", "Gordon"));
		hm.put("77777777", new Customer("77777777", "78787878", "Burt", "Cassidy"));
		hm.put("44444444", new Customer("44444444", "45454545", "John", "Farmer"));
		hm.put("88888888", new Customer("88888888", "89898989", "George", "Smith"));

		System.out.println("HashMap");
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.toString());
		System.out.println();


		// LinkedHashMap
        Map<String, Customer> lhm = new LinkedHashMap<String, Customer>();
		lhm.put("11111111", new Customer("11111111", "12121212", "Bob", "Kennedy"));
		lhm.put("22222222", new Customer("22222222", "23232323", "Alice", "Gordon"));
		lhm.put("77777777", new Customer("77777777", "78787878", "Burt", "Cassidy"));
		lhm.put("44444444", new Customer("44444444", "45454545", "John", "Farmer"));
		lhm.put("88888888", new Customer("88888888", "89898989", "George", "Smith"));

		System.out.println("LinkedHashMap");
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());
		System.out.println(lhm.toString());
		System.out.println();


		// TreeMap
        Map<String, Customer> tm = new TreeMap<String, Customer>();
		tm.put("11111111", new Customer("11111111", "12121212", "Bob", "Kennedy"));
		tm.put("22222222", new Customer("22222222", "23232323", "Alice", "Gordon"));
		tm.put("77777777", new Customer("77777777", "78787878", "Burt", "Cassidy"));
		tm.put("44444444", new Customer("44444444", "45454545", "John", "Farmer"));
		tm.put("88888888", new Customer("88888888", "89898989", "George", "Smith"));

		System.out.println("TreeMap");
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.entrySet());
		System.out.println(tm.toString());
		System.out.println();
	}
}
