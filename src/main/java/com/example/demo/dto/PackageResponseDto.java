package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PackageResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6241798155008131867L;

	private long packageId;
	
	private String packageName;
	
	private String packageDesc;

	private double packagePrice;
	
}
