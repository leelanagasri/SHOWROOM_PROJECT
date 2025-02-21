package one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

public class Main {
	static String str1 = "Welcome to the coders camp showroom. Enter your choice to continue \n 1. Display list of all vehicles"
			+ " \n 2. Lend a vehicle \n 3. Add a vehicle \n 4. Return a vehicle";
	
	static String str2 = "Press Q to quit and C to continue";
	
	static Map<String, String> hm = new HashMap<>();
	
	public static void n2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the vehicle");
		String veh = sc.nextLine();
		System.out.println("Enter your name ");
		String val = sc.nextLine();
		if(hm.get(veh) == null){
			hm.put(veh , val);
			System.out.println("Vehicle list has been updated. you can take the vehicle now");
		}
		else {
			System.out.println("Vehicle is already being used by "+hm.get(veh));
		}
		System.out.println(str2);
		promo();
	}
	
	public static void n4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the vehicle you want to Return");
		String veh = sc.nextLine();
		hm.put(veh,null);
		System.out.println(str2);
		promo();
	}
	public static void promo(){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'C' || ch == 'c') {
			System.out.println(str1);
			type();
		}
		else if(ch == 'q' || ch == 'Q') {
			System.out.println("Thank you for visiting :)");
		}
	}
	
	public static void type() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("We have following vehicles in our automobile showroom: Coders camp Showroom");
			hm.put("car", null);
			hm.put("activa 5g", null);
			hm.put("pulsor motorcycle", null);
			hm.put("kawasaki Ninja", null);
			hm.put("Duke", null);
			for(String i:hm.keySet()) {
				System.out.println(i);
			}
			System.out.println(str2);
			promo();
		}
		else if (n==2){
			n2();
		}
		else if (n==3){
			System.out.println("Enter the name of the vehicle you want to add ");
			String s1 = sc.next();
			hm.put(s1, null);
			System.out.println("Vehicle has been added to the list");
			System.out.println(str2);
			promo();
		}
		else if(n==4) {
			n4();
		}
	}
	public static void main(String[] args){
		System.out.println(str1);
		type();
	}
}
