package Charator;

public class Character {
	WeaponBehavior weapon;
	
	public void fight() {
		System.out.println("무기가 없다");
	}
	
	public void setWeapon(WeaponBehavior w) {
		weapon=w;
	}
}
