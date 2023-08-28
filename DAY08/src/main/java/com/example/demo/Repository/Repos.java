package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Model;

public interface Repos extends JpaRepository<Model, Long> {
	@Query(value = "select * from start where name like :b%",nativeQuery = true)
	public List<Model> starts(@Param("b")String name);
	
	@Query(value = "select * from start where name like %:bn",nativeQuery = true)
	public List<Model> ends(@Param("bn") String name);
}
