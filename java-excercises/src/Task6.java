import java.util.Scanner;

public class Task6 {
	
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
		int number = Integer.parseInt(text);
		int x = 0;
		int y = 0;
		int z = 0;
		int v = 0;
		while(x<number) {
			y = x;
			while(y<number) {
				answer = answer + " ";
				
				y=y+1;
			}
			answer = answer + "*";
			String multiply = "";
			v = z*2;
			multiply = stringMultiply("*", v);
			answer = answer + multiply;
			System.out.println(answer);
			x=x+1;
			z=z+1;
			answer = "";
	}
	}
}
