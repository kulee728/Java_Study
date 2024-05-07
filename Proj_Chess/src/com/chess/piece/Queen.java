package com.chess.piece;

import com.chess.settings.Square;

public class Queen extends Piece {
	//상속 type player position
	
	public Queen() {
		this.type = "Queen";
	}
	
	@Override
	public boolean isValidMove(Square destination) {
		
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인
	
	@Override
	public void move(Square destination) {
		
	}//말을 새로운 위치로 이동
	

	
	
	
	
	
}
