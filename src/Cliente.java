public class Cliente implements Autenticavel{

    private SistemaAutenticacao autenticacao;
    @Override
    public boolean autentica(int senha) {
        return this.autenticacao.autentica(senha);
    }

    @Override
    public void setSenha(int senha){
        this.autenticacao.setSenha(senha);
    }
}
