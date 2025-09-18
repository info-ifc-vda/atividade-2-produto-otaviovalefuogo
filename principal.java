import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        produto p1 = new produto();
        System.out.println("Digite o nome do produto:");
        p1.nome = T.nextLine();
        System.out.println("Digite o valor do produto:");
        p1.valor = T.nextDouble();
        System.out.println("Digite a quantidade em estoque:");
        p1.quantidade = T.nextInt();
        p1.exibirDados();
        System.out.println("Valor total em estoque: " + p1.calcularValorTotal());
        System.out.println("Digite a quantidade que deseja alterar:(positiva para adicionar, negativa para remover)");
        int x = T.nextInt();
        p1.alterarQuantidade(x);
        p1.exibirDados();
        System.out.println("Valor total em estoque atualizado: " + p1.calcularValorTotal());
        T.close();
    }
    

    
}

