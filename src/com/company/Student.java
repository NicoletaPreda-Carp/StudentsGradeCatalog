package com.company;

public class Student {
    private String _name;
    private String _surname;
    private int _age;
    private int gradeMath;
    private int gradeEnglish;
    private int gradeSport;

    public Student (String name, String surname, int age) {
        this._name = name;
        this._surname = surname;
        this._age = age;
    }

    public double calculateAverage () {
        return (double)(this.gradeEnglish + this.gradeMath + this.gradeSport) / 3;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
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
