package com.OneToManyDto.OTM.dto.service;

import java.util.List;

import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
//import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
import com.OneToManyDto.OTM.dto.dto.MobilesDto;

public interface ServiceImplement {

	MobilesDto post(MobilesDto dto);

	List<MobilesDto> postall(List<MobilesDto> dtos);

	MobilesDto get(int mobileno);

	List<MobilesDto> getall();

	MobilesDto update(MobilesDto dto);

	String delete(int mobileno);

	List<MobilesDetailsDto> getpath(String name);



	

	

}
