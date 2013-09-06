/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.tablemodel;

import br.com.controller.VendedorController;
import br.com.model.negocio.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author antonio_sj
 */
public class VendedorTableModel extends AbstractTableModel{
   private static final int COL_CODIGO = 0;
    private static final int COL_NOME = 1;
    private static final int COL_ENDERECO = 2;
    private static final int COL_CPF = 3;
    private static final int COL_RG = 4;
    private List<Vendedor> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome", "Endereço", "Cpf", "Rg"};

    //Cria uma VendedorTableModel sem nenhuma linha
    public VendedorTableModel() {
        linhas = new ArrayList<Vendedor>();
    }

    //Cria uma VendedorTableModel contendo a lista recebida por parâmetro.
    public VendedorTableModel(List<Vendedor> Vendedors) {
        this.linhas = new ArrayList<Vendedor>(Vendedors);
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
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_ENDERECO) {
            return String.class;
        } else if (columnIndex == COL_CPF) {
            return String.class;
        } else if (columnIndex == COL_RG) {
            return String.class;
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
        Vendedor m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_CODIGO) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        } else if (column == COL_ENDERECO) {
            return m.getEndereco();
        } else if (column == COL_CPF) {
            return m.getCpf();
        } else if (column == COL_RG) {
            return m.getRg();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Vendedor u = linhas.get(row);
        if (column == COL_CODIGO) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome((String) aValue);
        } else if (column == COL_ENDERECO) {
            u.setEndereco((String) aValue);
        } else if (column == COL_CPF) {
            u.setCpf((String) aValue);
        } else if (column == COL_RG) {
            u.setRg((String) aValue);
        }
    }

    // Retorna a marca referente a linha especificada
    public Vendedor getVendedor(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao Vendedor
    public void addVendedor(Vendedor vendedor) {
        // Adiciona o registro.
        linhas.add(vendedor);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    

    }

    public void updateVendedor(int indiceLinha, Vendedor vendedor) {
        linhas.set(indiceLinha, vendedor);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        
    }

    //Remove o sócio da linha especificada.
    public void removeVendedor(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
       
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
    
    

}