package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Imagess;
import com.example.demo.services.ImageService;
import com.example.demo.services.PropertyService;

@CrossOrigin
@RestController
@RequestMapping
public class ImageController {
	@Autowired
    private ImageService imageService;
	
	 @PostMapping(value="/uploadImage/{vpid}",consumes="multipart/form-data")
	   	public boolean uploadImage(@PathVariable("vpid")long vpid,@RequestBody MultipartFile file) {
	   		boolean flag=true;
	   		System.out.println(file+" "+vpid);
	   		try {
	   			flag=imageService.upload(vpid, file.getBytes());
	   		}
	   		catch(Exception e){
	   			flag=false;
	   			System.out.println(e.toString());
	   		}
	  		return flag;
	   	}
	    @GetMapping("/getimage/{id}")
	    public List<Imagess> getImage(@PathVariable long id) {
	    	return imageService.getImage(id);
	    }
}
