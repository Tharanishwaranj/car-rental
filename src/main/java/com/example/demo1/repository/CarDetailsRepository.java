package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.CarDetails;

public interface CarDetailsRepository extends JpaRepository<CarDetails,Long>{
    
}
