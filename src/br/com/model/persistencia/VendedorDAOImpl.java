/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Vendedor;
import br.com.model.persistencia.dao.VendedorDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author antonio_sj
 */
public class VendedorDAOImpl extends DAOImpl <Vendedor, Integer> implements VendedorDAO{

    @Override
    public List<Vendedor> getByNome(String nome) {
        return getEntityManager().createQuery("select v from Vendedor v where v.nome  like"
                + " '%" + nome + "%'").getResultList();
    }

   
    public Vendedor getByNom(String nome) {
        Query q = getEntityManager().createQuery("select v from Vendedor v where v.nome like '" + nome + "'", Vendedor.class);
        List<Vendedor> vendedores = q.getResultList();
        Vendedor vv = new Vendedor();
        for (Vendedor v : vendedores) {
            vv = v;
        }
        return vv;

    }
    }

  
   

