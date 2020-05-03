package Tokens;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Token extends Thread{

private double N = Math.random()*100000000;
private int A=(int) N;
private JTextField txt;
private JLabel etiqueta;
boolean activo = false;
Sesion pr =new Sesion();

public Token(JTextField txto, JLabel et){
txt = txto;
etiqueta = et;

}

public int getA(){
return A;
}

public void run() {
pr.setLocationRelativeTo(null);
pr.setVisible(true);

activo = true;

do{
try{
   N = Math.random()*100000000;
   A=(int) N;
   txt.setText(String.valueOf(A));
   pr.idtoken_global = A;
   
   for(int i=20; i>=0; i--){
   etiqueta.setText(String.valueOf(i));
   sleep(1000);
   }
   
   N = Math.random()*100000000;
   A= (int) N;
   txt.setText(String.valueOf(A));
   pr.idtoken_global = A;
}catch (InterruptedException ex) {
    Logger.getLogger(Token.class.getName()).log(Level.SEVERE, null, ex);
}
}while (activo);

}


}
