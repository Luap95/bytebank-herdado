public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Lucas de Almeida Pereira");
        funcionario.setCpf("123.456.789-56");
        funcionario.setSalario(2840.25);

        System.out.println("O nome do funcionário é " + funcionario.getNome());
        System.out.println("Sua bonificação é de R$" + funcionario.getBonificacao());
    }
}
