import java.util.stream.Stream;

public class Exercise3 {
	public static void fibonacciIterative(int number) {
		if (number < 0) {
			System.out.println(0);
		} else {
			Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(number).map(t -> t[0])
					.forEach(x -> System.out.println(x));

		}
	}

	public static void main(String args[]) {
		Exercise3.fibonacciIterative(10);
	}
}
