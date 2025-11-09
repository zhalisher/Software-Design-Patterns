package client;
import gamecharacter.*;
import visitors.*;
public class Main {
    public static void main(String[] args) {
        HealVisitor smallHeal = new HealVisitor(20);
        HealVisitor bigHeal = new HealVisitor(60);
        HealVisitor fullHeal = new HealVisitor(100);

        DamageTakenVisitor smallDmg = new DamageTakenVisitor(20);
        DamageTakenVisitor bigDmg =  new DamageTakenVisitor(60);
        DamageTakenVisitor fullDmg = new DamageTakenVisitor(100);

        Saber saber = new Saber();
        Archer archer = new Archer();
        Caster caster = new Caster();


        saber.accept(bigDmg);
        saber.accept(smallHeal);
    }
}