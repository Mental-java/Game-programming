package RPG_Game.Town;

import RPG_Game.Character.Character;
import RPG_Game.Character.Select;

import java.util.Scanner;

public class TownMenu {
    private Character character;

    public TownMenu(Character character) {
        this.character = character;
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

    }

    private void shop() {
        System.out.println("상점에 입장합니다.");

    }

    private void viewCharacterInfo() {
        System.out.println("캐릭터 특성창을 보여줍니다.");
        character.displayInfo();
    }
}
