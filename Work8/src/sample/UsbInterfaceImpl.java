package sample;

public class UsbInterfaceImpl implements UsbInterface {
	@Override
	public void power() {
		System.out.println("電源が入りました");
	}
}
