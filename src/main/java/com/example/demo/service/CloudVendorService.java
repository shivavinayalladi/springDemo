package com.example.demo.service;

import com.example.demo.model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(int cloudVendorId);
    public Optional<CloudVendor> getCloudVendor(int cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();
    public List<CloudVendor> getVendorByName(String vendorName);
    public List<CloudVendor> getVendorByAddress(String address);
}
