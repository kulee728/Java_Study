package com.chess.settings;

import com.chess.piece.Piece;

public class Square {
	private Piece piece;
	public boolean isOccupied() {
		if(piece==null)
			return false;
		else
			return true;
	}
	public Piece getPiece() {
		return this.piece;
	}
}
//구현 완료