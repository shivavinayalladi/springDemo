package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//    single vendor
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getVendorDetails(@PathVariable("vendorId") int vendorId) {
        return ResponseHandler.customResponseBuilder("Vendor Details of " + vendorId + " are given as", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
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

    @GetMapping("/byname")
    public List<CloudVendor> getVendorByName(@RequestParam String name) {
        return cloudVendorService.getVendorByName(name);
    }

    @GetMapping("/byaddress")
    public List<CloudVendor> getVendorByAddress(@RequestParam String address) {
        return cloudVendorService.getVendorByAddress(address);
    }
}
