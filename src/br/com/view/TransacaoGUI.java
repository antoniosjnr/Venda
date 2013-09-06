package br.com.view;

import br.com.model.tablemodel.TransacaoTableModel;
import br.com.controller.TransacaoController;
import br.com.model.negocio.Transacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class TransacaoGUI extends javax.swing.JFrame {

    private TransacaoTableModel model;

    public TransacaoGUI() {
        initComponents();
        List<Transacao> lista = new ArrayList<Transacao>();
        TransacaoController a = new TransacaoController();
        lista = a.listarTransacao();

        //cria o modelo de Produto      
        model = new TransacaoTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        labelTit = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTit.setForeground(new java.awt.Color(255, 255, 255));
        labelTit.setText("Transações");
        painelFundo.add(labelTit);
        labelTit.setBounds(108, 11, 110, 20);

        txPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPesquisaKeyPressed(evt);
            }
        });
        painelFundo.add(txPesquisa);
        txPesquisa.setBounds(10, 43, 240, 27);

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
        botaoPesquisa.setBounds(270, 40, 100, 30);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Potência", "Marca"
            }
        ));
        scrollPane.setViewportView(tabela);

        painelFundo.add(scrollPane);
        scrollPane.setBounds(10, 81, 648, 142);

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
        btInserir.setBounds(50, 230, 80, 30);

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
        btEditar.setBounds(140, 230, 70, 30);

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
        btRemover.setBounds(220, 230, 90, 30);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirTransacaoGUI im = new InserirTransacaoGUI(model);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            TransacaoController mc = new TransacaoController();
            if (mc.excluir(i)){
            model.removeTransacao(selecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma tabela");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdTransacao = (Integer) model.getValueAt(selecionado, 0);
            AtualizarTransacaoGui am = new AtualizarTransacaoGui(selecionado, cdTransacao, model);
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
    private javax.swing.JLabel labelTit;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String produto = txPesquisa.getText();
        List<Transacao> lista = new ArrayList<Transacao>();
        TransacaoController a = new TransacaoController();
        lista = a.listarTransacaoByProduto(produto);
        model.limpar();

        //cria o modelo de Produto      
        model = new TransacaoTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);
    }
}
