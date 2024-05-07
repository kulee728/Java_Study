package com.chess.piece;

import com.chess.settings.Square;

public class King extends Piece {
	//상속 type player position
	public boolean hasMoved = false;
	
	public King() {
		this.type = "King";
	}
	
	@Override
	public boolean isValidMove(Square destination) {
		
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인
	

	
	
	
	
	
	
}
