import Characters.Mage;
import Characters.Warrior;
import Characters.Character;
import Decorator.CharacterDecorator;
import Decorator.SupporCharacterDecorator;


public class Main {
    public static void main(String[] args) {
        CharacterFacade characterFacade = new CharacterFacade();

        System.out.println("FACADE PATTERN");

        characterFacade.characterAction();

        System.out.println("DECORATOR PATTERN");

        Character warrior = new Warrior();
        Character warriorSupport = new SupporCharacterDecorator(warrior);
        warriorSupport.doSmth();

        Character mage = new Mage();
        Character mageSupport = new SupporCharacterDecorator(mage);
        mageSupport.doSmth();

    }
}