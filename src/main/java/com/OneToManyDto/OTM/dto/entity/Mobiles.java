package com.OneToManyDto.OTM.dto.entity;

import java.util.List;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "mobiles")
@NoArgsConstructor
@AllArgsConstructor
public class Mobiles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileno;
	
	private String name;

	private String Colur;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_detailno",referencedColumnName = "mobileno")
	private List<MobileDetails> details;
	

}
