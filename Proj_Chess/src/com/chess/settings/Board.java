package com.chess.settings;

import com.chess.piece.Piece;

public class Board {
	private Square[][] squares; // 8x8 크기의 객체 이차원 배열, 각 칸에는 말이 위치할 수있다.
	public void setup() {
		
	}//보드를 초기화 하고 초기 말을 배치
	
	public void movePiece(Piece piece, Square destination) {
		
	} //말을 이동시키고, 보드의 상태를 업데이트
	
	public boolean isCheck(Player player) {
		
	} //특정 플레이어가 체크 상태인지 확인
	
	public boolean isCheckmate(Player player) {
		
	} //특정 플레이어가 체크메이트 상태인지 확인
	
	
	
}
