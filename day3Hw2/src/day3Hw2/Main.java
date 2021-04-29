package day3Hw2;

public class Main {
	public static void main(String[] args) {
		// Student student1= new Student (1,"e","s","java");
		Student student1 = new Student();
		student1.setFirstName("Eyyüp");
		student1.setLastName("Sayilir");
		student1.setId(1);
		student1.setTakenCourse("Java");
		student1.setStudentNumber(111);

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ali");
		student2.setLastName("veli");
		student2.setTakenCourse("Python");
		student2.setStudentNumber(222);

		Student[] students = { student1, student2 };

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setGivenCourse("java");
		instructor1.setInstructorNumber(1111);
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("engin");
		instructor2.setLastName("Demiroğ");
		instructor2.setGivenCourse("C#");
		instructor2.setInstructorNumber(2222);
		Instructor[] instructors = { instructor1, instructor2 };

		UserManager userManager = new UserManager();
		// ogrenci olustur
		userManager.add(student1);
		// egitmen olustur
		userManager.add(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(student1);
		studentManager.getAllCoursesByStudents(students);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor2);
		instructorManager.getAllCoursesByInstructor(instructors);

	}
}
