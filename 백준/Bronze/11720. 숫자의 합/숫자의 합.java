import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt(); //숫자의 개수
		String a = scan.next();
		
		int sum = 0;
		
		for(int i = 0; i<count; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
			}
		}
	