package aula7;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	//Metodos Personalizados
	public void marcarLuta(Lutador l1,Lutador l2) {
		if (l1.getCategoria().contentEquals(l2.getCategoria()) 
				&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.isAprovada()) {
				System.out.println("#####DESAFIADO######");
				desafiado.apresentar();
				System.out.println("#####DESAFIANTE#####");
				desafiante.apresentar();
	
				Random aleatorio = new Random();
	
				int vencedor = aleatorio.nextInt(3);
				System.out.println("========= RESULTADO ========");
				switch (vencedor) {
					case 0:
						System.out.println("Empatou!");
						desafiado.empatarLuta();
						desafiante.empatarLuta();
						break;
					case 1:
						System.out.println(this.desafiado+ " ganhou!");
						desafiado.ganharLuta();
						desafiante.perderLuta();
						break;
					case 2:
						System.out.println(this.desafiante + " ganhou!");
						desafiado.perderLuta();
						desafiante.ganharLuta();
						break;
				}
			}else {
				System.out.println("A luta não pode acontecer!");
		}
	}
	
	
	//Metodos Especiais
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}
