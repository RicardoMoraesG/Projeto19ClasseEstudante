/*
 *
 */
package modelo.principal;

/**
 *
 * @author aula 14/10/2019
 */
public class Projeto19ClasseEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Estudante(String nome, String RA, String celular)
       Estudante objEst1 = new Estudante("Jonathan", "11111", "11-1111-1111");
       Estudante objEst2 = new Estudante("Anderson", "22222", "22-2222-2222");
       Estudante objEst3 = new Estudante(   "Lucas", "33333", "33-3333-3333");
       
       objEst1.addDisciplinasNotas("POO", 6);
       objEst1.addDisciplinasNotas("Engenharia Software", 6);
       objEst1.addDisciplinasNotas("SO", 6);
       objEst1.addDisciplinasNotas("Estrutura de Dados", 6);
       objEst1.addDisciplinasNotas("Estatística", 6);
       
       objEst2.addDisciplinasNotas("POO", 6);
       objEst2.addDisciplinasNotas("Engenharia Software", 6);
       objEst2.addDisciplinasNotas("SO", 6);
       objEst2.addDisciplinasNotas("Estrutura de Dados", 6);
       objEst2.addDisciplinasNotas("Estatística", 6);
      
       objEst1.listarDisciplinasNotas();
       objEst2.listarDisciplinasNotas();
       
       System.out.println("Média Notas " + objEst1.getNome() + ": " + objEst1.calcularMediaNotas());
       System.out.println("Média Notas " + objEst2.getNome() + ": " + objEst2.calcularMediaNotas());
       
       objEst1.addEstudante(objEst1);
       objEst1.addEstudante(objEst2);
       objEst1.addEstudante(objEst3);
       objEst1.listarMonitorados();
      
       
    }
    
}