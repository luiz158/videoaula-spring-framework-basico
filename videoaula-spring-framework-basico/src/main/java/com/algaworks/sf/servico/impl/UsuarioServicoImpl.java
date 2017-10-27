package com.algaworks.sf.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.algaworks.sf.model.Usuario;
import com.algaworks.sf.notificador.Mensagem;
import com.algaworks.sf.notificador.Notificador;
import com.algaworks.sf.servico.UsuarioServico;

@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Autowired
	@Qualifier("importante")
	private Notificador notificador;
	
	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Bem vindo!", "Obrigado pelo cadastro!"));
	}
	
//	@PostConstruct
//	void inicio() {
//		System.out.println("Usuario Serviço iniciado!");
//	}
//	
//	@PreDestroy
//	void fim() {
//		System.out.println("Usuario Serviço finalizado!");
//	}
}