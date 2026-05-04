/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;

/**
 *
 * @author aluno
 */
public class Bombeiro {

    private String identificadorBombeiro;
    private String nome;
    private String patente;
    private String matricula;
    private String contato;

    public Bombeiro() {}

    public Bombeiro(String identificadorBombeiro, String nome, String patente, String matricula, String contato) {
        this.identificadorBombeiro = identificadorBombeiro;
        this.nome = nome;
        this.patente = patente;
        this.matricula = matricula;
        this.contato = contato;
    }

    public String getIdentificadorBombeiro() {
        return identificadorBombeiro;
    }

    public void setIdentificadorBombeiro(String identificadorBombeiro) {
        this.identificadorBombeiro = identificadorBombeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}