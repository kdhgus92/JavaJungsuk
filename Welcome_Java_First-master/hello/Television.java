

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("ä���� "+ channel +"�̰� ������ "+volume+"�Դϴ�.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
