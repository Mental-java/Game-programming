# 프로젝트 소개

- 텍스트 기반 RPG 게임 프로그래밍

# 시연영상
https://github.com/Mental-java/Game-programming/files/11504899/mp4.zip

# 프로젝트 요구사항

- 플레이어 게임에 접속하면 게임 시작, 게임 종료를 선택 할 수 있습니다.
- 플레이어가 게임종료를 선택한다면 그 즉시 프로그램이 종료된다.
- 플레이어가 게임 시작을 선택한다면 Select 클래스가 실행 되면서 캐릭터를 선택 하는 메뉴로 넘어간다.
- 플레이어는 3가지의 캐릭터를 선택 할 수 있습니다. 각각의 캐릭터는 다른 특성을 가지고 있습니다.
- 플레이어가 캐릭터를 선택했다면 TownMenu 클래스로 넘어가서 마을 메뉴를 실행합니다.
- 마을 메뉴로 넘어간다면 플레이어는 던전입장, 상점, 캐릭터 특성창 보기, 게임종료를 선택 할 수 있습니다.
- 던전에 입장한다면 몬스터를 잡을 수 있습니다.
- 몬스터는 캐릭터의 레벨에 따라서 다른 난이도의 몬스터가 등장합니다.
- 캐릭터가 레벨5에 달성해 던전에 간다면 보스몬스터가 등장합니다.
- 몬스터와 싸우는 메뉴에 들어가면 공격하기, 물약마시기, 마을로 돌아가기를 선택 할 수 있습니다.
- 공격하기를 선택한다면 캐릭터의 공격력을 몬스터에게 데미지로 입힙니다.
- 물약마시기를 한다면 캐릭터의 체력을 회복합니다.
- 그렇게 몬스터를 잡는다면 캐릭터는 경험치와 돈을 획득 할 수 있습니다.
- 플레이어가 상점에 방문한다면 몬스터를 잡고 얻은 돈으로 물약과 검, 방패를 구매 할 수 있습니다.
- 상점의 검과 방패를 구매한다면 캐릭터의 공격력과 방어력이 올라갑니다.
- 플레이어가 레벨5에 달성하고 보스몬스터를 잡는다면 게임이 클리어하게 됩니다.


# 상호작용

- 캐릭터가 수신 할 수 있는 메세지

1. 던전입장, 상점 입장, 캐릭터 특성창 보기
2. 몬스터와 전투하기, 마을로 돌아가기
3. 물약 마시기, 공격하기
4. 상점에서 아이템 구매하기

- 몬스터가 수신 할 수 있는 메세지

1. 플레이어의 레벨에 따른 몬스터 등장
2. 캐릭터를 공격해라
3. 몬스터 사냥시 캐릭터에게 돈과 경험치 제공


# 클래스 설계

1. 캐릭터 클래스
    - 속성 : 메뉴에서 선택한 캐릭터 특성을 출력하고 정보를 저장한다
    - 행위 : 캐릭터 선택, 캐릭터 특성 출력

2. 몬스터 클래스
    - 속성 : 몬스터의 특성을 저장한다
    - 행위 : 몬스터의 정보를 전투장에 전달한다.

3. 마을 클래스
    - 속성 : 마을에서 다른 곳으로 이동 할 수 있다.
    - 행위 : 마을에서 던전,상점으로 이동 할 수 있고 캐릭터의 특성을 출력 할 수 있다.
