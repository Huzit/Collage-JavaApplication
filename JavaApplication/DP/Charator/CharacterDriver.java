package Charator;

import java.util.ArrayList;

public class CharacterDriver {
	public static void main(String[] args) {
		
	ArrayList<Character> characters = new ArrayList<>();
	characters.add(new King(new AxeBehavior()));
	characters.add(new Queen(new SwordBehavior()));
	characters.add(new King(new SwordBehavior()));
	
	for(int i = 0; i<characters.size(); i++) {
		Character c = characters.get(i);
		c.fight();
	}
}
}
