package visitors;

import gamecharacter.*;

public class DamageTakenVisitor implements GameVisitor{
    private int damageAmount;

    public DamageTakenVisitor(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    @Override
    public void visit(Saber saber) {
        saber.receiveDamage(damageAmount);
    }

    @Override
    public void visit(Archer archer) {
        archer.receiveDamage(damageAmount);
    }

    @Override
    public void visit(Caster caster) {
        caster.receiveDamage(damageAmount);
    }
}
