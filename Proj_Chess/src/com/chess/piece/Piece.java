package com.chess.piece;

import com.chess.settings.Player;
import com.chess.settings.Square;

public class Piece {
	public String type; //말의 종류
	public Player player; //해당 말의 소유 플레이어 객체
	public Square position; //해당 말의 위치
	
	public boolean isValidMove(Square destination) {
		return true;
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인
	
	public void move(Square destination) {
		if(isValidMove(destination)) {
			this.position.setPiece(null);
			destination.setPiece(this);
			this.position = destination;
			
		}
		else {
			System.out.println("(move) 움직이지 못했습니다.");
		}
			
	}//말을 새로운 위치로 이동
	
	
}
