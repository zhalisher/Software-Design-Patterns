package visitors;
import gamecharacter.*;

public interface GameVisitor {
    void visit(Saber saber);
    void visit(Archer archer);
    void visit(Caster caster);
}
