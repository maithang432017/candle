package oddcandle;

import java.util.ArrayList;
import java.util.List;


public class candle {
	public static void main(String[] args) {
		int n=5;
		List<Integer> numOfCandles= new ArrayList<>();
		numOfCandles.add(4);
		numOfCandles.add(4);
		numOfCandles.add(2);
		numOfCandles.add(3);
		System.out.println("number of highest candles:"+candles(numOfCandles));
			}
public static int candles(List<Integer> arr) {
	int n=arr.size();
	int highest=arr.get(0);
	int count=0;
	for (int i=0;i<n;i++) {
		if(highest<arr.get(i)) {
			highest=arr.get(i);
			count=1;
		}
		if(highest==arr.get(i)) {
			count++;
		}
	}return count;
}
}


