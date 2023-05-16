package RPG_Game.BattleField;

import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class GoBattle {
   private Character character;
   private Monster[] monsters;
   private int dunjeonLevel;
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
      do {
         Scanner sc = new Scanner(System.in);

         if(dunjeonLevel == 6){
            dunjeonLevel = 0;
            return;
         }

         System.out.println("=====================================");
         System.out.println("1레벨 2레벨 3레벨 4레벨 5레벨(보스스테이지)");
         System.out.println("=====================================");
         System.out.print("입장할 던전의 레벨을 고르세요 : ");
         dunjeonLevel = sc.nextInt();
         System.out.println("\n던전 입장 중...");
         switch (dunjeonLevel){
            case 1:
               if(dunjeonLevel == character.level){
                  System.out.println("1레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 2:
               if(dunjeonLevel == character.level){
                  System.out.println("2레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 3:
               if(dunjeonLevel == character.level){
                  System.out.println("3레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 4:
               if(dunjeonLevel == character.level){
                  System.out.println("4레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 5:
               if(dunjeonLevel == character.level){
                  System.out.println("보스스테이지에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            default:
               System.out.println("잘못된 번호를 입력하셨습니다.");
         }
      } while(true);

   }

   public void selectDunjeon() {
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
               dunjeonLevel = 6;
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
