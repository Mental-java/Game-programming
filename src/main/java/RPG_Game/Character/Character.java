package RPG_Game.Character;

public class Character extends CommonChar {
    private String specialAbility;

    public Character(String name, int hp, int mp, int potionNum, int attack, int experience, int level, int money, int weaponLv, boolean shouting, int maxHp) {
        super(name, hp, mp, potionNum, attack, experience, level, money, weaponLv, shouting, maxHp);
        super.displayInfo();
        this.specialAbility = specialAbility;
    }

    public void useSpecialAbility() {
        System.out.println(name + "이(가) 특수 능력 " + specialAbility + "을(를) 사용했습니다!");
    }

    public int getlevel(){return level;}

    public int setweaponLv(int i){return this.weaponLv = i;}

    public int getweaponLv(){return weaponLv;}

    public int setpotionNum(int i) {return this.potionNum = i;}

    public int getpotionNum() {return potionNum;}

    public int getMoney() {
        return money;
    }

    public int setMoney(int i) {
        return this.money = i;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setShouting(boolean shouting) {
        this.shouting = shouting;
    }

    public boolean getShouting() {
        return this.shouting;
    }

    public int getHp() { return hp; }

    public int setHp(int x) { return this.hp = hp + x; }

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

    public int setPullHp(){
        return hp = maxHp;
    }

    public int drinkPotion(){
        return potionNum--;
    }

    public void levelUp() {
        if(experience >= 100) {
            System.out.println("LEVEL UP!!");
            level++;
            System.out.println("공격력 + 10");
            attack = attack + 10;
            System.out.println("MaxHp + 20");
            maxHp = maxHp + 20;
            System.out.println("레벨" + getlevel() + " 를 달성하셨습니다.\n");
            experience = experience - 100;
            if(getShouting()) {
                System.out.println("오예~");
            }
        }
        if(level == 6) level = 5;}
}
