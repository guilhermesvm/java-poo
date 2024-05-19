package br.upf.aluno196890.front;

import br.upf.aluno196890.domain.Teste;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaGlicose extends javax.swing.JFrame {
    List<Teste> lista = new ArrayList<>();
    
    public TelaGlicose() {
         try {
            initComponents();
                  
            lista.add(new Teste(51, "Trevor Phillips", 300));
            lista.add(new Teste(55, "Michael de Santa", 4));
            
            for(Teste obj : lista){
                textLog.append("Id: " + obj.id + " | Nome: " + obj.nome +
            " | IDG: " + obj.idg + " | Interpretacao: " + obj.getInterpretacao() + "\n");
            }
            buttonListarActionPerformed(null);
        } catch (Exception ex) {
            Logger.getLogger(TelaGlicose.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textIdg = new javax.swing.JTextField();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonListar = new javax.swing.JButton();
        buttonCalcular = new javax.swing.JButton();
        JLabel3 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        textId.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Índice Glicêmico");

        textIdg.setBackground(new java.awt.Color(255, 255, 255));
        textIdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdgActionPerformed(evt);
            }
        });

        buttonAlterar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAlterar.setForeground(new java.awt.Color(0, 0, 0));
        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonExcluir.setBackground(new java.awt.Color(255, 255, 255));
        buttonExcluir.setForeground(new java.awt.Color(0, 0, 0));
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonListar.setBackground(new java.awt.Color(255, 255, 255));
        buttonListar.setForeground(new java.awt.Color(0, 0, 0));
        buttonListar.setText("Listar");
        buttonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarActionPerformed(evt);
            }
        });

        buttonCalcular.setBackground(new java.awt.Color(255, 255, 255));
        buttonCalcular.setForeground(new java.awt.Color(0, 0, 0));
        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        JLabel3.setForeground(new java.awt.Color(0, 0, 0));
        JLabel3.setText("ID");

        textNome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TESTE DE DIABETES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonCalcular)
                        .addGap(41, 41, 41)
                        .addComponent(buttonAlterar)
                        .addGap(45, 45, 45)
                        .addComponent(buttonExcluir)
                        .addGap(42, 42, 42)
                        .addComponent(buttonListar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIdg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel3)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(JLabel3)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(textIdg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcular)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonListar))
                .addContainerGap())
        );

        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDados);

        textLog.setColumns(20);
        textLog.setRows(5);
        jScrollPane2.setViewportView(textLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // Pegar a linha selecionada
        int i = tableDados.getSelectedRow();
        
        // Remover o objeto da linha selecionada
        lista.remove(i);
        
        // Listar novamente = atualiza a tabela
        buttonListarActionPerformed(evt);
        
        limparCampos();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed
        Object [][] matriz = new Object[lista.size()] [4];
        
        int i = 0;
        
        for(Teste test : lista){
            matriz[i][0] = test.getId();
            matriz[i][1] = test.getNome();
            matriz[i][2] = test.getIdg();
            matriz[i][3] = test.getInterpretacao();
            i++;
         }
       
       tableDados.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
               "Id", "Nome", "Idg", "Interpretação"
            }
        ));
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        try {
            // Pegar a linha selecionada
            int i = tableDados.getSelectedRow();
            
            // Pegar o objeto da lista pela linha
            Teste test = lista.get(i);
            
            // Colocar os dados da tela no objeto = alterando
            test.setNome(textNome.getText());
            test.setIdg(Integer.valueOf(textIdg.getText()));
            test.setId(Integer.valueOf(textId.getText()));
            
            // Listar lista novamente
            buttonListarActionPerformed(evt);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void tableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDadosMouseClicked
       // Identificar a linha selecionada
       int linha = tableDados.getSelectedRow();

       // Pegar da lista objeto respectivo a linha
       Teste selecionado = lista.get(linha);
        
       // Colocar os dados do objeto nos componentes de for
       textNome.setText(selecionado.getNome());
       textIdg.setText(selecionado.getIdg().toString());
       textId.setText(selecionado.getId().toString());
    }//GEN-LAST:event_tableDadosMouseClicked

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
 
        try {
            // Instanciar objeto e inicializar pelo construtor
            Teste test = new Teste(
                    Integer.valueOf(textId.getText()),
                    textNome.getText(),
                    Integer.valueOf(textIdg.getText()));
            
            //Armazenar o objeto na lista
            lista.add(test);
            
            //Adicionar log 
            textLog.append("Incluindo: " + test+"\n");
            
            buttonListarActionPerformed(evt);
            
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void textIdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdgActionPerformed

     private void limparCampos() {
        textNome.setText("");
        textIdg.setText("");
        textId.setText("");
        
        
    }
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGlicose().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel3;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDados;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textIdg;
    private javax.swing.JTextArea textLog;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables

}
