
public class Instructor extends User {
	
    public Instructor() {
		
	}

	private String coursesOfInstructor;
	
	
	@Override
	public void add() {
		System.out.println("Eðitmen eklendi.");
	
	}
	
	@Override
	public void delete() {
		
		System.out.println("Eðitmen çýkarýldý.");
	}
	
	public void addCourse() {
		
		System.out.println("Yeni kurs  eklendi.");
	}
	
	
	public Instructor(String coursesOfInstructor) {
		super();
		this.coursesOfInstructor = coursesOfInstructor;
	}

		public String getCoursesOfInstructor() {
			return coursesOfInstructor;
		}

		public void setCoursesOfInstructor(String coursesOfInstructor) {
			this.coursesOfInstructor = coursesOfInstructor;
		}

	}

