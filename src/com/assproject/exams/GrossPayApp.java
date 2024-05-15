package com.assproject.exams;

public class GrossPayApp {
    //Gross Pay = Hours Worked X Standard Rate.

    final static float standardRate = 57.92F;

    public static void calculateGrossPay(int workHours) {
        double grossPay = workHours * standardRate;
        System.out.println("Your gross pay is: $" + grossPay);
    }

    public static void main(String[] args) {
       // calculateGrossPay(20);

        System.out.print("\\\\Can\b\\we\n\\go\t\\fishing?");
    }

}
