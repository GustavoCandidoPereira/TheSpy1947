import java.util.Random;
import java.util.Scanner;

/*
Alunos:
Gustavo Candido Pereira
Igor José Maia
João Pedro Trindade
Nicole Maximiano

1º Semestre - Análise e Desenvolvimento de Sistemas (PI)
*/
public class TheSpy {
//Scanner para inserção de dados
	static Scanner entrada = new Scanner(System.in);

	static Random random = new Random();
//Declaração de variáveis utilizadas
	// Introdução
	public static String nomeJogador;
	// Variáveis ao longo do jogo:
	// Fase1
	public static int energiaJogador = 1;
	public static int energiaInimigo = 1;
	public static String armaJogador = "pistola";
	public static int balas = 0;
	public static int poderDeDanoAtaque = 0;
	public static int danoInimigo = 0;
	public static int uniforme = 0;
	public static int maldade = 0;
	public static int bondade = 1;
	public static int escolha = 0;
	// Fase2
	public static int senha = 1000101011;
	public static int senha2 = 1173;
	public static int tentativasRestantes = 3;
	public static String alternativa;
	public static int confiancaRoger = 0;
	public static boolean RogerBanheiro = false;
	public static boolean viuQuadro = false;
	public static boolean acesso = false;
	public static boolean alarme = false;
	public static boolean kitSocorros = false;

//Método main responsável por chamar o Menu
	public static void main(String[] args) {
		menu();
	}

//Método menu, que foi chamado anteriormente, que direciona para as ações do jogo
	static void menu() {

		System.out.print("1- Jogar");
		System.out.print("\n2- Como jogar");
		System.out.print("\n3- Créditos");
		System.out.print("\n4- Sair");

		System.out.print("\nQual sua escolha?");
		escolha = entrada.nextInt();
//Switch para diferenciar a escolha
		switch (escolha) {
		case 1:
			inicio();
			break;

		case 2:
			comojogar();
			break;

		case 3:
			credito();
			break;

		case 4:
			sair();
			break;

		}

	}

//Método inicio, que contém a introdução do jogo
	static void inicio() {

		System.out.println("\n\n=============== THE SPY ===============\n\n");

		System.out.println(
				"Olá! para começar a história gostaria de saber qual será o nome que você gostaria de utilizar, e seu país?");
		System.out.println("Qual seu nome? ");
		nomeJogador = entrada.next();
		System.out.println("Qual país você pertence? ");
		String pais = entrada.next();

		System.out.println(
				nomeJogador + ", você é um espião pertencente do país " + pais + " e está designado para uma missão.");
		System.out.println(
				"Pós 2ª Guerra Mundial, ainda há especulações a respeito dos Naziztas restantes estarem escondidos em um laboratório desenvolvendo super-humanos para uma possivel reviravolta. \nVocê foi escolhido para descobrir o segredo atrás desses experimentos ilegais!");
		System.out.println("                       ,-.^._                 _\n"
				+ "                     .'      `-.            ,' ;\n"
				+ "          /`-.  ,----'         `-.   _  ,-.,'  `\n"
				+ "       _.'   `--'                 `-' '-'      ;\n"
				+ "      :                         o             ;    __,-.\n"
				+ "      ,'    o              Base Nazista       ;_,-',.__'--.\n"
				+ "     :     Bar                               ,--```    `--'\n"
				+ "     :                                      ;\n" + "     :                                      :\n"
				+ "     ;                                      :\n" + "    (                                       ;\n"
				+ "     `-.                           *      ,'\n" + "       ;                        Berlim   :\n"
				+ "     .'                             .-._,'\n" + "   .'                               `.\n"
				+ "_.'                                .__;\n" + "`._                  o            ;\n"
				+ "   `.            Alojamento       :   ,---------------------.\n"
				+ "     `.               ,..__,---._;    |      ALEMANHA       |\n"
				+ "       `-.__         :                | Capital: Berlim     |\n"
				+ "            `.--.____;                | Pop: 12700000       |\n"
				+ "                                      | Area: 250000 sq.mi. |\n"
				+ "                                      |      (647500 sq.km.)|\n"
				+ "                                      `---------------------'");
		System.out.println(
				"20/02/1947 \nOs seus superiores receberam informações de que mesmo após o fim da segunda guerra mundial, uma célula nazista continua em operação. \nO primeiro-ministro, Jorge Willians, junto com a chefia do seu país, decidem enviar um espião para obter maiores informações e deter o plano dos alemães.\nE você foi o escolhido!");

		System.out.print("\nPressione [ENTER] para continuar...\n");
		entrada.nextLine();
		loading();

	}

//Método loading, responsável por dar uma pausa entre a introdução e a fase 1
	static void loading() {

		int Loading = 0;

		System.out.printf("INICIANDO");
//For (laço de repetição) responsável por printar "." 25 vezes antes de prosseguir para a próxima etapa
		for (Loading = 0; Loading <= 25; Loading++) {
			System.out.printf(".");
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {
			}
		}
		faseUm();
	}

//Método responsável pela introdução da fase 1
	static void faseUm() {

		System.out.println(
				"\nApos receber sua missão, você é enviado a Berlim. Ao desembarcar você vai para a banca de jornal designada pelo seus superiores, para receber suas instruções.");
		System.out.println(
				"Ao chegar na banca, o contato dos seus superiores tem as intruções para sua missão, mas para ele te passar elas você precisa acertar o código");
		System.out.println(
				"O mesmo te passa um numero criptografado e você tem que descobrir o equivalente dele em número decimal");
//Primeira pergunta
		boolean acertou = false;
		System.out.println("Ele te informa a expressão FACA, isso é igual a:");
		System.out.println("a) 64202"); // resposta correta
		System.out.println("b) 68404");
		System.out.println("c) 64200");
		System.out.println("d) 64204");
		System.out.println("e) 66202");
		System.out.print("Acerte o código: ");
		alternativa = entrada.next();
//Switch para guardar a resposta certa em cases, e diferenciar as alternativas entre certo e errado		
		switch (alternativa) {
		case "a":
		case "A":
			System.out.println("Você acertou o código!");
			acertou = true;
			break;
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
			System.out.println("Não podemos prosseguir com a sua missão, seu impostor!");
			break;
		default:
			System.out.println("Escolha inválida!");
		}
//If responsável por verificar se acertou ou errou a pergunta para prosseguir
		if (acertou) {
			System.out.println("Agora deve escolher para onde ir:");
			System.out.println("1- Alojamento");
			System.out.println("2- Bar");
			System.out.println("3- Base Nazista");
			System.out.println("4- Desistir da missao");

			System.out.println("Escolha o lugar: ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("***Alojamento***");
				alojamento();
				break;

			case 2:
				System.out.println("***Bar***");
				bar();
				break;

			case 3:
				System.out.println("***Base Nazista***");
				BaseNazista();
				break;

			case 4:
				System.out.println("Até breve!");
				sair();
				break;
			}

		} else if (!acertou) {
			System.out.println("Você não conseguiu criptografar e perdeu o seu contato, tente novamente!");
			System.out.println("GAME OVER!");
			System.out.println();
			System.out.println();
			System.out.println("Bem-vindo novamente ao TheSpy!\n");
			menu();
		}
	}

//Método do alojamento que é chamado após escolher a opção de ir até ao alojamento
	static void alojamento() {

		System.out.println("Seu alojamento é um hotel longe do centro de Berlim e da Base Nazista");

		System.out.println("Ao chegar no alojamento você deseja fazer o que?");

		System.out.println("1- Descansar.");
		System.out.println("2- Recarregar a arma.");
		System.out.println("3- Voltar para o centro.");

		System.out.println("Qual sua escolha");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			if (energiaJogador < 10) {
				System.out.println("Voce acabou de descançar, mas a missao ainda o aguarda!");
				System.out.println("\nEnergia recuperada");
				energiaJogador++;
				System.out.println("\nSua energia atual é: " + energiaJogador);
			} else {
				System.out.println("Sua enegia esta otima!");
				System.out.println("\nSua energia: " + energiaJogador);
			}
			alojamento();
			break;

		case 2:
			carregarArma();
			break;

		case 3:
			faseMenu();
			break;
		}

	}

//Método do bar que é chamado após escolher a opção de ir até ao bar
	static void bar() {

		System.out.println(
				"Voce tem uma informação que os novos recrutas nazista iram se encontrar no bar onde voce esta. Eles iram comemorar a entrada no exercito nazista.");
		System.out.println("No balcao do bar voce encontra o Bartender e um militar nazista sentado sozinho.");

		if (uniforme == 1) {
			do {
				System.out.println("O que deseja fazer?");
				System.out.println("1- Pedir uma bebida e observar o ambiente.");
				System.out.println("2- Sair do bar e voltar ao centro.");
				System.out.println("Qual e sua escolha?");
				escolha = entrada.nextInt();

				switch (escolha) {

				case 1:
					System.out.println("Voce pediu um copo de whisky com gelo.");
					System.out.println("BEBENDO");
					break;

				case 2:
					escolha = 2;
					break;

				}
				while (escolha != 2)
					faseMenu();
			} while (true);
		} else {
			System.out.println("1- Pedir uma bebebida e observar o ambiente.");
			System.out.println("2- Continuar a observar a regiao");
			System.out.println("3- Sair do bar e voltar ao centro.");
			System.out.println("Qual e sua escolha?");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Ninguem entra ou sai do bar. O que deseja fazer");
				System.out.println("1 - Puxar assunto com o militar ao seu lado.");
				System.out.println("2 - Sair do bar");
				System.out.println("Qual sua escolha?");
				escolha = entrada.nextInt();

				switch (escolha) {
				case 1:
					System.out.println(
							"Voce se depara com o militar que parece estar meio embriagado, e dizendo que o mundo não gira, ele capota!. \nE que o reich ainda não chegou ao fim.");
					System.out.println("Voce percebe o que aconteceu, e cai uma ideia de roubar o uniforme dele.");
					System.out.println("O que deseja fazer?");

					System.out.println("1- Roubar o uniforme dele.");
					System.out.println("2- Voltar ao centro.");
					System.out.println("Qual sua escolha?");
					escolha = entrada.nextInt();

					switch (escolha) {
					case 1:
						System.out.println("OBTEVE 1 UNIFORME NAZISTA");
						uniforme = 1;
						System.out.println("Você conseguiu roubar com sucesso o uniforme do militar.");
						System.out
								.println("Então com medo de ser pego você sai do bar, e vai para o centro da cidade.");
						faseMenu();
						break;
					}

					break;

				case 2:
					faseMenu();
					break;

				}
				break;

			case 2:
				System.out.println(
						"Voce se depara com o militar que parece estar meio embriagado, e dizendo que o mundo não gira, ele capota!. \nE que o reich ainda não chegou ao fim.");
				System.out.println("Voce percebe o que aconteceu, e cai uma ideia de roubar o uniforme dele.");
				System.out.println("O que deseja fazer?");

				System.out.println("1- Roubar o uniforme dele.");
				System.out.println("2- Voltar ao centro.");
				System.out.println("Qual sua escolha?");
				escolha = entrada.nextInt();

				switch (escolha) {

				case 1:
					System.out.println("OBTEVE 1 UNIFORME NAZISTA");
					uniforme = 1;
					System.out.println("Voce consegui roubar com sucesso o uniforme do militar.");
					System.out.println("Entao com medo de ser pego voce sai do bar, e vai para o centro da cidade.");
					faseMenu();
					break;

				case 2:
					faseMenu();
					break;
				}
				break;
			case 3:
				faseMenu();
				break;
			}

		}
	}

//Método da base nazista que é chamado após escolher a opção de ir até a base nazista
	static void BaseNazista() {

		System.out.println(
				"A base Nazista, parece um prédio normal, porém bem fechado com poucas janelas, e na porta tem um guarda armado.");
		System.out.println("Você observa o ambiente, então o que você decide fazer?");
		System.out.println("1- Tentar entrar no predio.");
		System.out.println("2- Continuar a explorar o ambiente.");
		System.out.println("3- Voltar pro centro.");

		System.out.println("Qual sua escolha?");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			if (uniforme == 0) {
				while (escolha == 1) {
					System.out.println("O que deseja fazer?");
					System.out.println("1- Atacar o guarda.");
					System.out.println("2- Ir pro alojamento.");
					System.out.println("3- Voltar pro centro");

					System.out.println("Qual sua escolha?");
					escolha = entrada.nextInt();

					switch (escolha) {
					case 1:
						atacar();
						break;

					case 2:
						alojamento();
						break;

					case 3:
						faseMenu();
						break;
					}
				}
			} else {
				System.out.println("O que deseja fazer?");
				System.out.println("1- Voltar ao centro.");
				System.out.println("2- Ir pro alojamento.");
				System.out.println("3- Cumprimentar o guarda e entrar no predio.");

				System.out.println("\nSua escolha: ");
				escolha = entrada.nextInt();

				switch (escolha) {

				case 1:
					faseMenu();
					break;

				case 2:
					alojamento();
					break;

				case 3:
					System.out.println(
							"Após cumprimentar o Nazista, você com o uniforme ganho anteriormente entra na base nazista!");
					faseDois();
					break;
				}
			}
			break;

		case 2:
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Procurar novos recrutas.");
			System.out.println("2 - Ir pro alojamento.");
			System.out.println("3 - Voltar ao centro.");

			System.out.println("Sua escolha: ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				bar();
				break;

			case 2:
				alojamento();
				break;

			case 3:
				faseMenu();
				break;
			}

		}
	}

//Método atacar, responsável por verificar munição, e atacar de forma randômica o guarda, após essa opção ser escolhida
	static void atacar() {
		Random random = new Random();
		if (armaJogador.equals("pistola")) {
			if (balas != 0) {
				poderDeDanoAtaque = random.nextInt(balas);
			} else {
				System.out.println("\nVocê está sem munição!\n");
			}
			if (balas > 0) {
				System.out.println("\nVocê atirou!");
				System.out.println("\n[Dano: " + poderDeDanoAtaque + "]");

				balas -= poderDeDanoAtaque;
				System.out.println("\n[Quantidade de balas restantes: " + balas + "]");

				energiaInimigo -= poderDeDanoAtaque;

				System.out.println("[Energia do Nazista " + energiaInimigo + "]");
			}
			if (energiaInimigo < 1) {
				morteNazista();
			} else if (energiaInimigo > 0) {
				danoInimigo = random.nextInt(4);

				System.out.println("\n" + "O Nazista te atirou!");
				System.out.println("[Dano: " + danoInimigo + "]");

				energiaJogador -= danoInimigo;

				System.out.println("[Sua Energia: " + energiaJogador + "]");

				if (energiaJogador < 1) {
					System.out.print(nomeJogador + " você acaba de perder sua missão.");
					System.exit(0);
				}
			}
		}

	}

//Método responsável por recarregar a arma no alojamento, de forma randômica
	static void carregarArma() {

		if (armaJogador.equals("pistola")) {
			if (balas <= 5) {
				balas = balas + random.nextInt(5);

				System.out.println("Você acabou de recarregar sua " + armaJogador);
				System.out.println("\n[Arma Recarregada]");
				System.out.println("[Balas: " + balas + "]\n");
			} else {
				System.out.println("\n[Arma Recarregada No Máximo]");
				System.out.println("[Balas: " + balas + "]\n");
			}
			alojamento();
		}

	}

//Método responsável pela morte do nazista, onde você rouba o seu uniforme para se infiltrar
	static void morteNazista() {
		System.out.println("Voce matou o Nazista e escondeu o corpo!");
		System.out.println("OBTEVE 1 PONTO DE MALDADE");

		if (uniforme == 0) {
			System.out.println("OBTEVE 1 UNIFORME NAZISTA");
			uniforme = 1;
		}
		System.out.println(
				"Após matar o Nazista, você veste o uniforme que pertencia ao mesmo e entra na base nazista!\n");
		faseDois();
	}

//Menu que é chamado entre as fases
	static void faseMenu() {

		System.out.println("O que deseja fazer?");
		System.out.println("1- Alojamento");
		System.out.println("2- Bar");
		System.out.println("3- Base Nazista");

		System.out.println("Escolha o lugar: ");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			alojamento();
			break;

		case 2:
			bar();
			break;

		case 3:
			BaseNazista();
			break;
		}
	}

//Método que contém um array/vetor com uma lista de como jogar
	static void comojogar() {

		System.out.print(
				"O jogo é de múltipla escolha, que levará as outras escolha, dependendo das escolha que voce tomar mudara o curso do jogo.");
	}

//Método responsável pela saída do jogo
	static void sair() {

		System.exit(0);
	}

//Método responsável pelos créditos/alunos, utilizando vetor
	static void credito() {

		String nome[] = { "Gustavo Candido Pereira", "Igor José Maia Ferreira Leite", "João Pedro Trindade Basilio",
				"Nicole Maximiano" };
		int i, n = nome.length;
		System.out.println("Alunos responsáveis pelo desenvolvimento:");
		System.out.print("*****************************************");

		for (i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("%do- %s", (i + 1), nome[i]);
		}
	}

//Método responsável pelo ínicio da fase 2
	static void faseDois() {

		System.out.println(
				"\nVocê acaba de entrar na base e se depara com uma sala enorme, um local sem janelas porém bem iluminado.");
		System.out.println(
				"Pelo seu olhar periférico, consegue enxergar à sua esquerda um grupo de soldados conversando e à sua direita um quadro de avisos pendurado na parede.");
		System.out.println("Na frente, possui uma porta grande fechada e um segurança ao lado dela.");

		System.out.println("1- Caminhar até o quadro de avisos");
		System.out.println("2- Se juntar ao grupo");

		System.out.println("Digite a sua escolha: ");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("No quadro de avisos está pendurado um panfleto...");
			System.out.println(
					"A Importância da Genética Individual na Experimentação - Uma palestra por Dr. Tony Schmitz");
			viuQuadro = true;

		case 2:
			System.out.println("Você caminha com cautela até o grupo de soldados.");
			System.out.println("1- Permanecer quieto");
			System.out.println("2- Tentar iniciar uma conversa");

			System.out.println("Digite a sua escolha: ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				maldade += 1;
				System.out.println("Você espera por vários minutos...");
				System.out.println(
						"Até que um homem desconhecido para você entra pela porta e todos se viram para olhar.");
				break;

			case 2:
				bondade += 1;
				confiancaRoger++;
				System.out.println("Bem estranho aqui, não é... Estão nervosos?");

				System.out.println("Todos se viram e te olham como se fosse doido.");
				System.out.println("Um rapaz se apresenta como  e começa a conversar com você.");
				System.out.println(
						"A conversa é interrompida pelo som da porta se abrindo e por ela entra um homem, fazendo todos se virarem para ele.");
			}

			System.out.println(
					"Ele caminha direção ao grupo e se apresenta como Dr. Tony Schmitz, Supervisor de Produção.");

			System.out.println(
					"Dr Schmitz: Muito bem rapazes! Hoje vocês irão iniciar seus cargos, metade irá para o setor de Armazenamento e Estoque e outra metade trabalhará comigo na Produção");

			System.out.println(
					"O Doutor lidera o grupo no prédio ao lado de dentro, apresentando as pessoas e locais, e instruindo seu grupo das funções do trabalho a ser realizado, que em sua maior parte será no controle do estoque de vacinas produzidas.");
			System.out.println(
					"Você aprende que os soldados serão alocados em dormitórios durante o período de trabalho na base e o seu colega de quarto será .");
			System.out.println("Após a breve tour, você é deixado em seu dormitório.");
			System.out.println("Coloca suas coisas na mesa e se prepara mentalmente para missão que te aguarda.");

		}

		faseDoisReconhecimento();

	}

//Método dentro da fase dois, responsável pela busca da fórmula
	static void faseDoisReconhecimento() {

		System.out.println(
				"Meses já se passaram e você espera por uma oportunidade de descobrir onde a fórmula está sendo escondida.");
		System.out.println(
				"É sua chance mais fácil já que ele trabalha na Produção, mas obter informações sem parecer suspeito foi difícil até o momento.");
		System.out.println("Você decide arriscar e fazer uma abordagem.");

		System.out.println("1- Fazer a abordagem no banheiro");
		System.out.println("2- Fazer a abordagem no dormitório");

		System.out.println("Digite a sua escolha: ");
		escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			RogerBanheiro = true;
			System.out.println(
					"Você espera até de noite e quando estão os dois no banheiro fazendo suas higienes para irem dormir, aborda.");
			System.out.println("Outros funcionários entram e saem do banheiro, tornando a conversa desagradável.\n");
			confiancaRoger--;
			break;

		case 2:
			System.out.println("Você espera até de noite e quando os dois estão no dormitório, aborda ");
		}

		System.out.println(", você trabalha perto do Doutor Schmitz, não é?" + nomeJogador);

		System.out.println("Roger: Sim, ele realmente é um ótimo profissional! \n");

		System.out.println("Sabe onde eu consigo falar com ele? \n" + nomeJogador);

		System.out.println("Roger: por quê?");

		System.out.println("1- Admiro o trabalho dele e queria fazer algumas perguntas");
		System.out.println("2- É confidencial");
		System.out.println("3- Existe um problema com as vacinas");
		System.out.println("4- Preciso roubar a fórmula");

		System.out.println("Digite a sua escolha: ");
		escolha = entrada.nextInt();

		switch (escolha) {

		case 1:
			System.out.println("É que eu admiro muito o trabalho dele e queria conversar para fazer algumas perguntas."
					+ nomeJogador);
			break;

		case 2:
			System.out.println("É confidencial." + nomeJogador);
			confiancaRoger -= 2;

			System.out.println("Roger: localização também é confidencial. \n");

			break;

		case 3:
			System.out.println(
					"\nTem um problema com as vacinas na área de estoque. O chefe do setor pediu para eu ir verificar a produção e encontrar o erro. \n"
							+ nomeJogador);
			confiancaRoger++;
			break;

		case 4:
			System.out.println("\nQuero roubar a fórmula da vacina e vende-la para à Inglaterra! \n" + nomeJogador);
			confiancaRoger = 1000;
			System.out.println("\nRoger: Ahahahah! Você é um ótimo piadista, \n" + nomeJogador);
		}

		if (confiancaRoger >= 0) {
			boolean confiancaTemporaria = false;

			if (confiancaRoger == 0) {

				System.out.println(" está ficando suspeito...");
				System.out.println(": no que especificamente você quer conversar com ele? \n");

				if (viuQuadro) {
					System.out.println(
							"\nEu queria conversar sobre a palestra dele sobre genética e esclarecer minhas dúvidas. \n"
									+ nomeJogador);
					confiancaTemporaria = true;
				}
			}
			if (confiancaTemporaria || confiancaRoger > 0) {
				System.out.println(": Entendo, o Dr. fica no laboratório 31B, no terceiro andar.");

				if (confiancaRoger > 0) {
					System.out.println("No mesmo corredor que a sala de equipamentos");
				}
				System.out.println("Muito obrigado! " + nomeJogador);

				bondade += 1;
			}

		} else {
			System.out.println("Falha em obter a informação de...");
			System.out.println("A única opção que restou é pegá-la à força!");
			System.out.printf("\nVocê vai até o quarto e espera o retorno de Gunter com a arma em punho"
					+ "para pegá-lo de surpresa na entrada!\n");

			System.out.println(
					"Quando ele entra você imobliza ele e a apontaa sua arma para ele e força ele a te dar a localização");
			System.out.println("Ele fica no laboratório 31B, por favor não me mate");
			System.out.println("Ok! Mas se você avisar para alguem eu te matarei");
			System.out.println("Você da uma coronhada nele.");

		}
		System.out.printf("\nVocê vai até o quarto e espera o retorno de Gunter com a arma em punho"
				+ "para pegá-lo de surpresa na entrada!\n");

		System.out.println(
				"Quando ele entra você imobliza ele e a apontaa sua arma para ele e força ele a te dar a localização");
		System.out.println("Ele fica no laboratório 31B, por favor não me mate");
		System.out.println("Ok! Mas se você avisar para alguem eu te matarei");
		System.out.println("Você da uma coronhada nele.");
		faseDoisFormula();
	}

//Método após ele chegar na sala e encontrar a fórmula
	static void faseDoisFormula() {

		System.out.printf("===================================\n\n");
		System.out.println("Você chega ao corredor que Gunter informou");

		if (confiancaRoger > 0) {
			System.out.println("A sala de equipamentos que Gunter comentou está logo ali");
			System.out.println("------------------\n");
			System.out.println("1. Explorar\n" + "2. Deixar para lá\n> ");
			escolha = entrada.nextInt();

			if (escolha == 1) {
				salaDeEquipamentos();
			}
		}

		System.out.println("Seguindo em frente, encontra a sala 31B.\n"
				+ "É uma porta grande e reforçada, com os dizeres nazistas \"Arbeit macht frei\" (Trabalho liberta você) entalhados.\n"
				+ "Não há ninguém por perto, você se aproxima da porta e percebe o monitor.\n"
				+ "Há um teclado solicitando senha\n[SENHA]");
		System.out.println("Você percebe que no teclado só tem opções de numeros 0 e 1.\nLogo supõe que se trata de um código binário.\nNo seu relátario você teve acesso a data de nascimento do doutor quer seria 11/10/1897");
		System.out.println("O monitor tem espaço para 10 digitos logo, você supõe que seria o dia e mês da data de nascimento do doutor.");
		System.out.println("\nConsegue preencher a senha? Dica: converta 1110 para binário e utilize os 10 primeiros números");

		escolha = entrada.nextInt();

		for (int i = 0; i <= 1 && senha != 1000101011; i++) {
			tentativasRestantes -= 1;
			System.out.printf("[SENHA INVÁLIDA]\n %d tentativas restantes...\n> ", tentativasRestantes);
			escolha = entrada.nextInt();

		}

		if (tentativasRestantes == 1) {
			alarme = true;
		}

		if (alarme) {
			System.out.printf("Você extrapola o número de tentativas e os alarmes começam a soar.");
		} else {
			System.out.printf(
					"A porta se destranca e você entra.\n" + "Seus olhos rapidamente se voltam aos papéis no canto.\n");
			System.out.printf("\n-----------------------\n");
			System.out.printf("1- Pegar a fórmula e sair\n" + "2- Explorar o laboratório\n> ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				System.out.printf("Você vasculha os papéis e consegue achar a fórmula%n"
						+ "Pega a pasta e sai da sala discretamente.\n");

				break;
			case 2:
				System.out.printf("Ao reparar melhor na sala, você percebe tanques cilindricos com criaturas humanóides estranhas dentro.\nDeve ser isso que a vacina faz...\n");

				if (confiancaRoger < 1) {
					System.out.println("Gunter: \"É ELE!\"");
					System.out.printf("Você se vira e vê Gunter na porta apontando pra dentro da sala\n"
							+ "De repente, alarmes começam a soar. Você pega rapidamente o envelope "
							+ "com a fórmula dentro e consegue sair correndo por um triz\n");
					alarme = true;

				} else {
					System.out.println("Você abre um armário e acha uma pequena caixinha");
					System.out.println("[OBTEVE] Kit de primeiros socorros");
					kitSocorros = true;
				}
				break;
			}
		}
                System.exit(0);
		}

	static void salaDeEquipamentos() {
		
		System.out.println("Você chega na sla 27B que é a sala de equipamento, e precebe que prescisa de uma senha para entrar.");
		System.out.println("A senha e o numero da sala em octadecimal");
                System.out.println("qual e a senha da sala?");
                escolha = entrada.nextInt();
                
                for (int i = 0; i <= 1 && senha2 != 1173; i++) {
			tentativasRestantes -= 1;
			System.out.printf("[SENHA INVÁLIDA]\n %d tentativas restantes...\n> ", tentativasRestantes);
			escolha = entrada.nextInt();
                }
                        
                        if (escolha == 1173){
                            System.out.println("Você entra na sala de equipamentos, e depara com armas e munição. Mas ainda a uma sala inteira para ver.");
                            System.out.println("1- Continuar a explorar a sala");
                            System.out.println("2- Sair e ir para o laboratirio");
                            System.out.println("O que deseja fazer?");
                            escolha = entrada.nextInt();
                            
                            switch(escolha){
                                case 1: 
                                    System.out.println("Você entra na sala e la no fundo você encontra um bau e um cofre nas paredes laderais");
                                    System.out.println("Você pode tentar abrir eles ou sair da sala de equipamento.");
                                    System.out.println("O que deseja fazer");
                                    System.out.println("1- Abrir o bau");
                                    System.out.println("2- Abrir o cofre");
                                    System.out.println("3- Sair da sala e ir pro labolatorio");
                                    escolha = entrada.nextInt();
                                    
                                    switch(escolha){
                                        case 1: 
                                            System.out.println("Você vai em direção ao bau e nele a um cadeado numerico");
                                            System.out.println("Você não sabe a senha, mas mesmo mesmo assim tenta abrir");
                                            System.out.println("Pelo o cadeado você percebe que e um numero hexadecimal");
                                            System.out.println("Você passa a mão no bau e percebe que a um relevo indicado 79");
                                            System.out.println("Passa o numero 4f para hexadecimal");
                                            escolha = entrada.nextInt();
                                            
                                            if (escolha == 79){
                                                System.out.println("Você consegui abir o bau e nele havia uma bomba");
                                                System.out.println("[Você adiquiriu uma Bomba]");
                                            } else {
                                                System.out.println("Você não consegue descobir a senha desiste");
                                                System.out.println("Você sai da sala e vai para o laboratorio");
                                                System.out.println("Seguindo em frente, encontra a sala 31B.\n"
				+ "É uma porta grande e reforçada, com os dizeres nazistas \"Arbeit macht frei\" (Trabalho liberta você) entalhados.\n"
				+ "Não há ninguém por perto, você se aproxima da porta e percebe o monitor.\n"
				+ "Há um teclado solicitando senha\n[SENHA]");
		System.out.println("Você percebe que no teclado só tem opções de numeros 0 e 1.\nLogo supõe que se trata de um código binário.\nNo seu relátario você teve acesso a data de nascimento do doutor quer seria 11/10/1897");
		System.out.println("O monitor tem espaço para 10 digitos logo, você supõe que seria o dia e mês da data de nascimento do doutor.");
		System.out.println("\nConsegue preencher a senha? Dica: converta 1110 para binário e utilize os 10 primeiros números");

		escolha = entrada.nextInt();

		for (int i = 0; i <= 1 && senha != 1000101011; i++) {
			tentativasRestantes -= 1;
			System.out.printf("[SENHA INVÁLIDA]\n %d tentativas restantes...\n> ", tentativasRestantes);
			escolha = entrada.nextInt();

		}

		if (tentativasRestantes == 1) {
			alarme = true;
		}

		if (alarme) {
			System.out.printf("Você extrapola o número de tentativas e os alarmes começam a soar.");
		} else {
			System.out.printf("A porta se destranca e você entra.\n" + "Seus olhos rapidamente se voltam aos papéis no canto.\n");
			System.out.printf("1- Pegar a fórmula e sair\n" + "2- Explorar o laboratório\n> ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				System.out.printf("Você vasculha os papéis e consegue achar a fórmula%n"
						+ "Pega a pasta e sai da sala discretamente.\n");

				break;
			case 2:
				System.out.printf("Ao reparar melhor na sala, você percebe tanques cilindricos com criaturas humanóides estranhas dentro.\nDeve ser isso que a vacina faz...\n");

				if (confiancaRoger < 1) {
					System.out.println("Roger: \"É ELE!\"");
					System.out.printf("Você se vira e vê Roger na porta apontando pra dentro da sala\n"
							+ "De repente, alarmes começam a soar. Você pega rapidamente o envelope "
							+ "com a fórmula dentro e consegue sair correndo por um triz\n");
					alarme = true;

				} else {
					System.out.println("Você abre um armário e acha uma pequena caixinha");
					System.out.println("[OBTEVE] Kit de primeiros socorros");
					kitSocorros = true;
                                        System.exit(0);
				}
				break;
			}
		}
                                            }
                                            break;
                                            
                                        case 2:
                                            
                                            System.out.println("Você vai em direção ao cofre.");
                                            System.out.println("Você não sabe a senha, mas mesmo mesmo assim tenta abrir");
                                            System.out.println("Pelo o cadeado você percebe que e um numero hexadecimal");
                                            System.out.println("Você tenta mover o cofre na tentaiva de ver algo gravado nele, e do nada cai um papel.");
                                            System.out.println("Que estava escrito 2277");
                                            System.out.println("E o sistema de senha do cofre ia ate o numero 7. Sabendo disso você descobre que se trata de um numero octal");
                                            System.out.println("Passe o numero 2277 para octal");
                                            escolha = entrada.nextInt();
                                            
                                            if (escolha == 4345){
                                                System.out.println("Você consegui abir o cofre e nele havia uma arma Especial");
                                                System.out.println("[Você adiquiriu uma Arma]");
                                            } else {
                                                System.out.println("Você não consegue descobir a senha desiste");
                                                System.out.println("Você sai da sala e vai para o laboratorio");
                                                 System.out.println("Você não consegue descobir a senha desiste");
                                                System.out.println("Você sai da sala e vai para o laboratorio");
                                                System.out.println("Seguindo em frente, encontra a sala 31B.\n"
				+ "É uma porta grande e reforçada, com os dizeres nazistas \"Arbeit macht frei\" (Trabalho liberta você) entalhados.\n"
				+ "Não há ninguém por perto, você se aproxima da porta e percebe o monitor.\n"
				+ "Há um teclado solicitando senha\n[SENHA]");
		System.out.println("Você percebe que no teclado só tem opções de numeros 0 e 1.\nLogo supõe que se trata de um código binário.\nNo seu relátario você teve acesso a data de nascimento do doutor quer seria 11/10/1897");
		System.out.println("O monitor tem espaço para 10 digitos logo, você supõe que seria o dia e mês da data de nascimento do doutor.");
		System.out.println("\nConsegue preencher a senha? Dica: converta 1110 para binário e utilize os 10 primeiros números");

		escolha = entrada.nextInt();

		for (int i = 0; i <= 1 && senha != 1000101011; i++) {
			tentativasRestantes -= 1;
			System.out.printf("[SENHA INVÁLIDA]\n %d tentativas restantes...\n> ", tentativasRestantes);
			escolha = entrada.nextInt();

		}

		if (tentativasRestantes == 1) {
			alarme = true;
		}

		if (alarme) {
			System.out.printf("Você extrapola o número de tentativas e os alarmes começam a soar.");
		} else {
			System.out.printf("A porta se destranca e você entra.\n" + "Seus olhos rapidamente se voltam aos papéis no canto.\n");
			System.out.printf("1- Pegar a fórmula e sair\n" + "2- Explorar o laboratório\n> ");
			escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				System.out.printf("Você vasculha os papéis e consegue achar a fórmula%n"
						+ "Pega a pasta e sai da sala discretamente.\n");

				break;
			case 2:
				System.out.printf("Ao reparar melhor na sala, você percebe tanques cilindricos com criaturas humanóides estranhas dentro.\nDeve ser isso que a vacina faz...\n");

				if (confiancaRoger < 1) {
					System.out.println("Roger: \"É ELE!\"");
					System.out.printf("Você se vira e vê Roger na porta apontando pra dentro da sala\n"
							+ "De repente, alarmes começam a soar. Você pega rapidamente o envelope "
							+ "com a fórmula dentro e consegue sair correndo por um triz\n");
					alarme = true;

				} else {
					System.out.println("Você abre um armário e acha uma pequena caixinha");
					System.out.println("[OBTEVE] Kit de primeiros socorros");
					kitSocorros = true;
                                        System.exit(0);
				}
				break;
                                    }
                                            break;
                            }
                        }
                   }
             }
       }
	}
	}                   
