import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> grades = new ArrayList<>();
        float sumGrades = 0;
        float grade;

        System.out.println("Enter each grade between 0 and 10.");
        System.out.println("Type '1000' to finish entering grades and see the result.");
        System.out.println("Type '2000' to exit the program.");

        while (true) {
            System.out.println("Grade: ");
            grade = scanner.nextFloat();

            if (grade == 1000) {
                if (!grades.isEmpty()) {
                    for (float addedGrade : grades) {
                        sumGrades += addedGrade;
                    }
                    System.out.printf("Result is SUM: %.2f MEDIA: %.2f%n", sumGrades, sumGrades / grades.size());
                } else {
                    System.out.println("No grades were entered.");
                }
                sumGrades = 0;
                grades.clear();
            } else if (grade == 2000) {
                System.out.println("Exiting...");
                break;
            } else {
                grades.add(grade);
            }
        }

        scanner.close();
    }
}
