package alt.vers;

public class UltimateQuestion {
	public static void main(String[] args) {
		int i = 0;
		double x;
		do {
			x = i / 10.0;
			double out = 1 + 3 + x + x + x + x + x + 5 / 4 * 2;
			if(out != 42) {
				i++;
			}
		}while((1 + 3 + x + x + x + x + x + 5 / 4 * 2) != 42);
		System.out.println(1 + 3 + x + x + x + x + x + 5 / 4 * 2);
	}
}