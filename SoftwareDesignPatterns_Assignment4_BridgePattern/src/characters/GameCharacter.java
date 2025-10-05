package characters;

import weapons.Weapon;

public abstract class GameCharacter {
    protected Weapon weapon;
    public GameCharacter(Weapon weapon){
        this.weapon = weapon;
    }
    public abstract void fight();
}
