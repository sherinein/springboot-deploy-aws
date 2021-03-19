package org.dxc.apachecxf.model;


public class Patient {
	private long id;
	private String pname;
	private String description;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(long id, String pname, String description) {
		super();
		this.id = id;
		this.pname = pname;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
