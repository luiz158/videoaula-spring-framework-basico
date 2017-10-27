package com.algaworks.sf.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("urgente")
public class Sms implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem por SMS: " + mensagem);
	}
}
