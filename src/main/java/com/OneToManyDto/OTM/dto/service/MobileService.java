package com.OneToManyDto.OTM.dto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
//import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
import com.OneToManyDto.OTM.dto.dto.MobilesDto;
import com.OneToManyDto.OTM.dto.entity.Mobiles;
import com.OneToManyDto.OTM.dto.repository.MobileRepository;

@Service
public class MobileService implements ServiceImplement{
	
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public MobilesDto post(MobilesDto dto) {
		Mobiles mobiles=new Mobiles();
		mobiles.setColur(dto.getColur());
		mobiles.setDetails(dto.getDetails());
		mobiles.setName(dto.getName());
		mobiles.setMobileno(dto.getMobileno());
		mobileRepository.save(mobiles);
		return dto;
	}

	@Override
	public List<MobilesDto> postall(List<MobilesDto> dtos) {
		List<Mobiles>list=new ArrayList<Mobiles>();
		for(MobilesDto dto:dtos) {
			Mobiles mobiles=new Mobiles();
			mobiles.setColur(dto.getColur());
			mobiles.setDetails(dto.getDetails());
			mobiles.setMobileno(dto.getMobileno());
			mobiles.setName(dto.getName());
			list.add(mobiles);
			
		}
		List<Mobiles>list2=mobileRepository.saveAll(list);
		List<MobilesDto>dtos2=new ArrayList<MobilesDto>();
		for(Mobiles mobiles:list2) {
			MobilesDto dto=new MobilesDto();
			dto.setColur(mobiles.getColur());
			dto.setDetails(mobiles.getDetails());
			dto.setMobileno(mobiles.getMobileno());
			dto.setName(mobiles.getName());
			dtos2.add(dto);
			
		}return dtos2;
	}

	@Override
	public MobilesDto get(int mobileno) {
		Optional<Mobiles>optional=mobileRepository.findById(mobileno);
		Mobiles mobiles=optional.get();
		MobilesDto dto=new MobilesDto();
		dto.setColur(mobiles.getColur());
		dto.setDetails(mobiles.getDetails());
		dto.setMobileno(mobiles.getMobileno());
		dto.setName(mobiles.getName());
		mobileRepository.save(mobiles);
		return dto;
		
	}

	@Override
	public List<MobilesDto> getall() {
		List<Mobiles>list=mobileRepository.findAll();
		List<MobilesDto>dtos=new ArrayList<MobilesDto>();
		for(Mobiles mobiles:list) {
			MobilesDto dto=new MobilesDto();
			dto.setColur(mobiles.getColur());
			dto.setDetails(mobiles.getDetails());
			dto.setMobileno(mobiles.getMobileno());
			dto.setName(mobiles.getName());
			dtos.add(dto);
			
		}return dtos;
		
	}

	@Override
	public MobilesDto update(MobilesDto dto) {
		Optional<Mobiles>optional=mobileRepository.findById(dto.getMobileno());
		Mobiles mobiles=optional.get();
		mobiles.setColur(dto.getColur());
		mobiles.setDetails(dto.getDetails());
		mobiles.setMobileno(dto.getMobileno());
		mobiles.setName(dto.getName());
		mobileRepository.save(mobiles);
		return dto;
	}

	@Override
	public String delete(int mobileno) {
		mobileRepository.deleteById(mobileno);
		return "Unakenna Delete Pannanum AvlloThaney Delete Panniyachi Pothuma!!!";
	}

	@Override
	public List<MobilesDetailsDto> getpath(String name) {
		return mobileRepository.findByName(name);
	}

	


	}