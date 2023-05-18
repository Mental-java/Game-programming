package RPG_Game.BattleField;

import RPG_Game.Battle.Battle;
import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GoBattle {
   private Character character;
   private Monster[] monsters;
   private int dunjeonLevel;
   /* 던전 레벨 고르기 */
   private int currentLevel;
   /* 캐릭터의 현재 레벨 */


   public GoBattle(Character character){
      this.character = character;
      this.currentLevel = character.getlevel();
      resetmonster();
   }
   private void resetmonster() {
      monsters = new Monster[5];

      monsters[0] = new Monster("( ^ω^ )", 100, 30, 10, 40);
      monsters[1] = new Monster("ʕʘ‿ʘʔ", 120, 30, 20, 50);
      monsters[2] = new Monster("ʕ⁎̯͡⁎ʔ༄", 140, 30, 30, 50);
      monsters[3] = new Monster("ㄴ(ಠ_ಠ)ㄱ", 160, 30, 40, 50);
      monsters[4] = new Monster("보스몬스터", 400, 30, 50, 110);
   }

      public void enterDungeon() {
         Scanner sc = new Scanner(System.in);
      do {
         /* 특정 값을 받으면 마을로 돌아가는 코드 */
         if(dunjeonLevel == 6){
            System.out.print("\n마을 이동 중.");
            try {
               Thread.sleep(500);
               System.out.print(".");
               Thread.sleep(500);
               System.out.print(".");
               Thread.sleep(500);
               System.out.println(".");
               Thread.sleep(500);
               System.out.println();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            /* 던전에 다시 입장하기 위해 값 초기화 */
            dunjeonLevel = 0;
            return;
         }

         System.out.println("=====================================");
         System.out.println("1레벨 2레벨 3레벨 4레벨 5레벨(보스스테이지)");
         System.out.println("=====================================");
         System.out.print("입장할 던전의 레벨을 고르세요 : ");
         dunjeonLevel = sc.nextInt();

         System.out.print("\n던전 입장 중.");
         try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

         switch (dunjeonLevel){
            case 1:
               if(dunjeonLevel == character.getlevel()){
                  System.out.println("1레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 2:
               if(dunjeonLevel == character.getlevel()){
                  System.out.println("2레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 3:
               if(dunjeonLevel == character.getlevel()){
                  System.out.println("3레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 4:
               if(dunjeonLevel == character.getlevel()){
                  System.out.println("4레벨 던전에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            case 5:
               if(dunjeonLevel == character.getlevel()){
                  System.out.println("보스스테이지에 입장합니다.");
                  selectDunjeon();
               }else{
                  System.out.println("!!입장가능한 레벨이 아닙니다.");
               }
               break;
            default:
               System.out.println("잘못된 번호를 입력하셨습니다.\n");
         }
      } while(true);

   }

   public void selectDunjeon() {
      Scanner sc = new Scanner(System.in);
      do {
         /* 레벨업 시 던전을 빠져나오게 하는 코드 */
         if(currentLevel != character.getlevel()) {
            /* 다음 던전에 들어가기 위한 조건을 맞추기 위해 현재 레벨 1증가 */
            currentLevel++;
            System.out.println("던전 이용 가능 레벨을 초과하셨습니다.\n마을로 이동합니다.");
            /* 마을로 돌아가기위한 값 설정 */
            dunjeonLevel = 6;
            return;
         }
         /* 마을에서 부활하는 코드 */
         if(character.getHp() <= 0){
            System.out.println("캐릭터가 마을에서 부활합니다.");
            character.setFullHp();
            /* 마을로 돌아가기위한 값 설정 */
            dunjeonLevel = 6;
            return;
         }

         System.out.println("============== 던전 =================");
         System.out.println("1.던전을 조사한다.");
         System.out.println("2.마을로 돌아가기");
         System.out.println("====================================");
         System.out.print("어떻게 하시겠습니까? : ");
         int menuNum = sc.nextInt();

         switch (menuNum){
            case 1:
               meetMonster();
               break;
            case 2:
               /* 마을로 돌아가기위한 값 설정 */
               dunjeonLevel = 6;
               return;
            default:
               System.out.println("잘못된 번호를 입력하셨습니다.");
         }
      } while(true);
   }
   private void meetMonster() {
      int level = character.getlevel();
      Monster monster = monsters[level - 1];

      System.out.print("\n던전 조사 중.");
      try {
         Thread.sleep(500);
         System.out.print(".");
         Thread.sleep(500);
         System.out.print(".");
         Thread.sleep(500);
         System.out.println(".");
         Thread.sleep(500);
         System.out.println();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      if(level == 5) {
         System.out.println(
                 "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⡦⢀⣀⣀⠀⣀⠀⡎⠀⠰⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢷⣄⡀⠈⢻⡄⠑⠦⠆⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠹⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣅⡀⢀⣹⣿⣿⣿⣷⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⢀⣀⣀⣀⣈⣻⣿⣿⣦⣄⠀⠀⠀⠀⠀⣦⣘⣿⣿⣾⣿⣿⣿⣿⣿⣿⣶⡶⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⠙⠿⠿⣿⣿⣿⣿⡷⠀⠀⢀⠹⣛⣻⣿⣿⣿⣿⡟⢫⢻⣿⣟⠁⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⡇⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣷⣕⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⢀⠴⠛⠋⠁⠀⣿⣿⣷⣄⠀⢀⣀⣿⣿⣿⣿⣿⠉⠙⠟⣿⣿⣿⣿⡀⠀⠀⠀⡐⠀⠀\n"+
                 "⠀⠀⠀⠁⠀⠀⠀⠀⠀⡻⠿⢿⣿⣿⣿⣿⣿⣿⡿⠿⢿⡟⠒⠠⠈⠝⠛⠉⠀⠀⠀⣸⠁⠃⠀\n"+
                 "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⢸⣿⣿⣿⣿⡿⠋⠀⠀⢸⣷⠀⠀⠀⠀⠀⠀⠀⠀⢰⣷⣶⣶⠤\n"+
                 "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⠁⠀⠀⠀⢾⣿⣧⣀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡿⠁\n"+
                 "⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⠛⠀⠀⠀⡐⠀⢿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠛⠀⠀\n"+
                 "⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⡆⢀⣠⡄⠀⠀⠀⠹⣿⠻⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⢿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⣿⣿⣿⡿⠟⢫⣿⣿⠟⠋⠀⣼⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⣿⣿⣿⠁⠀⢸⣿⣧⣠⣴⠞⠛⢿⣿⠒⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⠹⣿⣿⡒⠶⢾⣿⣿⡋⠁⠀⠀⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "⠀⠀⠀⠀⠀⠀⠉⠉⠉⠩⠿⠿⠃⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                 "[보스몬스터]가 등장했습니다!!!");
      }else{
         System.out.println(level + "레벨 몬스터 [" + monster.getName() + "]가 나타났습니다!");
      }

      /* 몬스터와 전투 시작 */
      Battle battle = new Battle(character, monster);
      battle.fightMonster();
   }



}
