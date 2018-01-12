package com.barc.test.theater.data;

public class Section {
	
	private Integer sectionNumber;
	private Integer totalSeats;
	private Integer filledSeats;
	
	public Section(Integer sectionNumber, Integer totalSeats) {
		super();
		this.sectionNumber = sectionNumber;
		this.totalSeats = totalSeats;
		this.filledSeats = 0;
	}
	
	public Section() {
		this.sectionNumber = 0;
		this.totalSeats = 0;
		this.filledSeats = 0;
	}

	public Integer getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(Integer sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Integer getFilledSeats() {
		return filledSeats;
	}

	public void setFilledSeats(Integer filledSeats) {
		this.filledSeats = filledSeats;
	}

	@Override
	public String toString() {
		return "Section [sectionNumber=" + sectionNumber + ", totalSeats=" + totalSeats + ", filledSeats=" + filledSeats
				+ "] |";
	}

	public Integer getRemainingSeats() {
		return totalSeats - filledSeats;
	}
	
	
}
