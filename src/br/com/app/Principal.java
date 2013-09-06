

package br.com.app;

import br.com.view.JanelaPrincipalGUI;

/**
 * Classe responsável por executar toda a aplicação.
 * @author antonio-sj
 */
public class Principal {
    
    public static void main(String[] args)  {
       JanelaPrincipalGUI jp = new JanelaPrincipalGUI();
       jp.setLocationRelativeTo(null);
       jp.setVisible(true);
    }

}
