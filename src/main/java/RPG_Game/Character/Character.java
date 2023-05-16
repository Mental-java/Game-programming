package RPG_Game.Character;

public class Character extends CommonChar {
    private String specialAbility;


    public Character(String name, int hp, int mp, int postionNum, int attack, int experience, int level, int money,int weaponLv) {
        super(name, hp, mp, postionNum, attack, experience, level, money,weaponLv);
        super.displayInfo();
        this.specialAbility = specialAbility;
    }


    public void useSpecialAbility() {
        System.out.println(name + "이(가) 특수 능력 " + specialAbility + "을(를) 사용했습니다!");
    }

    public int getlevel(){return level;}

    public int setweaponLv(int i){return this.weaponLv = i;}

    public int getweaponLv(){return weaponLv;}


    public int getMoney() {
        return money;
    }


    }
}
