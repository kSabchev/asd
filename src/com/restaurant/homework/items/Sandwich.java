package com.restaurant.homework.items;
import com.restaurant.homework.items.container.Container;
import com.restaurant.homework.items.container.Wrapper;

public abstract class Sandwich implements Item {
	Category category = Category.SNACKS;
	Wrapper container = new Wrapper();
	
	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		return container;
	}
}