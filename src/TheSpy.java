import java.util.Scanner;

public class TheSpy {
	static Scanner entrada = new Scanner(System.in);
    public static String nomeJogador;

	public static void main(String[] args) {
        inicio();
        loading();
	}
	
    static void inicio() {
        System.out.println("\n\n=============== THE SPY ===============\n\n");

		System.out.println(
				"Olá! para começar a história gostaria de saber qual será o nome que você gostaria de utilizar, e seu país?");
		System.out.println("Qual seu nome? ");
		nomeJogador = entrada.nextLine();
		System.out.println("Qual país você pertence? ");
		String pais = entrada.nextLine();

		System.out.println(
				nomeJogador + ", você é um espião pertencente do país " + pais + " e está designado para uma missão.");
		System.out.println(
				"Pós 2ª Guerra Mundial, ainda há especulações a respeito dos Naziztas restantes estarem escondidos em um laboratório desenvolvendo super-humanos para uma possivel reviravolta. \nVocê foi escolhido para descobrir o segredo atrás desses experimentos ilegais!");
        System.out.println("                       ,-.^._                 _\n" +
"                     .'      `-.            ,' ;\n" +
"          /`-.  ,----'         `-.   _  ,-.,'  `\n" +
"       _.'   `--'                 `-' '-'      ;\n" +
"      :                         o             ;    __,-.\n" +
"      ,'    o              Base Nazista       ;_,-',.__'--.\n" +
"     :     Bar                               ,--```    `--'\n" +
"     :                                      ;\n" +
"     :                                      :\n" +
"     ;                                      :\n" +
"    (                                       ;\n" +
"     `-.                           *      ,'\n" +
"       ;                        Berlim   :\n" +
"     .'                             .-._,'\n" +
"   .'                               `.\n" +
"_.'                                .__;\n" +
"`._                  o            ;\n" +
"   `.            Alojamento       :   ,---------------------.\n" +
"     `.               ,..__,---._;    |      ALEMANHA       |\n" +
"       `-.__         :                | Capital: Berlim     |\n" +
"            `.--.____;                | Pop: 12700000       |\n" +
"                                      | Area: 250000 sq.mi. |\n" +
"                                      |      (647500 sq.km.)|\n" +
"                                      `---------------------'");
		System.out.println(
				"20/02/1947 \nOs seus superiores receberam informações de que mesmo após o fim da segunda guerra mundial, uma célula nazista continua em operação. \nO primeiro-ministro, Jorge Willians, junto com a chefia do seu país, decidem enviar um espião para obter maiores informações e deter o plano dos alemães.\nE você foi o escolhido!");

		System.out.print("\nPressione [ENTER] para continuar...");
		entrada.nextLine();

	}

	static void loading() {

        int Loading =0;

        System.out.printf("INICIANDO");

      	for(Loading=0;Loading<=25;Loading++){
		        System.out.printf(".");
		        try { 
              Thread.sleep (300); 
            } catch (InterruptedException ex) { }		
        }
	}
}