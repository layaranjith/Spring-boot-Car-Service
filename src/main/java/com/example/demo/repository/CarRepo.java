package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car,Integer>{
    
} 