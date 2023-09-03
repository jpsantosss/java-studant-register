package cadastroestudante;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceEstudante {
    private Scanner scanner;
    private Controlador controlador;
    
    public InterfaceEstudante(){
    scanner = new Scanner(System.in);
    controlador = new Controlador();
    }
    
    /*-------------------------------------------------------*/
    
    private int obterOpcao(){
        System.out.println("----MENU----");
        System.out.println("1 - Incluir");
        System.out.println("2 - Localizar por matricula");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar");
        System.out.println("0 - Sair");
        System.out.print("Digite a opcao: ");
        return scanner.nextInt();
    }
    
    /*-------------------------------------------------------*/
    
    private void incluirEstudante(){
        String matricula;
        String nome;
        String email;
        String telefone;
        String endereco;
        
        System.out.println();
        System.out.println("----CADASTRO DE ALUNO----");
        
        System.out.print("Matricula: ");
        matricula = scanner.next();
        
        System.out.print("Nome: ");
        nome = scanner.next();
        
        System.out.print("Email: ");
        email = scanner.next();
        
        System.out.print("Telefone: ");
        telefone = scanner.next();
        
        System.out.print("Endereco: ");
        endereco = scanner.next();
        
        System.out.println();
        
        Estudante estudante = new Estudante(matricula, nome, email, telefone, endereco);
        controlador.incluir(estudante);
    }
    
    /*-------------------------------------------------------*/
    
    private void localizarEstudante(){
        
        System.out.print("Digite a matricula: ");
        String matricula = scanner.next();
        
        Estudante estudante = controlador.localizarEstudante(matricula);
        
        if (estudante != null){
            System.out.println();
            System.out.println("Estudante encontrado!");
            System.out.println("Nome: "+estudante.obterNome());
            System.out.println("Matricula: "+estudante.obterMatricula());
            System.out.println("Telefone: "+estudante.obterTelefone());
            System.out.println();
        }else{
            System.out.println("Estudante nao encontrado");
        }
    }
    
    /*-------------------------------------------------------*/
    
    private void excluirEstudante(){
        String matricula;
        
        System.out.print("Digite a matricula: ");
        matricula = scanner.next();
        
        Estudante estudante = controlador.localizarEstudante(matricula);
        
        if (estudante != null){
            controlador.excluirEstudante(estudante);
            System.out.println();
            System.out.println("O estudante de matricula "+matricula+" foi removido com sucesso!");
            System.out.println();
        }
    }
        
    /*-------------------------------------------------------*/
   private void listarEstudantes(){
        ArrayList<Estudante>estudantes = controlador.obterEstudantes();
        for(int i = 0; i < estudantes.size(); i++){
            Estudante estudante = estudantes.get(i);
            
            System.out.println();
            System.out.println("Matricula: "+estudante.obterMatricula());
            System.out.println("Nome: "+estudante.obterNome());
            System.out.println("Telefone: "+estudante.obterTelefone());
            System.out.println("Email: "+estudante.obterEmail());
            System.out.println("Endereco: "+estudante.obterEndereco());
            System.out.println();
        }
    }
    /*-------------------------------------------------------*/
    
    public void executar(){
        int opcao =0;
        do{
            opcao = obterOpcao();
            switch(opcao){
                case 1:
                    incluirEstudante();
                    break;
                case 2:
                    localizarEstudante();
                    break;
                case 3:
                    excluirEstudante();
                    break;
                case 4:
                    listarEstudantes();
                    break;
                
            }
        } while (opcao != 0);
    }
}
