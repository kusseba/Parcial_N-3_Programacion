/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recup_parcial_03_sebastian_kus;

/**
 *
 * @author kusse
 */
public class Recup_Parcial_03_Sebastian_Kus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(new Runnable(){
         public void run() {
             FrmRecuperatorio frm = new FrmRecuperatorio();
             frm.setVisible(true);
         } 
      });
            
       
    }
    
}
