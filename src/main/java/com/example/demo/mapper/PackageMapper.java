package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.GetActivePackageResponse;
import com.example.demo.dto.PackageResponseDto;
import com.example.demo.entity.WashPackage;

@Component
public class PackageMapper {

	public GetActivePackageResponse convertPackageEntityToDto(List<WashPackage> packages) {
		GetActivePackageResponse getActivePackageResponse = new GetActivePackageResponse();
		List<PackageResponseDto> packageResponseDtos = new ArrayList<>();
		PackageResponseDto packageResponseDto = null;
		for(WashPackage washPackage :  packages) {
			packageResponseDto = new PackageResponseDto();
			packageResponseDto.setPackageId(washPackage.getPackageId());
			packageResponseDto.setPackageName(washPackage.getPackageName());
			packageResponseDto.setPackageDesc(washPackage.getPackageDesc());
			packageResponseDto.setPackagePrice(washPackage.getPackagePrice());
			packageResponseDtos.add(packageResponseDto);
		}
		getActivePackageResponse.setPackageResponseDtos(packageResponseDtos);
		return getActivePackageResponse;
	}
}
