
public class Student extends User {
	
	private String coursesOfStudent;
	private String email;
	private String password;
	
	
	public Student() {
		
	}
	
	
	public Student(String coursesOfStudent, String email, String password) {
		super();
		this.coursesOfStudent = coursesOfStudent;
		this.email = email;
		this.password = password;
	}
	
	
	@Override
	public void add() {
		System.out.println("Öðrenci eklendi.");
	}
	
	@Override
    public void delete() {
		
		System.out.println("Öðrenci çýkarýldý.");
	}

	public void changePassword() {
		System.out.println("Parola deðiþtirildi.");
	}
	

	//get-set for all
	public String getCoursesOfStudent() {
		return coursesOfStudent;
	}
	public void setCoursesOfStudent(String coursesOfStudent) {
		this.coursesOfStudent = coursesOfStudent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
