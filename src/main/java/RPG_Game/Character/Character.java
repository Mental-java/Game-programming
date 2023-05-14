package RPG_Game.Character;

public class Character extends CommonChar {
    private String specialAbility;


    public Character(String name, int health, int mana, int attack, int experience,int level, String specialAbility) {
        super(name, health, mana, attack, experience, level);
        super.displayInfo();
        this.specialAbility = specialAbility;
    }

    public void useSpecialAbility() {
        System.out.println(name + "이(가) 특수 능력 " + specialAbility + "을(를) 사용했습니다!");
    }

    public int getlevel(){return level;}

}
