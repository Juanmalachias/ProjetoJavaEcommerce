package pedidos;

public class Pedido {
	
	private String descrição;
	private double preço;
	
	
	public Pedido(String descrição, double preço) {
		super();
		this.descrição = descrição;
		this.preço = preço;
	}


	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	

}
