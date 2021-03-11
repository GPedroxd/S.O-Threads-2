package View;

import Controller.ThreadId;

public class Main {

	public static void main(String[] args) {
		for(int a = 0; a < 5; a++) {
			new ThreadId().start();
		}
	}

}
