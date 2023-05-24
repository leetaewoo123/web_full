package ch06;

import java.util.Calendar;
import java.util.Date;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		
		Date date1 = new Date();
		System.out.println(date1.getYear()+1900);
		System.out.println(date1.getMonth()+1);
		System.out.println(date1.getDate()+1900);
		Date date2 = new Date();
		System.out.println(date2.getYear()+1900);
		System.out.println(date2.getMonth()+1);
		System.out.println(date2.getDate()+1900);
		System.out.println(date1 == date2);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);
		System.out.println(cal2.get(Calendar.DATE));
		System.out.println(cal == cal2);
	}

}
