package com.oas.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class VendorPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vid;
	private String vname;
	private String vtan;
	private String vpan;
	private String vloc;
    private String vdept;
}
