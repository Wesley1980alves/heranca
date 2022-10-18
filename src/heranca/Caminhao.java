package heranca;

public class Caminhao extends Veiculo {
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	

	public Caminhao() {

	}

	public Caminhao(String placa, int ano, int eixos) {
		super.setPlaca(placa);
		super.setAno(ano);
		this.setEixos(eixos);

	}

	@Override
	public void exibirDados() {
		System.out.println("Dados do veiculo caminhao");
		System.out.println(super.getPlaca());
		System.out.println(super.getAno());
		System.out.println(this.getEixos());

	}

}
