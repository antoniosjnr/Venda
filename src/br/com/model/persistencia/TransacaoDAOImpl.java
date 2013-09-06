/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Transacao;
import br.com.model.persistencia.dao.TransacaoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author antonio_sj
 */
public class TransacaoDAOImpl  extends DAOImpl <Transacao, Integer> implements TransacaoDAO{

   
    public List<Transacao> getByProduto(String produto) {
    return getEntityManager().createQuery("select t from Transacao t where t.produto  like"
                + " '%" + produto + "%'").getResultList();
    }    

    @Override
    public Transacao getByProd(String produto) {
        Query q = getEntityManager().createQuery("select t from Transacao t where t.produto like '" + produto + "'", Transacao.class);
        List<Transacao> transacoes = q.getResultList();
        Transacao tt = new Transacao();
        for (Transacao t : transacoes) {
            tt = t;
        }
        return tt;
    }

} 

