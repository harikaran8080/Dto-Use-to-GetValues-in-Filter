package com.OneToManyDto.OTM.dto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OneToManyDto.OTM.dto.dto.MobilesDetailsDto;
import com.OneToManyDto.OTM.dto.entity.Mobiles;

@Repository
public interface MobileRepository  extends JpaRepository<Mobiles, Integer>{

	
	@Query(value = "select m.name as MobileName,m.colur as MobileColur,d.ram as DetailsRam,"
			+"d.internettype as DetailsInternettype,d.battery as DetailsBattery,d.storage as DetailsStorage "
			+"from mobiles m inner join details d on m.mobileno=d.fk_detailno "
			+"where m.name like %:name% or m.colur like %:name% or d.ram like %:name% or d.internettype like %:name% or " 
			+"d.battery like %:name% or d.storage like %:name% ",nativeQuery = true)
	List<MobilesDetailsDto> findByName(String name);

}
