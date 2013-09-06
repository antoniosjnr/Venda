/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Vendedor;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface VendedorDAO extends DAO <Vendedor, Integer>{
     
    List<Vendedor> getByNome (String nome);
    Vendedor getByNom (String nome);
}
