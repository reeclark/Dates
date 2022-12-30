package dates;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Dates {
	public static void main(String[] args) {
		Scanner date = new Scanner(System.in);

		// Get first date.
		System.out.print("Enter oldest date as yyyy-mm-dd: ");
		String datestr = date.nextLine();
		LocalDate dateld = LocalDate.parse(datestr);

		// Get second date.
		System.out.println("Enter second date as yyyy-mm-dd: ");
		String datestr1 = date.nextLine();
		LocalDate dateld1 = LocalDate.parse(datestr1);
		date.close();

		// Find difference between the dates.
		Period period = dateld.until(dateld1);

		// Display the results.
		int day = period.getDays();
		int month = period.getMonths();
		int year = period.getYears();
		System.out.println(
				"The difference between the dates are: " + day + " Days, " + month + " Months, " + year + " Years.");
	}
}