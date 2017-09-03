package com.restaurant.homework.items;
import com.restaurant.homework.items.container.Container;
import com.restaurant.homework.items.container.Glass;

public abstract class ColdDrinks implements Item {
	Category category = Category.DRINKS;
	Glass container = new Glass();
	
	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		return container;
	}

}