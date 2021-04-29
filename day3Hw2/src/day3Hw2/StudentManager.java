package day3Hw2;

public class StudentManager extends UserManager {
	public void addCourse(Student student) {
		System.out.println(
				"Öğrenci " + student.getFirstName() + " *" + student.getTakenCourse() + "* kursuna kayıt oldu");
	}

	public void getAllCoursesByStudents(Student[] students) {
		System.out.println("-------STUDENTS & COURSES-----------------");
		for (Student mainStudent : students) {
			System.out.println(
					mainStudent.getFirstName() + " " + mainStudent.getLastName() + " " + mainStudent.getTakenCourse());

		}
		System.out.println();
	}
}
