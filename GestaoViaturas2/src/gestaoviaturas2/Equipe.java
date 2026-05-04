/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;

/**
 *
 * @author aluno
 */
import gestaoviaturas2.Bombeiro;
import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String identificadorEquipe;
    private List<Bombeiro> listaBombeiros;

    public Equipe() {
        listaBombeiros = new ArrayList<>();
    }

    public Equipe(String identificadorEquipe) {
        this.identificadorEquipe = identificadorEquipe;
        this.listaBombeiros = new ArrayList<>();
    }

    public String getIdentificadorEquipe() {
        return identificadorEquipe;
    }

    public void setIdentificadorEquipe(String identificadorEquipe) {
        this.identificadorEquipe = identificadorEquipe;
    }

    public List<Bombeiro> getListaBombeiros() {
        return listaBombeiros;
    }

    public void setListaBombeiros(List<Bombeiro> listaBombeiros) {
        this.listaBombeiros = listaBombeiros;
    }

    public void adicionarBombeiro(Bombeiro bombeiro) {
        listaBombeiros.add(bombeiro);
    }
}