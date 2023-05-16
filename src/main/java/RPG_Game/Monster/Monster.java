package RPG_Game.Monster;

public class Monster {
    public String name;
    public int hp;
    public int dp;
    public int attack;
    public int experience;

    public Monster(String name, int hp, int dp, int attack, int experience) {
        this.name = name;
        this.hp = hp;
        this.dp = dp;
        this.attack = attack;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int gethp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getExperience() {
        return experience;
    }
}
