package br.com.view;

import br.com.model.tablemodel.ClienteTableModel;
import br.com.controller.ClienteController;
import br.com.model.negocio.Cliente;

/**
 *
 * @author antonio_sj
 */
public class InserirClienteGUI extends javax.swing.JFrame {

    ClienteTableModel model;

    /**
     * Creates new form InserirAutomovelGui
     */
    public InserirClienteGUI(ClienteTableModel mtb) {
        initComponents();
        model = mtb;
        
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
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelEndereco = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        campoRg = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Marca");

        painelFundo.setBackground(new java.awt.Color(102, 102, 102));
        painelFundo.setLayout(null);

        labelTit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTit.setForeground(new java.awt.Color(255, 255, 255));
        labelTit.setText("Inserir Cliente");
        painelFundo.add(labelTit);
        labelTit.setBounds(57, 11, 140, 22);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome.:  ");
        painelFundo.add(labelNome);
        labelNome.setBounds(10, 50, 50, 20);
        painelFundo.add(campoNome);
        campoNome.setBounds(80, 50, 310, 20);

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
        botaoLimpar.setBounds(130, 233, 110, 30);

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
        botaoSalvar.setBounds(250, 233, 120, 30);

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco.setText("Endereco.:  ");
        painelFundo.add(labelEndereco);
        labelEndereco.setBounds(10, 80, 100, 20);

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(255, 255, 255));
        labelCpf.setText("Cpf.:  ");
        painelFundo.add(labelCpf);
        labelCpf.setBounds(10, 150, 40, 20);

        labelRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRg.setForeground(new java.awt.Color(255, 255, 255));
        labelRg.setText("Rg.:  ");
        painelFundo.add(labelRg);
        labelRg.setBounds(10, 180, 40, 20);
        painelFundo.add(campoRg);
        campoRg.setBounds(80, 180, 150, 20);
        painelFundo.add(campoEndereco);
        campoEndereco.setBounds(80, 80, 310, 20);
        painelFundo.add(campoCpf);
        campoCpf.setBounds(80, 150, 150, 20);
        painelFundo.add(campoTelefone);
        campoTelefone.setBounds(80, 120, 150, 20);

        labelTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTel.setForeground(new java.awt.Color(255, 255, 255));
        labelTel.setText("Telefone.:  ");
        painelFundo.add(labelTel);
        labelTel.setBounds(10, 120, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Cliente c = new Cliente();
           c.setNome(campoNome.getText());
           c.setEndereco(campoEndereco.getText());
           c.setTelefone(campoTelefone.getText());
           c.setCpf(campoCpf.getText());
           c.setRg(campoRg.getText());
          
           ClienteController mc = new ClienteController();
           mc.salvar(c);
           model.addCliente(Pesquisar(c.getNome()));
            dispose();
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

   public Cliente Pesquisar (String nome){
        ClienteController cc = new ClienteController();
        return cc.listarClienteByNom(nome);
   }
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        campoEndereco.setText(" ");
        campoTelefone.setText(" ");
        campoCpf.setText("");
        campoRg.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRg;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel labelTit;
    private javax.swing.JPanel painelFundo;
    // End of variables declaration//GEN-END:variables

    
}
