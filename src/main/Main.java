package main;

import figura.Circulo;

/**
 * Programa principal que usa los métodos auxiliares para calcular el area y el perímetro de un círculo respecto
 * a los valores que le damos en las variables. Además de usar otro método para cambiar el centro de x y de y.
 * 
 * @author Ismael Ramos Guisado
 * @author ismael.ramos@campusfp.es
 * @version 1.1
 */
public class Main {

    /**
     * Punto de entrada único al proyecto.
     * <br>
     * Utiliza varios métodos:
     * <ul>
     *      <li style="color:blue">Utiliza método calcular área</li>
     *      <li style="color:blue">Utiliza método calcular perímetro</li>
     *      <li style="color:blue">Utiliza método mover círculo, para ver el nuevo centro x y centro y.</li>
     * </ul>
     * <br>
     * <br>
     * Su función es mostrar por pantalla todos los resultados de los cálculos.
     * @param args arreglo de tipo String
     */
    public static void main(String[] args) {
        double centrox = 2;
        double centroy = 2;
        double radio = 6;
        
        Circulo c1 = new Circulo(centrox,centroy,radio);
        System.out.println("Área del circulo = " + c1.areCirculo());
        System.out.println("Perímetro del circulo  = " + c1.perimetroCirculo());
        c1.moverCirculo(10, 10);
        System.out.println("Centro x nuevo = " + c1.getCentrox());
        System.out.println("Centro y nuevo = " + c1.getCentroy());
        System.out.println(c1.toString());
    }
    
}
