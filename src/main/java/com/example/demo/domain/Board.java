package com.example.demo.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor // jpa 필수
@AllArgsConstructor
@ToString
@Entity(name = "board")
public class Board {
	//https://wikidocs.net/161165
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	private String title;
	private String content;
	private String writer;

	
	@CreationTimestamp  
	@Column(updatable = false) private LocalDateTime createdAt;
	 
	@UpdateTimestamp private LocalDateTime updatedAt;
	
}
