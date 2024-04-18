package com.assproject.inheritance;

public class InheritanceTest {
    public static void main(String args[]) {
        /**
         * I don't think we should instantiate the parent class
         * since it's already inherited by the subclass.
         */
        Student stud = new Student();
        double gradstud = stud.computeCGPA("D", 5);

        PublicUniversity pu = new PublicUniversity();
        PrivateUniversity pr = new PrivateUniversity();


        System.out.println("The CGPA of the student in a public university is : " + gradstud * pu.pointScale);
        System.out.println("The CGPA of the student in a private university is : " + gradstud * pr.pointScale);


        /**
         *  Instead the subclass should call the super class function and pass its arguments.
         */

        System.out.println("The CGPA of the student in a public university is : " + pu.computeCGPA("D", pu.pointScale));
        System.out.println("The CGPA of the student in a private university is : " + pr.computeCGPA("A", pr.pointScale));
    }

}
