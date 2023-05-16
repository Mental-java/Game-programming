package RPG_Game.Shop;

import RPG_Game.Character.Character;
import RPG_Game.Character.Select;
import RPG_Game.Town.TownMenu;

import java.util.Scanner;

public class Shop {
    public void shop() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("********************* 상점 ***********************");
            System.out.println("1. 무기 강화(공격력 +5) 구매하기 : 20원");
            System.out.println("2. 물약(체력 +10) 구매하기  : 10원");
            System.out.println("3. 레벨업 효과음(오예~) 구매하기 : 50원");
            System.out.println("4. 마을로 돌아가기");
            System.out.println("보유 잔액 : ");
            System.out.print("메뉴 선택: ");
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    if(money >= 20) {
                        System.out.println("무기 강화 아이템을 구매했습니다.");
                        System.out.println("보유 잔액 : ");
                    } else {
                        System.out.println("보유 잔액이 부족합니다.");
                    }
                    break;
                case 2:
                    if(money >= 10) {
                        System.out.println("물약 아이템을 구매했습니다.");
                        System.out.println("보유 잔액 : ");
                    } else {
                        System.out.println("보유 잔액이 부족합니다.");
                    }
                    break;

                case 3:
                    if(money >= 50) {
                        System.out.println("레벨업 효과음을 구매했습니다.");
                        System.out.println("보유 잔액 : ");
                    } else {
                        System.out.println("보유 잔액이 부족합니다.");
                    }
                    break;
//
                case 4:
                    return;
//
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
//
            }
        } while (true) ;
    }
}
