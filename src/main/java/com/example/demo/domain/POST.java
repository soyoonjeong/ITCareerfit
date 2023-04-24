package com.example.demo.domain;

import java.time.LocalDate;

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
@Entity(name = "post")
public class POST {
	//https://wikidocs.net/161165
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 45)
	private String company_name;
	@Column(nullable = false, length = 45)
	private String title;
	@Column
	private LocalDate deadline;
	private int type;
	@Column(length = 45)
	private String location;
	@Column(columnDefinition = "LONGTEXT")
	private String pos;
	@Column(columnDefinition = "LONGTEXT")
	private String tech;
	private int min_career;
	private int max_career;
	@Column(columnDefinition = "LONGTEXT")
	private String post_url;
	@Column(columnDefinition = "LONGTEXT")
	private String content;
	 @Column(columnDefinition = "int default 0")
	private int dead;
	private LocalDate last_check;
}
