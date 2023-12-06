package koschei.models;

public class Egg6 {
	
	private Needle7 needle7;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }

	public Egg6(Needle7 needle7) {
		super();
		this.needle7 = needle7;
	}
    
    
}
