package com.pattern.construct.FactoryMethod.game.run;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pattern.construct.FactoryMethod.game.unit.Unit;
import com.pattern.construct.FactoryMethod.game.unitfactory.ArcherFactory;
import com.pattern.construct.FactoryMethod.game.unitfactory.CavalryFactory;
import com.pattern.construct.FactoryMethod.game.unitfactory.UnitFactory;

public class GameUnitClient {

	private static void consoleCleaner() {
		for(int i=0;i<50;i++)
			System.out.println();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Map<Integer,UnitFactory> factoryMap = new HashMap<>();
		
		factoryMap.put(1, new ArcherFactory());
		factoryMap.put(2, new CavalryFactory());
		consoleCleaner();
		System.out.println("---------- Archer & Cavalry ---------- ");
		for(int i=5;i>0;i--) {
			System.out.println(i+"초 뒤 게임이 시작됩니다....");
			Thread.sleep(1000);

		}
		String unitClassName ="";
		String unitName;
		int unitAttackDamage;
		int unitAttackRange;
		UnitFactory factory;
		Unit [] player = new Unit[2];
		
		boolean menuRepeat = true;

		while(menuRepeat) {
			consoleCleaner();
			for(char c ='A';c!='C';c++) {
				System.out.printf("플레이어 %c의 직업을 선택해주세요\n"
						+ "1:궁수 (이동속도 10,체력 1000) "
						+ "2:기병 (이동속도 20, 체력 1500)\n커맨드 입력 >>> ",c);
				try {
					int unitClass = sc.nextInt();
					if(unitClass==1 || unitClass==2) {
						factory = factoryMap.get(unitClass);
						System.out.println(factory.getClassName()+" 직업을 선택하셨습니다.");
						System.out.print("해당 유닛의 이름을 설정해주세요 : ");
						unitName = sc.next();
						System.out.print("해당 유닛의 공격력을 설정해주세요 : ");
						unitAttackDamage = sc.nextInt();
						System.out.print("해당 유닛의 공격 사거리를 설정해주세요 : ");
						unitAttackRange = sc.nextInt();
					}
					else {
						consoleCleaner();
						System.out.println("잘못된 값을 입력하셨습니다. 처음부터 다시 입력해주세요.");
						System.out.println("아무 키 입력시 직업 선택 화면으로 돌아갑니다.");
						sc.next();
						sc.next();
						consoleCleaner();
						c = 'A' -1;
						continue;
					}

					player[(int)(c-'A')] = 
							factory.createUnit(unitName, unitAttackDamage, unitAttackRange);
					consoleCleaner();
				}
				
				catch(Exception E) {
					System.out.println("비 정상적인 접근입니다....처음부터 입력해주세요.");
					System.out.println("아무 키 입력시 직업 선택 화면으로 돌아갑니다.");
					sc.next();
					sc.next();
					consoleCleaner();
					c = 'A' -1;
					continue;
				}
			}
			
			consoleCleaner();
			System.out.println("설정이 완료되었습니다. 두 유닛의 스펙은 다음과 같습니다.");
			char c = 'A';
			for(int i=0;i<2;i++) {
				System.out.println("플레이어 "+(char)(c+i)+":");
				System.out.println(player[i].toString());
			}
			System.out.println();
			System.out.println("아무 키 입력시 게임이 시작됩니다!");
			sc.next();
			menuRepeat = false;
		}

		int turn = 0;
		while(true) {
			char playerTurn = turn==0?'A':'B';
			if(player[turn].hpController()<=0) {
				System.out.printf("%s 의 체력이 0이하가 되어 플레이어 %c(%s) 패배하였습니다!\n",player[turn].getName(),playerTurn,player[turn].getClassName());
				turn = (turn+1)%2;
				playerTurn = turn==0?'A':'B';
				System.out.printf("축하합니다! 승자는 %s, 플레이어%c 입니다!",player[turn].getName(),playerTurn);
			}
			
			
			System.out.println();
			System.out.printf("플레이어 %c(%s)의 차례입니다! 어떤 행동을 하시겠습니까?\n",playerTurn,player[turn].getClassName());
			System.out.println("현재 체력 : "+player[turn].hpController());
			System.out.println("1: 공격");
			System.out.println("2: 이동");
			System.out.println("그 외 입력 : 턴 넘기기");
			System.out.println("커맨드 입력 >>> ");
			try {
				int cmd = sc.nextInt();
				consoleCleaner();
				if(cmd==1) {
					System.out.println("공격을 선택하셨습니다!");
					player[(turn+1)%2].hpController(player[turn].attack());
					turn++;
					turn %=2;
				}
				else if(cmd==2) {
					System.out.println("이동을 선택하셨습니다!");
					player[turn].move();
					turn++;
					turn %=2;
				}
				else if(cmd==9999) {
					System.out.println("프로그램 종료 코드 9999");
					return;
				}
				else {
					System.out.print("턴을 왜 넘기시죠? 바보입니까?(Y/N) : ");
					turn++;
					turn %=2;
					sc.next();
				}
				
			}
			catch(Exception E) {
				System.out.print("턴을 왜 넘기시죠? 바보입니까?(Y/N) : ");
				turn++;
				turn %=2;
				sc.next();
			}
		}
		
	}

}
