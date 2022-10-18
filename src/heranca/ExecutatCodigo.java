package heranca;

import java.util.ArrayList;

public class ExecutatCodigo {

	public static void main(String[] args) {

		Onibus onibus = new Onibus(null, 0, 0);
		Caminhao caminhao = new Caminhao(null, 0, 0);
		ArrayList<Integer> nome = new ArrayList<Integer>();
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Object  > lista3 = new ArrayList<Object>();

		// onibus1
		onibus.setPlaca("AAAA-1111");
		onibus.setAno(2000);
		onibus.setAssentos(41);
		onibus.exibirDados();

		// ArrayList Onibus 1
		lista.add(onibus.getPlaca());
		lista1.add(onibus.getAno());
		lista2.add(onibus.getAssentos());

		// onibus2
		onibus.setPlaca("ABC-1234");
		onibus.setAno(2002);
		onibus.setAssentos(45);
		onibus.exibirDados();

		// Arraylist Onibus 2
		lista.add(onibus.getPlaca());
		lista1.add(onibus.getAno());
		lista2.add(onibus.getAssentos());

		// onibus3
		onibus.setPlaca("BBB-2222");
		onibus.setAno(2010);
		onibus.setAssentos(42);
		onibus.exibirDados();

		// ArrayList Onibus 3;
		lista.add(onibus.getPlaca());
		lista1.add(onibus.getAno());
		lista2.add(onibus.getAssentos());

		// onibus4
		onibus.setPlaca("CCC-3333");
		onibus.setAno(2015);
		onibus.setAssentos(43);
		onibus.exibirDados();

		// ArrayList Onibus 4
		lista.add(onibus.getPlaca());
		lista1.add(onibus.getAno());
		lista2.add(onibus.getAssentos());

		// onibus5
		onibus.setPlaca("DDD-4444");
		onibus.setAno(2020);
		onibus.setAssentos(44);
		onibus.exibirDados();

		// ArrayList Onibus 5
		lista.add(onibus.getPlaca());
		lista1.add(onibus.getAno());
		lista2.add(onibus.getAssentos());

		// setando os dados do veiculo caminhao
		// caminhao1
		caminhao.setPlaca("EFG-5678");
		caminhao.setAno(2022);
		caminhao.setEixos(9);
		caminhao.exibirDados();

		// ArrayList Caminhao 1
		lista.add(caminhao.getPlaca());
		lista1.add(caminhao.getAno());
		nome.add(caminhao.getEixos());

		// caminhao2
		caminhao.setPlaca("EEE-5555");
		caminhao.setAno(1982);
		caminhao.setEixos(2);
		caminhao.exibirDados();
		// ArrayList Caminhao 2

		lista.add(caminhao.getPlaca());
		lista1.add(caminhao.getAno());
		nome.add(caminhao.getEixos());

		// caminhao3
		caminhao.setPlaca("FFF-6666");
		caminhao.setAno(1992);
		caminhao.setEixos(3);
		caminhao.exibirDados();

		// ArrayList Caminhao 3
		lista.add(caminhao.getPlaca());
		lista1.add(caminhao.getAno());
		nome.add(caminhao.getEixos());

		// caminhao4
		caminhao.setPlaca("GGG-7777");
		caminhao.setAno(2002);
		caminhao.setEixos(4);
		caminhao.exibirDados();

		// ArrayList Caminhao 4
		lista.add(caminhao.getPlaca());
		lista1.add(caminhao.getAno());
		nome.add(caminhao.getEixos());

		// caminhao5
		caminhao.setPlaca("HHH-8888");
		caminhao.setAno(2012);
		caminhao.setEixos(7);
		caminhao.exibirDados();

		// ArrayList Caminhao 5
		lista.add(caminhao.getPlaca());
		lista1.add(caminhao.getAno());
		nome.add(caminhao.getEixos());

		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Lista das placa dos veiculos Onibus e Caminhao");

		for (String p : lista) {
			System.out.println(p);

		}
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Lista dos Anos dos Veiculos Onibus e Caminhao");

		for (int p : lista1) {
			System.out.println(p);
		}
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Lista dos Assentos do Onibus");
		for (int p : lista2) {
			System.out.println(p);
		}
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Lista dos Eixos do Caminhao");
		for (int p : nome) {
			System.out.println(p);
		}
		
		System.out.println("outra forma de mostrar todas as listas ");
		System.out.println("<><><><><><><><><><><><><><><><><><>><><><>><><><><><>");
		lista3.addAll(lista);
		lista3.addAll(lista1);
		lista3.addAll(lista2);
		lista3.addAll(nome);
		for(Object k:lista3) {
			System.out.println(k);
		}

		
	}

}

//}
