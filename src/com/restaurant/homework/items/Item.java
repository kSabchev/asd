package com.restaurant.homework.items;

import com.restaurant.homework.items.container.Container;

public interface Item {
	int getQuantity();
	void setQuantity(int quantity);
	String getName();
	Category getCategory();
	double getCost();
	Container getContainer();
}

