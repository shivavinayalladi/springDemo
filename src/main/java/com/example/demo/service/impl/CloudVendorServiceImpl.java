package com.example.demo.service.impl;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Created CloudVendor"+" with id "+cloudVendor.getVendorId();
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Updated CloudVendor"+" with id "+cloudVendor.getVendorId();
    }

    @Override
    public String deleteCloudVendor(int cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted CloudVendor"+" with id "+cloudVendorId;
    }

    @Override
    public Optional<CloudVendor> getCloudVendor(int cloudVendorId) {
        return  cloudVendorRepository.findById(cloudVendorId);
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
