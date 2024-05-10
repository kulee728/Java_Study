package com.chess.settings;
import com.chess.piece.*;

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
		for(int i=0;i<8;i+=7) {
		squares[i][0].setPiece(new Rook());
		squares[i][0].setPiece(new Knight());
		squares[i][0].setPiece(new Bishop());
		squares[i][0].setPiece(new Queen());
		squares[i][0].setPiece(new King());
		squares[i][0].setPiece(new Bishop());
		squares[i][0].setPiece(new Knight());
		squares[i][0].setPiece(new Rook());
		}
		for(int i=0;i<8;i++) {
			squares[1][i].setPiece(new Pawn());
		}
		for(int i=0;i<8;i++) {
			squares[6][i].setPiece(new Pawn());
		}
		
	}//보드를 초기화 하고 초기 말을 배치
	
	public void movePiece(Piece piece, Square destination) {
		
	} //말을 이동시키고, 보드의 상태를 업데이트
	
	public boolean isCheck(Player player) {
		return false;
		
	} //특정 플레이어가 체크 상태인지 확인
	
	public boolean isCheckmate(Player player) {
		return false;
		
	} //특정 플레이어가 체크메이트 상태인지 확인
	
	public void printBoard() {
		System.out.println(" ");
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				if(i==0 || i==9) {
					if(j==0 || j==9) {
						System.out.print(" ");
					}
					else
						System.out.print((char)('A'+j));
				}
				else {
					if(j==0 || j==9)
						System.out.print(9-i);
					else
						System.out.print(squares[i-1][j].getPieceChar());
				}
				System.out.println();
			}
		}
		
	}
	
}
