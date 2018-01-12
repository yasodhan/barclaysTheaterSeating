package com.barc.test.theater.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Row {
	
	private Integer rowNumber;
	private List<Section> sections;
	
	public Row(Integer rowNumber, List<Section> sections) {
		this.rowNumber = rowNumber;
		this.sections = sections;
	}
	
	public Row() {
		this.rowNumber = 0;
		this.sections = new ArrayList<Section>();
	}
	
	public Integer getRowNo() {
		return rowNumber;
	}
	public void setRowNo(Integer rowNNumber) {
		this.rowNumber = rowNumber;
	}
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Row [rowNumber=" + rowNumber + ", sections=" + Arrays.toString(sections.toArray()) + "] \n";
	}
	
	
	

}
