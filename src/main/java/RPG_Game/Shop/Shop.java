package RPG_Game.Shop;

import RPG_Game.Character.Character;

import java.util.Scanner;

public class Shop {

    private Character character;

    public Shop(Character character) {
        this.character = character;
    }

    public void shop() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("********************* 상점 ***********************");
            System.out.println("1. 무기 강화(공격력 +5) 구매하기 : 20원");
            System.out.println("2. 물약(체력 +10) 구매하기  : 10원");
            System.out.println("3. 레벨업 효과음(오예~) 구매하기 : 50원");
            System.out.println("4. 마을로 돌아가기");
            System.out.println("보유 잔액 : " + character.getMoney());
            System.out.print("메뉴 선택: ");
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    if(character.getMoney() >= 20) {
                        character.setMoney(character.getMoney() - 20);
                        character.setweaponLv(character.getweaponLv()+1);
                        character.setAttack(character.getAttack()+5);
                        System.out.println("무기 강화 아이템을 구매했습니다.");
                        System.out.println("보유 잔액 : " + character.getMoney());
                    } else {
                        System.out.println("보유 잔액이 부족합니다.");
                    }
                    break;
                case 2:
                    if(character.getMoney() >= 10) {
                        System.out.println("물약 아이템을 구매했습니다.");
                        System.out.println("보유 잔액 : " + character.getMoney());
                    } else {
                        System.out.println("보유 잔액이 부족합니다.");
                    }
                    break;

                case 3:
                    if(character.getMoney() >= 50) {
                        System.out.println("레벨업 효과음을 구매했습니다.");
                        System.out.println("보유 잔액 : " + character.getMoney());
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
