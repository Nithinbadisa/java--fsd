package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.myaadhar;

public interface MyAadharRepository extends JpaRepository<myaadhar, Integer> {

	Optional<myaadhar> findById(int id);

}
