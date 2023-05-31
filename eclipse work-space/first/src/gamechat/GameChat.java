package gamechat;

public class GameChat {
	public String sendMessage(String msg, ChatFilter filter) {
		if(filter.filter(msg)) { // 필터링 되었을 때
			return "입력하신 채팅이 필터링 되었습니다.";
		}else {
			return msg;
		}
	}
}
