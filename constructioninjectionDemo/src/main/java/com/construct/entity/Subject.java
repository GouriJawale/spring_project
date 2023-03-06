package com.construct.entity;




public class Subject {

	
	
	private int subid;
	
	private String subname;
	


	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public Subject(String subname, int subid) {
		super();
		this.subname = subname;
		this.subid = subid;
	}


	
	
	
}
