package casa;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Imprimindo informações iniciais
        pessoa.imprimeInformacoes();

        // Fazendo alguns aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        // Imprimindo informações após alguns aniversários
        pessoa.imprimeInformacoes();
    }
}
