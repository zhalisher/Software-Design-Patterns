package gamecharacter;

import visitors.GameVisitor;

public class Caster implements GameCharacter{
    private int hp = 100;

    public void reveivHealing(int amount){
        hp += amount;
        if (hp >= 100) hp = 100;
        System.out.println("Caster healed " + amount + ", HP now " + hp);
    }
    public void receiveDamage(int amount){
        hp -= amount;
        if(hp <= 0) hp = 0;
        System.out.println("Caster taken + " + amount + " of damage, HP now " + hp);
    }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}
