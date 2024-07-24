package com.oas.Entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class ProductPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private String pname;
	private Integer pmaxq;
	private Integer pminq;
	private String pstore;
	private String pman;
	private String ptype;
	private Double pprice;
	private Double pgst;
	@ManyToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "jtvendpro", joinColumns = { @JoinColumn(name = "fkpid")}, inverseJoinColumns = {@JoinColumn(name = "fkvid")})
	private List<VendorPojo> vpo;

}
