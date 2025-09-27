package adapter;

import characters.GameCharacter;
import characters.Mage;

public class MageAdapter implements GameCharacter {
    private final Mage mage;
    public MageAdapter(Mage mage){
        this.mage = mage;
    }

    @Override
    public void attack() {
        mage.castSpell();
    }
}
