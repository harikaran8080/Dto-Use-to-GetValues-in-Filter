package com.OneToManyDto.OTM.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
//import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
import com.OneToManyDto.OTM.dto.dto.MobilesDto;
import com.OneToManyDto.OTM.dto.service.ServiceImplement;

@RestController
@RequestMapping("/mobile/api/testing")
public class MobileController {
	
	@Autowired
	private ServiceImplement implement;
	
	
	@PostMapping("/post")
	public MobilesDto post(@RequestBody MobilesDto dto) {
		return implement.post(dto);
	}
	
	@PostMapping("/postall")
	public List<MobilesDto>postall(@RequestBody List<MobilesDto> dtos){
		return implement.postall(dtos);
	}
	@GetMapping("/get/{mobileno}")
	public MobilesDto get(@PathVariable int mobileno) {
		return implement.get(mobileno);
		
	}
	
	@GetMapping("/getall")
	public List<MobilesDto>getall(){
		return implement.getall();
	}
	
	@PutMapping("/update")
	public MobilesDto update(@RequestBody MobilesDto dto) {
		return implement.update(dto);
		
	}
	
	@DeleteMapping("/delete/{mobileno}")
	public String delete(@PathVariable int mobileno) {
		return implement.delete(mobileno);
		
	}
	
	@GetMapping("/getpath")
	public List<MobilesDetailsDto>getpath(@RequestParam (value = "getpath")String name){
		return implement.getpath(name);
	}
	

}
