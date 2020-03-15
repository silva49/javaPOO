package empleados.constantes;

public enum Mensajes {

    TITULO_MENU("Menú de opciones"),
    OPCION1("1. Calcular salario final"),
    OPCION2("2. Salir"),
    SALARIO_BASE("El salario base es : "),
    DESCUENTO_SALUD("El descuento de salud es : "),
    DESCUENTO_PENSION("El descuento de pension es : "),
    FINAL1("el salario final 1 es: "),
    FINAL2("el salario final 2 es: "),
    DEFINITIVO("\nEl salario a pagar es"),
    HORAS("Ingrese las horas trabajadas"),
    VALOR_HORA("Ingrese el valor de la hora");



    private  String mensaje;




    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
