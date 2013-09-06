package br.com.view;

import br.com.model.tablemodel.VendedorTableModel;
import br.com.controller.VendedorController;
import br.com.model.negocio.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class VendedorGUI extends javax.swing.JFrame {

    private VendedorTableModel model;

    public VendedorGUI() {
        initComponents();
        List<Vendedor> lista = new ArrayList<Vendedor>();
        VendedorController vc = new VendedorController();
        lista = vc.listarVendedor();

        //cria o modelo de Produto      
        model = new VendedorTableModel(lista);

        //atribui o modelo à tabela
        tabelaVendedor.setModel(model);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        labelTit = new javax.swing.JLabel();
        botaoPesquisa = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tabelaVendedor = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        txPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTit.setForeground(new java.awt.Color(255, 255, 255));
        labelTit.setText("Vendedor");
        painelFundo.add(labelTit);
        labelTit.setBounds(108, 11, 100, 22);

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
        botaoPesquisa.setBounds(270, 43, 100, 30);

        tabelaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Marca"
            }
        ));
        scrollPane.setViewportView(tabelaVendedor);

        painelFundo.add(scrollPane);
        scrollPane.setBounds(10, 100, 375, 142);

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
        btInserir.setBounds(40, 260, 90, 30);

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
        btEditar.setBounds(140, 260, 90, 30);

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
        btRemover.setBounds(240, 260, 110, 30);

        txPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPesquisaKeyPressed(evt);
            }
        });
        painelFundo.add(txPesquisa);
        txPesquisa.setBounds(10, 50, 240, 20);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelFundo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirVendedorGUI im = new InserirVendedorGUI(model);
        im.setLocationRelativeTo(null);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabelaVendedor.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            Vendedor m = model.getVendedor(selecionado);
            VendedorController mc = new VendedorController();
            if (mc.excluir(m.getId())){
            model.removeVendedor(selecionado);
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabelaVendedor.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdVendedor = (Integer) model.getValueAt(selecionado, 0);
            AtualizarVendedorGUI am = new AtualizarVendedorGUI(selecionado, cdVendedor, model);
            am.setLocationRelativeTo(null);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma tabela");
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
    private javax.swing.JTable tabelaVendedor;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = txPesquisa.getText();
        List<Vendedor> lista = new ArrayList<Vendedor>();
        VendedorController a = new VendedorController();
        lista = a.listarVendedorByNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new VendedorTableModel(lista);

        //atribui o modelo à tabela
        tabelaVendedor.setModel(model);
    }
    
 
}
