package com.restaurant.homework.orders;
import java.util.ArrayList;
import com.restaurant.homework.items.Item;
import com.restaurant.homework.menu.Menu;

public class PlaceOrder {
	
	ArrayList<Order> orders = new ArrayList<>();
	ArrayList<Item> availableItems = new ArrayList<>();
	
	
	
	public PlaceOrder(){
		orders = new ArrayList<Order>();
		availableItems = new ArrayList<Item>();
	}
	public PlaceOrder(Menu menu){
		this.availableItems = Menu.getItems();
		this.orders = new ArrayList<Order>();
	}
	public void orderItem(Order order){
		boolean available = false;
		
		for(int i=0;i<Menu.getItems().size();i++) {
			if(Menu.getItems().toString().contains(order.name)) {
				available = true;
			}
		}
		if(available) {
			Order orderOne = new Order();
			orders.add(orderOne);
		}
		
	}
	public ArrayList<Order> getOrder(){
		return orders;
	}
	public void displayOrder(Order order) {
		System.out.println(order.quantity + "x " + order.name);
	}
}