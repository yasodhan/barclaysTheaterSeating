package com.barc.test.theater.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.barc.test.theater.data.Request;
import com.barc.test.theater.data.Row;
import com.barc.test.theater.data.Section;
import com.barc.test.theater.data.Theater;

public class FileIo {
	
	public static void readFileAndCreateTheaterAndRequests(String absolutePath, Theater theater, List<Request> requests) {
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
		    String line = bufferedReader.readLine();
		    
		    List<Row> rows = new ArrayList<Row>();
		    Integer rowNumber = 1;
		    while (line != null && !line.isEmpty()) {
		    	String[] sectionSizeInputs = line.split(" ");
		    	List<Section> sections = new ArrayList<Section>();
		    	Integer sectionNumber = 1;
		    	for (String sectionSizeInput : sectionSizeInputs){
		    		Section section = new Section(sectionNumber, Integer.valueOf(sectionSizeInput));
		    		sections.add(section);
		    		sectionNumber++;
		    	}
		    	Row row = new Row(rowNumber, sections);
		    	rowNumber++;
		    	rows.add(row);
		    	line = bufferedReader.readLine();
		    }
		    theater.setRows(rows);
		    theater.calculateMetaData();
		    
		    Integer requestNumber = 1;
		    line = bufferedReader.readLine();
		    while (line != null && !line.isEmpty()) {
		    	String[] requestInputs = line.split(" ");
		    	String name = requestInputs[0];
		    	Integer numberOfTickets = Integer.valueOf(requestInputs[1]);
		    	Request request = new Request(requestNumber, name, numberOfTickets);
		    	requests.add(request);
		    	requestNumber++;
		    	line = bufferedReader.readLine();
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
