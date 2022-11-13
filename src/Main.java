import Model.Student;
import Model.StudentList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList stls = new StudentList();
        int choose = 0;
        do {
            System.out.println("__________Menu_________");
            System.out.println("Enter Information choose 1");
            System.out.println("Export the above list to the screen choose 2");
            System.out.println("Exit choose 3");
            choose = scanner.nextInt();
            switch (choose ) {
                case 1:
                    System.out.println("Enter Id : ");
                    int Id = scanner.nextInt();
                    System.out.println("Enter name : ");
                    String name = scanner.next();
                    System.out.println("Enter address : ");
                    String address = scanner.next();
                    System.out.println("Enter Phone number : ");
                    String PhoneNumber = scanner.next();
                    Student st = new Student(Id, name, address, PhoneNumber);
                    if (PhoneNumber.length() > 0 && PhoneNumber.length() <= 7) {
                        stls.addStudent(st);
                    } else {
                        System.out.println("Please re-enter your phone number at least 7 characters !");
                    }
                    break;
                case 2:
                    stls.printStudent();
                    break;

                case 3:
                    break;
            }
        }
        while (choose != 3);

    }
}
