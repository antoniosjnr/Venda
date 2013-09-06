package br.com.view;

import br.com.model.tablemodel.TransacaoTableModel;
import br.com.controller.ClienteController;
import br.com.controller.TransacaoController;
import br.com.controller.VendedorController;
import br.com.model.negocio.Cliente;
import br.com.model.negocio.Transacao;
import br.com.model.negocio.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author antonio_sj
 */
public class InserirTransacaoGUI extends javax.swing.JFrame {

    TransacaoTableModel model;

    /**
     * Creates new form InserirAutomovelGui
     */
    public InserirTransacaoGUI(TransacaoTableModel mtb) {
        initComponents();
        model = mtb;
        carregarComboC();
        carregarComboV();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        painelFundo = new javax.swing.JPanel();
        labelTit = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        labelVendedor = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox();
        comboVendedor = new javax.swing.JComboBox();
        campoProduto = new javax.swing.JTextField();

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Marca");

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTit.setForeground(new java.awt.Color(255, 255, 255));
        labelTit.setText("Inserir Transação");
        painelFundo.add(labelTit);
        labelTit.setBounds(57, 11, 170, 22);

        labelProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelProduto.setForeground(new java.awt.Color(255, 255, 255));
        labelProduto.setText("Produto.:  ");
        painelFundo.add(labelProduto);
        labelProduto.setBounds(10, 41, 70, 20);

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
        botaoLimpar.setBounds(140, 160, 110, 30);

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
        botaoSalvar.setBounds(260, 160, 120, 30);

        labelCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setText("Cliente.:  ");
        painelFundo.add(labelCliente);
        labelCliente.setBounds(10, 80, 100, 20);

        labelVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelVendedor.setForeground(new java.awt.Color(255, 255, 255));
        labelVendedor.setText("Vendedor.:  ");
        painelFundo.add(labelVendedor);
        labelVendedor.setBounds(10, 120, 80, 20);

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelFundo.add(comboCliente);
        comboCliente.setBounds(80, 80, 190, 20);

        comboVendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelFundo.add(comboVendedor);
        comboVendedor.setBounds(80, 120, 190, 20);
        painelFundo.add(campoProduto);
        campoProduto.setBounds(80, 40, 310, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Transacao t = new Transacao();
           t.setProduto(campoProduto.getText());
           t.setCliente((Cliente)comboCliente.getSelectedItem());
           t.setVendedor((Vendedor)comboVendedor.getSelectedItem());
           TransacaoController mc = new TransacaoController();
           mc.salvar(t);
           model.addTransacao(Pesquisar(t.getProduto()));
            dispose();
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

   public Transacao Pesquisar (String nome){
        TransacaoController cc = new TransacaoController();
        return cc.listarTransacaoByProd(nome);
   }
    
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoProduto.setText("");
        comboCliente.setSelectedIndex(0);
        comboVendedor.setSelectedIndex(0);
       
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JComboBox comboVendedor;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelTit;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JPanel painelFundo;
    // End of variables declaration//GEN-END:variables

     private void carregarComboC() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboCliente.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Cliente> clientes = new ArrayList<Cliente>();
        ClienteController a = new ClienteController();
        clientes = a.listarCliente();


        for (int linha = 0; linha < clientes.size(); linha++) {
            //pegando a categoria da lista
            Cliente cliente = clientes.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(cliente);
        }
    }
     
      private void carregarComboV() {
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboVendedor.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Vendedor> vendedores = new ArrayList<Vendedor>();
        VendedorController a = new VendedorController();
        vendedores = a.listarVendedor();


        for (int linha = 0; linha < vendedores.size(); linha++) {
            //pegando a categoria da lista
            Vendedor vendedor = vendedores.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(vendedor);
        }
    }
}