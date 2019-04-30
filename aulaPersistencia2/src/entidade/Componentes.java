package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Componentes {

	@Id //Define a chave primaria
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_componentes;
	
	private String nome;
	
	@ManyToMany
	private Remedio id_med;

	public int getId_componentes() {
		return id_componentes;
	}

	public void setId_componentes(int id_componentes) {
		this.id_componentes = id_componentes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Remedio getId_med() {
		return id_med;
	}

	public void setId_med(Remedio id_med) {
		this.id_med = id_med;
	}
	
	
	
}
