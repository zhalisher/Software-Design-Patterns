package gamecharacter;

import visitors.GameVisitor;

public interface GameCharacter {
    void accept(GameVisitor visitor);
}
