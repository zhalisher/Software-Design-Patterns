package Characters;

public class Caster implements AttackStrategy{
    @Override
    public void attack(String action) {
        System.out.println("Caster " +  action);
    }
}
