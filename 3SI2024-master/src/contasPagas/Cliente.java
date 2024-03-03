package contasPagas;

public class Cliente {
    private String nomeCliente;
    private String cpf;

    // Construtor
    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    // Métodos getter para nomeCliente e cpf
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }
}

