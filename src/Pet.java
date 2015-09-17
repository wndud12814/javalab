public class Pet extends Animal {
	private String name;
	private int age;
	private double weight;

	public String toString() {
		return ("Name : " + name + "\nAge:" + age + "years" + "\nWeight" + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight , String gender) {
		this.name = initialName;
		this.age = initialAge;
		this.weight = initialWeight;
		this.gender = gender;
	}

	public Pet(String initialName, int initialAge, double initialWeight) {
		this.name = initialName;
		this.age = initialAge;
		this.weight = initialWeight;
	}
	//오버로딩
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	public Pet(int initialAge) {
		name = "No name yert.";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}

	public Pet() {
		name = "No name yer.";
		age = 0;
		weight = 0;
	}

	public void set(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getWeight() {
		return this.weight;
	}
}