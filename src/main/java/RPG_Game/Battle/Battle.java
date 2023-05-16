package RPG_Game.Battle;

import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class Battle {
    private Character character;
    private Monster monster;

    public Battle(Character character, Monster monster){
        this.character = character;
        this.monster = monster;
    }
    public void fightMonster(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.싸우기 2.물약마시기 3.도망치기");
            System.out.print("무엇을 하시겠습니까?");
            int selectNum = sc.nextInt();

            switch (selectNum) {
                case 1:
                    hit();
                    break;
                case 2:
                    usePotion();
                    break;
                case 3:
                    escape();
                    break;
                default:
                    break;
            }
        }while(character.hp > 0 || monster.hp > 0);
    }

    /* 공격 메소드 */
    public void hit(){
        System.out.println(" 퍽퍽! ");
        monster.hp = monster.hp - character.attack;
        if(monster.hp <= 0) {
            System.out.println(monster.getName() + "를 물리쳤습니다.");
            System.out.println("경험치 " + monster.experience + " 획득!");
            character.levelUp();
            //System.out.println("돈 " + monster.money + " 획득!");
        }else{
            System.out.println(monster.getName() + " hp : " + monster.gethp());
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
        System.out.println(monster.attack + " 만큼 데미지를 입었습니다.");
    }
}
