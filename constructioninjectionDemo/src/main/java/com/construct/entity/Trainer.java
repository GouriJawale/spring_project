package com.construct.entity;



public class Trainer {

	@Override
	public String toString() {
		return "Trainer [trainername=" + trainername + ", subject=" + subject + "]";
	}
    
	private String trainername;
	
	private Subject subject;

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainer(Subject subject, String trainername) {
		super();
		this.subject = subject;
		this.trainername = trainername;
	}
	
	public void myTrainer() {
		
	System.out.println(subject.getSubname()+" is trained by "+getTrainername());
	
	}
}
