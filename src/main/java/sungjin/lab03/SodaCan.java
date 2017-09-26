package sungjin.lab03;

public class SodaCan {

	public static void main(String[] args) {
		SodaCan root_beer = new SodaCan("root beer");
		SodaCan coke = new SodaCan("coke");
		SodaCan sprite = new SodaCan("sprite");
		coke.open();
		coke.gulps();
		sprite.open();
		sprite.sips();
		sprite.gulps();
		sprite.gulps();
		sprite.gulps();
		root_beer.open();
		root_beer.gulps();
		root_beer.sips();
		root_beer.gulps();
		System.out.println(root_beer.toString());
		System.out.println(coke.toString());
		System.out.println(sprite.toString());
	}

	public String soda_type;
	public boolean open;
	public int amount;

	public SodaCan(String soda_type) {
		this.soda_type = soda_type;
		open = false;
		amount = 250;
	}

	public void open() {
		open = true;
	}
	
	public boolean isOpen() {
		return open == true;
	}
	
	public int sips() {
		int initial_amount = 0;
		
		if (isOpen()) {
			if (amount <= 10) {
				initial_amount = amount;
				amount = 0;
				return initial_amount;
			} else {
				amount = amount - 10;
				return 10;
			}
		}
		return 0;
	}

	public int gulps() {
		int initial_amount = 0;
		
		if (isOpen()) {
			if (amount <= 50) {
				initial_amount = amount;
				amount = 0;
				return initial_amount;
			} else {
				amount = amount - 50;
				return 50;
			}
		}
		return 0;
	}

	public String toString() {
		if (open == true)
			return "Soda type: " + soda_type + " that's open with amount " + amount + "cc";
		return "Soda type: " + soda_type + " that's closed with amount " + amount + "cc";
	}
}
