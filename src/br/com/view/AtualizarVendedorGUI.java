/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.tablemodel.VendedorTableModel;
import br.com.controller.VendedorController;
import br.com.model.negocio.Vendedor;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class AtualizarVendedorGUI extends javax.swing.JFrame {

    int linhaSelecionada;
    int codigoVendedor;
    VendedorTableModel model;

    /**
     * Creates new form InserirVendedorGui
     */
    public AtualizarVendedorGUI(int selecionado, int cdVendedor, VendedorTableModel mtb) {
        initComponents();
        txId.setEditable(false);
        linhaSelecionada = selecionado;
        codigoVendedor = cdVendedor;
        model = mtb;


        VendedorController vc = new VendedorController();
        Vendedor v = new Vendedor();
        v = vc.listarVendedorById(cdVendedor);

        txId.setText(Integer.toString(v.getId()));
        campoNome.setText(v.getNome());
        campoEndereco.setText(v.getEndereco());
        campoTelefone.setText(v.getTelefone());
        campoCpf.setText(v.getCpf());
        campoRg.setText(v.getRg());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        labelRg = new javax.swing.JLabel();
        campoRg = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Marca");

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Atualizar Vendedor");
        painelFundo.add(labelTitulo);
        labelTitulo.setBounds(61, 11, 190, 20);

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigo.setText("Codigo.:");
        painelFundo.add(labelCodigo);
        labelCodigo.setBounds(14, 60, 60, 20);
        painelFundo.add(txId);
        txId.setBounds(80, 60, 60, 20);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome.:  ");
        painelFundo.add(labelNome);
        labelNome.setBounds(14, 90, 50, 20);
        painelFundo.add(campoNome);
        campoNome.setBounds(80, 90, 290, 20);

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco.setText("Endereco.:  ");
        painelFundo.add(labelEndereco);
        labelEndereco.setBounds(10, 120, 100, 20);
        painelFundo.add(campoEndereco);
        campoEndereco.setBounds(80, 120, 290, 20);

        labelTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTel.setForeground(new java.awt.Color(255, 255, 255));
        labelTel.setText("Telefone.:  ");
        painelFundo.add(labelTel);
        labelTel.setBounds(14, 160, 60, 20);
        painelFundo.add(campoTelefone);
        campoTelefone.setBounds(70, 160, 150, 20);

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(255, 255, 255));
        labelCpf.setText("Cpf.:  ");
        painelFundo.add(labelCpf);
        labelCpf.setBounds(14, 190, 40, 20);
        painelFundo.add(campoCpf);
        campoCpf.setBounds(70, 190, 150, 20);

        labelRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRg.setForeground(new java.awt.Color(255, 255, 255));
        labelRg.setText("Rg.:  ");
        painelFundo.add(labelRg);
        labelRg.setBounds(14, 220, 40, 20);
        painelFundo.add(campoRg);
        campoRg.setBounds(70, 220, 150, 20);

        botaoLimpar.setBackground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(102, 102, 102));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        painelFundo.add(botaoLimpar);
        botaoLimpar.setBounds(134, 280, 110, 30);

        botaoSalvar.setBackground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(102, 102, 102));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        painelFundo.add(botaoSalvar);
        botaoSalvar.setBounds(254, 280, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        campoEndereco.setText(" ");
        campoTelefone.setText(" ");
        campoCpf.setText("");
        campoRg.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Vendedor v = new Vendedor();
        v.setId(Integer.parseInt(txId.getText())); 
        v.setNome(campoNome.getText());
        v.setEndereco(campoEndereco.getText());
        v.setTelefone(campoTelefone.getText());
        v.setCpf(campoCpf.getText());
        v.setRg(campoRg.getText());

        VendedorController vc = new VendedorController();
       if (vc.salvar(v)){
        model.updateVendedor(linhaSelecionada, v);   
       }
        
        dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JTextField txId;
    // End of variables declaration//GEN-END:variables

    public   Vendedor Pesquisar (String nome){
        VendedorController mc = new VendedorController();
        return mc.listarVendedorByNom(nome);
    
}


}
