public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Autenticavel cliente = new Cliente();
        cliente.setSenha(1111);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(adm);
        si.autentica(cliente);
    }
}
