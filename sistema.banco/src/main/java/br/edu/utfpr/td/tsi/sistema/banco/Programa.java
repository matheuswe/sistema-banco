package br.edu.utfpr.td.tsi.sistema.banco;

import br.edu.utfpr.td.tsi.modulo.cliente.GerenciadorClientes;

import br.edu.utfpr.td.tsi.modulo.conta.GerenciadorContaCorrente;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();
		gerenciadorClientes.cadastrar("Ivan", "123");

		GerenciadorContaCorrente gerenciadorContaCorrente = new GerenciadorContaCorrente();
		gerenciadorContaCorrente.cadastrarConta(1234);
		gerenciadorContaCorrente.transferir("1", "2");
		
		
	}

}
