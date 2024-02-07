import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//now taking the input
		System.out.print("Enter the number of subjects : ");
		int no = sc.nextInt();
		int totalmarks =0;
		for(int i=0;i<no;i++) {
			System.out.println("Enter "+(i+1)+" subject name: ");
			String name = sc.next();
			System.out.println("Enter the marks of "+name+" out of 100 :");
			int marks = sc.nextInt();
			
			// Validate marks (assuming marks are between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }
            
            //calculating total
			totalmarks+=marks;
		}
		
		//calculating Average percentage
		double Average_percentage = (double)totalmarks/no;
		char grade='0';
		if (Average_percentage >= 90) {
			grade= 'A';
        } else if (Average_percentage >= 80) {
        	grade = 'B';
        } else if (Average_percentage >= 70) {
        	grade = 'C';
        } else if (Average_percentage >= 60) {
        	grade = 'D';
        } else {
        	grade = 'F';
        }
		
		// Display Results
        System.out.println("\nResults are:");
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + Average_percentage + "%");
        System.out.println("Grade: " + grade);
	}

}
