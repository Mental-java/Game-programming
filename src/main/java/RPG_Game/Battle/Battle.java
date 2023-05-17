package RPG_Game.Battle;

import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class Battle {
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
            System.out.println("1.싸우기 2.물약마시기 3.도망치기");
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
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while(character.getHp() > 0 && newMonsterHp > 0);
    }

    /* 공격 메소드 */
    public void hit(){
        /* 캐릭터의 공격 */
        System.out.println("\n 퍽퍽!");
        System.out.println(character.getAttack() + " 만큼 데미지를 입혔습니다.\n");
        newMonsterHp = newMonsterHp - character.getAttack();
        /* 몬스터 처치 시 */
        if(newMonsterHp <= 0) {
            if(monster.getHp() == 400){
                System.out.println(monster.getName()+ "를 물리치셨습니다!!!");
                System.out.println("게임 클리어");
                System.exit(0);
            }else{
                System.out.println(monster.getName() + "를 물리쳤습니다.");
                System.out.println("경험치 " + monster.getExperience() + " 획득!");
                character.setExperience(monster.getExperience());
                System.out.println("돈 " + monster.getDropMoney() + " 획득!\n");
                character.plusMoney(monster.getDropMoney());
                /* 경험치 100이상 시 레벨업 */
                character.levelUp();
            }
        }else{
            /* 캐릭터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
            System.out.println(character.getName() + " hp : " + character.getHp());
            System.out.println(monster.getName() + " hp : " + newMonsterHp);
            monsterTurn();
        }
    }

    /* 물약 사용 메소드 */
    public void usePotion(){
        if(character.getpotionNum() <= 0){
            System.out.println("\n사용 가능한 포션이 없습니다.\n");
        }else {
            if(character.getMaxHp() < character.setHp(20)){
                character.setPullHp();
                character.drinkPotion();
                System.out.println("\n 꼴~깍 \n");
                System.out.println("체력이 모두 회복되었습니다.");
                System.out.println(character.getName() + " hp : " + character.getHp());
                System.out.println("포션이 " + character.getpotionNum() + " 개 남았습니다.\n");
            }else{
                System.out.println("\n 꼴~깍 \n");
                character.setHp(20);
                character.drinkPotion();
                System.out.println("체력이 20 회복되었습니다.");
                System.out.println(character.getName() + " hp : " + character.getHp());
                System.out.println("포션이 " + character.getpotionNum() + " 개 남았습니다.\n");
            }
        }
    }

    /* 도망치기 메소드 */
    public void escape(){
        System.out.println("\n무사히 도망쳤다!\n");
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
            System.out.println(character.getName() + " hp : " + character.getHp());
            System.out.println(monster.getName() + " hp : " + newMonsterHp);
            System.out.println("");
        }
    }


}
