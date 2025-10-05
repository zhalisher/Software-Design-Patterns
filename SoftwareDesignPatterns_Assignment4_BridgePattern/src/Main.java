import characters.GameCharacter;
import characters.Mage;
import characters.Warrior;
import weapons.Grimoire;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior(new Sword());
        GameCharacter mage = new Mage(new Grimoire());

        warrior.fight();
        mage.fight();
    }
}