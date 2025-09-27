import adapter.MageAdapter;
import adapter.WarriorAdapter;
import characters.BasicCharacter;
import characters.GameCharacter;
import characters.Mage;
import characters.Warrior;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new BasicCharacter();
        gameCharacter.attack();

        GameCharacter warrior = new WarriorAdapter(new Warrior());
        GameCharacter mage = new MageAdapter(new Mage());

        warrior.attack();
        mage.attack();
    }
}