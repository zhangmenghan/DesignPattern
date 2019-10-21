package com.zmh.iterator;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		ArrayList<College> collegeList = new ArrayList<College>();
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(infoCollege);
		collegeList.add(computerCollege);
		
		OutputImpl outputImpl = new OutputImpl(collegeList);
		outputImpl.printCollege();
	}
}
