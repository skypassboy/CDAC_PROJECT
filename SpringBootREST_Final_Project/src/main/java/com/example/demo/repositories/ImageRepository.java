package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Imagess;
import com.example.demo.entities.Property;
@Repository
public interface ImageRepository  extends JpaRepository<Imagess, Long> {
	

	@Query("select v from Imagess v where v.propertyid.propertyid=:id")
    public List<Imagess> getImage(long id);
}