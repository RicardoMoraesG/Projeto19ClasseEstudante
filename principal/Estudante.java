package modelo.principal;

import java.util.ArrayList;

/**
 *
 * @author aula 14/10/2019
 */
public class Estudante {
    //ATRIBUTOS
    private String nome;
    private String RA;
    private String celular;
    
    
    /**
     * utiliza um ArrayList como atributo
     */
    private ArrayList<String> disciplinas = new ArrayList<>();
    private ArrayList<Integer> notas = new ArrayList<>();
    private ArrayList<Estudante> monitor = new ArrayList<>();
    
    public Estudante(String nome, String RA, String celular) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
    }
        public Estudante() {
    }
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    //MÉTODOS ESPECIAIS
    
    /**
     * Adiciona os parametros em cada lista
     * recebem do objeto instanciado no programa principal:
     * @param disciplina 
     * @param nota 
     */
    public void addDisciplinasNotas(String disciplina, int nota){
        disciplinas.add(disciplina);
        notas.add(nota);
    }
    
    /**
     * adiciona os objetos do tipo Estudante instanciados no programa principal
     * na lista 'monitor'.
     * @param obj 
     */
    public void addEstudante(Estudante obj) {
        monitor.add(obj);
    }
    
    /**
     * mostra a lista de notas por disciplina
     */
    public void listarDisciplinasNotas(){
        int n = disciplinas.size();
        int i;
        for (i = 0; i < n; i++){
            System.out.println("Disciplina: " + disciplinas.get(i) + " Nota: " + notas.get(i) );
        }
    }
    
    /**
     * percorre os indices da ArrayList monitor apresentando seus valores.
     */
    public void listarMonitorados() {
        int n = monitor.size();
        int i;
        System.out.println("===LISTA DE ALUNOS MONITORADOS===");
        for (i = 0; i < n; i++) {
            System.out.println("Aluno: " + monitor.get(i).getNome());
        }
        System.out.println("=================================");
    }
    
    /**
     * calcula a media de todas as notas
     * @return media
     */
    public int calcularMediaNotas(){
        int media = 0;
        int totDisc = disciplinas.size();
        for(int i = 0; i < totDisc; i++){
            media += notas.get(i);
        }
        int totNotas = notas.size();
        media = media / totNotas;
        return media;
    }
    
}