import java.util.*;
public class PartTimeEmpWage {
	public static void main(String[] args) {
		int WAGE_PER_HOUR=20;
		int EmpHour=0;
		int CheckRandom=(int)(Math.random()*10%3);
		if(CheckRandom==1) {
			System.out.println("Employee is full time present");
			EmpHour=8;
		}
		else if(CheckRandom==2){
			System.out.println("Employee is Half time present");
			EmpHour=4;
	}
		else {
			System.out.println("Employee is Absent");
		}
System.out.println("Employee Wage is "+WAGE_PER_HOUR* EmpHour);
	}

}