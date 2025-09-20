package AbstractFactory;

import Characters.Mage;
import Characters.Warrior;

public interface CharacterFactory {
    Warrior createWarrior();
    Mage createMage();
}
