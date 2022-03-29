package Logic_Programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Result {

	private String delimeter;
	private String numbers;

	public Result(String delimeter, String numbers) {
		super();
		this.delimeter = delimeter;
		this.numbers = numbers;
	}

	private int sum() {
		ensureNotNegativeNumbers();
		return getNumber().sum();
	}
	private void ensureNotNegativeNumbers()
	{
		String sequence=getNumber().filter(n->n<0).mapToObj(Integer::toString).collect(Collectors.joining(","));
		if(!sequence.isEmpty())
		{
			throw new RuntimeException(""+sequence);
		}
	}
	private IntStream getNumber() {
		if(numbers.isEmpty()) {
			return IntStream.empty();
		}else
		{
			return Stream.of(numbers.split(delimeter)).mapToInt(Integer::parseInt);
		}
	}
	public static String sum(String input) {
		return parseInput(input).sum()+"";
	}
	private static Result parseInput(String input) {
		if(input.startsWith("//")) {
			String[] parts = input.split("\n", 2);
			return new Result(parts[0].substring(2), parts[1]);
		}else {
			return new Result(",|\n", input);
		}
	}
	public static void main(String[] args) {
		System.out.println(sum("1;8,3"));
	}

}