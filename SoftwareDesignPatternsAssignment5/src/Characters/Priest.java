package Characters;
// main purpose to use in decorator , but can be used in facade as well (just in decorator it would match to other classes)
public class Priest implements Character{
    @Override
    public void doSmth() {
        System.out.println("Priest casts a healing/supporting spell on ");
    }
}
