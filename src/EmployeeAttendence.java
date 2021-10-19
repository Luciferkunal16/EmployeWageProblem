import java.util.*;
public class EmployeeAttendence {
	public static void main(String[] args) {
		int CheckRandom=(int)(Math.random()*10%2);
		if(CheckRandom==1) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
