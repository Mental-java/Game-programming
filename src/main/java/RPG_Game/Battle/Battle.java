package RPG_Game.Battle;

import RPG_Game.Character.Character;
import RPG_Game.Character.Skill;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class Battle implements Skill {

    private Character character;
    private Monster monster;
    private int selectNum;
    /* 선택지 고르기 */
    private int newMonsterHp;
    /* 새로운 몬스터의 피 */

    public Battle(Character character, Monster monster){
        this.character = character;
        this.monster = monster;
        this.newMonsterHp = monster.getHp();
    }
    public void fightMonster(){
        Scanner sc = new Scanner(System.in);
        /* 몬스터의 피를 리셋하여 새로운 몬스터를 생성한 것처럼 구현 */
        if(newMonsterHp<=0) newMonsterHp = monster.getHp();

        do{
            System.out.println("===================================");
            System.out.println("1.싸우기 2.물약마시기 3.도망치기 4.스킬사용");
            System.out.println("===================================");
            System.out.print("무엇을 하시겠습니까?");
            selectNum = sc.nextInt();

            switch (selectNum) {
                case 1:
                    hit();
                    break;
                case 2:
                    usePotion();
                    break;
                case 3:
                    escape();
                    return;
                case 4:
                    useSkill(character, monster);
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while(character.getHp() > 0 && newMonsterHp > 0);
    }

    /* 공격 메소드 */
    public void hit(){
        /* 캐릭터의 공격 */
        System.out.println("\n[퍽퍽!]");

        if(character.getMaxMp() == 100){
            character.setMp(20);
            if (character.getMp() >= character.getMaxMp()){
                character.setFullMp();
            }
        }else{
            character.setMp(10);
            if (character.getMp() >= character.getMaxMp()){
                character.setFullMp();
            }
        }

        System.out.println(character.getAttack() + " 데미지를 입혔습니다.\n");
        newMonsterHp = newMonsterHp - character.getAttack();


        if(newMonsterHp <= 0) {
            /* 보스몬스터 클리어 시 */
            if(monster.getHp() == 400){
                System.out.println(monster.getName()+ "를 물리치셨습니다!!!");
                System.out.println("게임 클리어");
                System.exit(0);
            /* 몬스터 처치 시 */
            }else{
                System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
                System.out.println("[ " + character.getName() + " ] Mp : " + character.getMp());
                System.out.println("");

                System.out.println(monster.getName() + "를 물리쳤습니다.");
                /* 경험치 획득 */
                System.out.println("경험치 " + monster.getExperience() + " 획득!");
                character.setExperience(monster.getExperience());
                /* 돈 획득 */
                System.out.println(monster.getDropMoney() + "원 획득!\n");
                character.plusMoney(monster.getDropMoney());
                /* 경험치 100이상 시 레벨업 */
                character.levelUp();
            }
        }else{
            /* 캐릭터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
            System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
            System.out.println("[ " + character.getName() + " ] Mp : " + character.getMp());
            System.out.println(monster.getName() + " Hp : " + newMonsterHp);
            monsterTurn();
        }
    }

    /* 물약 사용 메소드 */
    public void usePotion(){
        /* 포션 0개일 때 사용 불가능 */
        if(character.getpotionNum() <= 0){
            System.out.println("\n사용 가능한 포션이 없습니다.\n");
        }else {
            /* 체력 회복 후 현재 체력이 최대 체력을 못넘게 하는 코드 */
            if(character.getMaxHp() <= character.getHp()+20){
                character.setFullHp();
                character.drinkPotion();
                System.out.println("\n[꼴~깍]");
                System.out.println("체력이 모두 회복되었습니다.");
                System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
                System.out.println("포션이 " + character.getpotionNum() + " 개 남았습니다.\n");
            /* 체력 회복 후 현재 체력이 최대 체력을 넘지 않을 시 */
            }else{
                System.out.println("\n[꼴~깍]");
                character.setHp(20);
                character.drinkPotion();
                System.out.println("체력이 20 회복되었습니다.");
                System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
                System.out.println("포션이 " + character.getpotionNum() + " 개 남았습니다.\n");
            }
        }
    }

    /* 도망치기 메소드 */
    public void escape(){
        System.out.println("\n[무사히 도망쳤다!]");
    }

    @Override
    public void useSkill(Character character, Monster monster) {
        if (character.getMp() >= 30) {
            int damage = character.getAttack() * 2;
            System.out.println("\n[스킬사용!]\n" + damage + " 데미지를 입혔습니다.\n");
            newMonsterHp -= damage;
            character.setMp(-30);

            if(newMonsterHp <= 0) {
                /* 보스몬스터 클리어 시 */
                if(monster.getHp() == 400){
                    System.out.println(monster.getName() + "를 물리치셨습니다!!!");
                    System.out.println("게임 클리어");
                    System.exit(0);
                /* 몬스터 처치 시 */
                }else{
                    System.out.println("[ " + character.getName() + " ] hp : " + character.getHp());
                    System.out.println("[ " + character.getName() + " ] mp : " + character.getMp());
                    System.out.println("");

                    System.out.println(monster.getName() + "를 물리쳤습니다.");
                    /* 경험치 획득 */
                    System.out.println("경험치 " + monster.getExperience() + " 획득!");
                    character.setExperience(monster.getExperience());
                    /* 돈 획득 */
                    System.out.println(monster.getDropMoney() + "원 획득!\n");
                    character.plusMoney(monster.getDropMoney());
                    /* 경험치 100이상 시 레벨업 */
                    character.levelUp();
                }
            }else{
                /* 캐릭터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
                System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
                System.out.println("[ " + character.getName() + " ] Mp : " + character.getMp());
                System.out.println(monster.getName() + " Hp : " + newMonsterHp);
                monsterTurn();
            }
        } else {
            System.out.println("\nMp가 부족합니다.\n");
        }
    }
    /* 몬스터 공격 메소드 */
    public void monsterTurn(){
        character.setHp(-monster.getAttack());
        System.out.println("\n몬스터가 공격합니다.");
        System.out.println(monster.getAttack() + " 만큼 데미지를 입었습니다.\n");
        /* 캐릭터 hp가 0이 될 시 */
        if(character.getHp() <= 0){
            System.out.println("캐릭터가 사망하였습니다.\n");
        }else{
            /* 몬스터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
            System.out.println("[ " + character.getName() + " ] Hp : " + character.getHp());
            System.out.println("[ " + character.getName() + " ] Mp : " + character.getMp());
            System.out.println(monster.getName() + " Hp : " + newMonsterHp);
            System.out.println("");
        }
    }


}
