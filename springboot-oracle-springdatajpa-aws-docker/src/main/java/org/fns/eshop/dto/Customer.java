package org.fns.eshop.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Customer {
	@Id
	private int cid;
	private String name;
	private String gender;
	private int mobile;
	private String email;
	

}
