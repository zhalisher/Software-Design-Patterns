package AbstractFactory;

import Characters.ElfMage;
import Characters.ElfWarrior;
import Characters.Mage;
import Characters.Warrior;

public class ElfFactory implements CharacterFactory{
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }
}
