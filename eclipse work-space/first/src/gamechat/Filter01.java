package gamechat;

public class Filter01 implements ChatFilter{
	@Override
	public Boolean filter(String message) {
		if(message.equals("xx")) {
			return true;
		}else {
			return false;
		}
	}
}
