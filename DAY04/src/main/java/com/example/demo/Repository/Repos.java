package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Model;

public interface Repos extends JpaRepository<Model, Integer> {

}
