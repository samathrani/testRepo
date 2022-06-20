package classroom1;

import classroom1.Student;

public class Student {
	
	int studentId;
	String studentName;
	float subject1;
	float subject2;
	float subject3;
	float subject4;
	String Grade;
	float Sum;
	float average;
	int outstandingStudCount;
	int firstClassStudCount;
	int secondClassStudCount;
	static int numberOfStudents = 10;

	public Student(float Maths, float Physics, float Chemistry, float Biology) {
		this.subject1 = Maths;
		this.subject2 = Physics;
		this.subject3 = Chemistry;
		this.subject4 = Biology;

	}

	public float calculateSum() {

		this.Sum = (subject1 + subject2 + subject3 + subject4);

		return Sum;
	}

	public float calculateAverage() {

		this.Sum = calculateSum();
		this.average = this.Sum / 4;
		return average;
	}

	public String calculateGrade() {

		this.average = calculateAverage();

		if (this.average >= 85) {
			Grade = "outstanding";
		} else if (this.average >= 70) {
			Grade = "firstClass";
		} else {
			Grade = "secondClass";
		}
		return Grade;
	}

	public static void main(String[] args) {




		Student[] stud = new Student[numberOfStudents];
		
		stud[0] = new Student(96, 86, 91, 95);
        stud[1] = new Student(36, 56, 71, 95);
		stud[2] = new Student(96, 86, 91, 95);
		stud[3] = new Student(36, 56, 71, 95);
		stud[4] = new Student(96, 86, 91, 95);
		stud[5] = new Student(36, 56, 71, 95);
		stud[6] = new Student(96, 86, 91, 95);
		stud[7] = new Student(36, 56, 71, 95);
		stud[8] = new Student(36, 56, 71, 95);
		stud[9] = new Student(36, 56, 71, 95);
		
		

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("student" + (i+1));
			System.out.println("The final sum is " + stud[i].calculateSum());
			System.out.println("The final average is " + stud[i].calculateAverage());
			System.out.println("The final Grade is " + stud[i].calculateGrade());
		
		}
	}
}
