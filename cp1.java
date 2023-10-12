import java.util.Scanner;

class cp1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("============================================");
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 - Ir de 0 ate um numero");
			System.out.println("2 - somar dois numeros");
			System.out.println("3 - Sair");
			System.out.println("============================================");
			System.out.print("Opcao: ");
			int opcao = scanner.nextInt();
					
			if (opcao < 1 || opcao > 3) {
				System.out.println("opcao " + opcao + " invalida");
				continue;
			}
			
			if (opcao == 1) {
				System.out.print("Digite o numero: ");
				int numero = scanner.nextInt();
				
				if (numero < 1 || numero > 10) {
					System.out.format("Numero escolhido %s. Numero deve estar entre 1 e 10\n", numero);
					continue;
				}
				
				/*
				System.out.print("Numeros: ");
				for (int i = 0; i <= numero; i++) {
					System.out.print(i + " ");
				}
				System.out.println();*/
				
				String textoNumeros = "Numeros: ";
				
				for (int i = 0; i <= numero; i++) {
					textoNumeros = textoNumeros + i + " ";
				}
				
				System.out.println(textoNumeros);
			}
			
			if (opcao == 2) {
				System.out.print("Digite o primeiro numero: ");
				int numero1 = scanner.nextInt();
				System.out.print("Digite o segundo numero: ");
				int numero2 = scanner.nextInt();
				
				int soma = numero1 + numero2;
				
				System.out.format(
					"Soma de %s e %s: %s\n", 
					numero1, numero2, soma);
			}
			
			if (opcao == 3) {
				System.out.println("Adeus!");
				//System.exit(0);
				break;
			}
		}
	}
}