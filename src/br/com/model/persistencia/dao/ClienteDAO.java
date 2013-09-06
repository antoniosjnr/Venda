/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Cliente;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface ClienteDAO extends DAO<Cliente, Integer> {
    
    List<Cliente> getByNome (String nome);
    Cliente getByNom (String nome); 
}
