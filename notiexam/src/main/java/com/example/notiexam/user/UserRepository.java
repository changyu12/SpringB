package com.example.notiexam.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


 interface UserRepository extends JpaRepository<User, Integer> {


	 Optional<User> findByusername(String username);

	

}
