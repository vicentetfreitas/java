package aula1;

public class ConsoleDeVideoGame {
	private double peso;
	private String fabricante;
	private String descricao;
	private String modelo;
	private int voltagem;
	private boolean ligado;

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getLigado() {
		return ligado;
	}
//	boolean estaLigado(){
//	if(ligado == true) {
//		return true;
//	}else {
//		return false;
//	}
//}
}
