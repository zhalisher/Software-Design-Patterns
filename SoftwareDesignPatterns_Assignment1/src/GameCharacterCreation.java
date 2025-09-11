class GameCharacterCreation {
    private final String name;
    private final String character_class;
    private final String gender;

    public GameCharacterCreation(String name, String character_class, String gender) {
        this.name = name;
        this.character_class = character_class;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " name: " + name + "\n" +
                " charachter_class: " + character_class + "\n" +
                " gender: " + gender;
    }

    static class Builder{
        private String name;
        private String character_class;
        private String gender;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setCharacter_class(String character_class){
            this.character_class = character_class;
            return this;
        }
        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public GameCharacterCreation build(){
            return  new GameCharacterCreation(name, character_class, gender);
        }
    }
}



