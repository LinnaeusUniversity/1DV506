package rq222ah_assing3;

public class AlarmMain {

	public static void main(String[] args) {

		

				AlarmClock clock = new AlarmClock (23,48) ;
				
				clock.displayTime();
				clock.setAlarm(6, 15);
				
				for (int i = 1 ; i <= 500 ; i++) 
					clock.timeTick();
				
				clock.displayTime();
			

		

	}

}
