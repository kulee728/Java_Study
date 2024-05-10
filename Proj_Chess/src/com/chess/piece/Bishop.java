package com.chess.piece;

import com.chess.settings.Square;

public class Bishop extends Piece {
	//상속 type player position
	
	public Bishop() {
		this.type = "Bishop";
	}
	
	@Override
	public boolean isValidMove(Square destination) {
		return false;
		
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인
	
	@Override
	public char toChar() {
		return 'B';
	}

	
	
	
	
	
}
