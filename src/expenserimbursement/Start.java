/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenserimbursement;

/**
 *
 * @author Gajendra
 */
public class Start {
    public static void main(String[] arg) {
        int i;
        StartApp s= new StartApp();
        s.setVisible(true);
        Home h=new Home();
        try{
            for(i=0;i<=245;i++)
            {
              Thread.sleep(30);
            }
                if(i>245){
                    s.setVisible(false);
                    h.setVisible(true);
                }
        }catch(InterruptedException e){
    }
}
}
