package figura;

/**
 * Programa que implementa una clase con métodos auxiliares para calcular el perímetro y el área.
 * 
 * @author Ismael Ramos Guisado
 * @author ismaaa7steam@gmail.com
 * @version 1.0
 */
public class Circulo {
    //Varibles privadas.
    private double centrox;
    private double centroy;
    private double radio;
    
    /**
     * Método vacío.
     */
    public Circulo(){
    }
       
    /**
     * Método para recoger los valores, dándole valor a las variables creadas anteriormente.
     * 
     * @param centrox es un double cuyo valor llega desde Main.java.
     * @param centroy es un double cuyo valor llega desde Main.java.
     * @param radio es un double cuyo valor llega desde Main.java.
     */
    public Circulo(double centrox, double centroy, double radio){
        this.centrox = centrox;
        this.centroy = centroy;
        this.radio = radio;
    }
    
    /**
     * Método para retornar el valor de la variable centrox.
     * 
     * @return devuelve el valor de centrox, el valor puede ser alterado por moverCirculo.
     */
    public double getCentrox(){
        return centrox;
    }
    
    /**
     * Método para establecer el valor de centrox.
     * 
     * @param centrox coge el valor y lo establece en la variable.
     */
    public void setCentrox(double centrox){
        this.centrox = centrox;
    }
    
    /**
     * Método para retornar el valor de la variable centroy.
     * 
     * @return devuelve el valor de centroy, el valor puede ser alterado por moverCirculo.
     */
    public double getCentroy(){
        return centroy;
    }
    
    /**
     * Método para establecer el valor de centroy.
     * 
     * @param centroy coge el valor y lo establece en la variable.
     */
    public void setCentroy(double centroy){
        this.centroy = centroy;
    }
    
    /**
     * Método para retornar el valor de la variable radio.
     * 
     * @return devuelve el valor de radio.
     */
    public double getRadio(){
        return radio;
    }
    
    /**
     * Método para establecer el valor de radio.
     * 
     * @param radio coge el valor y lo establece en la variable.
     */
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    /**
     * Con este método, retornamos una cadena de texto combinada con los valores de las variables.
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Circulo(" + "centrox=" + centrox + ", centroy=" + centroy + ", radio=" + radio + ')';
    }
    
    /**
     * Método que retorna el perímetro del círculo
     * 
     * @return devuelve el valor del perímetro.
     */
    public double perimetroCirculo(){
        return 2 * Math.PI * this.radio;
    }
    
    /**
     * Método que retorna el área del círculo
     * 
     * @return devuelve el valor del área.
     */
    public double areCirculo(){
        return Math.PI * Math.pow(this.radio,2);
    }
    
    /**
     * Método que cambia el valor de centrox y centroy según los parámetros que se establezcan.
     * 
     * @param deltax double que llega desde Main.java.
     * @param deltay double que llega desde Main.java.
     */
    public void moverCirculo(double deltax, double deltay){
        this.centrox = this.centrox + deltax;
        this.centroy = this.centroy + deltay;
    }
    
    /**
     * Método de la escala del círculo
     * 
     * @param s parámetro que usamos para multiplicarlo por el raio y hacerlo igual.
     */
    public void escalaCirculo(double s){
        this.radio = this.radio * s;
    }
}
