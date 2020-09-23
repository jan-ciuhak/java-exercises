import java.util.Scanner;

public class task4 {
	public static String stringMultiply(String s, int n){
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++){
	        sb.append(s);
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String answer= "";
		String middle= "*";
		int number = Integer.parseInt(text);
		int x = 0;
		int y = 0;
		while(x<number) {
			answer = answer + "*";
			x=x+1;
		}

		System.out.println(answer);
		y=y+1;
		middle = middle + stringMultiply(" ", (x-2));
		middle = middle + "*";
		while(y<(number-1)) {
			System.out.println(middle);
			y = y+1;
		}
		System.out.println(answer);
		
		
		
	}

}