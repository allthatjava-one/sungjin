package brian.lab03.soda.can;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonAndSodaCan {

	/**
	 * 3. Playing with both classes

Within a main method, create a few SodaCans and a few Persons.
Open some of the SodaCans and have the Persons take some sips and gulps from them. 
You should see the amount of soda in the cans drop at the same time the amount of soda that the person has drunk going up. 
You should see some of the People going from 'very thirsty' to 'thirsty' to 'satisfied'.
Given time, write some test cases and JavaDoc your code.

	 * @param args
	 */
	public static void main(String[] args) {
//		SodaCan[] cans = {new SodaCan("Coke"),new SodaCan("Sprite"),new SodaCan("Root Bear")};
		String[] sodaType = {"Coke", "Sprite", "Root Bear"};
		
		Random random = new Random();
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Bob"));
		people.add(new Person("Harry"));
		people.add(new Person("Tom"));
		
		OUTER:
		while(!people.isEmpty())
		{
			Person person = people.get(random.nextInt(people.size()));
			System.out.println(String.format("%s approches", person.getName()));
			
			while(!"satisfied".equals(person.getThirstStatus()))
//			while(!person.getThirstStatus().equals("satisfied"))
			{
				int n = random.nextInt(3);
				SodaCan selectedCan = new SodaCan(sodaType[n]);
				System.out.println(String.format("%s took %s", person.getName(), selectedCan.getType()));
				selectedCan.setOpened(true);
				
				while( !selectedCan.isEmpty() )
				{
					int typeOfDrinking = random.nextInt(2);
					if( typeOfDrinking == 0)
					{
						person.takeSip(selectedCan);
						System.out.println(String.format("%s took a sip of %s", person.getName(), selectedCan.getType()));
					}else {
						person.takeGulp(selectedCan);
						System.out.println(String.format("%s took a gulf of %s", person.getName(), selectedCan.getType()));
					}
					
					if("satisfied".equals(person.getThirstStatus())) {
						System.out.println(person);
						people.remove(person);
						continue OUTER;
					}else
						System.out.println(String.format("%s drank %d and feel %s. Can has %d left", 
								person.getName(), person.getAmountDrunk(), person.getThirstStatus(), selectedCan.getAmount()));
				}
			}
			
		}
	}
}
