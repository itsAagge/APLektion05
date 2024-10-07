package ex2student;

public class Ex2App {

	public static void main(String[] args) {
		MapI<Integer, Customer> map = new SetHashMap<>();

		map.put(12, new Customer("12", "12121212", "Bob", "Kennedy"));
		map.put(22, new Customer("22", "23232323", "Alice", "Gordon"));
		map.put(77, new Customer("77", "78787878", "Butch", "Cassidy"));
		map.put(45, new Customer("45", "45454545", "John", "Farmer"));
		map.put(88, new Customer("88", "89898989", "George", "Smith"));

		System.out.println("Keys:");
		System.out.println(map.keys());
		System.out.println();

		System.out.println("Values:");
		System.out.println(map.values());
		System.out.println();

		System.out.println("Entries:");
		System.out.println(map.entries());
		System.out.println();
		System.out.println();

		Customer oldCustomer = map.put(77, new Customer("77", "66666666", "Ronald", "Regan"));
		System.out.println("Old customer with key 77: " + oldCustomer);
		System.out.println("Values after replacing:");
		System.out.println(map.values());
		Customer c = map.get(77);
		System.out.println("New customer at key 77: " + c);
		System.out.println();

		Customer removed = map.remove(45);
		System.out.println("Removed customer: " + removed);
		System.out.println("Keys after removal:");
		System.out.println(map.keys());
		System.out.println("Values after removal:");
		System.out.println(map.values());
		System.out.println();
	}
}
