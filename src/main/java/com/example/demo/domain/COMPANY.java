package com.example.demo.domain;

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
@Entity(name = "COMPANY")
public class COMPANY {
	//https://wikidocs.net/161165
	@Id
	private String nm;
	
	@Column(columnDefinition = "LONGTEXT")
	private String company_url;
	private int employee_num;
	@Column(nullable = false)
	private int profit;
	@Column(nullable = false)
	private int stable;
	@Column(nullable = false)
	private int grow;
	@Column(columnDefinition = "LONGTEXT")
	private String culture;
	@Column(columnDefinition = "LONGTEXT")
	private String img_url;
}
