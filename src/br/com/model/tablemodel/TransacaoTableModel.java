package br.com.model.tablemodel;

import br.com.model.negocio.Cliente;
import br.com.model.negocio.Transacao;
import br.com.model.negocio.Vendedor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class TransacaoTableModel extends AbstractTableModel {

    private static final int COL_CODIGO = 0;
    private static final int COL_PRODUTO = 1;
    private static final int COL_CLIENTE = 2;
    private static final int COL_VENDEDOR = 3;
    
    private List<Transacao> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Produto", "Cliente", "Vendedor"};

    //Cria uma TransacaoTableModel sem nenhuma linha
    public TransacaoTableModel() {
        linhas = new ArrayList<Transacao>();
    }

    //Cria uma TransacaoTableModel contendo a lista recebida por parâmetro.
    public TransacaoTableModel(List<Transacao> transacoes) {        
        this.linhas = new ArrayList<Transacao>(transacoes);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_CODIGO) {
            return Integer.class;
        }else if (columnIndex == COL_PRODUTO){
            return String.class;
        }else if (columnIndex == COL_CLIENTE){
            return Cliente.class;
        }else if (columnIndex == COL_VENDEDOR){
            return Vendedor.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a marca da linha
        Transacao t = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_CODIGO) {
            return t.getCodigo();
        } else if (column == COL_PRODUTO) {
            return  t.getProduto();
        } else if (column == COL_CLIENTE){
            return t.getCliente();
        } else if (column == COL_VENDEDOR){
            return t.getVendedor();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
          Transacao t = linhas.get(row);
        if (column == COL_CODIGO) {
            t.setCodigo((Integer) aValue);
        } else if (column == COL_PRODUTO) {
            t.setProduto(aValue.toString());
        } else if (column == COL_CLIENTE) {
    //        t.setCliente((Cliente)aValue);
        } else if (column == COL_VENDEDOR) {
   //         t.setVendedor((Vendedor) aValue);
        }
    }

    // Retorna a marca referente a linha especificada
    public Transacao getTransacao(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a marca especificada ao modelo
    public void addTransacao(Transacao marca) {
        // Adiciona o registro.
        linhas.add(marca);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorDescricao();

    }
    
        public void updateTransacao(int indiceLinha, Transacao marca) {
            linhas.set(indiceLinha, marca);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorDescricao();
    }
    
    //Remove o sócio da linha especificada.
    public void removeTransacao(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarPorDescricao();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
    
    public void ordenarPorDescricao() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Transacao>() {

            public int compare(Transacao o1, Transacao o2) {
                return o1.getProduto().compareTo(o2.getProduto());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
