package student;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------STUDENT GRADE CALCULATOR---------------------");
		System.out.println("\n");
		System.out.println("Enter your marks obtained in each subject(out of 100)->");
		System.out.print("Maths :- ");
		int math = sc.nextInt();
		System.out.println("\n");
		
		System.out.print("Science :- ");
		int sci = sc.nextInt();
		System.out.println("\n");
		
		System.out.print("English :- ");
		int eng = sc.nextInt();
		System.out.println("\n");
		
		System.out.print("Computer :- ");
		int comp = sc.nextInt();
		System.out.println("\n");
		
		System.out.print("Hindi :- ");
		int hin = sc.nextInt();
		System.out.println("\n");
		
		int total = math + sci + eng + comp + hin;
		
		System.out.println("--------------------RESULT----------------------");
		System.out.println("\n");
		System.out.println("Subjects\t\tMarks");
		System.out.println("==================================");
		System.out.println("Maths\t\t\t "+math);
		System.out.println("\n");
		System.out.println("Science\t\t\t "+sci);
		System.out.println("\n");
		System.out.println("English\t\t\t "+eng);
		System.out.println("\n");
		System.out.println("Computer\t\t "+comp);
		System.out.println("\n");
		System.out.println("Hindi\t\t\t "+hin);
		System.out.println();
		System.out.println("\t\t====================");
		System.out.println("\t\t\t "+total);
		
		System.out.println("\n");
		double avg = total / 5;
		System.out.println("Average Percentage :- "+avg);
		System.out.println("\n");
		
		char grade;
		
		if(avg>=80) {
			grade = 'A';
		}
		else if(avg>=60 && avg<80) {
			grade = 'B';
		}
		else if(avg>=40 && avg<60) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent!!");
			break;
		case 'B':
			System.out.println("Well Done..");
			break;
		case 'C':
			System.out.println("You passed..");
			break;
		case 'D':
			System.out.println("You failed..Better Luck Next Time!!");
			break;
		default:
			System.out.println("Invalid Grade.");
		}
		System.out.println("Your grade is "+grade);
	}
}

