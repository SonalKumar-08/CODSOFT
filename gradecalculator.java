import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of subjects ");
        int subjects = scanner.nextInt();

        int totalMarks = 0;

        for(int i=1 ; i<=subjects ; i++){
            System.out.println("Enter marks obtained in subject " + i + " :");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (subjects*100) * 100 ;

        char grade;
        if(averagePercentage >= 90){
            grade = 'A';
        }
        else if(averagePercentage >= 80){
            grade = 'B';
        }
        else if(averagePercentage >= 70){
            grade = 'C';
        }
        else if(averagePercentage >=60){
            grade ='D';
        } 
        else if(averagePercentage >=55){
            grade = 'E';
        }
        else{
            grade = 'F';
        }

        System.out.println("Total marks obtained : " +totalMarks);
        System.out.println("Average Percentage : " +averagePercentage);
        System.out.println("Grade: " +grade);

        scanner.close();
    }
}
