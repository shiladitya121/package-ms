package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GetActivePackageResponse;
import com.example.demo.entity.WashPackage;
import com.example.demo.mapper.PackageMapper;
import com.example.demo.repository.PackageRepository;
import com.example.demo.service.PackageService;

@Service
public class PackageServiceImpl implements PackageService {

	@Autowired
	private PackageRepository packageRepository;
	
	@Autowired
	private PackageMapper packageMapper;
	
	@Override
	public GetActivePackageResponse getAllActivePackages() {
		List<WashPackage> packages = packageRepository.findPackageByStatus("ACTIVE");
		return packageMapper.convertPackageEntityToDto(packages);
	}

	
}
