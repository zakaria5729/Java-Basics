package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeCalculator {
	private int MyLeapYear[] = 
			{
				0, 4, 8, 12, 16, 20, 24, 29, 33,
				37, 41, 45, 49,53, 57, 62, 66, 70,
				74, 78, 82, 86, 90,95, 99, 103, 107,
				111, 115, 119, 124
			};
        
	public AgeCalculator() {
	}
        
	private boolean leapYear (int year) {
		int leap = year % 128;
		for (int i : MyLeapYear) {
			if (i == leap) {
				return true;
			}
		}
		return false;
	}
        
	private int monthDays (int monthNumber, int year) {
		if (monthNumber <= 6 && monthNumber > 0) {
			return 31;
		} else if (monthNumber == 12){
			if (leapYear(monthNumber)) {
				return 30;
			} else {
				return 29;
			}
		} else {
			return 30;
		}
	}
	public void calc (int[] birthdate, int[] now) {
		if (birthdate.length != 3 || now.length != 3) {
			return;
		}
		if ((now[0] < birthdate[0] || (now[0] == birthdate[0])) && ((now[1] < birthdate[1]) || (now[0] == birthdate[0])) && ((now[1] == birthdate[1] && now[2] < birthdate[2]))) {
			System.out.println("\nBirth date can't not be more than or equal to current date.\n");
			return;
		}
		System.out.println("\nFrom : \t" + birthdate[0]+"/"+birthdate[1]+"/"+birthdate[2]);
		System.out.println("To : \t" + now[0]+"/"+now[1]+"/"+now[2]+"\n");
		// --------------------------------
		int birthYear = birthdate[0];
		int birthMonth = birthdate[1];
		int birthDay = birthdate[2];
		// --------------------------------
		int nowYear = now[0];
		int nowMonth = now[1];
		int nowDay = now[2];
		// --------------------------------
		int resultYear, resultMonth, resultDay;
		// --------------------------------------------------------------
		if (nowDay > monthDays(nowMonth, nowYear)) {
			nowMonth += (int)nowDay / monthDays(nowMonth, nowYear);
			nowDay = nowDay % monthDays(nowMonth, nowYear) ;
		}
		if (birthDay > monthDays(birthMonth, birthYear)) {
			birthMonth += (int)birthDay / monthDays(birthMonth, birthYear);
			birthDay = birthDay % monthDays(birthMonth, birthYear);
		}
		// --------------------------------------------------------------
		if (nowMonth > 12) {
			nowYear += (int)nowMonth / 12;
			nowMonth = nowMonth % 12;
		}
		if (birthMonth > 12) {
			birthYear += (int)birthMonth / 12;
			birthMonth = birthMonth % 12;
		}
		// --------------------------------------------------------------
		if (nowDay >= birthDay) { resultDay = nowDay - birthDay + 1;} 
		else {
			if (nowMonth -1 < 1) {
				nowYear -= 1;
				nowMonth += 12;
			}
			nowMonth -= 1;
			nowDay += monthDays(nowMonth, nowYear);
			resultDay = nowDay - birthDay + 1;
		}
		if (nowMonth >= birthMonth) {resultMonth = nowMonth - birthMonth;}
		else {
			nowYear -= 1;
			nowMonth += 12;
			resultMonth = nowMonth - birthMonth;
		}
		resultYear = nowYear - birthYear;
		// ----------------------------------------------------------------------
		System.out.println("--------------------------------------------------------------");
		System.out.println("| Your Age is >>> "+resultYear+" Years and "+resultMonth+" Months and "+resultDay+" Days");
		// ----------------------------------------------------------------------
		long howManyDays = resultDay;
		long howManyLeapYear = 0;
		ArrayList<Integer> leapYears = new ArrayList<Integer>();
		for (int i = 1; i <= resultYear; i++) {
			if (leapYear(birthYear + i)) {
				howManyDays += 366;
				howManyLeapYear += 1;
				leapYears.add(birthYear + i);
			} else {
				howManyDays += 365;
			}
		}
		if (resultMonth <= 6) {
			howManyDays += resultMonth * 31;
		} else if (resultMonth > 6 && resultMonth < 12) {
			howManyDays += (6 * 31) + ((resultMonth-6) * 30);
		} else {
			howManyDays += (6 * 31) + ((resultMonth-6) * 30) + monthDays(12, birthYear + resultYear);
		}

		int x = ((int)(birthYear + 6) % 12) -1;
		if (x == -1) {
			x = 0;
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("| You have >>> " + howManyLeapYear + " Leap years in your age");
		System.out.println("| Leap Years : " + leapYears);
		System.out.println("--------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		AgeCalculator ac = new AgeCalculator();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Your birth day >>> ");
			int birthDay = input.nextInt();
			System.out.print("Your birth month >>> ");
			int birthMonth = input.nextInt();
			System.out.print("Your birth year like >>> ");
			int birthYear = input.nextInt();
			System.out.println("----------------------------------\n");
                        
			System.out.print("Day you want calc >>> ");
			int nowDay = input.nextInt();
			System.out.print("Month you want calc >>> ");
			int nowMonth = input.nextInt();
			System.out.print("Year you want calc >>> ");
			int nowYear = input.nextInt();
			
			int[] birthdate = {birthYear, birthMonth, birthDay};
			int[] now = {nowYear, nowMonth, nowDay};

			ac.calc(birthdate, now);
	
		} catch (Exception ex) {
			System.out.println("An error occured: "+ex);
		}
	}

}