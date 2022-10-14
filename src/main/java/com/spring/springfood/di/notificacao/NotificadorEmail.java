package com.spring.springfood.di.notificacao;

import com.spring.springfood.di.modelo.Cliente;

public class NotificadorEmail {

  public void notificar(Cliente cliente, String mensagem) {
    System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
  }

}
