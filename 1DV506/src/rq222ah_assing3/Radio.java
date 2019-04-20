package rq222ah_assing3;

public class Radio {

	private boolean on;
	private int channel;
	private int volume;

	public Radio() {
		on = false;
		channel = 1;
		volume = 1;

	}

	public void turnOn() {
		on = true;
	}

	public void setVolume(int v) {
		if (!on) {
			System.out.println("Radio off ==> No adjustment possible");

		}

		else if (v < 0 || v > 5)
			System.out.print("New volume not within range!\n");

		else
			volume = v;

	}

	public void channelUp() {
		if (channel >= 1 && channel <= 10)
			channel = channel + 1;

		else
			System.out.print("New channel not within range!");

	}

	public String getSettings() {

		String set = "\nSettings: " + "On " + on + ", " + "Channel " + channel + ", " + "Volume " + volume;
		return set;

	}

	public void turnOff() {
		on = false;
		channel = 1;
		volume = 1;

	}

	public void volumeUp() {
		setVolume(volume + 1);

	}

	public void volumeDown() {

		setVolume(volume - 1);

	}

	public void setChannel(int nw) {
		if (!on) {
			System.out.println("Radio off ==> No adjustment possible");
		}
		if (nw < 0 || nw > 10)
			System.out.print("New channel not within range!");

		else
			channel = nw;

	}

}