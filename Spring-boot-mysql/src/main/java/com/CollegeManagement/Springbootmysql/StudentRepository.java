package com.CollegeManagement.Springbootmysql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//@Repository
public interface StudentRepository extends JpaRepository<personaldetails, Integer> {

	List<personaldetails> findByAddress(String address);
	List<personaldetails> findByIdGreaterThan(int id);
	
	
	
}
