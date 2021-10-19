import java.util.*;
public class DailyEmployeeWage {
	public static void main(String[] args) {
		int WAGE_PER_HOUR=20;
		int EmpHour=0;
		int CheckRandom=(int)(Math.random()*10%2);
		if(CheckRandom==1) {
			EmpHour=8;
		}
		else {
			EmpHour=0;
	}
System.out.println("Employee Wage is "+WAGE_PER_HOUR* EmpHour);
}
}