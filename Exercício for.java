import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);    
        int num = 0;
        int tab = 0;
	    System.out.println("Digite um número inteiro:");
    	num= sc.nextInt();
	
	    for (int i = 0; i < 11; i ++){
         tab = num * i;
	
	    System.out.println(+tab);
	
	
}

}
}