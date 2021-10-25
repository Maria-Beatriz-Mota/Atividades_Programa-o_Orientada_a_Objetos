import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
	    int n[];
	    n = new int[6];
	    Scanner s = new Scanner(System.in);
	    for (int i=0; i < n.length;i++)  {
	        System.out.print("Digite os numeros: ");
	        n[i] = s.nextInt();
	    }
	    for (int i=n.length-1;i>=0 ;i--)  {    
	    	System.out.print(n[i]+" ");
	    	System.out.println("<-");
	    }
	}
}