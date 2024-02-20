package arrays;

public class Umsatzsteigerung {

		
		int[] dailyGains = { 1000, 2000, 500, 9000, 9010};
		
		public int count5PercentJumps(int[]gains) {
			int count=0;
			if(this.dailyGains.length < 2) {
				System.out.println("Es sind zu wenig Zahlen für eine Berechnung vorhanden.");
				for(int i=0; i<30; i++) {
					for(int j=1; j<29; j++) {
						if((dailyGains[i] * 1.05) >= dailyGains[j]) {
						count++;
					}
				}
			}
		}
		return count;
	}
}