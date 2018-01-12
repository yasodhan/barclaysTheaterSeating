package com.barc.test.theater.data;

public class Request {
	
	private Integer number;
	private String name;
	private Integer numberOfTickets;
	
	public Request(Integer number, String name, Integer numberOfTickets) {
		this.number = number;
		this.name = name;
		this.numberOfTickets = numberOfTickets;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(Integer numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	@Override
	public String toString() {
		return "Request [number=" + number + ", name=" + name + ", numberOfTickets=" + numberOfTickets + "]";
	}
	
	

}
