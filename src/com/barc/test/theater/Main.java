package com.barc.test.theater;

import java.util.ArrayList;
import java.util.List;

import com.barc.test.theater.data.Request;
import com.barc.test.theater.data.Theater;
import com.barc.test.theater.util.FileIo;

public class Main {

	public static void main(String args[]) {
		
		Theater theater = new Theater();
		List<Request> requests = new ArrayList<Request>();
		FileIo.readFileAndCreateTheaterAndRequests("/Users/yash/theater.txt", theater, requests);
		RulesEngine rulesEngine = new RulesEngine();
		List<String> results = rulesEngine.processRequestsForTheater(theater, requests);
		
		for(String result : results) {
			System.out.println(result);
		}
	}
}
