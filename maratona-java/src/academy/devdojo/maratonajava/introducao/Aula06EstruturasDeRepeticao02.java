package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000.
        // fiz usando while e deu certo também.
        for (int i = 0; i <=1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}