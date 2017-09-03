package com.restaurant.homework;

import com.restaurant.homework.items.Coffee;
import com.restaurant.homework.items.Item;
import com.restaurant.homework.items.Juices;
import com.restaurant.homework.items.Tea;
import com.restaurant.homework.items.nonvegitems.NonVegSandwich;
import com.restaurant.homework.items.vegitems.VegSandwich;
import com.restaurant.homework.menu.Menu;
import com.restaurant.homework.orders.PlaceOrder;
import com.restaurant.homework.orders.Order;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Item appleJuice = new Juices("Apple Juice", 1.99);
		Item orangeJuice = new Juices("Orange Juice", 2.99);
		Item bananaJuice = new Juices("Banana Juice", 2.49);
		Item tunaSandwich = new NonVegSandwich("Tuna Sandwich", 2.99);
		Item espresso = new Coffee("Espresso", 2.49);
		Item vegSandwich = new VegSandwich("Vegan Sandwich", 1.49);
		Item blackTea = new Tea("Black Tea", 0.99);
		Menu.addItem(appleJuice);
		Menu.addItem(bananaJuice);
		Menu.addItem(orangeJuice);
		Menu.addItem(tunaSandwich);
		Menu.addItem(espresso);
		Menu.addItem(vegSandwich);
		Menu.addItem(blackTea);
		
		System.out.println("What do you want to order?");
		System.out.println("1. Black Tea");
		System.out.println("2. Tuna Sandwich");
		System.out.println("3. Espresso");
		System.out.println("4. Vegan Sandwich");
		System.out.println("5. Apple Juice");
		System.out.println("6. Banana Juice");
		System.out.println("7. Orange Juice");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your choice: ");
		int choice = keyboard.nextInt();
		Item orderedItem = null;
		
		switch(choice) {
		case 1:
			orderedItem = blackTea;
			break;
		case 2:
			orderedItem = tunaSandwich;
			break;
		case 3:
			orderedItem = espresso;
			break;
		case 4:
			orderedItem = vegSandwich;
			break;
		case 5:	
			orderedItem = appleJuice;
			break;
		case 6: 
			orderedItem = bananaJuice;
			break;
		case 7: orderedItem = orangeJuice;
			break;
		
		}
		
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int quantity = keyboard2.nextInt();

		PlaceOrder order = new PlaceOrder();
		Order orderOne = new Order(orderedItem, quantity);
		order.orderItem(orderOne);
	
		System.out.print("Your order is: ");
		order.displayOrder(orderOne);
		System.out.print("Your bill is: ");
		System.out.println("$" + Double.valueOf(df.format(orderedItem.getCost()* quantity)) );
		
	}

	static DecimalFormat df = new DecimalFormat("#.##");

}
