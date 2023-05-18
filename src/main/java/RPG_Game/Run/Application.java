package RPG_Game.Run;

import RPG_Game.Character.Character;
import RPG_Game.Character.Select;

import RPG_Game.Town.TownMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("****************** The King - Joju ******************");
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 종료");
            System.out.print("메뉴 선택: ");

            try {
                int menuNum = sc.nextInt();

                switch (menuNum) {
                    case 1:
                        System.out.println("case 1");
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("잘못된 번호를 입력하셨습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[Error] 숫자를 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
            }
        } while (true);

    }

}
