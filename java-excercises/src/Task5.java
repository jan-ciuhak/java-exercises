import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String answer= " ";
		int number = Integer.parseInt(text);
		int x = 0;
		while(x<number) {
			answer = answer + "*";
			System.out.println(answer);
			x=x+1;
		}
	}
}
