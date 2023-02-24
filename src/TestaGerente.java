public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Lucas");
        gerente.setCpf("123.456.789-66");
        gerente.setSalario(7000.00);
        gerente.setSenha(1234);

        System.out.println("O nome do gerente é " + gerente.getNome());
        System.out.println("O cpf do gerente é " + gerente.getCpf());
        System.out.println("O salário do gerente é de R$" + gerente.getSalario());
        System.out.println(gerente.autentica(1234));
        System.out.println(gerente.getBonificacao());
    }
}
