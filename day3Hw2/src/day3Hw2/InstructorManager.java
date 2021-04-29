package day3Hw2;

public class InstructorManager extends UserManager {

	public void addCourse(Instructor instructor) {
		System.out.println("E�itmen " + instructor.getFirstName() + " i�in *" + instructor.getGivenCourse()
				+ "* kursu olu�turuldu");
	}

	public void getAllCoursesByInstructor(Instructor[] instructors) {
		System.out.println("-------INSTRUCTORS & COURSES-----------------");
		for (Instructor instructor : instructors) {
			System.out.println(
					instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getGivenCourse());
		}
		System.out.println();
	}

}
