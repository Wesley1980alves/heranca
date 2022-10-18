package heranca;

public class Onibus extends Veiculo {
	private   int assentos;
	

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public Onibus() {

	}

	public Onibus(String placa, int ano, int assentos) {
		super.setPlaca(placa);
		super.setAno(ano);
		this.setAssentos(assentos);
		
	}

	@Override
	public void exibirDados() {
		System.out.println("Dados do veiculo Onibus");
		System.out.println(super.getPlaca());
		System.out.println(super.getAno());
		System.out.println (getAssentos());
		
	
		
	
	}

}
