package characters;

import weapons.Weapon;

public class Warrior extends GameCharacter {
    public Warrior(Weapon weapon){
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("Warrior ");
        weapon.useWeapon();
    }
}
