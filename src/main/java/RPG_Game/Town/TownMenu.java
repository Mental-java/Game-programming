package RPG_Game.Town;

import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;

import java.util.Scanner;

public class TownMenu {
    private Character character;
    private Monster[] monsters;

    public TownMenu(Character character) {
        this.character = character;
        resetmonster();
    }

    private void resetmonster() {
        monsters = new Monster[5];

        monsters[0] = new Monster("^모^", 50, 10);
        monsters[1] = new Monster("^모2^", 70, 15);
        monsters[2] = new Monster("^모3^", 90, 20);
        monsters[3] = new Monster("^모4^", 110, 25);
        monsters[4] = new Monster("보스몬스터", 130, 30);

    }

    public void townMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("****************** 마을 메뉴 ***********************");
            System.out.println("1. 던전 입장");
            System.out.println("2. 상점");
            System.out.println("3. 캐릭터 특성창 보기");
            System.out.println("4. 게임 종료");
            System.out.print("메뉴 선택: ");
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    enterDungeon();
                    break;
                case 2:
                    shop();
                    break;
                case 3:
                    viewCharacterInfo();
                    break;
                case 4:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }

    private void enterDungeon() {
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

    private void shop() {
        System.out.println("상점에 입장합니다.");

    }

    private void viewCharacterInfo() {
        System.out.println("캐릭터 특성창을 보여줍니다.");
        character.displayInfo();
    }
}
