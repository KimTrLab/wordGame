import java.util.Scanner;

public class Day2_02 {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[41m";
	public static final String ANSI_GREEN = "\u001B[42m";

	public static void main(String[] args){
		System.out.println("Here's some text");
		System.out.println("\u001B[31m" + "and now the text is red11");
		System.out.println("Here's some text");
		
		System.out.println("Here's some text");
		System.out.println("\u001B[31m" + "and now the text is red");
	}
}
