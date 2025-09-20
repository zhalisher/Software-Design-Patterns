package Factories;


import Characters.GameCharacter;
import Characters.Warrior;

public class WarriorFactory extends CharacterFactory{
    @Override
    public GameCharacter createCharacter() {
        return new Warrior();
    }
}
