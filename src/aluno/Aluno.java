
package aluno;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme Pontes, Breno Oliveira
 */
public class Aluno {

   
    private final UUID uuid;
	private String nome;
	private int idade;
	private String endereco;
        
        public Aluno(String nome,int idade, String endereco) {
            this.nome = nome;
            this.endereco = endereco;
            this.idade = idade; 
            this.uuid = UUID.randomUUID();
        }

   
        
        
	public UUID getUuid() {
		return uuid;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
    
    
    
}
