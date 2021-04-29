package day3Hw2;

public class Student extends User {
	private int studentNumber;
	private String takenCourse;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, int studentNumber, String takenCourse) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
		this.studentNumber = studentNumber;
		this.takenCourse = takenCourse;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}

}
