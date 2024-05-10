package com.chess.piece;

import com.chess.settings.Square;

public class Pawn extends Piece {
	//상속 type player position
	private boolean hasMoved = false;
	public Pawn() {
		this.type = "Pawn";
	}
	
	@Override
	public boolean isValidMove(Square destination) {
		return hasMoved;
		
	}//해당 destination 으로 현재 말이 이동할 수 있는지 확인
	
	public void setHasMoved(boolean hasMoved){
		this.hasMoved = hasMoved;
	}

	@Override
	public char toChar() {
		return 'P';
	}
	
	
	
	
}
