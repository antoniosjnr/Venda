package br.com.view;

import br.com.model.tablemodel.ClienteTableModel;
import br.com.controller.ClienteController;
import br.com.model.negocio.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class ClienteGUI extends javax.swing.JFrame {

    private ClienteTableModel model;

    public ClienteGUI() {
        initComponents();
        List<Cliente> lista = new ArrayList<Cliente>();
        ClienteController a = new ClienteController();
        lista = a.listarCliente();

        //cria o Cliente de Produto      
        model = new ClienteTableModel(lista);

        //atribui o Cliente à tabela
        tabela.setModel(model);


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Clientes");
        painelFundo.add(labelTitulo);
        labelTitulo.setBounds(108, 11, 127, 22);

        txPesquisa.setToolTipText("Ano de Fabricação");
        txPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPesquisaKeyPressed(evt);
            }
        });
        painelFundo.add(txPesquisa);
        txPesquisa.setBounds(10, 51, 240, 27);

        botaoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoPesquisa.setForeground(new java.awt.Color(102, 102, 102));
        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });
        painelFundo.add(botaoPesquisa);
        botaoPesquisa.setBounds(260, 50, 100, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Potência", "Marca"
            }
        ));
        scrollTable.setViewportView(tabela);

        painelFundo.add(scrollTable);
        scrollTable.setBounds(10, 89, 648, 142);

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btInserir.setForeground(new java.awt.Color(102, 102, 102));
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        painelFundo.add(btInserir);
        btInserir.setBounds(30, 243, 100, 30);

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditar.setForeground(new java.awt.Color(102, 102, 102));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        painelFundo.add(btEditar);
        btEditar.setBounds(140, 243, 100, 30);

        btRemover.setBackground(new java.awt.Color(255, 255, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRemover.setForeground(new java.awt.Color(102, 102, 102));
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        painelFundo.add(btRemover);
        btRemover.setBounds(250, 243, 110, 30);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirClienteGUI im = new InserirClienteGUI(model);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            ClienteController mc = new ClienteController();
            if (mc.excluir(i)){
            model.removeCliente(selecionado);
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdCliente = (Integer) model.getValueAt(selecionado, 0);
            AtualizarClienteGUI am = new AtualizarClienteGUI(selecionado, cdCliente, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        efetuaPesquisa();


    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void txPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesquisaKeyPressed
    
        efetuaPesquisa();
       
    }//GEN-LAST:event_txPesquisaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = txPesquisa.getText();
        List<Cliente> lista = new ArrayList<Cliente>();
        ClienteController a = new ClienteController();
        lista = a.listarClienteByNome(nome);
        model.limpar();

        //cria o Cliente de Produto      
        model = new ClienteTableModel(lista);

        //atribui o Cliente à tabela
        tabela.setModel(model);
    }
}
