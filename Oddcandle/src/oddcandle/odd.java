package oddcandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class odd {
	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 3, 3, 4, 4, 4 };
		ArrayList<Integer> finalResult = findOddTime(array);
		System.out.println(finalResult);
	}

	public static ArrayList<Integer> findOddTime(int[] oddNum) {
		Map<Integer, Integer> countOddTime = new HashMap<>();
		ArrayList<Integer> finalResult = new ArrayList<>();

		for (int i = 0; i < oddNum.length; i++) {

			if (countOddTime.containsKey(oddNum[i])) {
				countOddTime.put(oddNum[i], countOddTime.get(oddNum[i]) + 1);
			} else {
				countOddTime.put(oddNum[i], 1);

			}
		}
		for (Map.Entry<Integer, Integer> finalOdd : countOddTime.entrySet()) {
			if (finalOdd.getValue() % 2 != 0) {
				finalResult.add(finalOdd.getKey());

			}

		}
		return finalResult;

	}
}


