package packages.exerherancainterface.exer02;


public class Quadrado extends Figura2D {

    private int lado;
    private static final int AOQUADRADO = 2;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return Math.pow(this.lado, AOQUADRADO);
    }
    
}
