/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Cliente;
import br.com.model.persistencia.ClienteDAOImpl;
import br.com.model.persistencia.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class ClienteController {
    
    public boolean salvar(Cliente cliente) {
        ClienteDAO dao = new ClienteDAOImpl();
       return dao.save(cliente);

    }

    public boolean excluir(int id) {
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.remove(Cliente.class, id);

    }
    
    public List<Cliente> listarCliente() {
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getAll(Cliente.class);
    }
    public Cliente listarClienteById (int id){
        ClienteDAO dao = new ClienteDAOImpl();
        return (Cliente)dao.getById(Cliente.class, id);
    }    
    
   public List<Cliente> listarClienteByNome (String nome){
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getByNome(nome);
    }
   
    public Cliente listarClienteByNom (String nome){
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getByNom(nome);
    }
      
}
