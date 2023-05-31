package gamechat;

import java.util.Scanner;

public class GameChatTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요 : ");
		String msg = scan.nextLine();
		GameChat gc = new GameChat();
		ChatFilter[] cf = new ChatFilter[3];
		cf[0] =new Filter01();
		cf[1] =new Filter01();
		cf[2] =new Filter01();
		String message = gc.sendMessage(msg, new Filter01());
		System.out.println(message);
		scan.close();
	}

}
