package warehouse;

import java.util.Scanner;

public class Estoque extends Almoxarifado {
	
	protected String item;
	
	public Estoque(String categoria, double preco, int quantidade, String item) {
		super(categoria, preco, quantidade);
		this.item = item;
	}

	public Estoque() {
		super();
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void cadProduto() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos serão cadastrados? ");
		int n = sc.nextInt();
		Estoque[] produto = new Estoque[n];
		
		for (int i=0; i < produto.length; i++) {
			System.out.println("Cadastro item #" + i);
			System.out.println("Descrição do Item: ");
			sc.nextLine();
			item = sc.nextLine();
			System.out.println("Categoria (Alimentos, Bebidas, Etc.): ");
			categoria = sc.nextLine();
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Preço: ");
			preco = sc.nextInt();
			produto[i] = new Estoque(categoria, preco, quantidade, item);
			System.out.println("");
		}
		
		for (int i=0; i < produto.length; i++) {
			System.out.println(produto[i]);
		}
		sc.close();
	}

}
