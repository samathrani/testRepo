package studentClassroom.src.student;

public class Student {


	int studentId = 1100;
	String studentName = "samath";
	int studentGrade = 5;
	char studentSection = 'A';
	int studentSerialNumber = 65432;
	float subject1 = 70f;
	float subject2 = 95.5f;
	float subject3 = 44.5f;
	float subject4 = 86.5f;
	String Grade = "";
	

	public float calculateSum() {
		float Sum = (subject1 + subject2 + subject3 + subject4);
		return Sum;
	}

	public float calculateAverage() {
		
		float average = new Student().calculateSum() / 4;
		return average;
	}

	public String calculateGrade() {

		if (new Student().calculateAverage() >= 90) {
			Grade = "outstanding";
		}
		if (new Student().calculateAverage() >= 80) {
			Grade = "firstClass";
		}
		if (new Student().calculateAverage() >= 65) {
			Grade = "secondClass";
		}
		return Grade;
	}

	public static void main(String[] args) {
		float total = new Student().calculateSum();
		System.out.println("The final sum is " + total);

		float average = new Student().calculateAverage();
		System.out.println("The final average is " + average);

		String Grade = new Student().calculateGrade();
		System.out.println("The final Grade is " + Grade);

	}
}
