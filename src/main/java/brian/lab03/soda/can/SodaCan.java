package brian.lab03.soda.can;

import java.util.Random;

/**
 * 
 * 1. Class SodaCan

Implement the class SodaCan using instance variables and methods to capture the following (see hints):
A SodaCan has a type (i.e. Coke, Sprite, Root Beer), it is either open or closed, it has an amount of soda in it (at least 0).
For this question, assume that SodaCans start out closed with 250cc of soda in them.
A SodaCan be opened (but can't be closed once opened).
Once open, either sips (remove 10cc) or gulps (remove 50cc) can be taken from them. Remember, amount must be at least 0 (i.e. if removing 10cc would make amount negative, amount should become 0). Both methods should return the amount of soda actually removed.
The string representation (from method toString) of a SodaCan displays its type, whether or not it is open/closed, and its amount.
Once you are done implementing this class, write a main method which creates a few SodaCans and then takes sips and gulps from them.
 
 - SodaCan has properties
 	type 			(Coke, Sprite, Root Beer ...)
 	open indicator	( true, false )
 	amount			( 100, 200, ... )
 	
 - SodaCans started as
 	closed
 	250cc
 	- type -> should be provided 
 	
 - SodaCan be opened but, once it is opened it cannot be closed
 - Operations 
 	sips() takes 10cc 
 	gulps() takes 50cc
 - Amount cannot go under 0
 - toString() should display the type, opened or not, amount
 
 * @author javajjang
 *
 */
public class SodaCan implements Can{
	
	private static final int SIP_AMOUNT=10;
	private static final int GULP_AMOUNT=50;

	private String type;
	private boolean isOpened=false;
	private int amount=250;
	
	public SodaCan(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isOpened() {
		return isOpened;
	}
	public void setOpened(boolean isOpened) {
		if(this.isOpened == true) {
			System.out.println("It is already opened.");
		}
			
		this.isOpened = isOpened;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	
	public boolean isEmpty() {
		if ( this.amount <= 0 ) {
			System.out.println("This can is empty");
			return true;
		}
		
		return false;
	}

	public String toString() {
		return String.format("%s is %s and %dcc left", type, (isOpened?"opened":"closed"), amount );
	}
	
	public static void main(String[] args) {
		SodaCan coke = new SodaCan("Coke");

		Random r = new Random();
		while( true )
		{
			if( coke.isOpened() == false ) {
				coke.setOpened(true);
				System.out.println(String.format("Opening the can of %s",coke.getType()));
			}
			
			if( coke.isEmpty() )
				break;
			
			int drinkingType = r.nextInt(2);
			System.out.println(String.format( "%s %scc and %s", (drinkingType==1?"Sipped":"Gupled"), (drinkingType==1?coke.sips():coke.gulps()), coke));
		}
	}

	public int sips() {
		int removingAmount = 0;
		
		if( isOpened() == false) {
			System.out.println("The can is closed. Open it first");
		}else {
			if( isEmpty() == false ) {
				removingAmount = this.amount-SIP_AMOUNT >= 0 ? SIP_AMOUNT : this.amount;
				this.amount = this.amount-removingAmount;
			}
		}
		
		return removingAmount;
	}
	
	public int gulps() {
		int removingAmount = 0;

		if( isOpened() == false) {
			System.out.println("The can is closed. Open it first");
		}else {
			if( isEmpty() == false ) {
				removingAmount = this.amount-GULP_AMOUNT >= 0 ? GULP_AMOUNT : this.amount;
				this.amount = this.amount-removingAmount;
			}
		}
		
		return removingAmount;
	}
}
