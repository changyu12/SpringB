package com.example.cartexam.item;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


import com.example.cartexam.auth.UserDetailRepository;
import com.example.cartexam.cart.Cart;
import com.example.cartexam.cart.CartService;
import com.example.cartexam.user.User;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@Override
	public void create(Item item) {
		
		//현재 로그인 하여 사용중인 사람의 정보 추출
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
				
		String username= auth.getName();
				
		Optional<User> oc = userDetailRepository.findByusername(username);
		User user = oc.get();
		item.setUser(user);
		
		Cart cart = cartService.readdetailusername();
		item.setCart(cart);
		
		
		item.setCreatedate(LocalDateTime.now());
		itemRepository.save(item);
		
	}

	@Override
	public Integer findTotalAmount(Cart cart) {
		
		return itemRepository.findTotalAmount(cart);
	}


	
}
