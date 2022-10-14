package com.spring.springfood.di.service;

import com.spring.springfood.di.modelo.Cliente;
import com.spring.springfood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

  private NotificadorEmail notificador;

  public void ativar(Cliente cliente) {
    cliente.ativar();

    notificador.notificar(cliente, "Seu cadastro está ativo!");
  }

}
