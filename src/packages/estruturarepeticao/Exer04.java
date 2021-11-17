package packages.estruturarepeticao;

public class Exer04 {
    public static void main(String[] args) {

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while(paisA <= paisB){
            paisA += ((paisA * 3) / 100);
            paisB += ((paisB * 15) / 100);
            anos++;
            System.out.println("paisA " + paisA + "\npaisB " + paisB + "\n");
        }

        System.out.println(anos + " anos para a população do país A ultrapassar ou se igualar à população do país B, com uma taxa de crescimento a 3% a.a");
    }
}
