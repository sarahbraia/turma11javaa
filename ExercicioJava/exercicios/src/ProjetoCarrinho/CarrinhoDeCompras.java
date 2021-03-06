package ProjetoCarrinho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import sun.jvm.hotspot.tools.SysPropsDumper;
public class CarrinhoDeCompras {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		String nome;
		char sexo;
		String produtos[] = {"Fantasia M�gico", "Fantasia Mulher Maravilha", "Fantasia Super Man", "Fantasia Homem Aranha", "Fantasia Wolverine", "Fantasia Pikachu", "Fantasia Caveira", "Fantasia Branca de Neve", "Fantasia Policial", "Fantasia Bombeiro"};
		int precos [] = {80, 200, 180, 220, 210, 190, 70, 150, 75, 85};
		int quantidade [] = {10,10,10,10,10,10,10,10,10,10};
		
		String produtosCarrinho[] = new String[produtos.length];
		int quantidadeCarrinho[] = new int[produtos.length];
		int valorCarrinho [] = new int[produtos.length];
		int codigoCarrinho [] = new int[produtos.length];
		int subtotal =0;
		int codigoProdutoComprar =0;
		int totalItensCarrinho =0;
		int quantidadeProdutoCarrinho =0;
		char contador = 'S';
		int funcao = 0;
		int diferencaAlteracao = 0;
		int opcPgto =0;//op��o de pagamento
		int desconto =0; // Desconto do pagamento a vista
		int valorComDesconto =0; // valor final caso pagamento a vista
		int parcelaCartao =0; // op��o de parcelamento caso escolha pagar no cart�o
		int qntParcela =0; // em quantas vezes no cartao a cliente quer fazer
		int valorParcelado =0; // o subtotal vai ser dividido pela qntParcela e vai dar isso aqui
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite o seu sexo:F- feminino, M- masculino, O - outros ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		while(contador =='S' )
		{
			System.out.println("----------------------------------------------------PRODUTOS-LOJAS-ABRACADABRA----------------------------------------------------\n");
		System.out.println("C�D ---- QTDE --------- PRODUTO ---------------------- PRE�O ------\n");
			
			for(int x = 0; x < produtos.length; x++ )
			{
				
				System.out.println(x + "    | \t " + quantidade[x] + "\t|    "+produtos[x] +"           \t|"+precos[x] );
			}
		System.out.println("-------------------------------------------------------------------");
		System.out.print("Voc� deseja:\n 1- Inserir produtos ao carrinho \n 2- Remover algum produto \n 3- Alterar a quantidade do produto \n 4- Visualizar carrinho \n 5- Efetuar o Pagamento \n Op��o Escolhida: ");
			funcao = leia.nextInt();
			switch (funcao) {
			case 1: {
				//Inserir produto
				System.out.printf("Cliente %s digite o c�digo do produto que deseja comprar?", nome);
				codigoProdutoComprar = leia.nextInt();
					if(quantidade[codigoProdutoComprar] < 0 ){
					System.out.println("Sinto muito o produto est� esgotado!");
					}else
					{
					System.out.printf("O produto que voc� selecionou � %s, por favor informe a quantidade: ", produtos[codigoProdutoComprar]);
					quantidadeProdutoCarrinho = leia.nextInt();
					
						if(quantidadeProdutoCarrinho <= quantidade[codigoProdutoComprar] )
						{
						quantidade[codigoProdutoComprar] -= quantidadeProdutoCarrinho;
						produtosCarrinho[codigoProdutoComprar] = produtos[codigoProdutoComprar];
						quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
						valorCarrinho [codigoProdutoComprar] = precos[codigoProdutoComprar];
						codigoCarrinho[codigoProdutoComprar] = codigoProdutoComprar;
						subtotal += precos[codigoProdutoComprar]*quantidadeProdutoCarrinho; //aqui
						totalItensCarrinho++;
						}else
						{
							System.out.printf("\nEst� quantidade n�o est� dispon�vel! S� h� %d itens deste produto ",quantidade[codigoProdutoComprar] );
						}
					
				
				}
					while(contador != 'S' && contador != 'N' )
					{
						System.out.println("\nDVoc� deseja continuar S-sim ou N-nao");
						contador = leia.next().toUpperCase().charAt(0);
					}
					break;
			}
			case 2: {
				//Remover produto
				if(totalItensCarrinho > 0)
				{
				System.out.printf("Cliente %s digite o c�digo do produto que deseja excluir do carrinho?", nome);
				codigoProdutoComprar = leia.nextInt();
				produtosCarrinho[codigoProdutoComprar] = null;
				quantidade[codigoProdutoComprar] += quantidadeCarrinho[codigoProdutoComprar];
				quantidadeCarrinho[codigoProdutoComprar] = 0;
				
				}else
				{
					System.out.println("N�o h� itens deste produto no carrinho!");
				}
				break;
			}
			case 3: {
				
				
				System.out.printf("Cliente %s digite o c�digo do produto que deseja alterar do carrinho?", nome);
				codigoProdutoComprar = leia.nextInt();
				if(quantidadeCarrinho[codigoProdutoComprar] > 0)
				{
				System.out.printf("O produto que voc� selecionou � %s, por favor informe a nova quantidade: ", produtos[codigoProdutoComprar]);
				quantidadeProdutoCarrinho = leia.nextInt();
				diferencaAlteracao = quantidade[codigoProdutoComprar] - quantidadeProdutoCarrinho;
				quantidadeCarrinho[codigoProdutoComprar] = quantidadeProdutoCarrinho;
				quantidade[codigoProdutoComprar] += diferencaAlteracao;
				
				}else
				{
					System.out.println("Seu carrinho n�o cont�m este produto!");
				}
				break;
			}
			case 4: {
				System.out.println("----------------------------------------------------PRODUTOS-MEU-CARRINHO----------------------------------------------------\n");	
				System.out.println("C�DIGO ---- QTDE---- PRODUTO ---- PRE�O ----\n");
				for(int x = 0; x < produtosCarrinho.length; x++ )
				{
					
					System.out.println(x + "        " + quantidadeCarrinho[x] + "        " +produtosCarrinho[x] + "        " + valorCarrinho[x] );
				}
						
						
						break;
					}
			case 5: {
				
				contador = 'N';
						
						
						break;
					}
			default:
				throw new IllegalArgumentException("Op��o inv�lida!" );
				
			}
		}//fecha while
		// pagamento da compra efetuada
		System.out.println("----------------------------------------------------PRODUTOS-MEU-CARRINHO----------------------------------------------------\n");
		System.out.println("O valor total da sua compra ficou em: "+subtotal+" reais.");
		System.out.println();
		System.out.println("Como gostaria de efetuar o pagamento? ");
		System.out.print("[1] � vista com 10% de desconto \n[2] No cart�o de cr�dito em at� 3x sem juros \nOp��o Escolhida: ");
		opcPgto = leia.nextInt();
		System.out.println();
			if(opcPgto == 1) {
				desconto = (subtotal * 10) / 100;
				valorComDesconto = subtotal - desconto;
				System.out.println("Valor total a ser pago: "+valorComDesconto);
			}
			else if(opcPgto == 2) {
				System.out.println("Gostaria de parcelar em quantas vezes?");
				System.out.print("[1] 1x sem juros \n[2] 2x sem juros \n[3] 3x sem juros \nOp��o Escolhida: ");
				parcelaCartao = leia.nextInt();
				System.out.println();
				if(parcelaCartao == 1) {
					System.out.println("Valor total a ser pago: "+subtotal);
				}
				else if (parcelaCartao == 2) {
					qntParcela = 2;
					valorParcelado = subtotal / qntParcela;
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					System.out.println("1� Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2� Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
				}
				else if (parcelaCartao == 3) {
					qntParcela = 3;
					valorParcelado = subtotal / qntParcela;
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					LocalDate parcela3 = hoje.plusDays(90);
					System.out.println("1� Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2� Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
					System.out.println("3� Parcela de "+valorParcelado+" para "+formatador.format(parcela3));
				}
			}
			System.out.println("----------------------------------------------------NOTA FISCAL----------------------------------------------------");	
			System.out.println("Identifica��o do emitente: Lojas Abrakadabra - Rua. Conego Eugenio Leite, 623. 3� andar. Pinheiros � S�o Paulo � SP  ");
			System.out.println("consulta de autenticidade no portal nacional da NF-e. www.nfe.fazenda.gov.br/portal ou no site da Sefaz Autorizada ");
			System.out.println("NF-e: 000.000.394 ");
			System.out.println("Nome/Raz�o social: "+nome);
			System.out.println("Sexo: "+sexo);
			
			System.out.println("\n C�LCULO DO IMPOSTO");
			
			System.out.println("Base de c�lculo do ICMS: "+subtotal+" valor do ICMS: "+subtotal*0.09+" Valor do frete: 0");
			System.out.println("\n DESCRI��O DOS PRODUTOS: ");
			System.out.println("C�DIGO ---- QTDE---- PRE�O ---- PRODUTO ----\n");
			for(int x = 0; x < produtosCarrinho.length; x++ )
			{
				
				System.out.println(x + "            " + quantidadeCarrinho[x] + "        " +valorCarrinho[x] + "        " + produtosCarrinho[x] );
			}
			System.out.println("TOTAL: R$ "+subtotal+"\n");
			System.out.print("FORMA DE PAGAMENTO");
			if(opcPgto == 1) {
				System.out.println("Valor total a ser pago: 1x sem juros"+valorComDesconto);
			}
			else if(opcPgto == 2) {
					if(parcelaCartao == 1) {
					System.out.println("\n Valor total parcelado em 1x sem juros."+subtotal);
				}
				else if (parcelaCartao == 2) {
					System.out.println("\n Valor total parcelado em 2x sem juros."+subtotal);
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					System.out.println("1� Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2� Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
				}
				else if (parcelaCartao == 3) {
					System.out.println("\n Valor total parcelado em 3x sem juros."+subtotal);
					LocalDate parcela1 = hoje.plusDays(30);
					LocalDate parcela2 = hoje.plusDays(60);
					LocalDate parcela3 = hoje.plusDays(90);
					System.out.println("1� Parcela de "+valorParcelado+" para "+formatador.format(parcela1));
					System.out.println("2� Parcela de "+valorParcelado+" para "+formatador.format(parcela2));
					System.out.println("3� Parcela de "+valorParcelado+" para "+formatador.format(parcela3));
				}
			}
	
			
			
		leia.close();
	}
}