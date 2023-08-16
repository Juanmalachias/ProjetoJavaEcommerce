package ecommerceRestaurante;

import java.util.List;
import java.util.ArrayList;

import pedidos.Pedido;



public class PedidoRepository {
	
	private List <Pedido>pedidos;
	
	public PedidoRepository() {
		pedidos = new ArrayList<>();
	}
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public List<Pedido>getPedidos(){
		return pedidos;
	}
	
	public double calculcarTotal() {
		double total = 0.00;
		for (Pedido pedido : pedidos) {
			total += pedido.getPreço();
		}
		return total;
	}
}
