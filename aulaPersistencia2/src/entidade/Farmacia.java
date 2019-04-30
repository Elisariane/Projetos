package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Farmacia {

	@Id //Define a chave primaria
	@GeneratedValue(strategy= GenerationType.AUTO) //Define que será auto incremento 
	private int id_farma;
	private String nome_fantasia;
	private String razao_social;
	private int cnpj;
	private String telefone;
	private String endereco;
	@OneToMany
	private Cidade id_cid;
}
