/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import java.awt.Frame;

/**
 *
 * @author matheusikenaga
 */
public class Modulo1Cadastros extends javax.swing.JFrame {

    /**
     * Creates new form TelaPreCadastro
     */
    public Modulo1Cadastros() {
        initComponents();
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setVisible(true);
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
        jLabel4 = new javax.swing.JLabel();
        btConsultAluguel = new javax.swing.JButton();
        btInsMultaSin = new javax.swing.JButton();
        btConsultPecas = new javax.swing.JButton();
        btConsultMotorista = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btInsMotorista = new javax.swing.JButton();
        btInsVeiculo = new javax.swing.JButton();
        btConsultVeiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btConsultMultasSin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btInsPecas = new javax.swing.JButton();
        btConsultViagem = new javax.swing.JButton();
        btInsViagem = new javax.swing.JButton();
        btInsAluguel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btSIGEGFROTAS = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btModComprasEAbast = new javax.swing.JButton();
        btModFinancas = new javax.swing.JButton();
        btModLocacao = new javax.swing.JButton();
        btModGerFrota = new javax.swing.JButton();
        btModCadastros = new javax.swing.JButton();
        btModComprasEAbast1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel4.setText("Cadastro Aluguel");

        btConsultAluguel.setText("Consultar");

        btInsMultaSin.setText("Incluir");

        btConsultPecas.setText("Consultar");

        btConsultMotorista.setText("Consultar");
        btConsultMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultMotoristaActionPerformed(evt);
            }
        });

        jLabel6.setText("Cadastro Multas e Sinistros");

        btInsMotorista.setText("Incluir");
        btInsMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsMotoristaActionPerformed(evt);
            }
        });

        btInsVeiculo.setText("Incluir");
        btInsVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsVeiculoActionPerformed(evt);
            }
        });

        btConsultVeiculo.setText("Consultar");
        btConsultVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultVeiculoActionPerformed(evt);
            }
        });

        jLabel2.setText("Cadastro Veículo");

        btConsultMultasSin.setText("Consultar");

        jLabel1.setText("Cadastro Motorista");

        jLabel5.setText("Cadastro Peças");

        btInsPecas.setText("Incluir");
        btInsPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsPecasActionPerformed(evt);
            }
        });

        btConsultViagem.setText("Consultar");

        btInsViagem.setText("Incluir");
        btInsViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsViagemActionPerformed(evt);
            }
        });

        btInsAluguel.setText("Incluir");

        jLabel3.setText("Cadastro Viagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122)
                        .addComponent(btInsMotorista)
                        .addGap(118, 118, 118)
                        .addComponent(btConsultMotorista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(136, 136, 136)
                        .addComponent(btInsVeiculo)
                        .addGap(118, 118, 118)
                        .addComponent(btConsultVeiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(136, 136, 136)
                        .addComponent(btInsViagem)
                        .addGap(118, 118, 118)
                        .addComponent(btConsultViagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(136, 136, 136)
                        .addComponent(btInsAluguel)
                        .addGap(118, 118, 118)
                        .addComponent(btConsultAluguel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(72, 72, 72)
                            .addComponent(btInsMultaSin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultMultasSin))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(149, 149, 149)
                            .addComponent(btInsPecas)
                            .addGap(118, 118, 118)
                            .addComponent(btConsultPecas))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btInsMotorista)
                    .addComponent(btConsultMotorista))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(btInsVeiculo)
                    .addComponent(btConsultVeiculo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(btInsViagem)
                    .addComponent(btConsultViagem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(btInsAluguel)
                    .addComponent(btConsultAluguel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btInsPecas)
                        .addComponent(jLabel5))
                    .addComponent(btConsultPecas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(btInsMultaSin)
                    .addComponent(btConsultMultasSin))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 119));
        jPanel2.setSize(new java.awt.Dimension(1920, 119));

        btSIGEGFROTAS.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/sige logo 88x88.png")); // NOI18N
        btSIGEGFROTAS.setToolTipText("Voltar para Tela Inicial");
        btSIGEGFROTAS.setBorderPainted(false);
        btSIGEGFROTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSIGEGFROTASActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btModComprasEAbast.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/compras-abast.png")); // NOI18N
        btModComprasEAbast.setToolTipText("Compras e Abastecimento");
        btModComprasEAbast.setMaximumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setMinimumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setPreferredSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModComprasEAbastActionPerformed(evt);
            }
        });

        btModFinancas.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/financeiro.png")); // NOI18N
        btModFinancas.setToolTipText("Finanças");
        btModFinancas.setMaximumSize(new java.awt.Dimension(89, 89));
        btModFinancas.setMinimumSize(new java.awt.Dimension(89, 89));
        btModFinancas.setPreferredSize(new java.awt.Dimension(89, 89));
        btModFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModFinancasActionPerformed(evt);
            }
        });

        btModLocacao.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/locacao.png")); // NOI18N
        btModLocacao.setToolTipText("Locação de Veículo");
        btModLocacao.setPreferredSize(new java.awt.Dimension(89, 89));
        btModLocacao.setSize(new java.awt.Dimension(89, 89));
        btModLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModLocacaoActionPerformed(evt);
            }
        });

        btModGerFrota.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/gerfrotras.png")); // NOI18N
        btModGerFrota.setToolTipText("Gerenciamento de Frotas");
        btModGerFrota.setPreferredSize(new java.awt.Dimension(89, 89));
        btModGerFrota.setSize(new java.awt.Dimension(89, 89));
        btModGerFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModGerFrotaActionPerformed(evt);
            }
        });

        btModCadastros.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/cadastros.png")); // NOI18N
        btModCadastros.setToolTipText("Cadastros");
        btModCadastros.setPreferredSize(new java.awt.Dimension(89, 89));
        btModCadastros.setSize(new java.awt.Dimension(89, 89));
        btModCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModCadastrosActionPerformed(evt);
            }
        });

        btModComprasEAbast1.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/manutencao.png")); // NOI18N
        btModComprasEAbast1.setToolTipText("Manutenção");
        btModComprasEAbast1.setMaximumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setMinimumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setPreferredSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModComprasEAbast1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btModCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModGerFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModComprasEAbast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModComprasEAbast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btModComprasEAbast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModGerFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btModFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btModComprasEAbast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setSize(new java.awt.Dimension(0, 9));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btSIGEGFROTAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSIGEGFROTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsMotoristaActionPerformed
        new CadastroMotorista().setVisible(true);
        //this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btInsMotoristaActionPerformed

    private void btInsVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsVeiculoActionPerformed
        // TODO add your handling code here:
        new CadastroVeiculo().setVisible(true);
        //this.dispose();

    }//GEN-LAST:event_btInsVeiculoActionPerformed

    private void btInsPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsPecasActionPerformed
        new CadastroPeca().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsPecasActionPerformed

    private void btInsViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsViagemActionPerformed
        new CadastroViagem().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsViagemActionPerformed

    private void btConsultMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultMotoristaActionPerformed
        new ConsultaMotorista();

        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultMotoristaActionPerformed

    private void btConsultVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultVeiculoActionPerformed
        new ConsultaVeiculo().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultVeiculoActionPerformed

    private void btSIGEGFROTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSIGEGFROTASActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btSIGEGFROTASActionPerformed

    private void btModComprasEAbastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModComprasEAbastActionPerformed
        new Modulo5ComprasEAbast().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModComprasEAbastActionPerformed

    private void btModFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModFinancasActionPerformed
        new Modulo4Financas().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModFinancasActionPerformed

    private void btModLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModLocacaoActionPerformed
        new Modulo3Locacao().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModLocacaoActionPerformed

    private void btModGerFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModGerFrotaActionPerformed
        new Modulo2GerFrota().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModGerFrotaActionPerformed

    private void btModCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModCadastrosActionPerformed
        new Modulo1Cadastros().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModCadastrosActionPerformed

    private void btModComprasEAbast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModComprasEAbast1ActionPerformed
        new Modulo6Manut().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModComprasEAbast1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultAluguel;
    private javax.swing.JButton btConsultMotorista;
    private javax.swing.JButton btConsultMultasSin;
    private javax.swing.JButton btConsultPecas;
    private javax.swing.JButton btConsultVeiculo;
    private javax.swing.JButton btConsultViagem;
    private javax.swing.JButton btInsAluguel;
    private javax.swing.JButton btInsMotorista;
    private javax.swing.JButton btInsMultaSin;
    private javax.swing.JButton btInsPecas;
    private javax.swing.JButton btInsVeiculo;
    private javax.swing.JButton btInsViagem;
    private javax.swing.JButton btModCadastros;
    private javax.swing.JButton btModComprasEAbast;
    private javax.swing.JButton btModComprasEAbast1;
    private javax.swing.JButton btModFinancas;
    private javax.swing.JButton btModGerFrota;
    private javax.swing.JButton btModLocacao;
    private javax.swing.JButton btSIGEGFROTAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
