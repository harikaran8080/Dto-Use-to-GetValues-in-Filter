package com.OneToManyDto.OTM.dto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "details")
public class MobileDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int detailno;
	
	private String ram;
	
	private String internettype;
	
	private String battery;
	
	private int storage;

}
