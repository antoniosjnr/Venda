package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author antonio_sj
 */
@Entity
public class Vendedor implements Serializable {
    @Id
    @GeneratedValue
    private int       id;
    private String    nome;
    private String    endereco;
    private String    cpf;
    private String    rg;
    private String    telefone;
    
//    @OneToMany
//    @JoinColumn (name = "idVendedor", referencedColumnName = "id")
//    private Transacao transacao;

    public Vendedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

//    public Transacao getTransacao() {
//        return transacao;
//    }
//
//    public void setTransacao(Transacao transacao) {
//        this.transacao = transacao;
//    }
    
    
    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}
