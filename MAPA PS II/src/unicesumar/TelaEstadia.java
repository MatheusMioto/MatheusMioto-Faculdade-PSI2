
package unicesumar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEstadia extends JFrame {
    private Responsavel responsavel;
    private Crianca crianca;
    private JTextField txtTempoUtilizado;
    private JButton btnCalcular;
   
    public TelaEstadia(Responsavel responsavel, Crianca crianca) {
        setTitle("Etapa 3 de 3 - Dados da Estadia");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 5, 5)); // 3 linhas, 2 colunas, espaçamentos
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Salvar responsável e criança passados
        this.responsavel = responsavel;
        this.crianca = crianca;
        
        add(new JLabel("Etapa 3 de 3 - Dados da Estadia"));
        add(new JLabel());//espaço vazio para alinhamento da grid
        
        // Inicialização e adição de componentes
        add(new JLabel("Responsável:"));
        JTextField txtResponsavel = new JTextField(responsavel.getNome());
        txtResponsavel.setEditable(false);
        add(txtResponsavel);

        add(new JLabel("Criança:"));
        JTextField txtCrianca = new JTextField(crianca.getNome());
        txtCrianca.setEditable(false);
        add(txtCrianca);

        add(new JLabel("Tempo Utilizado (minutos):"));
        txtTempoUtilizado = new JTextField();
        add(txtTempoUtilizado);
        
        add(new JLabel());//espaço vazio para alinhamento da grid
        
        btnCalcular = new JButton("Calcular e Mostrar Resumo");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResumo();
            }
        });
        add(btnCalcular);

        // Centraliza a tela
        setLocationRelativeTo(null);
    }
    private void calcularResumo() {
        try {
            int tempo = Integer.parseInt(txtTempoUtilizado.getText());
            double custo = Estadia.calcularCusto(tempo);
            JOptionPane.showMessageDialog(this,
                    "Dados da Estadia\n" +
                    "Nome Responsável: " + responsavel.getNome() + "\n" +
                    "CPF Responsável: " + responsavel.getCpf() + "\n" +
                    "Telefone Responsável: " + responsavel.getTelefone() + "\n" +
                    "Email Responsável: " + responsavel.getEmail() + "\n" +
                    "Endereço Responsável: " + responsavel.getEndereco() + "\n" +
                    "Idade Responsável: " + responsavel.getIdade() + "\n" +
                    "Nome Criança: " + crianca.getNome() + "\n" +
                    "Idade Criança: " + crianca.getIdade() + "\n" +
                    "Sexo Criança: " + crianca.getSexo() + "\n" +
                    "Tempo no Brinquedo: " + tempo + "\n" +
                    "Valor a Pagar: " + String.format("R$%.2f", custo),
                    "Resumo da Estadia", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um tempo válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEstadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstadia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Responsavel responsavelExemplo = new Responsavel(); // Substitua com o objeto real
                Crianca criancaExemplo = new Crianca(); // Substitua com o objeto real
                
                TelaEstadia telaEstadia = new TelaEstadia(responsavelExemplo, criancaExemplo);
                telaEstadia.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
