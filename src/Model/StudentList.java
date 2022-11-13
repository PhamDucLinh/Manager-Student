package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
    private ArrayList<Student> StudentList = new ArrayList<>();

    public StudentList() {
        this.StudentList = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> studentList) {
        StudentList = studentList;
    }
    public void  addStudent(Student st ) {
        this.StudentList.add(st);
    }

    public void printStudent(){
        for(Student student : StudentList){
            System.out.println(student);
        }
    }
    public void sortStudentByID() {
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}

