package com.eboshun.dateandtime;

// import date Class
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Make an object of the Date Class
		Date myObj = new Date();
		System.out.println(myObj);
		
		System.out.println(myObj.getTime());
		
		// is depricated but will still work
		System.out.println(myObj.getYear());

	}

}
