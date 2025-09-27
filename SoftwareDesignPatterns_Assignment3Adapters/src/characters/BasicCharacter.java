package characters;

import java.sql.SQLOutput;

public class BasicCharacter implements GameCharacter{
    @Override
    public void attack() {
        System.out.println("Character attacks with basic attack");
    }
}
