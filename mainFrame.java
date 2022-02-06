/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import javax.swing.JFrame;

/**
 *
 * @author Amcِ
 */
public class mainFrame extends JFrame{
     
   
    mainFrame(){
           //Create instance of gamePanel class by the short way !
         this.add(new gamePanel());
         this.setTitle("Snake");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.pack();
         this.setVisible(true);
         this.setLocationRelativeTo(null);
         
    }
    
}
