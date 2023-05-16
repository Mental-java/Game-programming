package RPG_Game.Character;

import java.util.Scanner;

public class Select {

    public Character makingCharacter() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("****************** 플레이 할 캐릭터를 선택하시오 ******************");
            System.out.println("1. A 캐릭터");
            System.out.println("2. B 캐릭터");
            System.out.println("3. C 캐릭터");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();

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
        Character ch = new Character("A", 100, 0,0, 20, 0,1, 30,0);

        System.out.print("확실합니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        if(real == 1){
           return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();
    }

    private Character createB() {
        Scanner sc = new Scanner(System.in);
        Character ch = new Character("B", 120, 0,0, 20, 0,1, 30,0);

        System.out.print("확실합니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        if(real == 1){
            return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();

    }

    private Character createC() {
        Scanner sc = new Scanner(System.in);
        Character ch = new Character("C", 140, 0,0, 20, 0,1, 30,0);

        System.out.print("확실합니까? (확인 : 1, 취소 : 2) : ");
        int real = sc.nextInt();
        if(real == 1){
            return ch;
        }else if(real == 2){
            return makingCharacter();
        }
        return makingCharacter();
    }


}
