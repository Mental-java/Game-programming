package RPG_Game.BattleField;

import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class GoBattle {

   private Character character;
   private Monster[] monsters;

   public GoBattle(Character character){
      this.character = character;
      resetmonster();
   }
   private void resetmonster() {
      monsters = new Monster[5];

      monsters[0] = new Monster("^모^", 50, 30, 10, 30);
      monsters[1] = new Monster("^모2^", 70, 30, 15, 50);
      monsters[2] = new Monster("^모3^", 90, 30, 20, 70);
      monsters[3] = new Monster("^모4^", 110, 30, 25, 90);
      monsters[4] = new Monster("보스몬스터", 130, 30, 30, 110);
   }

      public void enterDungeon() {
      System.out.println("던전에 입장합니다.");
      do {
         Scanner sc = new Scanner(System.in);
         System.out.println("============== 던전 =================");
         System.out.println("1.던전을 조사한다.");
         System.out.println("2.마을로 돌아가기");
         System.out.print("어떻게 하시겠습니까? : ");
         int menuNum = sc.nextInt();

         switch (menuNum){
            case 1:
               fightMonster();
               break;
            case 2:
               return;
            default:
               System.out.println("잘못된 번호를 입력하셨습니다.");
         }
      } while(true);

   }

   private void fightMonster() {
      int level = character.getlevel();
      Monster monster = monsters[level - 1];

      System.out.println("레벨 " + level + " 몬스터 [" + monster.getName() + "]가 나타났습니다!");
   }




}
