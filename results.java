package semester;
import java.util.Scanner;

public class results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] rollNo = new int[4];
        String[] studName = new String[4];
        int[] marks1 = new int[4];
        int[] marks2 = new int[4];
        int[] marks3 = new int[4];
        int[] totals = new int[4];
        String[] result = new String[4];
        double[] average = new double[4];
        String[] grades = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            
            System.out.print("Enter Roll Number: ");
            String rollNoStr = scanner.nextLine();
            rollNo[i] = Integer.parseInt(rollNoStr);
            
            System.out.print("Enter Student's name: ");
            studName[i] = scanner.nextLine();
            
            System.out.print("Enter marks for subject 1: ");
            marks1[i] = scanner.nextInt();
            
            System.out.print("Enter marks for subject 2: ");
            marks2[i] = scanner.nextInt();
            
            System.out.print("Enter marks for subject 3: ");
            marks3[i] = scanner.nextInt();
            
            scanner.nextLine(); 
            
            System.out.print("Enter RESULT: "); 
            result[i] = scanner.nextLine();
            
            totals[i] = marks1[i] + marks2[i] + marks3[i];
            average[i] = (double) totals[i] / 3;
            if (average[i] >= 80 && average[i] <= 100) {
                grades[i] = "A";
            } else if (average[i] >= 75 && average[i] < 80) {
                grades[i] = "B+";
            } else if (average[i] >= 65 && average[i] < 75) {
                grades[i] = "B";
            } else if (average[i] >= 55 && average[i] < 65) {
                grades[i] = "C+";
            } else if (average[i] >= 50 && average[i] < 55) {
                grades[i] = "C";
            } else if (average[i] >= 40 && average[i] < 50) {
                grades[i] = "D";
            } else if (average[i] >= 0 && average[i] < 40) {
                grades[i] = "F";
            } else {
                grades[i] = "INVALID";
            }
        }

        System.out.println("***********************************************************************");
        System.out.println("\t\t\tSTUDENT MARKLIST");
        System.out.println("***********************************************************************");
        System.out.printf("ROLL \tNAME \tMARK1 \tMARK2 \tMARK3 \tTOTAL \tRESULT \tAverage\tGRADE%n");
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%s\t%.1f\t%s%n",
                    rollNo[i], studName[i], marks1[i], marks2[i], marks3[i], totals[i], result[i], average[i], grades[i]);
        }

        scanner.close();
    }
}
