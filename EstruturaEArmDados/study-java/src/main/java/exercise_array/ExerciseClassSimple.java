package exercise_array;

import java.util.Scanner;

public class ExerciseClassSimple {
    public static void main(String[] args) {

        int x = 0;
        String[] students = new String[10];
        String[] classes = new String[10];

        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Enter student name:");
            String name = reader.next();
            System.out.println(String.format("Is student %s from T1 or T2?", name));
            String classStudant = reader.next();

            students[x] = name;
            classes[x]= classStudant;
            x++;
        }while (x < 10);

        int i;
        System.out.println("Show array of name:");
        for (i = 0; i < students.length; i++){
            System.out.println(String.format("Student number %d, is %s of class %s", i, students[i], classes[i]));
        }
        System.out.println("Number of students in the name vector:"+ i);
        System.out.println("Number of students in the class vector:"+ i);
    }
}
