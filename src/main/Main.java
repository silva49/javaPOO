package main;



import empleados.Descuentos;

import static empleados.constantes.Mensajes.*;
import static empleados.constantes.Valores.IMPUESTO_PENSION;
import static empleados.constantes.Valores.IMPUESTO_SALUD;
import static empleados.constantes.Valores.OTRO_DESCUENTO;
import static empleados.constantes.Valores.OTRO_AUMENTO;
import static empleados.constantes.Valores.MIILLON;



import javax.swing.*;


public class Main {

  public static  void main (String[] args){


      Descuentos descuentos = new Descuentos();

      String opcion = JOptionPane.showInputDialog(null,
               TITULO_MENU.getMensaje()+"\n" +
                       OPCION1.getMensaje() +"\n " +
                        OPCION2.getMensaje());




      switch (opcion) {
          case "1":

              String horasTrabajadas = JOptionPane.showInputDialog(null, HORAS.getMensaje());
              double horas=Double.parseDouble(horasTrabajadas);

              String valorHora= JOptionPane.showInputDialog(null,VALOR_HORA.getMensaje());
              double valor= Double.parseDouble(valorHora);

              descuentos.setHorasTrabajadas(horas);
              descuentos.setValorHora(valor);

             double salud = descuentos.impuesto(IMPUESTO_SALUD);

             double pension = descuentos.impuesto(IMPUESTO_PENSION);

              JOptionPane.showMessageDialog(null,SALARIO_BASE.getMensaje()+ "" + descuentos.calcularSalarioBase());
              JOptionPane.showMessageDialog(null,DESCUENTO_SALUD.getMensaje() + salud);
              JOptionPane.showMessageDialog(null,DESCUENTO_PENSION.getMensaje()  + pension);
              JOptionPane.showMessageDialog(null, FINAL1.getMensaje() +descuentos.salarioFinal(salud+pension ) );
              JOptionPane.showMessageDialog(null, FINAL2.getMensaje() +descuentos.salarioFinal(salud,pension )
              + DEFINITIVO.getMensaje() +((descuentos.salarioFinal(salud,pension)>MIILLON)? descuentos.salarioDefinitivo(salud,pension,OTRO_DESCUENTO): descuentos.salarioDefinitivo(salud+ pension,OTRO_AUMENTO)));
              break;
          case "2":


              break;

              default:
                 JOptionPane.showMessageDialog(null,"Opcion inexistente");
                  break;

      }
  }


}
