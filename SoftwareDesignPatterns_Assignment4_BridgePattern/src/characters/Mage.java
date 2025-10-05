package characters;

import weapons.Weapon;

public class Mage extends GameCharacter{
    public Mage(Weapon weapon){
        super(weapon);
    }
    @Override
    public void fight() {
        System.out.print("Mage ");
        weapon.useWeapon();
    }
}
