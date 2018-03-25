package com.jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	//Atualiza��es -> Commit para o GitHub
	// M�todos de cria��o
	public static void menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem Vindo ao jogo RPG em Texto");
		System.out.println("===============================");
		System.out.println("	MENU DE OP��ES");
		System.out.println("===============================");
		System.out.println("[1] Come�ar");
		System.out.println("[2] Regras");
		System.out.println("[3] Instru��es");
		System.out.println("[4] Sair");
		int r = teclado.nextInt();
		switch (r) {
		case 1:
			break;
		case 2:
			System.out.println("Este � um jogo baseado em texto, com op��es de a��es "
					+ "\ndistintas que s�o escolhidas" + " pelo jogador");
			System.out.println();
			System.out.println("O jogador s� poder� escolher a��es dentre as que " + "\ndispon�veis na tela");
			regras();
			break;
		case 3:
			System.out.println("Instru��es");
			regras();
			break;
		case 4:
			System.out.println("Saindo");
			System.exit(0);
			break;
		default:
			System.out.println("Op��o inv�lida");
			menu();
			break;
		}

		return;
	}

	public static void opcJogo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Andar");
		System.out.println("[2] Correr");
		System.out.println("[3] Parar");
		System.out.println("[4] Vir. Esquerda");
		System.out.println("[5] Vir. Direita");
		System.out.println("[6] Jogar dado");
		System.out.println("[7] Sair");
		int r = teclado.nextInt();
		switch (r) {
		case 1:
			System.out.println("Andando");
			break;
		case 2:
			System.out.println("Correndo");
			break;
		case 3:
			System.out.println("Parado");
			break;
		case 4:
			System.out.println("Virei � esquerda");
			break;
		case 5:
			System.out.println("Virei � direita");
			break;
		case 6:
			jogarDado();
			break;
		case 7:
			System.out.println("Saindo..");
			System.exit(0);
			break;
		default:
			System.out.println("Op��o inv�lida");
			System.out.println();
			opcJogo();
			break;
		}
	}

	public static void regras() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Come�ar o jogo");
		System.out.println("[2] Sair");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			System.out.println("Come�ando");
			System.out.println();
			break;
		case 2:
			System.out.println("Saindo..");
			System.exit(0);
			break;
		default:
			System.out.println("Op��o invl�lida");
			regras();
			break;
		}
	}

	public static void objetos() {
		Random gerador = new Random();
		int objeto = gerador.nextInt(6);
		switch (objeto) {
		case 0:
			System.out.println(objeto);
			break;
		case 1:
			System.out.println(objeto);
			break;
		case 2:
			System.out.println(objeto);
			break;
		case 3:
			System.out.println(objeto);
			break;
		case 4:
			System.out.println(objeto);
			break;
		case 5:
			System.out.println(objeto);
			break;
		}
	}

	// M�todos de a��o
	public static void escolha1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Oque deseja fazer?");
		System.out.println("[1] Ir para o bal��o");
		System.out.println("[2] Ir para a mesa de jogo");
		System.out.println("[3] Ir em dire��o ao homem velho");
		int res1 = teclado.nextInt();
		switch (res1) {
		case 1:
			System.out.println();
			System.out.println("Voc� vai de encontro ao bal��o, l� tem 5 homens sentados, todos conversando, rindo e bebendo.");
			System.out.println("Quando eles persebem a sua presen�a, todo o movimento � interrompido e um sil�ncio toma conta do bal��o");
			balcao();
			break;
		case 2:
			System.out.println();
			System.out.println("Voc� se aproxima da mesa onde se aglomeram algumas pessoas e percebe que eles est�o jogando \"Cartomante\", um jogo de cartas e dados baseado em apostas");
			System.out.println("Quem est� conduzindo o jogo � um pequeno Halfling, ao perceber a sua aproxima��o ele se levanta e diz"
							+ "\n\"Ora ora, parece que temos carne nova no peda�o. Me diga, voc� sabe jogar Cartomante?");
			jogoCart();
			break;
		case 3:
			System.out.println();
			System.out.println("Voc� anda em dire��o ao homem que est� limpando a mesa, e ouve que ele est� cantarolando alguma musica, que te soa familiar, mas voc� n�o � capaz de reconhecer");
			System.out.println("Quando ele percebe a sua aproxima��o para imediatamente de cantarolar e faz um barulho como quem se preocupa com algo");
			System.out.println("\"O que tu procuras por aqui meu jovem?\"");
			velho();
			break;
		default:
			escolha1();
			break;
		}
	}

	public static void jogarDado() {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		System.out.print("Quer jogar quantos dados? ");
		int res = teclado.nextInt();
		System.out.print("Dados com quatos lados? ");
		int lados = teclado.nextInt();
		for (int c = 0; c < res; c++) {
			int dado = (1 + (gerador.nextInt(lados)));
			System.out.println(dado);
			if (lados == 20) {
				if (dado == 20) {
					System.out.println("Acerto Cr�tico!");
				} else if (dado == 1) {
					System.out.println("Falha cr�tica!");
				}
			}
			if (lados == 10) {
				if (dado == 10) {
					System.out.println("Acerto Cr�tico!");
				} else if (dado == 1) {
					System.out.println("Erro Cr�tico!");
				}
			}
			if (lados == 6) {
				if (dado == 6) {
					System.out.println("Acerto Cr�tico!");
				} else if (dado == 1) {
					System.out.println("Erro Cr�tico!");
				}
			}
			if (lados == 4) {
				if (dado == 4) {
					System.out.println("Acerto Cr�tico!");
				} else if (dado == 1) {
					System.out.println("Erro Cr�tico!");
				}
			}
		}
	}

	public static void balcao() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Oque deseja fazer?");
		System.out.println("[1] Se aproximar");
		System.out.println("[2] Se afastar");
		System.out.println("[3] Pedir uma bebida");
		int resBalcao = teclado.nextInt();
		switch (resBalcao) {
		case 1:
			System.out.println();
			System.out.println("Voc� se aproxima do bal��o e se senta no meio dos homens, um deles te olha de um jeito estranho e pergunta o que voce esta fazendo ali");
			balcao11();
			break;
		case 2:
			System.out.println();
			System.out.println("Voc� decide n�o se aproximar e quando est� a uma boa dist�ncia da mesa os homens recome�am o que estavam fazendo");
			escolha1();
			break;
		case 3:
			System.out.println();
			System.out.println("Voc� encosta no bal��o e percebe que n�o tem ningu�m em sua vista");
			balcao13();
			break;
		default:
			System.out.println();
			System.out.println("Op��o inv�lida");
			balcao();
			break;
		}
	}

	public static void balcao11() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Voc� responde");
		System.out.println("[1] \"S� estou de passagem, procurando algo para beber e esquecer dos problemas\"");
		System.out.println("[2] \"Estou a procura de alguma aventura\"");
		System.out.println("[3] N�o dizer nada");
		int resPergunta = teclado.nextInt();
		switch (resPergunta) {
		case 1:
			System.out.println();
			System.out.println(
					"O homem te olha com um certo al�vio e grita \"� aben�oado, traga uma cerveja para o meu amigo aqui, �sta � por minha conta\"");
			System.out.println(
					"Derrepende um homem vestindo um avental branco com algumas gotas de sangue surge por uma porta escura com um grande copo de cerveja na m�o,"
							+ "\nele vem at� voc� e coloca o copo na sua frente");
			System.out.println(
					"Depois de algumas boas goladas voc� finalmente toma toda a cerveja, e percebe porque esta taverna � t�o conhecida, "
							+ "\nbastaram alguns goles e voc� ja est� se sentindo um pouco tonto, e um pouco mais alegre");
			break;
		case 2:
			System.out.println();
			System.out.println(
					"O homem te olha com uma cara de goza��o e diz, rindo com tom de deboche, para os outros que est�o na mesa, \n\"Olhem senhores, parece que temos um pequeno aventureiro entre n�s\"");
			System.out.println("Todos come�am a rir no mesmo tom de deboche batendo os seus copos na mesa.");
			System.out.println("Ap�s alguns segundos de risos, um dos homens levanta e se vira em sua dire��o e diz,"
					+ "\n\"Olha garoto, se voc� est� procurando por aventura, eu sou o cara que vai poder fazer isso por voc�. "
					+ "\nMe encontre amanh�, no porto da cidade, entes do sol nascer.\""
					+ "\nEnt�o ele deixou algumas moedas de prata na mesa, deu uma �ltima golada em seu copo de cerveja, come�ou a andar em dire��o a porta, "
					+ "\nmas quando estava quase passando por ela, ele se virou e disse, \"E n�o se atrase.\"");
			break;
		case 3:
			System.out.println();
			System.out.println();
			break;
		default:
			System.out.println();
			System.out.println("Opcao inv�lida");
			balcao11();
			break;
		}

	}

	public static void balcao13() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Gritar para chamar aten��o de algu�m");
		System.out.println("[2] Deixar pra l�");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			System.out.println();
			System.out.println("Voc� grita pedindo por uma bebida e um homem com um avental branco sai de uma porta com o interior escuro,"
							+ "\nusando um avental branco com algumas manchas de sangue");
			System.out.println("Com a cara fechada ele enche um copo de cerveja e coloca em cima da mesa na sua frente");
			System.out.println("Depois de algumas boas goladas voc� finalmente toma toda a cerveja, e percebe porque esta taverna � t�o conhecida, "
							+ "\nbastaram alguns goles e voc� ja est� se sentindo um pouco tonto, e um pouco mais alegre");
			break;
		case 2:
			System.out.println("Voc� decide n�o pedir nada e volta para o meio da taverna");
			System.out.println();
			escolha1();
			break;
		default:
			break;
		}

	}

	public static void jogoCart() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Sim");
		System.out.println("[2] N�o");
		System.out.println("[3] N�o responder");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			Random gerador = new Random();
			System.out.println();
			System.out.println("\"Vamos come�ar uma rodada.\"");
			System.out.println("\"Como eu sou o dono da mesa, eu come�o jogando\"");
			System.out.println();
			jogoCart2();
				break;
		case 2:
			System.out.println();
			System.out.println(
					"O pequeno Halfling faz uma cara de espanto quando ouve a sua resposta, e faz um gesto com a m�o, te convidando a sentar na mesa");
			System.out.println(
					"Voc� se senta e ele come�a a embaralhar as cartas com uma m�o e mexe alguns dados com a outra");
			System.out.println(
					"\"O jogo � muito simples, eu come�o jogando um dado, e depois voc� joga um dado, ambos com 20 faces."
							+ "\nAp�s cada dado, cada um tira uma carta do baralho e multiplica o seu valor com o do dado."
							+ "\nQuem tiver os maiores valores, ganha, simples assim." + "\nE ent�o, vamos come�ar!");
			Random gerador1 = new Random();
			System.out.println("Como eu sou o dono da mesa, eu come�o jogando\"");
			System.out.println();
			jogoCart2();
			break;
		case 3:
			System.out.println();
			System.out.println("Voc� n�o diz nada, fica apenas observando o movimento");
			System.out.println("Depois de alguns segundos em sil�ncio o Halfling diz, com um certo tom de deboche");
			System.out.println("\"E ent�o meu amigo, o gato comeu sua l�ngua? Voc� vai me responder?\"");
			jogoCart();
			break;
		default:
			System.out.println("Op��o inv�lida");
			jogoCart();
			break;
		}
	}

	public static void jogoCart1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Jogar dado");
		System.out.println("[2] Levantar e sair");
		int resp1 = teclado.nextInt();
		switch (resp1) {
		case 1:
			System.out.println();
			break;
		case 2:
			System.out.println();
			System.out.println("Voc� levanta da mesa sem dizer nada e quando est� se virando o pequeno Halfling diz,\n"
					+ "\"Volte mais tarde, quando tiver culh�es para me enfrentar\"");
			escolha1();
			break;
		default:
			System.out.println("Op��o inv�lida");
			jogoCart1(	);
			break;
		}
	}

	public static void jogoCart2() {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int dadoA = (1 + (gerador.nextInt(20)));
		System.out.println(dadoA);
		System.out.println("\"Este foi o meu dado, fa�a a sua jogada\"");
		jogoCart1();
		int dadoB = (1 + (gerador.nextInt(20)));
		System.out.println(dadoB);
		int baralhoA = (1+(gerador.nextInt(13)));
		int baralhoB = (1+(gerador.nextInt(13)));
		int dadoBaralhoA, dadoBaralhoB;
		dadoBaralhoA = dadoA*baralhoA;
		dadoBaralhoB = dadoB*baralhoB;
		if(dadoBaralhoA>dadoBaralhoB) {
			System.out.println("\"Parece que eu ganhei, " + dadoBaralhoA + "(" + dadoA + "*" + baralhoA + ") contra " + dadoBaralhoB + "(" + dadoB + "*" + baralhoB + ")\"");
		}else {
			System.out.println("\'Muito bem, voc� ganhou esta rodada, " + dadoBaralhoB + "(" + dadoB + "*" + baralhoB + ") contra " + dadoBaralhoA + "(" + dadoA + "*" + baralhoB + ")\"");
		}
			System.out.println("\"Gostaria de continuar jogando?");
			System.out.println("[1] Continuar jogando");
			System.out.println("[2] Levantar e sair");
			int resp1 = teclado.nextInt();
			System.out.println();
			switch (resp1) {
			case 1:
				jogoCart2();
				break;
			case 2:
				System.out.println();
				System.out.println("Voc� levanta da mesa sem dizer nada e quando est� se virando o pequeno Halfling diz,\n"
						+ "\"Volte mais tarde, quando tiver culh�es para me enfrentar\"");
				escolha1();
				break;
			default:
				System.out.println("Op��o inv�lida");
				jogoCart1();
				break;
			}
	}
	
	public static void velho() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Algo para beber");
		System.out.println("[2] Alguma aventura");
		System.out.println("[3] N�o responder");
		int resp = teclado.nextInt();
		switch(resp) {
		case 1:
			System.out.println("\"Bom, o bal��o n�o � aqui, como pode ver");
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("Op��o inv�lida");
			velho();
		}
	}

	// M�todo principal -> In�cio do jogo
	// Atualiza��o feita pelo Desktop
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		menu();
		String nome;
		String clas = "a";
		int classe;
		System.out.println("Digite o nome do seu personagem:");
		nome = teclado.nextLine();
		System.out.println("Escolha a classe do seu personagem");
		System.out.println("[1] Mago");
		System.out.println("[2] Feiti�eiro");
		System.out.println("[3] Guerreiro");
		System.out.println("[4] Ladino");
		classe = teclado.nextInt();
		switch (classe) {
		case 1:
			clas = "Mago";
			break;
		case 2:
			clas = "Feiti�eiro";
			break;
		case 3:
			clas = "Guerreiro";
			break;
		case 4:
			clas = "Ladino";
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		System.out.println();
		System.out.println("Personagem criado com sucesso");
		System.out.println("Nome: " + nome);
		System.out.println("Classe: " + clas);
		System.out.println();
		System.out.println("Vamos come�ar a nossa hist�ria...");
		System.out.println("O ano dos acontecimentos aqui contados n�o � especificado,"
				+ " mas poder�amos dizer que � algo perto do final da idade m�dia");
		System.out.println();
		System.out.println(nome + " est� dentro de uma taverna, A sereia do espa�o,"
				+ " uma das maiores e mais conhecidas tavernas da regi�o.");
		System.out.println("A noite es� calma, o movimento dentro da taverna est� normal,"
				+ " todas as mesas est�o ocupadas, algumas pessoas est�o "
				+ " no bal��o bebendo um tipo de cerveja que "
				+ "\ns� � feita nessa taverna, outras est�o em volta de uma mesa jogando algum "
				+ " tipo de jogo com dados, e um senhor est� limpando uma" + " velha mesa no canto");
		escolha1();
	}
}
