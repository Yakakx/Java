package this_practice;

public class Animal {
	String name, move;
	public Animal() {
		
	}
	public Animal(String name, String move) {
		this.name = name;
		this.move = move;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getName() {
		return name;
	}
	public String getMove() {
		return move;
	}
}
