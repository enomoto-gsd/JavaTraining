package sample;

public class AudioInterfaceImpl implements AudioInterface {
	public void play() {
		System.out.println("再生します。");
	}
	public void pause() {
		System.out.println("停止します。");
	}
}
