package semester;
import java.util.Scanner;

public class results {

    public static void main(String[] args)
        {
            
            final String name="Nonga Shaldon", Roll_No="C026-01-0975/2022", Semester="2.2";

            String unitCode[] = new String[4];
            String unitName[] = new String[4];
            int score[] = new int[4];

            double total = 0, average;
            char grade;

            Scanner input = new Scanner(System.in);
            for(int i=0;i<score.length;i++)
            {
                System.out.print("Enter your Unit name"+(i+1)+"\nName: ");
                unitName[i] = input.next();

                System.out.print("Enter your Unit Code"+(i+1)+"\nCode: ");
                unitCode[i]= input.next();

                System.out.print("Enter your Score "+(i+1)+"\nScore: " );
                score[i] = input.nextInt();
            }

            for(int mark = 0;mark<score.length; mark++)
            {
                total+=score[mark];
            }

            average = total/4;

            if(average >= 70 && average <= 100)
                grade='A';
            else if(average >= 60)
                grade ='B';
            else if(average >= 50)
                grade='C';
            else if(average >=40)
                grade = 'D';
            else if(average >=0)
                grade = 'F';
            else
                grade = '-';            

            System.out.println("\t\t\t Department of Computer Science\n\t\t\t\tEnd Semester Results");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("|Name:- " +name+"\t|Roll_No:- "+Roll_No+"\tSemester:- "+Semester);
            System.out.println("..............................................................................");
            System.out.println("|Unit Code\t\t|Unit Name:\t\t\tScore");
            System.out.println("------------------------------------------------------------------------------");
            
            for(int i=0;i<score.length;i++)
            {
                System.out.println("|"+unitCode[i]+"\t\t|"+unitName[i]+"\t\t\t|"+score[i]+"\n");
            }

            System.out.println("|Total\t\t\t\t\t\t\t|"+((int)total));
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("|Average\t\t\t\t\t\t|"+average);
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("|Grade\t\t\t\t\t\t\t|"+grade);
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("\t\t\t\t\tRecommendation  |");
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("Grading Creiteria\t\tOverall Grade(A-D)\t Recommend Pass");
            System.out.println("70-100\t\tA");
            System.out.println("60-70\t\tB");
            System.out.println("50-60\t\tC");
            System.out.println("40-50\t\tD");
            System.out.println("Below 40 \tF");
            System.out.println("------------------------------------------------------------------------------");

            input.close();
        }
}
