//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GameCharacterCreation gameCharacterCreation = new GameCharacterCreation(
                "ballm",
                "warrior",
                "male"
        );
        System.out.println(gameCharacterCreation);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        GameCharacterCreation gameCharacterBuilder = new GameCharacterCreation.Builder()
                .setName("ballmBuilder")
                .setCharacter_class("warriorBuilder")
                .setGender("maleBuilder")
                .build();
        System.out.println(gameCharacterBuilder);
    }
}