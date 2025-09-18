
public class produto{
    String nome;
    double valor;
    int quantidade;
    
    public void exibirDados(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor do produto: " + valor);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
    public double calcularValorTotal(){
        return valor * quantidade;
    }
    public void alterarQuantidade(int qtd){
        
        this.quantidade = qtd;
        if(qtd < 0){
            System.out.println("Quantidade inválida. A quantidade não pode ser negativa.");
            this.quantidade = 0;
        }

    }
}