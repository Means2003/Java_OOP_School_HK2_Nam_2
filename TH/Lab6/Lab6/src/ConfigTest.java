
public class ConfigTest {
	public static void main(String[] args) {
		Config config = Config.getinstance();
		System.out.println("Initial sound level: " + config.getSoundLevel());
		System.out.println("Initial brightness: " + config.getBrightness());

		float newSoundLevel = config.getSoundLevel() + 0.1f;
		config.setSoundLevel(newSoundLevel);
		System.out.println("New sound level: " + config.getSoundLevel());

		float newBrightness = config.getBrightness() - 0.2f;
		config.setBrightness(newBrightness);
		System.out.println("New brightness: " + config.getBrightness());
	}
}

