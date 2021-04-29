package day3Hw2;

public class Instructor extends User {
	private int InstructorNumber;

	private String givenCourse;

	public Instructor() {
	}

	public Instructor(String givenCourse) {
		super();
		this.givenCourse = givenCourse;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}

	public int getInstructorNumber() {
		return InstructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		InstructorNumber = instructorNumber;
	}

}
