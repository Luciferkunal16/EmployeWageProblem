public class EmployeeWageSwitchCase {
	public static void main(String[] args) {
	int WAGE_PER_HOUR=20;
	int EmpHour=0;
	int CheckRandom=(int)(Math.random()*10%3);
	switch (CheckRandom) {
	case 1:
		System.out.println("Employee is full time present");
		EmpHour=8;
		break;
	case 2:
		System.out.println("Employee is Half time present");
		EmpHour=4;
		break;
	default :
		System.out.println("Employee is Absent");
		break;
	}
System.out.println("Employee Wage is "+WAGE_PER_HOUR* EmpHour);
}


}
