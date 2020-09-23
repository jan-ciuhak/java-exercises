import java.util.Scanner;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String answer= " ";
		int number = Integer.parseInt(text);
		int x = 0;
		int y = 0;
		while(x<number) {
			answer = answer + "*";
			x=x+1;
		}
		while(y<number) {
			System.out.println(answer);
			y=y+1;
		}
		
	}

}
