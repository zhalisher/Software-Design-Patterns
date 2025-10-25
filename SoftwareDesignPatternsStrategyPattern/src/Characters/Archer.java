package Characters;

public class Archer implements AttackStrategy{
    @Override
    public void attack(String action) {
        System.out.println("Archer " + action);
    }
}
