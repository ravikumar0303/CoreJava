package com.IET.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.IET.beans.Customer;
import com.IET.beans.Item;

public class CustomerTest {

	public static void main(String[] args) {
		Map<Customer, ArrayList<Item>> cm = new HashMap();
		ArrayList<Item> rv = new ArrayList<>();
		System.out.println("\n");
		rv.add(new Item(12, "monitor"));
		rv.add(new Item(23, "mouse"));
		cm.put(new Customer(57, "vishal"), rv);
		System.out.println("\n");

//		cm.put(new Customer(114,"pankaj"),rv);
		rv.add(new Item(14, "Keyboard"));
//		System.out.println("\n");
//		cm.put(new Customer(92,"Shamim"),rv);

		System.out.println(cm);

	}

}
