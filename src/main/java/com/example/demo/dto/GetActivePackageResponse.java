package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetActivePackageResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3650949978305392273L;

	private List<PackageResponseDto> packageResponseDtos;
}
