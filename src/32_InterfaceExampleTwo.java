
/**
 * Interface Example Two
 * */
public class Main {

	public static void main(String[] args) {

		Remote remote = new Television();
		remote.powerOn();
		remote.volumeUp();
		remote.powerOff();
	}
}

interface Remote {

	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
}

class Television implements Remote {

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down");
	}
}
