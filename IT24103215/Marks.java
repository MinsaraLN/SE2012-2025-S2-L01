import java.util.*;

public class Marks {
    static int no_Subjects = 3;
    static String[] subjectNames = {"Mathematics", "Chemistry", "Physics" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scan.nextInt();
        int[][] marks = new int[n][no_Subjects];
        //int N = 1;
        while (true) {
            System.out.println("\n add | update | average | average_s | total | grades | exit");
            String comm = scan.next();

            if (comm.equals("add")) {
                int id = scan.nextInt() - 1;
                if (id >= 0 && id < n) {
                    for (int i = 0; i < no_Subjects; i++) {
                        System.out.print("Enter marks for " + subjectNames[i] + ": ");
                        marks[id][i] = scan.nextInt();
                    }
                }
			}
			else if(comm.equals("update")){
				int id = scan.nextInt() - 1;
                if (id >= 0 && id < n) {
                    for (int i = 0; i < no_Subjects; i++) {
                        System.out.print("Enter marks for " + subjectNames[i] + ": ");
                        marks[id][i] = scan.nextInt();
                    }
                }
			
			}
			else if(comm.equals("average")){
				int id = scan.nextInt() - 1;
				int sum = 0;
				for(int i = 0; i < no_Subjects; i++){
					
					sum += marks[id][i];
				}
				System.out.println("Average marks of student " + (id + 1) + " is " + sum/no_Subjects);
			
			}
			else if(comm.equals("average_s")){
				System.out.println("Enter the subject id: ");
				int s_id = scan.nextInt() - 1;
				int s_sum = 0;
				for(int i = 0; i < n; i++){
					s_sum += marks[i][s_id];
				}
				System.out.println("Average marks for " + subjectNames[s_id] + " " + s_sum/n);				
			}
            else if (comm.equals("total")) {
                int s_id = scan.nextInt() - 1;
                if (s_id >= 0 && s_id < n) {
                    int total = 0;
                    for (int i = 0; i < no_Subjects; i++){
                        total += marks[s_id][i];
                    }
                    System.out.println("Total marks for student: " + (s_id + 1) + " = " + total);
                }
            }
            else if (comm.equals("grades")) {
                System.out.println("ID\t Math\t Chem\t Phys");
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + "\t");
                    for (int j = 0; j < no_Subjects; j++) {
                        System.out.print(Grade(marks[i][j]) + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (comm.equals("exit")) {
                System.out.println("Exit!");
                break;

            }
            //N++;
        }
        scan.close();
    }

    static String Grade(int mark) {
        if (mark >= 90) return "A";
        if (mark >= 80) return "B";
        if (mark >= 70) return "C";
        if (mark >= 60) return "D";
        return "F";
    }
} 
			

