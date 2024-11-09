package studentDatabaseapp;
import java.util.*;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Students :");
		int n=sc.nextInt();
		Student stu1[]=new Student[n];
		for(int i=0;i<n;i++) {
			stu1[i]=new Student();
			stu1[i].enroll();
			stu1[i].payTuition();
			stu1[i].status();
		}
	}

}
