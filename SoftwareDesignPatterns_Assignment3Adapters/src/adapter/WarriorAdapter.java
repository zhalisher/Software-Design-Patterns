package adapter;

import characters.GameCharacter;
import characters.Warrior;

public class WarriorAdapter implements GameCharacter {
    private final Warrior warrior;
    public WarriorAdapter(Warrior warrior){
        this.warrior = warrior;
    }

    @Override
    public void attack() {
        warrior.swordAttack();;
    }
}
