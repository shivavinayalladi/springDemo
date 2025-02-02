package com.example.demo.repository;

import com.example.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {
    List<CloudVendor> findByVendorName(String vendorName);
    List<CloudVendor> findByVendorAddress(String vendorAddress);

}