package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("usercode:");
        student.usercode = scanner.next();
        System.out.println("username:");
        student.username = scanner.next();
        System.out.println("userpass:");
        student.userpass = scanner.next();
        System.out.println(" enter  markS:");
        List<String> list = new ArrayList();
        list.add(scanner.next());
        list.add(scanner.next());
        list.add(scanner.next());
        list.add(scanner.next());
        list.add(scanner.next());
        for (String s : list) {
            System.out.println(s);
        }
        //////////////////////////////
        Student s1 = null;
        Student s2 = null;
        Student s3 = null;
        Student s4 = null;
        Student s5 = null;

        try {
            s1 = (Student)s1.clone ();
            s2 = (Student)s2.clone ();
            s3 = (Student)s3.clone ();
            s4 = (Student)s4.clone ();
            s5 = (Student)s5.clone ();
        } catch (CloneNotSupportedException e){}
        //////////////////////////////
        System.out.println("usercode:");
        System.out.println(s1.usercode);
        System.out.println("username:");
        System.out.println(s2.username);
        System.out.println("userpass:");
        System.out.println(s3.userpass);
        System.out.println("Marks:");
        System.out.println(s5.list);




    }
}
