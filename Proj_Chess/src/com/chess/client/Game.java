package com.chess.client;

import com.chess.settings.Board;
import com.chess.settings.Player;

public class Game {
	private Player [] players;
	private Board board;
	private Player currentPlayer;
	public void start() {
		
	}//게임 초기화, 플레이어 생성, 보드 설정, 게임 시작
	
	public void end() {
		
	} //게임 종료판단, 종료시 결과 표시, 승자 선언
	
	public void switchPlayer() {
		
	} //현재 플레이어 변경
	
	public boolean checkmate() {
		
	}//현재 상태가 체크메이트인지 확인, 필요한 경우 게임을 종료
}
