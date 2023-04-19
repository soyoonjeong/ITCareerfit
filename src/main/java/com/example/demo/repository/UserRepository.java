package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.USER;

//https://geonoo.tistory.com/149
//jpa 사용법+sql문 받아옴
public interface UserRepository extends JpaRepository<USER, String> {
	
}