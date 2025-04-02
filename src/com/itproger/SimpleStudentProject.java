package com.itproger;
import java.util.*;

public class SimpleStudentProject {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] name = new String[100];
    public static int[] id = new int[100];
    public static double[] score = new double[100];
    public static char[] baga = new char[100];
    public static int datasize = 0;
    public static double average = 0;
    public static double max = 0;
    public static double min = 101;
    public static double sum = 0;
    public static int count1 = 0;

    public static void main(String[] args) {

        String user = "1";
        String pass = "2";

        while (true) {

            System.out.print("Enter your username: ");
            String str_user = scanner.nextLine();

            System.out.print("Enter your password: ");
            String str_pass = scanner.nextLine();

            if (user.equals(str_user) && pass.equals(str_pass)) {
                Welcome();
                choose();
                break;
            }
            else {
                System.out.println("You entered something wrong, try again.");
            }
        }
    }

    public static void Welcome(){
        System.out.println("You entered successfully!");
    }

    public static void choose() {
        while (true) {
            System.out.println("________________________________");
            System.out.println("Main menu");
            System.out.println("1. Add Student");
            System.out.println("2. Manage Records");
            System.out.println("3. Calculate Grades");
            System.out.println("4. View Statistics");
            System.out.println("5. Generate Reports");
            System.out.println("6. Delete Student");
            System.out.println("7. Logout and exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter student name: ");
                    String stud_name = scanner.next();

                    System.out.print("Enter student ID(Please enter 'number'): ");
                    int stud_id = scanner.nextInt();

                    System.out.print("Enter test score: ");
                    int stud_score = scanner.nextInt();

                    add(stud_name, stud_id, stud_score);
                    break;
                case 2:
                    System.out.print("Enter student ID to edit: ");
                    int man = scanner.nextInt();
                    manage(man);
                    break;
                case 3:
                    calcul();
                    System.out.println("Grades Calculated.");
                    System.out.println("Grade Details added.");
                    break;
                case 4:

                    System.out.println("Statistics:");
                    System.out.println("Total: "+ count1);
                    System.out.println("Average Score: "+ Math.floor(average/count1));
                    System.out.println("Highest Score: "+ max);
                    System.out.println("Lowest Score: "+ min);
                    break;
                case 5:
                    System.out.print("Enter student ID to generate a report: ");
                    int prosto = scanner.nextInt();

                    System.out.print("Generating report for student with ID: ");
                    int generate = scanner.nextInt();

                    generat(generate, prosto);
                    break;
                case 6:
                    System.out.print("Enter student ID to delete: ");
                    int del = scanner.nextInt();

                    dele(del);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    public static void generat(int generate, int prosto){
        int count = 0;
        char baga = ' ';
        if (prosto == generate) {

            for (int i = 0; i < datasize ;i++ ) {
                if (generate == id[i]) {

                    count ++;

                    if (score[i] <= 100 && 90 <= score[i] ) {
                        baga = 'A';
                    }
                    else if(score[i] <= 90 && 80 <= score[i] ){
                        baga = 'B';
                    }
                    else if(score[i] <= 80 && 70 <= score[i] ){
                        baga = 'C';
                    }
                    else if(score[i] <= 70 && 60 <= score[i] ){
                        baga = 'D';
                    }
                    else if(score[i] <= 60 && 0 <= score[i] ){
                        baga = 'F';
                    }
                    System.out.println("Student report");
                    System.out.println("Name: "+ name[i]);
                    System.out.println("Student id: "+ id[i]);
                    System.out.println("Test score: "+ score[i]);
                    System.out.println("Final Grade: "+ baga);
                    break;
                }
            }
            if(count == 0){
                System.out.println("Student with this ID not exists.");
            }
        }
        else{
            System.out.println("You enterd two different ID.");
        }
    }
    public static void calcul(){
        average = 0;
        max = 0;
        min = 101;
        count1 = 0;
        for (int i = 0;i < datasize ;i++ ) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            if (score[i] != 0) {
                average += score[i];
            }
            if(score[i] != 0){
                count1 ++;
            }
        }
    }

    public static void dele(int del){
        int count = 0;
        for(int i = 0;i < datasize; i++ ){
            if(del == id[i]){
                id[i] = 0;
                score[i] = 0;
                name[i] = null;
                count ++;
            }
        }if(count > 0){
            System.out.println("Student deleted successfully.");
        }else{
            System.out.println("A student with this ID not exists!");
        }

    }

    public static void add(String stud_name, int stud_id, int stud_score){
        for (int i = 0;i < id.length ;i++ ) {
            if(stud_id != id[i]){
                if(0 < stud_score && stud_score < 101){
                    name[datasize] = stud_name;

                    id[datasize] = stud_id;

                    score[datasize] = stud_score;

                    datasize++;

                    System.out.println("Student added successfully.");
                    break;
                }else{
                    System.out.println("You need to enter between '0' - '100'!");
                    break;
                }

            }else{
                System.out.println("A student with this ID exists.");
                break;
            }
        }

    }
    public static void manage(int man){
        int count = 0;

        for (int i = 0;i < datasize ;i++ ) {
            if(id[i] == man){
                System.out.print("Enter your new test score: ");
                int grade = scanner.nextInt();
                if(grade <= 100){
                    score[i] = grade;
                    count ++;
                }
                else{
                    System.out.println("You need to enter between '0' - '100'!");
                }
            }

        }
        if(count > 0){
            System.out.println("Student record updated successfully.");
        }
        else{
            System.out.println("Dont exists!");
        }
    }

}

