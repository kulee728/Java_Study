package com.chess.settings;
import com.chess.*;
import com.chess.client.Game;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		try {
			g.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
