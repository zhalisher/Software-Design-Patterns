import AbstractFactory.CharacterFactory;
import AbstractFactory.ElfFactory;
import Characters.Warrior;
import Characters.Mage;

public class Main {
    public static void main(String[] args) {
        CharacterFactory elfFactory = new ElfFactory();
        Warrior elfWarrior = elfFactory.createWarrior();
        Mage elfMage = elfFactory.createMage();

        elfWarrior.attack();
        elfMage.castSpell();

    }
}