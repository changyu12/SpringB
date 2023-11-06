package com.example.cartexam.item;

import com.example.cartexam.cart.Cart;

public interface ItemService {

	void create(Item item);
	
	Integer findTotalAmount(Cart cart);
}
