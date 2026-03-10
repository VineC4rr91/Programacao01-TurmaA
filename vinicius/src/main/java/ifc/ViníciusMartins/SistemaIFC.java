package ifc.ViníciusMartins;
/*
Feio por VineC4rr91.
*/
public class SistemaIFC {
     
    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante vinicius = new Estudante();
        Estudante joao = new Estudante();
        Estudante patricia = new Estudante();
        
        patricia.setNome("Patricia");
        camada.setNome("Patricia");
        vinicius.setNome("Patricia");
        joao.setNome("Patricia");
        
        System.out.println(camada.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(joao.getNome());
        System.out.println(joao.getNome());
    }
}
