package com.chess.client;

import java.util.Scanner;

import com.chess.settings.Board;
import com.chess.settings.Player;

public class Game {
	private Player [] players;
	private Board board;
	private Player currentPlayer;
	Scanner sc = new Scanner(System.in);
	
	public void consoleCleaner() {
		for(int i =0;i<50;i++)
			System.out.println();
	}
	
	public void start() throws InterruptedException {
		consoleCleaner();
		System.out.println("********** Console Chess **********");
		System.out.print("Press any Keys to Start : ");
		sc.next();
		
		chessInitializer();
		
		System.out.println("Game Start!");
		Thread.sleep(2000);
		consoleCleaner();
		while(!checkmate()) {
			System.out.println("----------Board Status----------");
			
			switchPlayer();
		}
		end();
	}//게임 초기화, 플레이어 생성, 보드 설정, 게임 시작
	
	public void end() {
		
	} //게임 종료판단, 종료시 결과 표시, 승자 선언
	
	public void switchPlayer() {
		if(currentPlayer == players[0])
			currentPlayer = players[1];
		else
			currentPlayer = players[0];
	} //현재 플레이어 변경
	
	public boolean checkmate() {
		if(board.isCheckmate(currentPlayer))
			return true;
		else
			return false;
	}//현재 상태가 체크메이트인지 확인, 필요한 경우 게임을 종료

	public void chessInitializer() {
		players = new Player[2];
		players[0].setColor("White");
		players[1].setColor("Black");
		
		currentPlayer = players[0];
		board = new Board();

	}
}



