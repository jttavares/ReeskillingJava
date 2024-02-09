package br.com.tavares.exceptions;

public class LimiteCreditoExcedidoException extends Exception{
	private double quantiaExcedida;
	
	public LimiteCreditoExcedidoException(double quantiaExcedida) {
		super("Limite de credito excedido por: " + quantiaExcedida);
		this.quantiaExcedida = quantiaExcedida;
	}
	
	public double getQuantiaExcedida() {
		return quantiaExcedida;
	}
	
}