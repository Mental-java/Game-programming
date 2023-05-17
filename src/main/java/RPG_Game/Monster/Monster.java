package RPG_Game.Monster;

public class Monster {
    private String name;
    private int hp;
    private int dropMoney;
    private int attack;
    private int experience;

    public Monster(String name, int hp, int dropMoney, int attack, int experience) {
        this.name = name;
        this.hp = hp;
        this.dropMoney = dropMoney;
        this.attack = attack;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getExperience() {
        return experience;
    }

    public int getDropMoney() { return dropMoney; }

    public int setHp(int x){
        return this.hp += x;
    }
}
