package hellothree;

public class Hellothree {

	String getMiddle(String word){
		return word.substring((word.length()-1)/2, word.length()/2+1);
		
		
	}
	public static void main(String[] args){
		Hellothree he = new Hellothree();
		System.out.println(he.getMiddle("power"));
	}
}
