package com.example.clientes.setup;

import com.example.clientes.model.Cliente;
import com.example.clientes.model.ItemPedido;
import com.example.clientes.model.Pedido;
import com.example.clientes.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class AppSetup {

    public static List<Produto> produtos = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<ItemPedido> carrinho = new ArrayList<>();
    public static Cliente cliente = null;
    public static Pedido pedido = null;
}
