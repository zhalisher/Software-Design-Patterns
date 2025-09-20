package Factories;

import Characters.GameCharacter;
import Characters.Mage;

public class MageFactory extends CharacterFactory{
    @Override
    public GameCharacter createCharacter() {
        return new Mage();
    }
}
