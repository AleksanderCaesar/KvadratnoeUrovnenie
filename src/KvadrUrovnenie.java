import javax.swing.*;
import static java.lang.Math.*; 
import static java.lang.Integer.parseInt;
/**
 *
 * @author Алекс
 */
public class KvadrUrovnenie {

    public static void main(String[] args) {
       int a,b,c;
       double x1,x2,d;
       a=parseInt(JOptionPane.showInputDialog("Введите число a:"));
       b=parseInt(JOptionPane.showInputDialog("Введите число b:"));
       c=parseInt(JOptionPane.showInputDialog("Введите число c:"));
       d=(b*b)-(4*a*c);
      // System.out.println(d);
       if(d==0){ 
           x1=(-b)/2*a;
           JOptionPane.showMessageDialog(null,"Уровнение имеет один корень: "+x1);}
            if(d>0) {
               x1=(-b+sqrt(d))/(2*a);
               x2=(-b-sqrt(d))/(2*a);
               JOptionPane.showMessageDialog(null,"Уровнение имеет два корня: "+x1+" и "+x2);
              }    
        else if(d<0) JOptionPane.showMessageDialog(null,"Уровнение не имеет корней" ); 
    } 
}

