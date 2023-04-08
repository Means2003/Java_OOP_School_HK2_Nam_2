package Ex5;

public class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public void setHour(int hour){
		this.hour = hour;
	}
	public void setMinute(int minute){
		this.minute = minute;
	}
	public void setSecond(int second){
		this.second = second;
	}
	public void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	@Override
	public String toString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public Time nextSecond(){
		++second;
		if (second >= 60) {
			second = 0;
			++minute;
			if (minute >= 60){
				minute = 0;
				++hour;
				if (hour >= 24){
					hour = 0;
				}
			}
		}
		return this;
	}
	public Time previousSecond(){

		if (hour == 0 && minute == 0 && second == 0){
			hour = 23;
			minute = 59;
			second = 59;
			return this;
		}
		if (minute == 0 && second == 0){
			hour--;
			minute = 59;
			second = 59;
			return this;
		}
		if (second == 0){
			minute--;
			second = 59;
			return this;
		}
		second--;
		return this;
	}

}
