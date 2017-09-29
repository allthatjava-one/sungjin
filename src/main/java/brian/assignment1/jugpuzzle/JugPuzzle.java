package brian.assignment1.jugpuzzle;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author csc207student 
 *
 */
public class JugPuzzle {
	
	Jug jug0 = new Jug(8, 8);
	Jug jug1 = new Jug(5, 0);
	Jug jug2 = new Jug(3, 0);
	List<Jug> jugs = new ArrayList<>();
	
	public JugPuzzle() {
		jugs.add(jug0);
		jugs.add(jug1);
		jugs.add(jug2);
	}
	
	
	int moves;

	public boolean getIsPuzzleSolved() {
		return jugs.get(0).getSize() == 4 && jugs.get(1).getSize() == 4;
	}

	public void move(int from, int to) {
		
		Jug fromJug = jugs.get(from);
		Jug toJug = jugs.get(to);
		
		while( !fromJug.isEmpty()							// From Jug is Not Empty
				&& toJug.getSize() != toJug.MAX_SIZE )		// To Jug is not full
		{
			fromJug.spillTo(toJug);							// Then pour 1 liquid to toJug
		}

		moves++;
	}

	public int getMoves() {
		return moves;
	}

	public String toString(){
		return String.format("%d 0:%s 1:%s 2:%s", moves
				, jugs.get(0).toString(), jugs.get(1).toString(), jugs.get(2).toString() );
	}
	
	/**
	 * <pre>
	 * sdfasdf 
	 * sdaf asd
	 * sad fsadf 
	 * 
	 * </pre>
	 * @author javajjang
	 *
	 */
	public class Jug{
		
		List<String> liquids = new ArrayList<>();
		private final int MAX_SIZE;
		
		public Jug(int maxSize, int initialSize)
		{
			MAX_SIZE=maxSize;
			liquids = new ArrayList<>(MAX_SIZE);

			for(int i=0; i < initialSize; i++)
				liquids.add("X");
		}
		
		public void spillTo(Jug toJug)
		{
			toJug.addLiquid( liquids.remove(liquids.size()-1) );
		}
		
		private void addLiquid(String liquid)
		{
			liquids.add(liquid);
		}
		
		public int getSize() {
			return liquids.size();
		}
		
		public boolean isEmpty() {
			return liquids.isEmpty();
		}
		
		public String toString() {
			return String.format("(%d/%d)", getSize(), MAX_SIZE);
		}
	}
}
