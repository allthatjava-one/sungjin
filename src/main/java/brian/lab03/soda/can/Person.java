package brian.lab03.soda.can;

/**
 * 
 * 2. Class Person

Implement the class Person using instance variables and methods to capture the following:
A Person has a thirstStatus which is 'satisfied', 'thirsty' or 'very thirsty', and amountDrunk which keeps track of how much soda they have drunk so far.
A very thirsty person has drank no soda. A thirsty person has already drank 175cc of soda. A satisfied Person has drank 375cc of soda.
Initially, a Person is very thirsty.
A person can takeSip(SodaCan), they can also takeGulp(SodaCan).
The string representation of a Person displays their thirstStatus and their amountDrunk.<br />
<br />
 - Person has properties<br />
 	thirstStatus ('satisfied', 'thirsty' or 'very thirsty')<br />
 	amountDrink - keeps track of how much soda they have drunk<br />
 	<br />
 - 'very thirsty' person had no drink<br />
 - 'thirsty' person had 175cc<br />
 - 'satisfied' person had 375cc<br />
 - Initially the person is thirsty<br />
 <br />
 - operation takeSip(SodaCan), takeGulp(SodaCan)<br />
 <br />
 - toString shows thirstStatus and amoutDrunk<br />

 * 
 * @author javajjang
 *
 */
public class Person {
	
	private String name;
	
	private String thirstStatus = "thirsty";
	private int amountDrunk = 0;
						
	/**
	 * 
	 * @param name - The person who will drink soda
	 */
	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThirstStatus() {
		return thirstStatus;
	}

	public void setThirstStatus(String thirstStatus) {
		this.thirstStatus = thirstStatus;
	}

	public int getAmountDrunk() {
		return amountDrunk;
	}

	public void setAmountDrunk(int amountDrunk) {
		this.amountDrunk = amountDrunk;
	}

	public void takeSip(SodaCan sodaCan)
	{
		amountDrunk += sodaCan.sips();
		thirstStatus = changeStatus(amountDrunk);
	}
	
	public void takeGulp(SodaCan sodaCan)
	{
		amountDrunk += sodaCan.gulps();
		thirstStatus = changeStatus(amountDrunk);
	}
	
	/** 
	 * Returns something that has been entereds.faslkdjkflsj
	 * 
	 * Person p = new Person("Bob");
	 * p.setSoda(new Soda("sdfk"));
	 * 
	 * p.changeStatus(true); // change it to true whens lfkjsla js
	 * 
	 * @param amountDrunk
	 * @return String which will represent how much has been drunk
	 */
	public String changeStatus(int amountDrunk)
	{
		return amountDrunk < 175 ? "very thirsty" 
				: amountDrunk < 375 ? 
						"thirsty" : "satisfied"; 
	}
	
	/**
	 * The string representation of a Person displays their thirstStatus and their amountDrunk.
	 */
	public String toString()
	{
		return String.format("Thirst Status: %s, amount drank: %d", thirstStatus, amountDrunk);
	}
}
