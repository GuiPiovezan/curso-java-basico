package packages.exerherancainterface.exer02;

import static java.lang.System.out;

public class Teste {

   public static void main(String[] args) {
    

    Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");
        
        Circulo f2 = new Circulo();
        f2.setRaio(2);
        f2.setNome("Circulo");
        
        Triangulo f3 = new Triangulo();
        f3.setAltura(2);
        f3.setBase(3);
        f3.setNome("Triângulo");
        
        Cubo f4 = new Cubo();
        f4.setAresta(3);
        f4.setNome("Cubo");
        
        Cilindro f5 = new Cilindro();
        f5.setAltura(3);
        f5.setRaio(2);
        f5.setNome("Cilindro");
        
        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumPoliBase(4);
        f6.setBase(f1);
        f6.setNome("Piramide");

        FigurasGeometricas[] figuras = new FigurasGeometricas[6]; 

        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;

        for (FigurasGeometricas figura : figuras) {
            out.println("*--------------*");
            out.println(figura.getNome());

            if(figura instanceof Figura2D)
            {
                Figura2D figura2d = (Figura2D) figura;
                out.println(figura2d.calcularArea());
            }

            if(figura instanceof Figura3D){
                Figura3D figura3d = (Figura3D) figura;
                out.println("Área: " + (figura3d.calcularArea()));
            }
        }



   }
}
