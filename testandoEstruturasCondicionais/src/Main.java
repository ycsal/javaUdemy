import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ex = 1;
		Scanner sc = new Scanner(System.in);
		while (ex > 0 && ex <= 8) {
			System.out.println("\nExercicio 1 - Negativo ou Positivo\nExercicio 2 - Par ou Impar\nExercicio 3 - Multiplos ou nao\n"
					+ "Exercicio 4 - Duracao do Jogo\nExercicio 5 - Itens e valores\nExercicio 6 - Intervalos\n"
					+ "Exercicio 7 - Quadrantes\nExercicio 8 - Imposto de Renda");
			System.out.println("Qual exercicio voce deseja visualizar?/n"
					+ "Para encerrar, digite qualquer outro numero.");
			ex = sc.nextInt();
			switch (ex) {
			case 1:
				/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
				System.out.println("Digite um número inteiro:");
				int n = sc.nextInt();
				if (n>0) {
					System.out.println(n + " é positivo.");
				}
				else if (n == 0) {
					System.out.println(n + " é nulo.");
				}
				else {
					System.out.println(n + " é negativo.");
				}
				break;
				
			case 2:
				/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
				System.out.println("Digite um número inteiro:");
				int a = sc.nextInt();
				if (a % 2 == 0) {
					System.out.println(a + " é par.");
				}
				else {
					System.out.println(a + " é ímpar.");
				}
				break;
				
			case 3:
				/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
				 * indicando se os valores lidos são múltiplos entre si. 
				 * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/
				System.out.println("Digite um número inteiro:");
				int b = sc.nextInt();
				System.out.println("Digite outro número inteiro:");
				int c = sc.nextInt();
				if (c % b == 0 || b % c == 0) {
					System.out.printf("%d e %d sao multiplos.\n", b, c);
				}
				else {
					System.out.printf("%d e %d nao sao multiplos.\n", b, c);
				}
				break;
				
			case 4:
				/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
				 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
				 * tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
				System.out.println("Qual e o horario inicial do jogo (formato 24h)?");
				int hInicial = sc.nextInt();
				System.out.println("Qual e o horario final do jogo (formato 24h)?");
				int hFinal = sc.nextInt();
				int duracaoTotal = (hInicial<hFinal)? hFinal-hInicial : 24-hInicial+hFinal;
				System.out.printf("O jogo tem %d hora(s) de duracao\n", duracaoTotal);
				break;
				
			case 5:
				/*Com base na tabela do pdf, escreva um programa que leia o código de um item e a quantidade deste item. 
				 * A seguir, calcule e mostre o valor da conta a pagar.*/
				System.out.println("Digite o codigo do item que voce deseja:");
				System.out.println("1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante");				
				int cd = sc.nextInt();
				System.out.println("Digite a quantidade desejada:");				
				int qtd = sc.nextInt();
				double valorTotal;
				switch (cd) {
				case 1:
					valorTotal = qtd*4.0;
					break;
				case 2:
					valorTotal = qtd*4.5;
					break;
				case 3:
					valorTotal = qtd*5.0;
					break;
				case 4:
					valorTotal = qtd*2.0;
					break;
				case 5:
					valorTotal = qtd*1.5;
					break;
				default:
					valorTotal = 0;
					break;
				}
				System.out.printf("\nCodigo %d - %d unidades\nValor total: R$%.2f\n", cd, qtd, valorTotal);

				break;
				
			case 6:
				/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
				 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
				 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
				System.out.println("Digite um  valor qualquer");				
				double v = sc.nextDouble();
				if(v>=0 && v<=25) System.out.println(v + " esta no intervalo [0,25].");
				else if(v>=25 && v<=50) System.out.println(v + " esta no intervalo (25,50].");
				else if(v>=50 && v<=75) System.out.println(v + " esta no intervalo (50,75].");
				else if(v>=75 && v<=100) System.out.println(v + " esta no intervalo (75,100].");
				else System.out.println(v + " esta fora de intervalo.");
				break;
				
			case 7:
				/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
				 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
				 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
				 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/
				System.out.println("Insira o valor de x:");
				double x = sc.nextDouble();
				System.out.println("Insira o valor de y:");
				double y = sc.nextDouble();
				if (x==0.0 && y == 0.0) System.out.println("Ponto na Origem (0, 0).");
				else if (x>0 && y>0) System.out.printf("\nPonto no quadrante 1 (%.1f, %.1f).\n", x, y);
				else if (x<0 && y>0) System.out.printf("\nPonto no quadrante 2 (%.1f, %.1f).\n", x, y);
				else if (x<0 && y<0) System.out.printf("\nPonto no quadrante 3 (%.1f, %.1f).\n", x, y);
				else if (x>0 && y<0) System.out.printf("\nPonto no quadrante 4 (%.1f, %.1f).\n", x, y);
				else if (x==0) System.out.printf("\nPonto no eixo Y (%.1f, %.1f).\n", x, y);
				else System.out.printf("\nPonto no eixo X (%.1f, %.1f).\n", x, y);
				break;
				
			case 8:
				/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
				 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. 
				 * A moeda deste país é o Rombus, cujo símbolo é o R$.
				 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o 
				 * valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela do pdf.
				 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
				 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), 
				 * a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
				 * O valor deve ser impresso com duas casas decimais. */
				System.out.println("Insira seu salario:");
				double sal = sc.nextDouble();
				double imposto = 0;
				if (sal > 0 && sal <= 2000) System.out.println("\nIsento de imposto de renda.");
				else {
					if (sal <= 3000.0) {
						imposto = (sal - 2000.0) * 0.08;
					}
					else if (sal <= 4500.0) {
						imposto = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
					}
					else {
						imposto = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
					}
					System.out.printf("O imposto é de R$ %.2f.\n", imposto);
				}
				break;
			default:
				sc.close();
			}
		}
	}
}
