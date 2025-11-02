public class Main {
    public static void main(String[] args) {
        DisplayCharacterInfo partyDisplay = new DisplayCharacterInfo("Party");

        GameCharacter character1 = new GameCharacter("Gilgamesh");
        GameCharacter character2 = new GameCharacter("Merlin");

        character1.addCharacter(partyDisplay);
        character2.addCharacter(partyDisplay);

        character2.damageTaken(50);
        character2.removeCharacter(partyDisplay);
        // ??
        character2.damageTaken(20);
    }
}