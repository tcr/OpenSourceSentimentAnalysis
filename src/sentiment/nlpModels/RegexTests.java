package sentiment.nlpModels;

import java.util.Arrays;
import java.util.List;

public class RegexTests {

	public static void main(String[] args){
		String test = "<in{Sadness=16.666666666666668, Fear=16.666666666666668, Surprise=16.666666666666668, Joy=16.666666666666668, Love=16.666666666666668, Anger=16.666666666666668}, {Liberal=20.0, Green=20.0, Moderate=20.0, Libertarian=20.0, Conservative=20.0}>";
		List<String> splits = Arrays.asList(test.split(", "));
		for (String s: splits){
			System.out.println();
		}
	}
}
