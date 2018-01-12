package com.barc.test.theater.data;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	
	private Integer maxSectionSize;
	private Integer seatingCapacity;
	
	private List<Row> rows;
	
	public Theater() {
		this.maxSectionSize = 0;
		this.seatingCapacity = 0;
		this.setRows(new ArrayList<Row>());
	}
	

	public Theater(List<Row> rows) {
		super();
		this.maxSectionSize = 0;
		this.seatingCapacity = 0;
		this.rows = rows;
		calculateMetaData();
	}


	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public Integer getMaxSectionsize() {
		return maxSectionSize;
	}

	public void calculateMetaData() {
		seatingCapacity = 0;
		maxSectionSize = 0;
		for (Row row : rows) {
			for (Section section : row.getSections()) {
				seatingCapacity += section.getRemainingSeats();
				if (maxSectionSize < section.getRemainingSeats()) {
					maxSectionSize = section.getRemainingSeats();
				}
			}
		}
	}


	@Override
	public String toString() {
		return "Theater [maxSectionSize=" + maxSectionSize + ", seatingCapacity=" + seatingCapacity + ", \n rows= \n" + rows
				+ "]";
	}
	


}
