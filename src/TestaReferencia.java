public class TestaReferencia {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Lucas");
        g.setSalario(7000.00);

        EditorVideo ed = new EditorVideo();
        ed.setNome("Rik");
        ed.setSalario(3400);

        Designer d = new Designer();
        d.setNome("Dio");
        d.setSalario(4000);

        ControleBonificacao cb = new ControleBonificacao();
        cb.registra(g);
        cb.registra(ed);
        cb.registra(d);

        System.out.println(cb.getSoma());

    }
}
