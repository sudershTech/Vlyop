package pageObjects;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentDate {
	
	public static void main(String [] args){
		// Create object of SimpleDateFormat class and decide the format
		DateFormat d= new SimpleDateFormat("dd/MM/yyyy ");
		
		Date date= new Date();
		String CurrentDate= d.format(date);
		System.out.println(CurrentDate);
	}
	

}

