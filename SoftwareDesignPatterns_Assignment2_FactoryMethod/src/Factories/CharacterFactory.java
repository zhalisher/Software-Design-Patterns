package Factories;

import Characters.GameCharacter;

public abstract class CharacterFactory {
    public abstract GameCharacter createCharacter();
    public void planAttack(){
        GameCharacter character = createCharacter();
        character.attack();
    }
}
