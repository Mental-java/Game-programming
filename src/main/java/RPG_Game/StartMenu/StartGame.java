package RPG_Game.StartMenu;

import RPG_Game.Character.Character;
import RPG_Game.Character.CommonChar;
import RPG_Game.Character.Select;

import java.util.Scanner;

public class StartGame {
    public Character mainMenu(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("****************** RPG게임 ***********************");
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 종료");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();


            switch (menuNum){
                case 1:
                    SelectCharacter();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while (true);


    }

    private Character SelectCharacter() {
        Select sel = new Select();
        return sel.makingCharacter();
    }
}
