package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Mode1;

import jakarta.transaction.Transactional;

public interface Repos1 extends JpaRepository<Mode1, Long>{
	@Query(value = "select*from ticket where age=:s or name=:sn",nativeQuery = true)
	public List<Mode1> geti(@Param("s")int age,@Param("sn") String name);
	@Query(value = "select * from ticket where age=:4 and name=:raju",nativeQuery = true)
	public List<Mode1> getand(@Param("4")int age,@Param("raju")String name);
	@Query(value = "select * from ticket where name like :g%",nativeQuery = true)
	public List<Mode1> getstart(@Param("g")String name);
	@Query(value ="select * from ticket where name like %:gn",nativeQuery = true)
	public List<Mode1> getend(@Param("gn") String name);
	@Modifying
	@Transactional
	@Query(value = "update ticket set name=?1 where name=?2",nativeQuery = true)
	public Integer up(@Param("s")String name,@Param("s1") String name1);
	@Modifying
	@Transactional
	@Query(value="delete from ticket where age=:s3",nativeQuery = true)
	public Integer de(@Param("s3")int age);
}
