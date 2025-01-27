package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//    single vendor
    @GetMapping("{vendorId}")
    public Optional<CloudVendor> getVendorDetails(@PathVariable("vendorId") int vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

//    all vendors
    @GetMapping("all")
    public List<CloudVendor> getAllVendors() {
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createVendor(@RequestBody CloudVendor cloudvendor) {

        return cloudVendorService.createCloudVendor(cloudvendor);
    }

    @PutMapping
    public String updateVendor(@RequestBody CloudVendor cloudvendor) {
        return cloudVendorService.updateCloudVendor(cloudvendor);
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") int vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);
    }
}
