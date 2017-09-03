package com.restaurant.homework.items;
import com.restaurant.homework.items.container.Container;
import com.restaurant.homework.items.container.Cup;
public abstract class HotDrinks implements Item {
	Category category = Category.DRINKS;
	Cup container = new Cup();
	
	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		return container;
	}
}