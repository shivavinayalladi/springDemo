package com.example.demo.repository;

import com.example.demo.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

@DataJpaTest
public class CloudVendorRepositoryTest {

    @Autowired
    CloudVendorRepository cloudVendorRepository;

    CloudVendor cloudVendor;

    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor(null,"raju","asdf","789");
        cloudVendorRepository.save(cloudVendor);
        cloudVendorRepository.saveAndFlush(cloudVendor);
    }

    @AfterEach
    void tearDown() {
        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }

//    Test case for success
    @Test
    void testFindByVendorName_Found() {
        List<CloudVendor> foundCloudVendors = cloudVendorRepository.findByVendorName("raju");

        assertThat(foundCloudVendors).isNotEmpty(); // Ensure list is not empty
        CloudVendor foundCloudVendor = foundCloudVendors.get(0);

        assertThat(foundCloudVendor.getVendorName()).isEqualTo(cloudVendor.getVendorName());
        assertThat(foundCloudVendor.getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(foundCloudVendor.getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
        assertThat(foundCloudVendor.getVendorPhoneNumber()).isEqualTo(cloudVendor.getVendorPhoneNumber());
    }

    @Test
    void testFindByVendorAddress_Found() {
        List<CloudVendor> foundCloudVendors = cloudVendorRepository.findByVendorAddress("asdf"); // Fixed query parameter

        assertThat(foundCloudVendors).isNotEmpty(); // Ensure list is not empty
        CloudVendor foundCloudVendor = foundCloudVendors.get(0);

        assertThat(foundCloudVendor.getVendorName()).isEqualTo(cloudVendor.getVendorName());
        assertThat(foundCloudVendor.getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(foundCloudVendor.getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
        assertThat(foundCloudVendor.getVendorPhoneNumber()).isEqualTo(cloudVendor.getVendorPhoneNumber());
    }


//    Test case for failure

    @Test
    void testFindByVendorName_NotFound() {
        List<CloudVendor> foundCloudVendors = cloudVendorRepository.findByVendorName("ram");

        assertThat(foundCloudVendors).isEmpty();
    }

    @Test
    void testFindByVendorAddress_NotFound() {
        List<CloudVendor> foundCloudVendors = cloudVendorRepository.findByVendorAddress("jdbc"); // Fixed query parameter

        assertThat(foundCloudVendors).isEmpty();
    }
}
