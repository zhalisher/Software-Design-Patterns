import Characters.Mage;
import Characters.Priest;
import Characters.Warrior;

public class CharacterFacade{
    private Warrior warrior;
    private Mage mage;
    private Priest priest;

    public CharacterFacade() {
        this.warrior = new Warrior();
        this.mage = new Mage();
        this.priest = new Priest();
    }
    public void characterAction(){
        warrior.doSmth();
        mage.doSmth();
        priest.doSmth();
    }
}
