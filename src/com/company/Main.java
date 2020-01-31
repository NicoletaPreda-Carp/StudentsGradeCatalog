package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Student jhon = new Student("John", "Dale", 10);
	Student kille = new Student("Kille", "Jason", 9);
	Student marryN = new Student("Marry", "Nicholson", 10);
	Student marryF = new Student("Marry", "Flinstone", 10);

	setRandomMarks(jhon);
	setRandomMarks(kille);
	setRandomMarks(marryF);
	setRandomMarks(marryN);

	double avaregeForJhon = jhon.calculateAverage();
	System.out.println("The average for " + jhon.get_name() + " "+ jhon.get_surname() + " is: " + avaregeForJhon);
	double avaregeForKille = kille.calculateAverage();
	System.out.println("The average for " + kille.get_name() + " "+ kille.get_surname() + " is: " + avaregeForKille);
	double avaregeForMarryF = marryF.calculateAverage();
	System.out.println("The average for " + marryF.get_name() + " "+ marryF.get_surname() + " is: " + avaregeForMarryF);
	double avaregeForMarryN = marryN.calculateAverage();
	System.out.println("The average for " + marryN.get_name() + " "+ marryN.get_surname() + " is: " + avaregeForMarryN);
	}

    public static void setRandomMarks (Student student) {
		Random random = new Random();
		student.setGradeEnglish(random.nextInt(10));
		student.setGradeMath(random.nextInt(10));
		student.setGradeSport(random.nextInt(10));
	}


}
