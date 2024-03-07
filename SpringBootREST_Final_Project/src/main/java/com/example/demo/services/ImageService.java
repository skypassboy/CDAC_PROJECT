package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Imagess;
import com.example.demo.entities.Property;
import com.example.demo.repositories.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private  ImageRepository imageRepo;
	@Autowired
	PropertyService ps;
	 public boolean upload(long id,byte [] photo) {
		 System.out.println(id+"   "+photo);
		 Property p=ps.getPropertyById(id);
		 Imagess img=new Imagess(photo,p);
	    	if(imageRepo.save(img) != null)
	    		return true;
	    	else
	    		return false;
	    	
	    }
	    
	    public List<Imagess> getImage(long id) {
	    	
	    	return imageRepo.getImage(id);
	    }
	    
}