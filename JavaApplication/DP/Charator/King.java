package Charator;

public class King extends Character{
	public King(WeaponBehavior w) {
		weapon=w;
	}
	public void fight() {
		weapon.useWeapon();
	}
}
