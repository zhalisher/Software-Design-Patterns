package Decorator;

import Characters.Character;
import Characters.Priest;

public class SupporCharacterDecorator extends CharacterDecorator {
    Priest priest = new Priest();
    public SupporCharacterDecorator(Character decCharacter) {
        super(decCharacter);
    }
    @Override
    public void doSmth() {
        support(decoratedCharacter);
    }
    public void support(Character decoratedCharacter){
        priest.doSmth();
        System.out.println(decoratedCharacter.getClass().getName());

    }
}
