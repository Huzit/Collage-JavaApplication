package Charator;

public class Queen extends Character {
	public Queen(WeaponBehavior w) {
		weapon=w;
	}
	public void fight(){
		weapon.useWeapon();
	}
}
