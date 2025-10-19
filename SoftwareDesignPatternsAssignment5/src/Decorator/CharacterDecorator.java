package Decorator;

import Characters.Character;

public class CharacterDecorator implements Characters.Character {
    protected Characters.Character decoratedCharacter;
    public CharacterDecorator(Character decoratedCharacter){
        this.decoratedCharacter = decoratedCharacter;
    }

    @Override
    public void doSmth() {
        decoratedCharacter.doSmth();
    }
}
