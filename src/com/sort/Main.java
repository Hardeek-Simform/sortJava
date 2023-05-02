package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main implements Comparable<Main>, Comparator<Main> {
    int studentEnr;
    String studentName;
    String studentCollege;

    Main(int studentEnr, String studentName, String studentCollege) {
        this.studentEnr = studentEnr;
        this.studentName = studentName;
        this.studentCollege = studentCollege;
    }

    Main() {
    }

    void printValue() {
        System.out.println("Enrollment No. : " + studentEnr + "\nStudent Name : " + studentName + "\nCollege Name : " + studentCollege);
    }

    public static void main(String[] args) {
        Main HardeekObj = new Main(1001, "Hardeek", "Aditya Silver Oak");
        Main YashObj = new Main(1101, "Yash", "Silver Oak");
        Main MihirObj = new Main(1201, "Mihir", "VPMP");
        ArrayList studentList = new ArrayList(3);
        studentList.add(YashObj);
        studentList.add(HardeekObj);
        studentList.add(MihirObj);

        Collections.sort(studentList);
        System.out.println("Default Sorting Order -->\n");
        Iterator stuItr = studentList.iterator();
        while (stuItr.hasNext()) {
            Main individualStuObj = (Main) stuItr.next();
            individualStuObj.printValue();
        }
        System.out.println("---------------------");
        Collections.sort(studentList, new Main());
        System.out.println("Customized Sorting Order -->\n");
        stuItr = studentList.iterator();
        while (stuItr.hasNext()) {
            Main individualStuObj = (Main) stuItr.next();
            individualStuObj.printValue();
        }
    }

    @Override
    public int compareTo(Main student) {
        int Studentenrno1 = this.studentEnr;
        Main stuObj = student;
        int enrno2 = stuObj.studentEnr;
        if (Studentenrno1 < enrno2) {
            return -1;
        } else if (Studentenrno1 > enrno2) {
            return +1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Main stu1, Main stu2) {
        return -stu1.compareTo(stu2);
    }
}