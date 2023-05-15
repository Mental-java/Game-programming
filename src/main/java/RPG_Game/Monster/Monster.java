package RPG_Game.Monster;

public class Monster {
    private String name;
    private int health;
    private int attack;

    private int experience;

    public Monster(String name, int health, int attack,int experience) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getExperience() {
        return experience;
    }
}
