package ativconstrutor;


public class Tema {
	
	public long id;
	public String nome;
	public double ValorAluguel;
	public String cor;
	
	public Tema(long id, String nome, double valorAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		setValorAluguel(valorAluguel);
		this.cor = cor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return ValorAluguel;
	}

	public void setValorAluguel(double ValorAluguel) {
		if(ValorAluguel >= 450) {
			ValorAluguel = ValorAluguel;
		}else {
			System.out.println("O valor inserido é irregular.");
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
