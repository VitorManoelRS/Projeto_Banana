/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_banana;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Lucas
 */
public class Interface extends javax.swing.JFrame {
    //Instanciando a Classe Banco publica
    Banco banquinho = new Banco();
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        lbl_imagem.setVisible(true);
                
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tela de Id");
        dispose();
        
      
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        lbl_textura = new javax.swing.JLabel();
        lbl_massa = new javax.swing.JLabel();
        lbl_ph = new javax.swing.JLabel();
        lbl_diametro = new javax.swing.JLabel();
        lbl_comprimento = new javax.swing.JLabel();
        txt_massa = new javax.swing.JTextField();
        txt_textura = new javax.swing.JTextField();
        txt_comprimento = new javax.swing.JTextField();
        txt_diametro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ph = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_imagem = new javax.swing.JLabel();
        txt_url = new javax.swing.JTextField();
        btn_busca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Digite o numero da amostra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 29, -1));

        btn_buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        lbl_textura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_textura.setText("Textura:");
        jPanel1.add(lbl_textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lbl_massa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_massa.setText("Massa:");
        jPanel1.add(lbl_massa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lbl_ph.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_ph.setText("PH:");
        jPanel1.add(lbl_ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        lbl_diametro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_diametro.setText("Diametro:");
        jPanel1.add(lbl_diametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        lbl_comprimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_comprimento.setText("Comprimento:");
        jPanel1.add(lbl_comprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        txt_massa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_massa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_massa.setEnabled(false);
        jPanel1.add(txt_massa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 63, -1));

        txt_textura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_textura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_textura.setEnabled(false);
        jPanel1.add(txt_textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 63, -1));

        txt_comprimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_comprimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_comprimento.setEnabled(false);
        jPanel1.add(txt_comprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 63, -1));

        txt_diametro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_diametro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_diametro.setEnabled(false);
        jPanel1.add(txt_diametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 63, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Categoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        txt_ph.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_ph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_ph.setEnabled(false);
        txt_ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 63, -1));

        txt_categoria.setFont(new java.awt.Font("Arial", 0, 34)); // NOI18N
        txt_categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_categoria.setEnabled(false);
        jPanel1.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 360, 20));

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_banana/grass.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 230, 2040, 250));

        lbl_imagem.setBackground(new java.awt.Color(255, 255, 255));
        lbl_imagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 130, 150));

        txt_url.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_url.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_url.setEnabled(false);
        txt_url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_urlActionPerformed(evt);
            }
        });
        jPanel1.add(txt_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 334, 25));

        btn_busca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_busca.setText("...");
        btn_busca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 25, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Selecione o banco de dados (.ARFF)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_banana/bananinha.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 370, 420));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, 340, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 510, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_banana/kong.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        //Intanciando a classe Banana
        Banana bananinha = new Banana();
        int id;
        try
        {
            //Enviando o id da amostra para classe Banco
            banquinho.setId(Integer.parseInt(txt_id.getText()));
            
            //Chamando banco e retornando valor da massa
            bananinha.setMassa(banquinho.massa_bd());
            txt_massa.setText(""+bananinha.getMassa());

            //Chamando banco e retornando valor da textura
            bananinha.setTextura(banquinho.textura_bd());
            txt_textura.setText(""+bananinha.getTextura());

            //Chamando banco e retornando valor do comprimento
            bananinha.setComprimento(banquinho.comprimento_bd());
            txt_comprimento.setText(""+bananinha.getComprimento());

            //Chamando banco e retornando valor da diametro
            bananinha.setDiametro(banquinho.diametro_bd());
            txt_diametro.setText(""+bananinha.getDiametro());

            //Chamando banco e retornando valor do pH
            bananinha.setPh(banquinho.ph_bd());
            txt_ph.setText(""+bananinha.getPh());

            //Chamando banco e retornando a categoria
            bananinha.setCategoria((int)banquinho.categoria_bd());
            txt_categoria.setText(""+bananinha.calcula_categoria());

            if(bananinha.getCategoria() == 0)
            {
                ImageIcon icon = new ImageIcon("src/projeto_banana/B1-Verde.png");
                lbl_imagem.setVisible(true);

                icon.setImage(icon.getImage().getScaledInstance(lbl_imagem.getWidth(), lbl_imagem.getHeight(), 1));
                lbl_imagem.setIcon(icon);

               
            }
            if(bananinha.getCategoria() == 1)
            {
                ImageIcon icon = new ImageIcon("src/projeto_banana/B2-DeVez.png");
                lbl_imagem.setVisible(true);
                icon.setImage(icon.getImage().getScaledInstance(lbl_imagem.getWidth(), lbl_imagem.getHeight(), 1));
                lbl_imagem.setIcon(icon);

            
            }
            if(bananinha.getCategoria() == 2)
            {
                ImageIcon icon = new ImageIcon("src/projeto_banana/B3-Madura.png");
                lbl_imagem.setVisible(true);
                icon.setImage(icon.getImage().getScaledInstance(lbl_imagem.getWidth(), lbl_imagem.getHeight(), 1));
                lbl_imagem.setIcon(icon);

             
            }
            if(bananinha.getCategoria() == 3)
            {
                ImageIcon icon = new ImageIcon("src/projeto_banana/B4-Passada.png");
                lbl_imagem.setVisible(true);
                icon.setImage(icon.getImage().getScaledInstance(lbl_imagem.getWidth(), lbl_imagem.getHeight(), 1));
                lbl_imagem.setIcon(icon);

              

            }
            
        }
        catch (Exception e){
            
            ImageIcon imagem = new ImageIcon(Interface.class.getResource("erro.jpg"));
            //JOptionPane.showMessageDialog(null,"","Error", JOptionPane.INFORMATION_MESSAGE,imagem);
            //JOptionPane.showMessageDialog(null, "Erro! "+ e);
            JOptionPane.showMessageDialog(this,"", "Error", WIDTH, imagem);
            
        }
        
        id=(int) Float.parseFloat(txt_id.getText());
        
            if(id==666){
                ImageIcon imagem = new ImageIcon(Interface.class.getResource("monkey.jpg"));
                JOptionPane.showMessageDialog(this,"", "Deus é mais", WIDTH, imagem);
            } 
            
            if(id==69){
                ImageIcon imagem = new ImageIcon(Interface.class.getResource("donkey.PNG"));
                JOptionPane.showMessageDialog(this,"", "Deus é mais", WIDTH, imagem);
                    }
            else{}
        
        
        

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_urlActionPerformed

    private void btn_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaActionPerformed
        //Instanciando a classe Banco

        //Instanciando o objeto para selecionar o arquivo do banco
        JFileChooser busca = new JFileChooser();

        //Alterando seu titulo
        busca.setDialogTitle("Procurar banco de dados");

        //Lendo somente arquivos
        busca.setFileSelectionMode(JFileChooser.FILES_ONLY);

        //Filtrando os tipos de arquivos (.arff)
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Banco de dados", "arff");
        busca.setFileFilter(filtro);

        //Abrindo o selecionar arquivos e sabendo o retorno(Abrir ou cancelar)
        int retorno = busca.showOpenDialog(this);

        //Clicando no botao abrir
        if(retorno == busca.APPROVE_OPTION)
        {
            //Armazenando o caminho do arquivo selecionado
            File file = busca.getSelectedFile();

            //Exibindo o arquivo selecionado no txt
            txt_url.setText(file.getPath());

            //Enviando para a classe Banco
            banquinho.setUrl(file.toString());

            txt_id.setEnabled(true);
            btn_buscar.setEnabled(true);

        }

    }//GEN-LAST:event_btn_buscaActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busca;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_comprimento;
    private javax.swing.JLabel lbl_diametro;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_massa;
    private javax.swing.JLabel lbl_ph;
    private javax.swing.JLabel lbl_textura;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_comprimento;
    private javax.swing.JTextField txt_diametro;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_massa;
    private javax.swing.JTextField txt_ph;
    private javax.swing.JTextField txt_textura;
    private javax.swing.JTextField txt_url;
    // End of variables declaration//GEN-END:variables
}