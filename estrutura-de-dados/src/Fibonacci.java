import javax.swing.JOptionPane;

public class Fibonacci {
	// Escrever um algoritmo recursivo para escrever até o 10 elemento da lista
	
	static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
				
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo Fibonacci:"));
				
		for(int i = 1; i<= numero; i++) {
			System.out.println(fibonacci(i));
		}
		
	
	}

}
