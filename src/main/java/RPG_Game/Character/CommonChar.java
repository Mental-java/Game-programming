package RPG_Game.Character;

public class CommonChar {
    public String name;
    public int hp;
    public int mp;
    public int postionNum;
    public int attack;
    public int experience;
    public int level;
    public int money;
    public int weaponLv;



    public CommonChar(String name, int hp, int mp, int postionNum, int attack, int experience, int level, int money, int weaponLv) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.postionNum = postionNum;
        this.attack = attack;
        this.experience = experience;
        this.level = level;
        this.money = money;
        this.weaponLv = weaponLv;
    }



    public void displayInfo() {
        System.out.println("~~~~~~ 캐릭터 정보 ~~~~~~");
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp);
        System.out.println("포션 개수 : " + postionNum);
        System.out.println("공격력 : " + attack);
        System.out.println("경험치 : " + experience);
        System.out.println("레벨 : " + level);
        System.out.println("돈 : " + money);
        System.out.println("무기 레벨 = " + weaponLv);
    }
}
