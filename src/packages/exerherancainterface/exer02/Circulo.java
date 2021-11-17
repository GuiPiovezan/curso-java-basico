package packages.exerherancainterface.exer02;
import java.lang.Math;

public class Circulo extends Figura2D {

    private double raio;
    private final int QUADRADO = 2;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, QUADRADO) * Math.PI;
    }
    
}
