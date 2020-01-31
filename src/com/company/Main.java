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

	}

    public static void setRandomMarks (Student student) {
		Random random = new Random();
		student.setGradeEnglish(random.nextInt(10-1)-1);
		student.setGradeMath(random.nextInt(10-1)-1);
		student.setGradeSport(random.nextInt(10-1)-1);
	}


}
