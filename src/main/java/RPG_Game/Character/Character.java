package RPG_Game.Character;

public class Character extends CommonChar {
    private String specialAbility;


    public Character(String name, int hp, int mp, int dp, int attack, int experience, int level, int money) {
        super(name, hp, mp, dp, attack, experience, level, money);
        super.displayInfo();
        this.specialAbility = specialAbility;
    }


    public void useSpecialAbility() {
        System.out.println(name + "이(가) 특수 능력 " + specialAbility + "을(를) 사용했습니다!");
    }

    public int getlevel(){return level;}

    public int getMoney() {
        return money;
    }

    public void levelUp(){
        if(experience >= 100) {
            level++;
            experience = experience - 100;
        }
        if(level == 6) level = 5;
    }
}
