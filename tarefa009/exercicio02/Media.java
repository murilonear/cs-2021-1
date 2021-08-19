package exercicio02;

public class Media {
    public static void main(String[] args) {
        int valorA, valorB, soma, media;
        valorA = (8 + 9 + 7)/3;
        valorB = (4 + 5 + 6)/3;
        soma = valorA + valorB;
        media = valorA + valorB/2;
        System.out.println("A média aritmética dos números 8, 9 e 7 é: "+valorA);
        System.out.println("A média dos números 4,5 e 6 é: "+valorB);
        System.out.println("A soma das duas médias é de: "+soma);
        System.out.println("A média das médias é de: "+media);
    }
}
