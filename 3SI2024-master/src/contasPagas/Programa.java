package contasPagas;

public class Programa {
    public static void main(String[] args) {
        // Instanciando dois objetos da classe Produto
        Produto produto1 = new Produto("Produto A", 50.0);
        Produto produto2 = new Produto("Produto B", 75.0);

        // Instanciando dois objetos da classe Cliente
        Cliente cliente1 = new Cliente("Cliente 1", "123.456.789-00");
        Cliente cliente2 = new Cliente("Cliente 2", "987.654.321-00");

        // Instanciando dois objetos da classe Conta
        Conta conta1 = new Conta(1, "01/03/2024", "05/03/2024", produto1, cliente1);
        Conta conta2 = new Conta(2, "01/03/2024", "07/03/2024", produto2, cliente2);

        // Utilizando o método visualizarConta para visualizar as duas contas
        conta1.visualizarConta();
        System.out.println(); // Adicionando uma linha em branco entre as contas
        conta2.visualizarConta();
    }
}
