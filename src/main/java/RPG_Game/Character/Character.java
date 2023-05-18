package RPG_Game.Character;

import RPG_Game.Monster.Monster;

public class Character extends CommonChar {
    private String specialAbility;

    public Character(String name, int hp, int mp, int potionNum, int attack, int experience, int level, int money, int weaponLv, boolean shouting, int maxHp, int maxMp) {
        super(name, hp, mp, potionNum, attack, experience, level, money, weaponLv, shouting, maxHp, maxMp);
        displayInfo();
    }

    public void useSpecialAbility() {
        System.out.println(name + "이(가) 특수 능력 " + specialAbility + "을(를) 사용했습니다!");
    }

    public void increaseMp(int amount) {
        mp += amount;
        if (mp > maxMp) {
            mp = maxMp;
        }
    }

    public int setweaponLv(int i){return this.weaponLv = i;}

    public int getweaponLv(){return weaponLv;}

    public int setpotionNum(int i) {return this.potionNum = i;}

    public int getpotionNum() {return potionNum;}

    public int getMoney() {
        return money;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int setMoney(int i) {
        return this.money = i;
    }
    public void setShouting(boolean shouting) {
        this.shouting = shouting;
    }
    public boolean getShouting() {
        return this.shouting;
    }

    public int getHp() {
        return hp;
    }

    public int setHp(int x) {
        return this.hp = hp + x;
    }

    public String getName() {
        return name;
    }

    public int setExperience(int x) {
        return this.experience += x;
    }

    public int plusMoney(int x){
        return this.money += x;
    }

    public int getMaxHp(){
        return maxHp;
    }

    public void setFullHp(){ hp = maxHp; }

    public int drinkPotion(){
        return potionNum--;
    }

    public void levelUp() {
        if(experience >= 100) {
            if(getShouting()) {
                System.out.println(
                                "            [LEVEL UP]\n" +
                                "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢠⣴⣾⣿⣶⣶⣆⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀\n" +
                                "⢀⢀⢀⣀⢀⣤⢀⢀⡀⢀⣿⣿⣿⣿⣷⣿⣿⡇⢀⢀⢀⢀⣤⣀⢀⢀⢀⢀⢀\n" +
                                "⢀⢀ ⣶⢻⣧⣿⣿⠇ ⢸⣿⣿⣿⣷⣿⣿⣿⣷⢀⢀⢀⣾⡟⣿⡷⢀⢀⢀⢀\n" +
                                "⢀⢀⠈⠳⣿⣾⣿⣿⢀⠈⢿⣿⣿⣷⣿⣿⣿⣿⢀⢀⢀⣿⣿⣿⠇⢀⢀⢀⢀\n" +
                                "⢀⢀⢀⢀⢿⣿⣿⣿⣤⡶⠺⣿⣿⣿⣷⣿⣿⣿⢄⣤⣼⣿⣿⡏⢀⢀⢀⢀⢀\n" +
                                "⢀⢀⢀⢀⣼⣿⣿⣿⠟⢀⢀⠹⣿⣿⣿⣷⣿⣿⣎⠙⢿⣿⣿⣷⣤⣀⡀⢀⢀\n" +
                                "⢀⢀⢀ ⢸⣿⣿⣿⡿⢀⢀⣤⣿⣿⣿⣷⣿⣿⣿⣄⠈⢿⣿⣿⣷⣿⣿⣷⡀⢀\n" +
                                "⢀⢀⢀⣿⣿⣿⣿⣷⣀⣀⣠⣿⣿⣿⣿⣷⣿⣷⣿⣿⣷⣾⣿⣿⣿⣷⣿⣿⣿⣆\n" +
                                "⣿⣿⠛⠋⠉⠉⢻⣿⣿⣿⣿⡇⡀⠘⣿⣿⣿⣷⣿⣿⣿⠛⠻⢿⣿⣿⣿⣿⣷⣦\n" +
                                "⣿⣿⣧⡀⠿⠇⣰⣿⡟⠉⠉⢻⡆⠈⠟⠛⣿⣿⣿⣯⡉⢁⣀⣈⣉⣽⣿⣿⣿⣷\n" +
                                "⡿⠛⠛⠒⠚⠛⠉⢻⡇⠘⠃⢸⡇⢀⣤⣾⠋⢉⠻⠏⢹⠁⢤⡀⢉⡟⠉⡙⠏⣹\n" +
                                "⣿⣦⣶⣶⢀⣿⣿⣿⣷⣿⣿⣿⡇⢀⣀⣹⣶⣿⣷⠾⠿⠶⡀⠰⠾⢷⣾⣷⣶⣿\n" +
                                "⣿⣿⣿⣿⣇⣿⣿⣿⣷⣿⣿⣿⣇⣰⣿⣿⣷⣿⣿⣷⣤⣴⣶⣶⣦⣼⣿⣿⣿⣷\n");
            }else{
                System.out.println("[LEVEL UP]");
            }
            level++;
            System.out.println("[공격력 + 10]");
            attack = attack + 10;
            System.out.println("[MaxHp + 20]");
            maxHp = maxHp + 20;
            System.out.println("[레벨" + getlevel() + " 를 달성하셨습니다.]\n");
            experience = experience - 100;
        }
        if(level == 6) level = 5;}

    public int getlevel() {
        return this.level;
    }

    public void setMp(int i) {
        this.mp = mp + i;
    }

    public void setFullMp() {  mp = maxMp; }

    public int getMp() {
        return this.mp;
    }

    public int getMaxMp() {
        return this.maxMp;
    }
}
