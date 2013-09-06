/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Transacao;
import br.com.model.persistencia.TransacaoDAOImpl;
import br.com.model.persistencia.dao.TransacaoDAO;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class TransacaoController {
    
    public boolean salvar(Transacao cliente) {
        TransacaoDAO dao = new TransacaoDAOImpl();
       return dao.save(cliente);

    }

    public boolean excluir(int id) {
        TransacaoDAO dao = new TransacaoDAOImpl();
        return dao.remove(Transacao.class, id);

    }
    
    public List<Transacao> listarTransacao() {
        TransacaoDAO dao = new TransacaoDAOImpl();
        return dao.getAll(Transacao.class);
    }
    public Transacao listarTransacaoById (int id){
        TransacaoDAO dao = new TransacaoDAOImpl();
        return (Transacao)dao.getById(Transacao.class, id);
    }    
    
   public List<Transacao> listarTransacaoByProduto (String produto){
        TransacaoDAO dao = new TransacaoDAOImpl();
        return dao.getByProduto(produto);
    }
    public Transacao listarTransacaoByProd (String produto ){
        TransacaoDAO dao = new TransacaoDAOImpl();
        return dao.getByProd(produto);
    }
      
}
