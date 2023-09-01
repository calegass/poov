import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("a)");
        //a) Criar um vetor de tamanho 20 de inteiros
        ArrayList<Integer> vet = new ArrayList<>(20);

        //int[] vet = new int[20];

        System.out.println("b)");
        //b) Preencher os 10 primeiros valores do vetor com números digitados pelo usuário via teclado
        while (vet.size() < 10) {
            vet.add(s.nextInt());
        }
        //System.out.println(vet.size());

        System.out.println("c)");
        //c) Preencher os 10 últimos valores do vetor com números aleatórios entre 1 e 100
        while (vet.size() < 20) {
            vet.add(r.nextInt(100) + 1);
            //vet.add(s.nextInt());
        }
        //System.out.println(vet.size());

        System.out.println("d)");
        //d) Mostrar o vetor inteiro na tela
        for (int i: vet) {
            System.out.print(i + " ");
        }

        System.out.println("\ne)");
        //e) Mostrar o vetor de trás para frente na tela
        Collections.reverse(vet);
        for (int i: vet) {
            System.out.print(i + " ");
        }
        Collections.reverse(vet);

        System.out.println("\nf)");
        //f) Calcular e mostrar a média dos valores do vetor
        double media = 0;
        for (int i: vet) {
            media += i;
        }
        media /= vet.size();
        System.out.println(media);

        System.out.println("g)");
        //g) Encontrar e mostrar o maior valor e o menor valor do vetor
        int maior = vet.get(0), menor = vet.get(0);
        for (int i: vet) {
            if (maior < i) maior = i;
            if (menor > i) menor = i;
        }
        System.out.println(maior + " " + menor);

        System.out.println("h)");
        //h) Mostrar os valores das posições pares do vetor
        for (int i = 0; i < vet.size(); i++) {
            if (i%2 == 0) System.out.print(vet.get(i) + " ");
        }

        System.out.println("\ni)");
        //i) Mostrar os valores das posições ímpares do vetor
        for (int i = 0; i < vet.size(); i++) {
            if (i%2 != 0) System.out.print(vet.get(i) + " ");
        }

        System.out.println("\nj)");
        //j) Mostrar os valores pares do vetor
        for (int i: vet) {
            if (i%2 == 0) System.out.print(i + " ");
        }

        System.out.println("\nk)");
        //k) Mostrar os valores ímpares do vetor
        for (int i: vet) {
            if (i%2 != 0) System.out.print(i + " ");
        }

        System.out.println("\nl)");
        //l)Verificar se há elementos repetidos no vetor e exibir uma mensagem em caso afirmativo
        boolean existe_repetido = false;
        for (int i = 0; i < vet.size() && !existe_repetido; i++) {
            for (int j = i + 1; j < vet.size(); j++) {
                if (Objects.equals(vet.get(i), vet.get(j))) {
                    existe_repetido = true;
                    break;
                }
            }
        }
        if (existe_repetido) System.out.println("Repetido");
        else System.out.println("Não repetido");

        System.out.println("m)");
        //m) Solicitar um valor ao usuário e verificar se esse valor existe no vetor. Se existir exibir a posição em que
        //ele está, senão exibir uma mensagem de valor não encontrado
        int buscar = s.nextInt(), existe_buscar = vet.indexOf(buscar);
        if (existe_buscar != -1) System.out.println(existe_buscar);
        else System.out.println("Não encontrado!");

        System.out.println("n)");
        //n) Verificar se o vetor está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos
        //do vetor
        boolean crescente = true;
        for (int i = 0; i < vet.size(); i++) {
            if (vet.get(i) > vet.get(i + 1)) {
                crescente = false;
                break;
            }
        }
        if (crescente) System.out.println("Crescente");
        else System.out.println("Não ordenado");
    }
}