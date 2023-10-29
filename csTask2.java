import java.util.Scanner;

public class csTask2 {
	
	//Method for calculate total mark
	public static double calculateMark(double []a) {
		double total = 0;
		for(double i:a) {
			total+=i;
		}
		return total;
	}
	
	//Method for calculate Average of student
	public static double calculateAvg(double mark,int s) {
		return mark/s;
	}
	
	//Method for calculate the grade of the student
	public static char calculateGrade(double marks) {
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
	
	public static void main(String[] args) {
		
		double totalmark;
		double avg;
		char grade;
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter how many subject student have:->");
		int sub=scn.nextInt();
		double []ia=new double[sub];
        
		for(int i=0;i<sub;i++) {
			System.out.println("Enter "+(i+1)+"th subject mark:->");
			ia[i]=scn.nextDouble();
		}
		
		totalmark=calculateMark(ia);
		
		avg=calculateAvg(totalmark,sub);
		
		grade=calculateGrade(avg);
		
		System.out.println("Student result:->");
		System.out.println("===============================================================");
		System.out.println("Student total mark:->"+totalmark);
		System.out.println("Average of the student :->"+avg);
		System.out.println("Grade of the student:->"+grade);
		
	}

}
