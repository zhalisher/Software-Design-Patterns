import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements CharacterInfo {
    private String name;
    private int health;
    private int level;

    private List<CharacterUpdate> characters = new ArrayList<>();

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
    }
    public void damageTaken(int amount){
        health -= amount;
        if(health <= 0){
            health = 0;
        }
        System.out.println(name + "took " + amount + " of damage. Current health: " + health);
        notifyCharacter();
    }
    public void heal(int amount){
        health += amount;
        if(health >= 100){
            health = 100;
        }
        System.out.println(name + " healed " + amount + " of health. Current health: " + health);
        notifyCharacter();
    }
    public void levelUp(){
        level++;
        System.out.println(name + " leveled up. Current level: " + level);
        notifyCharacter();
    }
    @Override
    public void notifyCharacter() {
        List<String> characterInfo = new ArrayList<>();
        characterInfo.add("Name: " + name);
        characterInfo.add("Health: " + health);
        characterInfo.add("Level: " + level);
        for (CharacterUpdate character : characters){
            character.update(characterInfo);
        }
    }

    @Override
    public void addCharacter(CharacterUpdate characterUpdate) {
            characters.add(characterUpdate);
    }

    @Override
    public void removeCharacter(CharacterUpdate characterUpdate) {
        characters.remove(characterUpdate);
    }
}
