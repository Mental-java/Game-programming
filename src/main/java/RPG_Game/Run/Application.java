package RPG_Game.Run;

import RPG_Game.Character.Character;
import RPG_Game.Character.Select;

import RPG_Game.Town.TownMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("****************** The King - Joju ******************");
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 종료");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();
            switch (menuNum){
                case 1:
                    Select s = new Select();
                    Character character = s.makingCharacter();
                    TownMenu townMenu = new TownMenu(character);
                    townMenu.townMenu();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while (true);

    }

}
