package studentDatabaseapp;
import java.util.*;
public class Student {
	private String firstName;
	private String lastName;
	private String studentID;
	private int gradeYear;
	private String courses="";
	private int tuitionBalance;
	private int costOfCourse=600;
	private static int id=1000;
	//enter user name and year
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName=sc.nextLine();
		System.out.print("Enter Student Last Name: ");
		this.lastName=sc.nextLine();
		System.out.print("1 - Fresher\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student grade level: ");
		this.gradeYear=sc.nextInt();
	}
	//generate ID
	private void setStudentID() {
		//grade level+id
		id++;
		this.studentID= gradeYear+""+id;
	}
	//enroll courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner sc=new Scanner(System.in);
			String course =sc.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n    "+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}else {
				break;
			}
		}while(1!=0);
	}
	//View Balance
	public void viewBalance() {
		
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter payment amount: ");
		int payment=sc.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of : $"+payment);
		viewBalance();
	}
	public void status() {
		setStudentID();
		System.out.println("Name : "+firstName+" "+lastName+" \n"+
							"Grade Year : "+gradeYear+"\n"+
							"Student ID : "+studentID+"\n"+
							"Courese Enrolled : "+ courses+"\n"+
							"Tuition Balance : $"+ tuitionBalance
						   );
	}

}
