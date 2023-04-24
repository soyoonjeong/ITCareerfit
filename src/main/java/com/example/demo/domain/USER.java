package com.example.demo.domain;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

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
@Entity(name = "USER")
public class USER {
	//https://wikidocs.net/161165
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 45)
	private String email;
	@Column(nullable = false, length = 45)
	private String password;
	 @Column(nullable = false, length = 45)
	private String nm;
	@Column(nullable = false, length = 45)
	private String phone;
	@CreationTimestamp
	@Column
	private LocalDate birthday;
	@Column(columnDefinition = "LONGTEXT")
	private String pos;
	@Column(length = 45)
	private String company_1;
	@Column(length = 45)
	private String company_2;
	@Column(length = 45)
	private String company_3;
	@Column(length = 45)
	private String company_4;
	@Column(length = 45)
	private String company_5;
	@Column(columnDefinition = "LONGTEXT")
	private String good_posts;
	@Column(columnDefinition = "LONGTEXT")
	private String img;
	@Column//(nullable = false)
	private int profit;
	@Column//(nullable = false)
	private int stable;
	@Column//(nullable = false)
	private int grow;
	@Column(columnDefinition = "LONGTEXT")
	private String culture;
	@Column(columnDefinition = "LONGTEXT")
	private String img_url;
	
}
