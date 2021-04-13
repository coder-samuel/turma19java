package Species;

public class AnimalRegistration {
	//attributes
	private String name;
	private int age;
	private char sound;
	//encapsulation
	public AnimalRegistration(String name, int age, char sound) {
		super();
		this.name = name;
		this.age = age;
		this.sound = sound;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSound() {
		return sound;
	}
	public void setSound(char sound) {
		this.sound = sound;
	}
	
	
	
	//methods
	
	
}
