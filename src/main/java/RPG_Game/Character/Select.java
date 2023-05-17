package RPG_Game.Character;

import java.util.Scanner;

public class Select {

    public Character makingCharacter() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("****************** 플레이 할 캐릭터를 선택하시오 ******************");
            System.out.println("1. 전사");
            System.out.println("2. 도적");
            System.out.println("3. 마법사");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();
            System.out.println("");

            switch (menuNum) {
                case 1:
                    return createA();
                case 2:
                    return createB();
                case 3:
                    return createC();
                default:
                    System.out.println("잘못된 번호를 입력했습니다.");
            }
        } while (true);
    }

    private Character createA() {
        Scanner sc = new Scanner(System.in);
        Character ch = new Character("전사", 100, 0,0, 50, 0,1, 30,0, false,100);

        System.out.print("이 캐릭터를 선택하시겠습니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        System.out.println("");
        if(real == 1){
           return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();
    }

    private Character createB() {
        Scanner sc = new Scanner(System.in);
        Character ch = new Character("도적", 60, 0,0, 80, 0, 1, 30, 0, false,60);

        System.out.print("이 캐릭터를 선택하시겠습니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        System.out.println("");
        if(real == 1){
            return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();

    }

    private Character createC() {
        Scanner sc = new Scanner(System.in);
        Character ch = new Character("마법사", 80, 0,0, 60, 0, 1, 30,0, false,80);

        System.out.print("이 캐릭터를 선택하시겠습니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        System.out.println("");
        if(real == 1){
            return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();
    }


}
