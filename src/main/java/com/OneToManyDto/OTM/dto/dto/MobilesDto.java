package com.OneToManyDto.OTM.dto.dto;

import java.util.List;

import com.OneToManyDto.OTM.dto.entity.MobileDetails;

import lombok.Data;

@Data
public class MobilesDto {

    private int mobileno;
	
	private String name;

	private String Colur;
	
	
	private List<MobileDetails> details;
}
