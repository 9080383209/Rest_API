package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Empmod;

public interface Repos extends JpaRepository<Empmod, Integer> {

}
