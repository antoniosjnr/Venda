/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Transacao;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public interface TransacaoDAO extends DAO<Transacao, Integer> {
    
    List<Transacao> getByProduto (String produto);
     Transacao getByProd (String produto);
    
    
}
