package cadastroestudante;

import java.util.ArrayList;

public class Controlador {
    private ArrayList <Estudante> estudantes;
    
    public Controlador (){
        estudantes = new ArrayList<Estudante>();
    }
    
    public void incluir(Estudante estudante){
        estudantes.add(estudante);
    }
    
    public void excluir(Estudante estudante){
        estudantes.remove(estudante);
    }
    
    public Estudante localizarEstudante(String matricula){
        Estudante estudanteLocalizado = null;
        
        for (int i = 0; i < estudantes.size(); i++){
            Estudante estudanteBusca = estudantes.get(i);
            if (estudanteBusca.obterMatricula().equals(matricula)){
                estudanteLocalizado = estudanteBusca;
                break;
            }
        }
        return estudanteLocalizado;
    }
    
    public void excluirEstudante (Estudante estudante){
        estudantes.remove(estudante);
    }
    
    public ArrayList<Estudante> obterEstudantes(){
        return estudantes;
    }
}
