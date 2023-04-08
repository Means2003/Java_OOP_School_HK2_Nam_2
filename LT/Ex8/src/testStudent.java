import java.util.ArrayList;
import java.util.Scanner;

public class testStudent {
  public static void main(String[] args) {
    ArrayList<StudentMark> studentMarks = new ArrayList<>();
    System.out.println("1. Insert student");
    System.out.println("2. View list of student");
    System.out.println("3. Avrage Mark");
    System.out.println("4. Exit");

    try (Scanner scanner = new Scanner(System.in)) {
      int control;
      control = scanner.nextInt();
      scanner.nextLine(); // Tiêu thụ dòng '\n' sau khi đọc lựa chọn

      switch (control) {
        case 1:
          int id=0;
          System.out.println("Full Name");
          String fullName = scanner.nextLine();
          System.out.print("Class Name");
          String className = scanner.nextLine();
          System.out.println("Semester");
          int semester = scanner.nextInt();
          double[] subjectMarkList = new double [5];
          for (int i=0; i<5; i++) {
            id++;
            System.out.print("subject mark "+id);
            subjectMarkList[i] = scanner.nextDouble();
          }
          StudentMark studentMark = new StudentMark(fullName, className, semester, subjectMarkList);
          studentMarks.add(studentMark);
          break;

        case 2:
          System.out.println("Full Name");
          String fullName2 = scanner.nextLine();
          System.out.print("Class Name");
          String className2 = scanner.nextLine();
          System.out.println("Semester");
          int semester2 = scanner.nextInt();
          for (StudentMark c : studentMarks) {
            if (c.getFullName().equals(fullName2) && c.getClassName().equals(className2) && c.getSemester() == semester2) {
              c.display();
            }
          }
          break;

        case 3:
          double totalAverageMark = 0;
          for (StudentMark studentMark1 : studentMarks) {
            double averageMark = studentMark1.getAverageMark();
            totalAverageMark += averageMark;
          }
          double overallAverageMark = totalAverageMark / studentMarks.size();
          System.out.println("Overall average mark: " + overallAverageMark);
          break;

        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}
