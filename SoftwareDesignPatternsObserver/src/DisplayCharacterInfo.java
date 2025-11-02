import java.util.List;

public class DisplayCharacterInfo implements  CharacterUpdate{
    private String nickname;

    public DisplayCharacterInfo(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void update(List<String> info) {
        System.out.println(this.nickname + " : "  + info);
    }
}
