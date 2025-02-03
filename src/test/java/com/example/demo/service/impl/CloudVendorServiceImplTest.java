package com.example.demo.service.impl;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


class CloudVendorServiceImplTest {

    @Mock
    private CloudVendorRepository cloudVendorRepository;

    private CloudVendorServiceImpl cloudVendorService;
    private CloudVendor cloudVendor;
    AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        cloudVendorService = new CloudVendorServiceImpl(cloudVendorRepository);
        cloudVendor = new CloudVendor();
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createCloudVendor() {
        // Arrange
        CloudVendor cloudVendor = new CloudVendor(null, "raju", "asdf", "789");
        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);

        // Act
        String result = cloudVendorService.createCloudVendor(cloudVendor);

        // Assert
        assertThat(result).isEqualTo("Created CloudVendor with id " + cloudVendor.getVendorId());
    }

    @Test
    void updateCloudVendor() {
    }

    @Test
    void deleteCloudVendor() {
    }

    @Test
    void getCloudVendor() {
    }

    @Test
    void getAllCloudVendor() {
    }

    @Test
    void getVendorByName() {
    }

    @Test
    void getVendorByAddress() {
    }
}