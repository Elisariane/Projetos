package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Remedio {
	@Id //Define a chave primaria
	@GeneratedValue(strategy= GenerationType.AUTO) //Define que será auto incremento 
	private int id_med;
	
	private String nome;
	private String descricao;
	private boolean precricao;
	private int qtd_comprimidos;
	private double preco;
	
	@ManyToMany
	private Farmacia id_farma;
	
	@ManyToOne
	private Categoria id_categoria;

	public int getId_med() {
		return id_med;
	}

	public void setId_med(int id_med) {
		this.id_med = id_med;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPrecricao() {
		return precricao;
	}

	public void setPrecricao(boolean precricao) {
		this.precricao = precricao;
	}

	public int getQtd_comprimidos() {
		return qtd_comprimidos;
	}

	public void setQtd_comprimidos(int qtd_comprimidos) {
		this.qtd_comprimidos = qtd_comprimidos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Farmacia getId_farma() {
		return id_farma;
	}

	public void setId_farma(Farmacia id_farma) {
		this.id_farma = id_farma;
	}

	public Categoria getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	

}
