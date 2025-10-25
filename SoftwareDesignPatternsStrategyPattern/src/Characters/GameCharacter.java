package Characters;

public class GameCharacter {
    private String name;
    private AttackStrategy attackStrategy;

    public GameCharacter(String name, AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        this.name = name;
    }
    public void attack(String action) {
        System.out.print(name + " ");
        attackStrategy.attack(action);
    }
    public void newAttack(AttackStrategy newStrategy) {
        this.attackStrategy = newStrategy;
    }
}
