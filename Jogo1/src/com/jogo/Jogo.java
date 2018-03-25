package com.jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	//Atualizações -> Commit para o GitHub
	// Métodos de criação
	public static void menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem Vindo ao jogo RPG em Texto");
		System.out.println("===============================");
		System.out.println("	MENU DE OPÇÕES");
		System.out.println("===============================");
		System.out.println("[1] Começar");
		System.out.println("[2] Regras");
		System.out.println("[3] Instruções");
		System.out.println("[4] Sair");
		int r = teclado.nextInt();
		switch (r) {
		case 1:
			break;
		case 2:
			System.out.println("Este é um jogo baseado em texto, com opções de ações "
					+ "\ndistintas que são escolhidas" + " pelo jogador");
			System.out.println();
			System.out.println("O jogador só poderá escolher ações dentre as que " + "\ndisponíveis na tela");
			regras();
			break;
		case 3:
			System.out.println("Instruções");
			regras();
			break;
		case 4:
			System.out.println("Saindo");
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida");
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
			System.out.println("Virei à esquerda");
			break;
		case 5:
			System.out.println("Virei à direita");
			break;
		case 6:
			jogarDado();
			break;
		case 7:
			System.out.println("Saindo..");
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida");
			System.out.println();
			opcJogo();
			break;
		}
	}

	public static void regras() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Começar o jogo");
		System.out.println("[2] Sair");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			System.out.println("Começando");
			System.out.println();
			break;
		case 2:
			System.out.println("Saindo..");
			System.exit(0);
			break;
		default:
			System.out.println("Opção invlálida");
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

	// Métodos de ação
	public static void escolha1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Oque deseja fazer?");
		System.out.println("[1] Ir para o balção");
		System.out.println("[2] Ir para a mesa de jogo");
		System.out.println("[3] Ir em direção ao homem velho");
		int res1 = teclado.nextInt();
		switch (res1) {
		case 1:
			System.out.println();
			System.out.println("Você vai de encontro ao balção, lá tem 5 homens sentados, todos conversando, rindo e bebendo.");
			System.out.println("Quando eles persebem a sua presença, todo o movimento é interrompido e um silêncio toma conta do balção");
			balcao();
			break;
		case 2:
			System.out.println();
			System.out.println("Você se aproxima da mesa onde se aglomeram algumas pessoas e percebe que eles estão jogando \"Cartomante\", um jogo de cartas e dados baseado em apostas");
			System.out.println("Quem está conduzindo o jogo é um pequeno Halfling, ao perceber a sua aproximação ele se levanta e diz"
							+ "\n\"Ora ora, parece que temos carne nova no pedaço. Me diga, você sabe jogar Cartomante?");
			jogoCart();
			break;
		case 3:
			System.out.println();
			System.out.println("Você anda em direção ao homem que está limpando a mesa, e ouve que ele está cantarolando alguma musica, que te soa familiar, mas você não é capaz de reconhecer");
			System.out.println("Quando ele percebe a sua aproximação para imediatamente de cantarolar e faz um barulho como quem se preocupa com algo");
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
					System.out.println("Acerto Crítico!");
				} else if (dado == 1) {
					System.out.println("Falha crítica!");
				}
			}
			if (lados == 10) {
				if (dado == 10) {
					System.out.println("Acerto Crítico!");
				} else if (dado == 1) {
					System.out.println("Erro Crítico!");
				}
			}
			if (lados == 6) {
				if (dado == 6) {
					System.out.println("Acerto Crítico!");
				} else if (dado == 1) {
					System.out.println("Erro Crítico!");
				}
			}
			if (lados == 4) {
				if (dado == 4) {
					System.out.println("Acerto Crítico!");
				} else if (dado == 1) {
					System.out.println("Erro Crítico!");
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
			System.out.println("Você se aproxima do balção e se senta no meio dos homens, um deles te olha de um jeito estranho e pergunta o que voce esta fazendo ali");
			balcao11();
			break;
		case 2:
			System.out.println();
			System.out.println("Você decide não se aproximar e quando está a uma boa distância da mesa os homens recomeçam o que estavam fazendo");
			escolha1();
			break;
		case 3:
			System.out.println();
			System.out.println("Você encosta no balção e percebe que não tem ninguém em sua vista");
			balcao13();
			break;
		default:
			System.out.println();
			System.out.println("Opção inválida");
			balcao();
			break;
		}
	}

	public static void balcao11() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Você responde");
		System.out.println("[1] \"Só estou de passagem, procurando algo para beber e esquecer dos problemas\"");
		System.out.println("[2] \"Estou a procura de alguma aventura\"");
		System.out.println("[3] Não dizer nada");
		int resPergunta = teclado.nextInt();
		switch (resPergunta) {
		case 1:
			System.out.println();
			System.out.println(
					"O homem te olha com um certo alívio e grita \"Ô abençoado, traga uma cerveja para o meu amigo aqui, ésta é por minha conta\"");
			System.out.println(
					"Derrepende um homem vestindo um avental branco com algumas gotas de sangue surge por uma porta escura com um grande copo de cerveja na mão,"
							+ "\nele vem até você e coloca o copo na sua frente");
			System.out.println(
					"Depois de algumas boas goladas você finalmente toma toda a cerveja, e percebe porque esta taverna é tão conhecida, "
							+ "\nbastaram alguns goles e você ja está se sentindo um pouco tonto, e um pouco mais alegre");
			break;
		case 2:
			System.out.println();
			System.out.println(
					"O homem te olha com uma cara de gozação e diz, rindo com tom de deboche, para os outros que estão na mesa, \n\"Olhem senhores, parece que temos um pequeno aventureiro entre nós\"");
			System.out.println("Todos começam a rir no mesmo tom de deboche batendo os seus copos na mesa.");
			System.out.println("Após alguns segundos de risos, um dos homens levanta e se vira em sua direção e diz,"
					+ "\n\"Olha garoto, se você está procurando por aventura, eu sou o cara que vai poder fazer isso por você. "
					+ "\nMe encontre amanhã, no porto da cidade, entes do sol nascer.\""
					+ "\nEntão ele deixou algumas moedas de prata na mesa, deu uma última golada em seu copo de cerveja, começou a andar em direção a porta, "
					+ "\nmas quando estava quase passando por ela, ele se virou e disse, \"E não se atrase.\"");
			break;
		case 3:
			System.out.println();
			System.out.println();
			break;
		default:
			System.out.println();
			System.out.println("Opcao inválida");
			balcao11();
			break;
		}

	}

	public static void balcao13() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Gritar para chamar atenção de alguém");
		System.out.println("[2] Deixar pra lá");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			System.out.println();
			System.out.println("Você grita pedindo por uma bebida e um homem com um avental branco sai de uma porta com o interior escuro,"
							+ "\nusando um avental branco com algumas manchas de sangue");
			System.out.println("Com a cara fechada ele enche um copo de cerveja e coloca em cima da mesa na sua frente");
			System.out.println("Depois de algumas boas goladas você finalmente toma toda a cerveja, e percebe porque esta taverna é tão conhecida, "
							+ "\nbastaram alguns goles e você ja está se sentindo um pouco tonto, e um pouco mais alegre");
			break;
		case 2:
			System.out.println("Você decide não pedir nada e volta para o meio da taverna");
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
		System.out.println("[2] Não");
		System.out.println("[3] Não responder");
		int resp = teclado.nextInt();
		switch (resp) {
		case 1:
			Random gerador = new Random();
			System.out.println();
			System.out.println("\"Vamos começar uma rodada.\"");
			System.out.println("\"Como eu sou o dono da mesa, eu começo jogando\"");
			System.out.println();
			jogoCart2();
				break;
		case 2:
			System.out.println();
			System.out.println(
					"O pequeno Halfling faz uma cara de espanto quando ouve a sua resposta, e faz um gesto com a mão, te convidando a sentar na mesa");
			System.out.println(
					"Você se senta e ele começa a embaralhar as cartas com uma mão e mexe alguns dados com a outra");
			System.out.println(
					"\"O jogo é muito simples, eu começo jogando um dado, e depois você joga um dado, ambos com 20 faces."
							+ "\nApós cada dado, cada um tira uma carta do baralho e multiplica o seu valor com o do dado."
							+ "\nQuem tiver os maiores valores, ganha, simples assim." + "\nE então, vamos começar!");
			Random gerador1 = new Random();
			System.out.println("Como eu sou o dono da mesa, eu começo jogando\"");
			System.out.println();
			jogoCart2();
			break;
		case 3:
			System.out.println();
			System.out.println("Você não diz nada, fica apenas observando o movimento");
			System.out.println("Depois de alguns segundos em silêncio o Halfling diz, com um certo tom de deboche");
			System.out.println("\"E então meu amigo, o gato comeu sua língua? Você vai me responder?\"");
			jogoCart();
			break;
		default:
			System.out.println("Opção inválida");
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
			System.out.println("Você levanta da mesa sem dizer nada e quando está se virando o pequeno Halfling diz,\n"
					+ "\"Volte mais tarde, quando tiver culhões para me enfrentar\"");
			escolha1();
			break;
		default:
			System.out.println("Opção inválida");
			jogoCart1(	);
			break;
		}
	}

	public static void jogoCart2() {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int dadoA = (1 + (gerador.nextInt(20)));
		System.out.println(dadoA);
		System.out.println("\"Este foi o meu dado, faça a sua jogada\"");
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
			System.out.println("\'Muito bem, você ganhou esta rodada, " + dadoBaralhoB + "(" + dadoB + "*" + baralhoB + ") contra " + dadoBaralhoA + "(" + dadoA + "*" + baralhoB + ")\"");
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
				System.out.println("Você levanta da mesa sem dizer nada e quando está se virando o pequeno Halfling diz,\n"
						+ "\"Volte mais tarde, quando tiver culhões para me enfrentar\"");
				escolha1();
				break;
			default:
				System.out.println("Opção inválida");
				jogoCart1();
				break;
			}
	}
	
	public static void velho() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("[1] Algo para beber");
		System.out.println("[2] Alguma aventura");
		System.out.println("[3] Não responder");
		int resp = teclado.nextInt();
		switch(resp) {
		case 1:
			System.out.println("\"Bom, o balção não é aqui, como pode ver");
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("Opção inválida");
			velho();
		}
	}

	// Método principal -> Início do jogo
	// Atualização feita pelo Desktop
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
		System.out.println("[2] Feitiçeiro");
		System.out.println("[3] Guerreiro");
		System.out.println("[4] Ladino");
		classe = teclado.nextInt();
		switch (classe) {
		case 1:
			clas = "Mago";
			break;
		case 2:
			clas = "Feitiçeiro";
			break;
		case 3:
			clas = "Guerreiro";
			break;
		case 4:
			clas = "Ladino";
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println();
		System.out.println("Personagem criado com sucesso");
		System.out.println("Nome: " + nome);
		System.out.println("Classe: " + clas);
		System.out.println();
		System.out.println("Vamos começar a nossa história...");
		System.out.println("O ano dos acontecimentos aqui contados não é especificado,"
				+ " mas poderíamos dizer que é algo perto do final da idade média");
		System.out.println();
		System.out.println(nome + " está dentro de uma taverna, A sereia do espaço,"
				+ " uma das maiores e mais conhecidas tavernas da região.");
		System.out.println("A noite esá calma, o movimento dentro da taverna está normal,"
				+ " todas as mesas estão ocupadas, algumas pessoas estão "
				+ " no balção bebendo um tipo de cerveja que "
				+ "\nsó é feita nessa taverna, outras estão em volta de uma mesa jogando algum "
				+ " tipo de jogo com dados, e um senhor está limpando uma" + " velha mesa no canto");
		escolha1();
	}
}
