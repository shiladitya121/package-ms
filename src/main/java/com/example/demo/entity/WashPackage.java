package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "package", name = "t_package")
@Setter
@Getter
public class WashPackage {

	@Id
	@Column(name = "package_id")
	private long packageId;
	
	@Column(name = "package_name")
	private String packageName;
	
	@Column(name = "package_desc")
	private String packageDesc;
	
	@Column(name = "package_price")
	private double packagePrice;
	
	@Column(name = "status")
	private String status;
}
