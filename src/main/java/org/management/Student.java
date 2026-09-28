package org.management;

public class Student {
    private int id;
    private String studentName;

    public Student(String studentPhone, String studentCity, String studentName) {
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.studentName = studentName;
    }

    private String studentPhone;
    private String studentCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public Student(String studentCity, String studentPhone, String studentName, int id) {
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
        this.studentName = studentName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
