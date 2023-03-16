/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing1;
import java.util.*;
/**
 *
 * @author yusuf
 */
public class Menu1 extends javax.swing.JFrame {
            
    public Random rand = new Random();
    public Scanner scan = new Scanner(System.in);
    
    Player p1 = new Player("Curry", 10,1,1); //test player until player initialization is made
    Enemy e1 = EnemyDatabase.slime; //test enemy, takes slime from enemydata class
    
    
    public void fight(Entity p, Entity e) { //p = initiator, e = receiver
        descText.append("\n" + p.name + " attacks!");
        if (rand.nextInt(11) <= 8) { //for now the accuracy is fixed at 80% hit rate
            int dmg = (p.atk - e.def > 0) ? p.atk - e.def : 1; //minimum damage dealt is 1
            e.hp = (e.hp - dmg >= 0) ? e.hp - dmg : 0; //prevents hp going to negative
            descText.append("\n" + e.name + " took " + dmg + " damage!");
        }
        
        else {
            descText.append("\nMiss!");
        }
    }
    
    public void OFchecker (Entity p) { if (p.hp > p.maxhp) { p.hp = p.maxhp; } } //prevents hp overflow
    
    public void check(Player p, Enemy e) { //checks player and enemy hp, rewrites info screens
        OFchecker (p);
        OFchecker (e);
        plaText.setText(p.name + "\nHP: " + p.hp + "/" + p.maxhp + "\nAtk: " + p.atk + "\tDef: " + p.def);
        enemText.setText(e.name + "\nHP: " + e.hp + "/" + e.maxhp);  
    }
    
    public int wincheck (Player p, Enemy e) { //returns 1 if win conditions are met, 0 if lose conditions are met, 2 otherwise
        if (p.hp <= 0) { return 0; }
        if (e.hp <= 0) { return 1; }
        return 2;
    }
    
    public void lcheck(Player p, Enemy e) { //checks if player or enemy is down, also a general check on battle stuff i suppose
        
        invframe.setVisible(false); //disable the frame that holds the inventory
        invframe.setEnabled(false);
        
        check(p,e);
        if (wincheck(p,e) == 0) { //game over procedure
            descText.append("\n" + p.name + " has been defeated...");
            atkButt.setEnabled(false); //disable all battle buttons
            itemButt.setEnabled(false);
            skillButt.setEnabled(false);
            runButt.setEnabled(false);
        }
        if (wincheck(p,e) == 1) { //
            descText.append("\n" + e.name + " has been defeated!" + "\nYOU WIN!");
            nextButt.setVisible(true); //make next button appear to progress
            atkButt.setEnabled(false); //disable all battle buttons
            itemButt.setEnabled(false);
            skillButt.setEnabled(false);
            runButt.setEnabled(false);
            Player.inv.add(e.loot); //add loot from enemy to player inventory
        }
    }
    
    public void invAdd(Item i) {
        Player.inv.add(i);
        invchoice.addItem(i.name);
    }
    
    public void invRemove(Item i) {
        Player.inv.remove(i);
        invchoice.remove(i.name);
    }
    
    /**
     * Creates new form Menu1
     */
    public Menu1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invframe = new javax.swing.JFrame();
        invchoice = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        useButt = new javax.swing.JButton();
        scrPanel = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        atkButt = new javax.swing.JButton();
        skillButt = new javax.swing.JButton();
        itemButt = new javax.swing.JButton();
        runButt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enemText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        plaText = new javax.swing.JTextArea();
        nextButt = new javax.swing.JButton();

        invframe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        invframe.setLocation(new java.awt.Point(100, 200));
        invframe.setPreferredSize(new java.awt.Dimension(100, 146));
        invframe.setResizable(false);
        invframe.setSize(new java.awt.Dimension(500, 200));

        jLabel1.setText("Select the Item to use.");

        useButt.setText("Use");
        useButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invframeLayout = new javax.swing.GroupLayout(invframe.getContentPane());
        invframe.getContentPane().setLayout(invframeLayout);
        invframeLayout.setHorizontalGroup(
            invframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invframeLayout.createSequentialGroup()
                .addContainerGap(32283, Short.MAX_VALUE)
                .addComponent(invchoice, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(invframeLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(invframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useButt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        invframeLayout.setVerticalGroup(
            invframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invframeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invchoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useButt)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        descText.setEditable(false);
        descText.setColumns(20);
        descText.setRows(5);
        scrPanel.setViewportView(descText);

        atkButt.setText("Attack");
        atkButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atkButtActionPerformed(evt);
            }
        });

        skillButt.setText("Skill");

        itemButt.setText("Item");
        itemButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtActionPerformed(evt);
            }
        });

        runButt.setText("Run");
        runButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtActionPerformed(evt);
            }
        });

        enemText.setEditable(false);
        enemText.setColumns(20);
        enemText.setRows(5);
        jScrollPane1.setViewportView(enemText);

        plaText.setEditable(false);
        plaText.setColumns(20);
        plaText.setRows(5);
        jScrollPane2.setViewportView(plaText);

        nextButt.setText("Next >>");
        nextButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtActionPerformed(evt);
            }
        });
        nextButt.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nextButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atkButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(skillButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(runButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atkButt)
                    .addComponent(skillButt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButt)
                    .addComponent(itemButt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButt)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atkButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atkButtActionPerformed

        descText.setText(""); //clear text
        check(p1,e1);
        fight(p1,e1); //player attack
        if (wincheck(p1,e1) == 2) { //if enemy hasn't lost yet
            fight(e1,p1); //enemy turn, no algorithm so far, so only attacks
        }
        lcheck(p1,e1); 
    }//GEN-LAST:event_atkButtActionPerformed

    private void nextButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtActionPerformed

    private void itemButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtActionPerformed
        if (Player.inv.isEmpty()) { //check if inventory is empty, if it's empty command won't work
            descText.append("\nInventory is empty!");
        }
        
        else { //if inventory is not empty, reveal the inventory jFrame
            invframe.setEnabled(true);
            invframe.setVisible(true);
        }
    }//GEN-LAST:event_itemButtActionPerformed

    private void useButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useButtActionPerformed
        
        descText.append("\n" + p1.name + " used " + Player.inv.get(Player.inv.size()-1).name + "!");
        
        int choiceIndex = invchoice.getSelectedIndex(); //the chosen index is the same index in the inv
        Item.useItem(Player.inv.get(choiceIndex), p1, descText); //use selected item
        invRemove(Player.inv.get(choiceIndex)); //remove used item from inventory
        
        lcheck(p1,e1); 
        if (wincheck(p1,e1) == 2) { //if enemy hasn't lost yet
            fight(e1,p1); //enemy turn, no algorithm so far, so only attacks
        }
        lcheck(p1,e1); //lcheck also clears the choice1 list
    }//GEN-LAST:event_useButtActionPerformed

    private void runButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtActionPerformed
        // TODO add your handling code here:
        invAdd(ItemDatabase.pot_hp1); //JUST FOR NOW THIS BUTTON ADDS POTS CHEATTT
    }//GEN-LAST:event_runButtActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atkButt;
    private javax.swing.JTextArea descText;
    private javax.swing.JTextArea enemText;
    private java.awt.Choice invchoice;
    private javax.swing.JFrame invframe;
    private javax.swing.JButton itemButt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextButt;
    private javax.swing.JTextArea plaText;
    private javax.swing.JButton runButt;
    private javax.swing.JScrollPane scrPanel;
    private javax.swing.JButton skillButt;
    private javax.swing.JButton useButt;
    // End of variables declaration//GEN-END:variables
}
