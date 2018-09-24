package lab5_inheritance;

public class Staff {
	String position;
	
	public Staff(String pos) {
		position = pos;
	}
	
	public String getPosition() {
		return position;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + "member with a " + getPosition() + "position";
	}
}
