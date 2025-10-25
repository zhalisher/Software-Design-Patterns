import Characters.Archer;
import Characters.AttackStrategy;
import Characters.Caster;
import Characters.GameCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter Gilgamesh = new GameCharacter("Gilgamesh", new Archer());
        GameCharacter Merlin = new GameCharacter("Merlin", new Caster());

        Gilgamesh.attack("uses range attacks");
        Merlin.attack("casts great spells");

        Gilgamesh.newAttack(new Caster());
        Gilgamesh.attack(", now started to casts spells");
    }
}