
package courierhub;

public class CourierHub {

    public static void main(String[] args) {
            
       Splash sp = new Splash();
       sp.setVisible(true);              
       Login l = new Login();
       l.setVisible(false);
       
       try{
           for(int x=0;x<=100;x++)
           {
               Thread.sleep(110); 
               sp.jLabel2.setText(Integer.toString(x)+"%");
               sp.jProgressBar1.setValue(x);
               
            if(x==100){
            sp.setVisible(false);
            l.setVisible(true);
            }
           }       
       }catch (Exception e){       
       }       
    }   
}
