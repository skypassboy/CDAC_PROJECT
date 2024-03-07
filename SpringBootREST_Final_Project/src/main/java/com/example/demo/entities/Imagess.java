package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "images")
@Getter
@Setter
public class Imagess {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long imgid;

	@Column
	byte[] image;

	public Imagess(byte[] image, Property propertyid) {
		super();
		this.image = image;
		this.propertyid = propertyid;
	}

	@ManyToOne
	@JoinColumn(name = "propertyid")
	private Property propertyid;
}
