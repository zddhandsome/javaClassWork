package javaClassWork5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class nineFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.get(GregorianCalendar.YEAR);
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
							(gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + " " +
							gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		gregorianCalendar.setTimeInMillis(1234567898765L);

	}

}
