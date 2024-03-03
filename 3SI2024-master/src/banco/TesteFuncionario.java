package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João Silva");
        funcionario.setDepartamento("RH");
        funcionario.setSalario(5000.0);
        funcionario.setDataEntrada("01/01/2020");
        funcionario.setRg("123456789");
        funcionario.setAtivo(true);
        funcionario.setSetor("Administrativo");
        funcionario.setDataNascimento("10/05/1985");

        funcionario.mostra(); // Imprime os detalhes do funcionário

        funcionario.bonifica(1000.0); // Bonificação de 1000.0 no salário
        funcionario.mostra(); // Imprime novamente após a bonificação

        funcionario.demite(); // Demissão do funcionário
        funcionario.mostra(); // Imprime após a demissão
    }
}
