package com.chess.piece;

import com.chess.settings.Player;
import com.chess.settings.Square;

public class Piece {
	public String type; //말의 종류
	public Player player; //해당 말의 소유 플레이어 객체
	public Square position; //해당 말의 위치
	
	public boolean isValidMove(Square destination) {
		return false;
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인(Piece 마다 Override)
	
	public void move(Square destination) {
		if(isValidMove(destination)) {
			destination.setPiece(this);
			this.position = destination; //이것 외에도 외부에서 move 시 기존에 있던 자리의 square는 null 처리를 해 주어야 한다.
		}
		else {
			System.out.println("(move) 움직이지 못했습니다.");
		}
			
	}//말을 새로운 위치로 이동

	public char toChar() {
		return ' ';
	}
	
	
}
