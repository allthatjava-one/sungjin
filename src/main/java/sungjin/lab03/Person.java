package sungjin.lab03;


public class Person {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		SodaCan sprite1 = new SodaCan("Sprite");
		sprite1.open();
		SodaCan sprite2 = new SodaCan("Sprite");
		sprite2.open();
		SodaCan coke = new SodaCan("Coke");
		coke.open();
		SodaCan rootbeer = new SodaCan("Root beer");
		rootbeer.open();
		SodaCan fanta = new SodaCan("Fanta");
		person1.takeGulp(sprite1);
		person1.takeGulp(sprite1);
		person1.takeGulp(sprite1);
		person1.takeGulp(sprite1);
		person1.takeSip(sprite1);
		person1.takeGulp(sprite2);
		person1.takeGulp(sprite2);
		person1.takeGulp(sprite2);
		person1.takeSip(sprite2);
		person1.takeSip(sprite2);
		person2.takeSip(coke);
		person2.takeGulp(coke);
		person2.takeGulp(coke);
		person2.takeGulp(coke);
		person2.takeGulp(coke);
		person3.takeGulp(rootbeer);
		person3.takeSip(rootbeer);
		person4.takeSip(fanta);
		person4.takeGulp(fanta);
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println(person4.toString());
		System.out.println(sprite1.toString());
		System.out.println(sprite2.toString());
		System.out.println(coke.toString());
		System.out.println(rootbeer.toString());
		System.out.println(fanta.toString());
	}
	
	private String thirstStatus;
	public int amountDrunk;
	
	public Person() {
		thirstStatus = "very thirsty";
		amountDrunk = 0;
	}
	
	public void takeSip(SodaCan soda_can) {
		if (soda_can.isOpen()) {
			amountDrunk += 10;
			soda_can.sips();
			changeThirstStatus();
		}
	}
	
	public void takeGulp(SodaCan soda_can) {
		if (soda_can.isOpen()) {
			amountDrunk += 50;
			soda_can.gulps();
			changeThirstStatus();
		}
	}	
	
	private void changeThirstStatus() {
		if (175 <= amountDrunk && amountDrunk < 375) {
			thirstStatus = "thirsty";
		}
		else if (375 <= amountDrunk) {
			thirstStatus = "satisfied";
		}
		else {
			thirstStatus = "very thirsty";
		}
	}
	
	public String toString() {
		return "This person is " + thirstStatus + " and has drunk " + amountDrunk + "cc";
	}
}
