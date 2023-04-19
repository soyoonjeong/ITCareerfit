package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.COMPANY;
import com.example.demo.domain.TECHNICAL_STACK;

//https://geonoo.tistory.com/149
//jpa 사용법+sql문 받아옴
public interface Technical_StackRepository extends JpaRepository<TECHNICAL_STACK, String> {
	
}