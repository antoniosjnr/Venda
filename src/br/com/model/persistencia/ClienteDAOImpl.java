package br.com.model.persistencia;


import br.com.model.negocio.Cliente;
import br.com.model.persistencia.dao.ClienteDAO;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author antonio_sj
 */
public class ClienteDAOImpl extends DAOImpl <Cliente, Integer> implements ClienteDAO{

   
    public List<Cliente> getByNome(String nome) {
        return getEntityManager().createQuery("select c from Cliente c where c.nome  like"
                + " '%" + nome + "%'").getResultList();
    }

    @Override
    public Cliente getByNom(String nome) {
        Query q = getEntityManager().createQuery("select c from Cliente c where c.nome like '" + nome + "'", Cliente.class);
        List<Cliente> clientes = q.getResultList();
        Cliente vv = new Cliente();
        for (Cliente v : clientes) {
            vv = v;
        }
        return vv;

    }
    }
    
    
    

