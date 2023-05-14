package RPG_Game.Character;

public class CommonChar {
    protected String name;
    protected int health;
    protected int mana;
    protected int attack;
    protected int experience;
    protected int level;

    public CommonChar(String name, int health, int mana, int attack, int experience,int level) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.experience = experience;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("캐릭터 정보:");
        System.out.println("이름: " + name);
        System.out.println("체력: " + health);
        System.out.println("마나: " + mana);
        System.out.println("공격력: " + attack);
        System.out.println("경험치: " + experience);
        System.out.println("레벨: "+level);
    }
}
