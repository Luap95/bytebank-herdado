public class Gerente extends Funcionario  implements Autenticavel {

    private SistemaAutenticacao autenticacao;
    public Gerente(){
        this.autenticacao = new SistemaAutenticacao();
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticacao.autentica(senha);
    }

    @Override
    public void setSenha(int senha){
        this.autenticacao.setSenha(senha);
    }
    public double getBonificacao(){
        return super.getSalario();
    }
}
