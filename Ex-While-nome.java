/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        String nome;
		Scanner sc = new Scanner(System.in);
		
		nome = sc.nextLine();
		int cont = 1;
		
		while (cont != 5) {
		     System.out.println(nome);
		     cont++;
		}
	}
}
