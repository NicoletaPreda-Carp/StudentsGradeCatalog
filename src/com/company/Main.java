package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Student jhon = new Student("John", "Dale", 10);
	Student kille = new Student("Kille", "Jason", 9);
	Student marryN = new Student("Marry", "Nicholson", 10);
	Student marryF = new Student("Marry", "Flinstone", 10);

	ArrayList<Student> classMembers = new ArrayList<Student>();

	classMembers.add(kille);
	classMembers.add(jhon);
	classMembers.add(marryF);
	classMembers.add(marryN);

	setRandomMarks(jhon);
	setRandomMarks(kille);
	setRandomMarks(marryF);
	setRandomMarks(marryN);

	displayAverageGrades(jhon);
	displayAverageGrades(kille);
	displayAverageGrades(marryF);
	displayAverageGrades(marryN);

	displayAverageAge(classMembers);
	}

	private static void displayAverageGrades(Student student) {
		double avaregeForJhon = student.calculateAverage();
		System.out.println("The average for " + student.get_name() + " "+ student.get_surname() + " is: " + avaregeForJhon);
	}

	public static void setRandomMarks (Student student) {
		Random random = new Random();
		student.setGradeEnglish(random.nextInt(10));
		student.setGradeMath(random.nextInt(10));
		student.setGradeSport(random.nextInt(10));
	}

	private static void displayAverageAge (ArrayList<Student> students) {
    	int sumOfAges = 0;
    	for (int i = 0; i< students.size(); i++ ) {
			sumOfAges += students.get(i).get_age();
		}
		System.out.println("Average class age: " + (double) sumOfAges / students.size());
	}



}
