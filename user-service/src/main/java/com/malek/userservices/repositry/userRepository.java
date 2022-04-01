package com.malek.userservices.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malek.userservices.entity.User;

@Repository
public interface userRepository extends JpaRepository<User,Long> {
	
	
	

}
