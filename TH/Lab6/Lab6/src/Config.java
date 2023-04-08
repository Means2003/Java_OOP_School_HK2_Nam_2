
public class Config {
   private static Config instance;
   private float soundLevel;
   private float brightness;
   private Config() {
	   soundLevel=5.0f;
	   brightness=5.0f;
   }
   
   public static Config getinstance() {
	   if(instance==null) {
		   instance= new Config();
	   }
	   return instance;
   }
   public float getSoundLevel() {
	return soundLevel;
   }
   public void setSoundLevel(float soundLevel) {
	this.soundLevel = soundLevel;
   }
   public float getBrightness() {
	return brightness;
    }
   public void setBrightness(float brightness) {
	this.brightness = brightness;
}
}
