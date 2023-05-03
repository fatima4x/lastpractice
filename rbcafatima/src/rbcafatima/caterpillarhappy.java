package rbcafatima;

public class caterpillarhappy {
int moves,cabbages;
	
	caterpillarhappy(int moves, int cabbages)
	{
	  this.moves=moves;
	  this.cabbages=cabbages;
	}
	int get_moves() {
		return moves;
	}
	
	void move()
	{
		moves++;
	}
	void eat()
	{
		cabbages++;
	}
	void display_info()
	{
		System.out.println("Cabbages eaten is"+cabbages);
		System.out.println("Moves made is"+moves);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
