package ecommerceRestaurante;
import java.util.ArrayList;
import java.text.NumberFormat;

import pedidos.Pedido;
import Restaurante.util.Cores;
public class PedidoController {

	private PedidoRepository repository;
	private NumberFormat nfMoeda;
	
	
	public PedidoController(PedidoRepository repository) {
		this.repository = repository;
		nfMoeda = NumberFormat.getCurrencyInstance();
	}
	 public void adicionarPedido(String descricao, double preco) {
		 Pedido pedido = new Pedido(descricao, preco);
	        repository.adicionarPedido(pedido);
	    }
	 public void mostrarPedidos() {
	        System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_RED_BACKGROUND_BRIGHT + 
	                           "*******************************************************");

	        for (Pedido pedido : repository.getPedidos()) {
	            String descricao = pedido.getDescrição();
	            String precoFormatado = nfMoeda.format(pedido.getPreço());
	            int descricaoLength = descricao.length();
	            int precoLength = precoFormatado.length();
	            int totalLength = descricaoLength + precoLength + 2;
	            int spacesToAdd = 53 - totalLength;
	            
	            String formattedDescricao = descricao + " ".repeat(spacesToAdd);

	            System.out.println("* " + formattedDescricao+precoFormatado+ " *");
	        }

	        String valortotal = "Total: " + nfMoeda.format(repository.calculcarTotal());
	        int valorTotalLength = valortotal.length();
	        int spacesToAddTotal = 51 - valorTotalLength;
	        String formattedValorTotal = valortotal + " ".repeat(spacesToAddTotal);
	        
	        System.out.println("* " + formattedValorTotal + " *");

	        System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_RED_BACKGROUND_BRIGHT + 
	                           "*******************************************************");
	    }
}
