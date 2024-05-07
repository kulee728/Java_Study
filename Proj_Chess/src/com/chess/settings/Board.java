package com.chess.settings;

import com.chess.piece.Piece;

public class Board {
	private Square[][] squares; // 8x8 크기의 객체 이차원 배열, 각 칸에는 말이 위치할 수있다.
	
	
	public Board() {
		setup();
	}
	
	public void setup() {
		squares = new Square[8][8];
		for(int i=0;i<8;i++) {
			squares[i] = new Square[8];
			}
		
		
	}//보드를 초기화 하고 초기 말을 배치
	
	public void movePiece(Piece piece, Square destination) {
		
	} //말을 이동시키고, 보드의 상태를 업데이트
	
	public boolean isCheck(Player player) {
		
	} //특정 플레이어가 체크 상태인지 확인
	
	public boolean isCheckmate(Player player) {
		
	} //특정 플레이어가 체크메이트 상태인지 확인
	
	public void printBoard() {
		System.out.println(" ");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i%10==0) {
					System.out.println((char)('A'+j));
				}
			} //여기서 부터 다시 코딩하세요(*24.05.07 5:20PM)
		}
		
	}
	
}
