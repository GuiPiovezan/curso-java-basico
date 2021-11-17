package packages.exerherancainterface.exer02;

public class Cubo extends Figura3D {

    private double aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * (this.aresta * this.aresta);
    }

    @Override
    public double calcularVolume() {
        return this.aresta * this.aresta * this.aresta;
    }
    
}
