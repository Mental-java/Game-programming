package RPG_Game.Character;

public class CommonChar {
    protected String name;
    protected int hp;
    protected int mp;
    protected int dp;
    protected int attack;
    protected int experience;
    protected int level;
    protected int money;

    public CommonChar(String name, int hp, int mp, int dp, int attack, int experience, int level, int money) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.dp = dp;
        this.attack = attack;
        this.experience = experience;
        this.level = level;
        this.money = money;
    }

    public void displayInfo() {
        System.out.println("~~~~~~ 캐릭터 정보 ~~~~~~");
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp);
        System.out.println("마나 : " + dp);
        System.out.println("공격력 : " + attack);
        System.out.println("경험치 : " + experience);
        System.out.println("레벨 : " + level);
        System.out.println("돈 : " + money);
    }
}
