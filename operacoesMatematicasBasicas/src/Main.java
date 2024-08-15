import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ex = 1;
		Scanner sc = new Scanner(System.in);
			while (ex > 0 && ex <7) {
			System.out.println("\nExercicio 1 - Soma\nExercicio 2 - Circulo\nExercicio 3 - Diferenca de produtos\n"
					+ "Exercicio 4 - Funcionario\nExercicio 5 - Pecas e valores\nExercicio 6 - Calculos de Poligonos");
			System.out.println("Qual exercicio voce deseja visualizar?/n"
					+ "Para encerrar, digite qualquer outro numero.");
			ex = sc.nextInt();
			
				if(ex == 1) {
					/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
					 * números com uma mensagem explicativa.*/
					
					double x, y, soma;
					
					System.out.println("Digite o primeiro numero a ser somado:");
					x = sc.nextDouble();
					
					System.out.println("Digite o segundo numero a ser somado:");
					y = sc.nextDouble();
					
					soma = x + y;
					System.out.printf("\n%.2f + %.2f = %.2f\n", x, y, soma);
				}
				
				if (ex == 2) {
					/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor 
					 * da área deste círculo com quatro casas decimais conforme exemplos.*/
					
					double r, area, pi = 3.14159;
					
					System.out.println("Digite o valor do raio do circulo:");
					r = sc.nextDouble();
					
					area = pi * (Math.pow(r, 2));
					
					System.out.printf("\nA area do circulo é de %.4f centimentros quadrados\n", area);
				}
				
				if (ex == 3) {
					/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre
					 * a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
					
					double a, b, c, d, diferenca;
					
					System.out.println("Digite o primeiro numero:");
					a = sc.nextDouble();
					
					System.out.println("Digite o segundo numero:");
					b = sc.nextDouble();
					
					System.out.println("Digite o terceiro numero:");
					c = sc.nextDouble();
					
					System.out.println("Digite o quarto numero:");
					d = sc.nextDouble();
					
					diferenca = a*b - c*d;
					System.out.printf("\nDiferenca dos produtos: %.2f\n", diferenca);
				}
				
				if (ex == 4) {
					/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
					 * o valor que recebe por hora e calcula o salário desse funcionário. 
					 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
					
					int numf;
					double horasTotais, valorHora, sal;
					
					System.out.println("Digite o numero do funcionario:");
					numf = sc.nextInt();
					
					System.out.println("Digite o numero de horas trabalhadas:");
					horasTotais = sc.nextDouble();
					
					System.out.println("Digite quanto ganha por hora trabalhada:");
					valorHora = sc.nextDouble();
										
					sal = valorHora * horasTotais;
					System.out.printf("\nFuncionario %d - salario: R$%.2f\n", numf, sal);
				}
				
				if(ex == 5) {
					/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
					 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
					int c1, c2, n1, n2;
					double vu1, vu2, total;
					
					System.out.println("Digite o codigo da peca 1:");
					c1 = sc.nextInt();
					
					System.out.println("Digite o valor da peca 1:");
					vu1 = sc.nextDouble();
					
					System.out.println("Digite o numero de pecas 1:");
					n1 = sc.nextInt();
					
					System.out.println("Digite o codigo da peca 2:");
					c2 = sc.nextInt();
										
					System.out.println("Digite o valor da peca 2:");
					vu2 = sc.nextDouble();
					
					System.out.println("Digite o numero de pecas 2:");
					n2 = sc.nextInt();
					
					total = n1*vu1 + n2*vu2;
					
					System.out.printf("\nCódigo %d - %d unidade(s) - R$%.2f a unidade\n"
							+ "Código %d - %d unidade(s) - R$%.2f a unidade\n"
							+ "Valor total a ser pago: R$%.2f\n", c1, n1, vu1, c2, n2, vu2, total);
				}
				
				if (ex == 6) {
					/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
					 * Em seguida, calcule e mostre:
					 * a) a área do triângulo retângulo que tem A por base e C por altura.
					 * b) a área do círculo de raio C. (pi = 3.14159)
					 * c) a área do trapézio que tem A e B por bases e C por altura.
					 * d) a área do quadrado que tem lado B.
					 * e) a área do retângulo que tem lados A e B*/
					
					double a, b, c, aTri, aC, aTra, aQ, aR;
					
					System.out.println("Digite o valor A:");
					a = sc.nextDouble();
					
					System.out.println("Digite o valor B:");
					b = sc.nextDouble();
					
					System.out.println("Digite o valor C:");
					c = sc.nextDouble();
					
					aTri = (a*c) /2;
					aC = 3.14159 * Math.pow(c, 2);
					aTra = ((a+b) /2) * c;
					aQ = Math.pow(b, 2);
					aR = a * b;
					System.out.printf("\nA area do triangulo retangulo é: %.3f"
							+ "\nA area do circulo é: %.3f"
							+ "\nA area do trapézio é: %.3f"
							+ "\nA area do quadrado é: %.3f" 
							+ "\nA area do retangulo é: %.3f\n", aTri, aC,  aTra, aQ, aR);
					
				}
			}
		}
}
