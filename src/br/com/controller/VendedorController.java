/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Vendedor;
import br.com.model.persistencia.VendedorDAOImpl;
import br.com.model.persistencia.dao.VendedorDAO;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class VendedorController {
    
     
    public boolean salvar(Vendedor vendedor) {
        VendedorDAO dao = new VendedorDAOImpl();
       return dao.save(vendedor);

    }

    public boolean excluir(int id) {
        VendedorDAO dao = new VendedorDAOImpl();
        return dao.remove(Vendedor.class, id);

    }
    
    public List<Vendedor> listarVendedor() {
        VendedorDAO dao = new VendedorDAOImpl();
        return dao.getAll(Vendedor.class);
    }
    public Vendedor listarVendedorById (int id){
        VendedorDAO dao = new VendedorDAOImpl();
        return (Vendedor)dao.getById(Vendedor.class, id);
    }  
    
      
   public List<Vendedor> listarVendedorByNome (String nome){
        VendedorDAO dao = new VendedorDAOImpl();
        return dao.getByNome(nome);
    }
   
   public Vendedor listarVendedorByNom (String nome){
        VendedorDAO dao = new VendedorDAOImpl();
        return dao.getByNom(nome);
    }
   
    
}
