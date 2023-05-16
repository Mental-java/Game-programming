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
        this.newMonsterHp = monster.hp;
    }
    public void fightMonster(){
        Scanner sc = new Scanner(System.in);
        /* 몬스터의 피를 리셋하여 새로운 몬스터를 생성한 것처럼 구현 */
        if(newMonsterHp<=0) newMonsterHp = monster.hp;

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
        }while(character.hp > 0 && newMonsterHp > 0);
    }

    /* 공격 메소드 */
    public void hit(){
        /* 캐릭터의 공격 */
        System.out.println("\n 퍽퍽!");
        System.out.println(character.attack + " 만큼 데미지를 입혔습니다.\n");
        newMonsterHp = newMonsterHp - character.attack;
        /* 몬스터 처치 시 */
        if(newMonsterHp <= 0) {
            System.out.println(monster.getName() + "를 물리쳤습니다.");
            System.out.println("경험치 " + monster.experience + " 획득!");
            character.experience = character.experience + monster.experience;
            System.out.println("돈 + monster.money +  획득!\n");
            /* 경험치 100이상 시 레벨업 */
            character.levelUp();

        }else{
            /* 캐릭터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
            System.out.println(character.name + " hp : " + character.hp);
            System.out.println(monster.getName() + " hp : " + newMonsterHp);
            monsterTurn();
        }
    }

    /* 물약 사용 메소드 */
    public void usePotion(){
        System.out.println(" 꼴~깍 ");
    }

    /* 도망치기 메소드 */
    public void escape(){
        System.out.println(" ㅌㅌㅌ ");
    }

    /* 몬스터 공격 메소드 */
    public void monsterTurn(){
        character.hp = character.hp - monster.attack;
        System.out.println("\n몬스터가 공격합니다.");
        System.out.println(monster.attack + " 만큼 데미지를 입었습니다.\n");
        /* 캐릭터 hp가 0이 될 시 */
        if(character.hp <= 0){
            System.out.println("캐릭터가 사망하였습니다.\n");
        }else{
            /* 몬스터의 공격 후 캐릭터와 몬스터의 현재 피 출력 */
            System.out.println(character.name + " hp : " + character.hp);
            System.out.println(monster.getName() + " hp : " + newMonsterHp);
            System.out.println("");
        }
    }


}
