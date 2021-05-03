
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student creating
		Student sakin=new Student();
		sakin.setFirstName("Sakin");
		sakin.setLastName("Hayta");
		sakin.setId(1);
		sakin.setEmail("abv@gmail.com");
		sakin.setPassword("12345");
		
		Student ali=new Student();
		ali.setFirstName("Ali");
		ali.setLastName("yyy");
		ali.setId(2);
		ali.setEmail("abv3@gmail.com");
		ali.setPassword("12345");
		
		Student veli=new Student();
		veli.setFirstName("Veli");
		veli.setLastName("tt");
		veli.setId(3);
		veli.setEmail("abv4@gmail.com");
		veli.setPassword("123455");
		
		Instructor engin=new Instructor();
        engin.setFirstName("Engin");
        engin.setLastName("Demiroð");

		
		
		User[] users= {sakin,ali,veli};
		UserManager userManager=new UserManager();
		userManager.add(engin);
		userManager.addMultiply(users);
		
		veli.changePassword();
		ali.delete();
		engin.addCourse();
		
		
		
		

	}

}
