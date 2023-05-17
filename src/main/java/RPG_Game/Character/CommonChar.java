package RPG_Game.Character;

public class CommonChar {
    public String name;
    public int hp;
    public int mp;
    public int potionNum;
    public int attack;
    public int experience;
    public int level;
    public int money;
    public int weaponLv;
    public boolean shouting;
    public int maxHp;

    public int maxMp;


    public CommonChar(String name, int hp, int mp, int potionNum, int attack, int experience, int level, int money, int weaponLv, boolean shouting,int maxHp,int maxMp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.potionNum = potionNum;
        this.attack = attack;
        this.experience = experience;
        this.level = level;
        this.money = money;
        this.weaponLv = weaponLv;
        this.shouting = shouting;
        this.maxHp = maxHp;
        this.maxMp=maxMp;
    }



    public void displayInfo() {
        System.out.println("~~~~~~ 캐릭터 정보 ~~~~~~");
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp+" / "+maxHp);
        System.out.println("마나 : "+mp+" / "+maxMp);
        System.out.println("포션 개수 : " + potionNum);
        System.out.println("공격력 : " + attack);
        System.out.println("경험치 : " + experience);
        System.out.println("레벨 : " + level);
        System.out.println("돈 : " + money);
        System.out.println("무기 레벨 = " + weaponLv);
        System.out.println("샤우팅 : " + shouting);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
