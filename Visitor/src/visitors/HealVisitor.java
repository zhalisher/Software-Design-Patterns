package visitors;

import gamecharacter.*;

public class HealVisitor implements GameVisitor{
    private int healAmoumt;

    public HealVisitor(int healAmoumt) {
        this.healAmoumt = healAmoumt;
    }

    @Override
    public void visit(Saber saber) {
        saber.reveivHealing(healAmoumt);
    }

    @Override
    public void visit(Archer archer) {
        archer.reveivHealing(healAmoumt);
    }

    @Override
    public void visit(Caster caster) {
        caster.reveivHealing(healAmoumt);
    }
}
