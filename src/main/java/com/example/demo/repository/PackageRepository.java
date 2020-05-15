package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WashPackage;

@Repository
public interface PackageRepository extends JpaRepository<WashPackage, Long> {

	@Query("FROM WashPackage wp WHERE wp.status = ?1")
	public List<WashPackage> findPackageByStatus(String status);
}
