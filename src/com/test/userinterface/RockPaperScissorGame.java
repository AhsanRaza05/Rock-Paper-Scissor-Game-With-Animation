/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.userinterface;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ahsan
 */
public class RockPaperScissorGame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form RockPaperScissorGame
     */
    
    
    public RockPaperScissorGame() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        playerScore = 0;
        computerScore = 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        computerScoreLbl = new javax.swing.JLabel();
        playerScoreLbl = new javax.swing.JLabel();
        selectionLbl = new javax.swing.JLabel();
        resetGameBtn = new javax.swing.JButton();
        rockBtn = new javax.swing.JButton();
        paperBtn = new javax.swing.JButton();
        ScissorBtn = new javax.swing.JButton();
        playerPanel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){

                super.paintComponent(g);

                if(playerImgDimension != null)
                playerImgLbl.setSize(playerImgDimension.width , playerImgDimension.height);
            }
        };
        playerImgLbl = new javax.swing.JLabel();
        computerPanel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){

                super.paintComponent(g);
                if(computerImgDimension != null)
                computerImgLbl.setSize(computerImgDimension.width , computerImgDimension.height);
            }

        };
        computerImgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        headerLbl.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Rock Paper Scissors");

        computerScoreLbl.setBackground(new java.awt.Color(0, 0, 255));
        computerScoreLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        computerScoreLbl.setForeground(new java.awt.Color(255, 255, 255));
        computerScoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerScoreLbl.setText("Computer : 0");
        computerScoreLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerScoreLbl.setOpaque(true);

        playerScoreLbl.setBackground(new java.awt.Color(0, 0, 255));
        playerScoreLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        playerScoreLbl.setForeground(new java.awt.Color(255, 255, 255));
        playerScoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScoreLbl.setText("Player : 0");
        playerScoreLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        playerScoreLbl.setOpaque(true);

        selectionLbl.setBackground(new java.awt.Color(255, 102, 51));
        selectionLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        selectionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectionLbl.setText("Make Your Selection");
        selectionLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selectionLbl.setOpaque(true);

        resetGameBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetGameBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetGameBtn.setText("Reset Game");
        resetGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameBtnActionPerformed(evt);
            }
        });

        rockBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rockBtn.setText("Rock");
        rockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockBtnActionPerformed(evt);
            }
        });

        paperBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paperBtn.setText("Paper");
        paperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperBtnActionPerformed(evt);
            }
        });

        ScissorBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ScissorBtn.setText("Scissor");
        ScissorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorBtnActionPerformed(evt);
            }
        });

        playerPanel.setBackground(new java.awt.Color(0, 0, 255));

        playerImgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RRockInverted.png"))); // NOI18N

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(playerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(playerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        computerPanel.setBackground(new java.awt.Color(0, 0, 255));

        computerImgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RRock.png"))); // NOI18N

        javax.swing.GroupLayout computerPanelLayout = new javax.swing.GroupLayout(computerPanel);
        computerPanel.setLayout(computerPanelLayout);
        computerPanelLayout.setHorizontalGroup(
            computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(computerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(computerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        computerPanelLayout.setVerticalGroup(
            computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(computerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(computerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(resetGameBtn)))
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(computerScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(selectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(rockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(paperBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ScissorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(computerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(headerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerScoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(computerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paperBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScissorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameBtnActionPerformed
        // Reseting the Score and hand images to default
        
        // Reset Scores
        playerScore = 0;
        computerScore = 0;
        updateScores();
        
        // Reset Selection
        selectionLbl.setText("Make Your Selection");

        // Reset Images
        resetImages();
    }//GEN-LAST:event_resetGameBtnActionPerformed

    private void rockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockBtnActionPerformed

        // Reset Images
        resetImages();
        
        playerImgDimension = playerImgLbl.getSize();
        computerImgDimension = computerImgLbl.getSize();
        
        // Set counter for Timer
        timerCounter = 10;
        
        // Create Timer 
        timer = new Timer(200,this);
        
        // Start the Timer
        timer.start();
        
        playerChoice = "r";
        computerChoice = getcomputerChoice();
        
        Dimension d = selectionLbl.getSize();
        
        Timer tm = new Timer(2000, new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                ImageIcon i;
                
                i = new ImageIcon(getClass().getResource("/images/RRockInverted.png"));
                playerImgLbl.setIcon(i);

                if (isDraw()) {

                    i = new ImageIcon(getClass().getResource("/images/RRock.png"));
                    computerImgLbl.setIcon(i);
                    selectionLbl.setText("Draw");

                } else if (isGameWon() == true) {

                    i = new ImageIcon(getClass().getResource("/images/SScissor.png"));
                    computerImgLbl.setIcon(i);

                    playerScore++;
                    updateScores();
                    selectionLbl.setText("Player Won");

                } else {
                    i = new ImageIcon(getClass().getResource("/images/PPaper.png"));
                    computerImgLbl.setIcon(i);

                    computerScore++;
                    updateScores();
                    selectionLbl.setText("Player Lost");
                }

                selectionLbl.setSize(d);
            }
        });
        tm.start();
        tm.setRepeats(false);

    }//GEN-LAST:event_rockBtnActionPerformed

    private void paperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperBtnActionPerformed

        // Reset Images
        resetImages();
        
        playerImgDimension = playerImgLbl.getSize();
        computerImgDimension = computerImgLbl.getSize();
        
        // Set counter for Timer
        timerCounter = 10;
        
        // Create Timer 
        timer = new Timer(200,this);
        
        // Start the Timer
        timer.start();
        
        playerChoice = "p";
        computerChoice = getcomputerChoice();
        Dimension d = selectionLbl.getSize();
        
        Timer tm = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon i;
                
                i = new ImageIcon(getClass().getResource("/images/PPaperInverted.png"));
                playerImgLbl.setIcon(i);
                
                if (isDraw()) {

                    i = new ImageIcon(getClass().getResource("/images/PPaper.png"));
                    computerImgLbl.setIcon(i);
                    selectionLbl.setText("Draw");

                } else if (isGameWon() == true) {

                    i = new ImageIcon(getClass().getResource("/images/RRock.png"));
                    computerImgLbl.setIcon(i);

                    playerScore++;
                    updateScores();
                    selectionLbl.setText("Player Won");

                } else {
                    i = new ImageIcon(getClass().getResource("/images/SScissor.png"));
                    computerImgLbl.setIcon(i);

                    computerScore++;
                    updateScores();
                    selectionLbl.setText("Player Lost");
                }

                selectionLbl.setSize(d);
            }
        });
        
       tm.start();
       tm.setRepeats(false);
        
    }//GEN-LAST:event_paperBtnActionPerformed

    private void ScissorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorBtnActionPerformed

        // Reset Images
        resetImages();
        
        playerImgDimension = playerImgLbl.getSize();
        computerImgDimension = computerImgLbl.getSize();
        timerCounter = 10;
        timer = new Timer(200,this);
        timer.start();
        
        playerChoice = "s";
        
        computerChoice = getcomputerChoice();
        
        Dimension d = selectionLbl.getSize();
        
        Timer tm = new Timer(2000, (e) -> {

            ImageIcon i;
            
            i = new ImageIcon(getClass().getResource("/images/SScissorInverted.png"));
            playerImgLbl.setIcon(i);
            
            if (isDraw()) {

                i = new ImageIcon(getClass().getResource("/images/SScissor.png"));
                
                computerImgLbl.setIcon(i);
                selectionLbl.setText("Draw");

            } else if (isGameWon() == true) {

                i = new ImageIcon(getClass().getResource("/images/PPaper.png"));
               
                computerImgLbl.setIcon(i);

                playerScore++;
                updateScores();
                selectionLbl.setText("Player Won");

            } else {
                i = new ImageIcon(getClass().getResource("/images/RRock.png"));
               
                computerImgLbl.setIcon(i);

                computerScore++;
                updateScores();
                selectionLbl.setText("Player Lost");
            }

            selectionLbl.setSize(d);
        });
        
        tm.start();
        tm.setRepeats(false);
    }//GEN-LAST:event_ScissorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RockPaperScissorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperScissorGame().setVisible(true);
            }
        });
    }
    String playerChoice = "";
    String computerChoice = "";
    Integer playerScore;
    Integer computerScore;
    boolean areHandsUp = false;
    int timerCounter;
    Timer timer;
    Dimension playerImgDimension;
    Dimension computerImgDimension;
    
    String getcomputerChoice() {

        int result = (int) Math.floor(Math.random() * 3);

        String choice = "";

        if (result == 1) {

            choice = "r";
        } else if (result == 2) {

            choice = "p";
        } else {

            choice = "s";
        }

        return choice;
    }
    
    boolean isDraw() {

        if (playerChoice.equalsIgnoreCase(computerChoice)) {

            return true;
        }

        return false;
    }

    Boolean isGameWon() {

        if (playerChoice.equalsIgnoreCase("p")) {

            if (computerChoice.equalsIgnoreCase("r")) {

                return true;
            }
            return false;
        } else if (playerChoice.equalsIgnoreCase("r")) {

            if (computerChoice.equalsIgnoreCase("s")) {

                return true;
            }
            return false;
        } 
        else {

            if (computerChoice.equalsIgnoreCase("p")) {

                return true;
            }
            return false;
        }
// R < P < S < P

//Increasing order
// P > R > S > P
// P < R < S <  
      
    }
    void updateScores(){
        
        playerScoreLbl.setText("Player : %d".formatted(playerScore));
        computerScoreLbl.setText("Computer : %d".formatted(computerScore));
    }
    
    void resetImages(){
        
        //Reset Computer Hand Image to Rock
        ImageIcon i = new ImageIcon(getClass().getResource("/images/RRock.png"));
        computerImgLbl.setIcon(i);
        
        //Reset Player Hand Image to Rock
        i = new ImageIcon(getClass().getResource("/images/RRockInverted.png"));
        playerImgLbl.setIcon(i);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ScissorBtn;
    private javax.swing.JLabel computerImgLbl;
    private javax.swing.JPanel computerPanel;
    private javax.swing.JLabel computerScoreLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton paperBtn;
    private javax.swing.JLabel playerImgLbl;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JLabel playerScoreLbl;
    private javax.swing.JButton resetGameBtn;
    private javax.swing.JButton rockBtn;
    private javax.swing.JLabel selectionLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Action Per");
        if(timerCounter > 0){
            timerCounter--;
            
            if(areHandsUp){
                
                playerImgDimension.setSize(playerImgLbl.getWidth(), playerImgLbl.getHeight() - 20);
                computerImgDimension.setSize(computerImgLbl.getWidth(), computerImgLbl.getHeight() - 20);
                areHandsUp = false;
            }
            else{
                
               
                playerImgDimension.setSize(playerImgLbl.getWidth(), playerImgLbl.getHeight() + 20);
                computerImgDimension.setSize(computerImgLbl.getWidth(), computerImgLbl.getHeight() + 20);
                areHandsUp = true;
            }
            
        }
        else{
            timer.stop();
        }
        playerPanel.repaint();
        computerPanel.repaint();
    }
}
