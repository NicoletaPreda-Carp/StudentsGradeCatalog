package com.company;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int gradeMath;
    private int gradeEnglish;
    private int gradeSport;

    public Student (String name, String surname, int age) {
        name = this.name;
        surname = this.surname;
        age = this.age;
    }

    public double calculateAverage () {
        return (this.gradeEnglish + this.gradeMath + this.gradeSport) / 3;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public int getGradeEnglish() {
        return gradeEnglish;
    }

    public void setGradeEnglish(int gradeEnglish) {
        this.gradeEnglish = gradeEnglish;
    }

    public int getGradeSport() {
        return gradeSport;
    }

    public void setGradeSport(int gradeSport) {
        this.gradeSport = gradeSport;
    }
}
