package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {

	@Id //Define a chave primaria
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_item_pedido;
	
	private double preco_total;
	private double sub_total;
	private int quantidade;
	
	@ManyToOne
	private Pedido id_pedido;

	public int getId_item_pedido() {
		return id_item_pedido;
	}

	public void setId_item_pedido(int id_item_pedido) {
		this.id_item_pedido = id_item_pedido;
	}

	public double getPreco_total() {
		return preco_total;
	}

	public void setPreco_total(double preco_total) {
		this.preco_total = preco_total;
	}

	public double getSub_total() {
		return sub_total;
	}

	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Pedido id_pedido) {
		this.id_pedido = id_pedido;
	}
	
	
}
