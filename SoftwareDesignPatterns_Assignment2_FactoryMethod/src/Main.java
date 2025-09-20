import Factories.CharacterFactory;
import Factories.MageFactory;
import Factories.WarriorFactory;

public class Main{
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        warriorFactory.planAttack();

        CharacterFactory mageFactory = new MageFactory();
        mageFactory.planAttack();
    }
}
