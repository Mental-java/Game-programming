package RPG_Game.Town;

import RPG_Game.BattleField.GoBattle;
import RPG_Game.Character.Character;
import RPG_Game.Monster.Monster;
import RPG_Game.Shop.Shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TownMenu {
    private Character character;
    public GoBattle dunjun;


    public TownMenu(Character character) {
        this.character = character;
        dunjun = new GoBattle(character);
    }

    public void townMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("****************** 마을 메뉴 ******************");
            System.out.println("1. 던전 입장");
            System.out.println("2. 상점");
            System.out.println("3. 캐릭터 특성창 보기");
            System.out.println("4. 게임 종료");
            System.out.print("메뉴 선택: ");

            try {
                int menuNum = scanner.nextInt();
                System.out.println("");

                switch (menuNum) {
                    case 1:
                        dunjun.enterDungeon();
                        break;
                    case 2:
                        System.out.print("상점 이동 중.");
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
                        Shop shop = new Shop(character);
                        shop.shop();
                        break;
                    case 3:
                        System.out.println("캐릭터 특성창을 보여줍니다.");
                        character.displayInfo();
                        break;
                    case 4:
                        System.out.println("게임을 종료합니다.");
                        System.exit(0);
                    default:
                        System.out.println("잘못된 번호를 입력하셨습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[Error] 숫자를 입력해주세요.");
            }

        } while (true);
    }

}
