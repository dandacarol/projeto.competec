import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num;
	   System.out.println("Escreva um número impar");
	   num = sc.nextInt();
	   for (int i = 1; i < num;i = i + 2){
	   System.out.println(+i);
	   }
	}
}