/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;

/**
 *
 * @author aluno
 */
public class Manutencao {

    private String identificadorManutencao;
    private String tipo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String horaInicio;
    private String horaFim;
    private double custo;

    public Manutencao() {}

    public Manutencao(String identificadorManutencao, String tipo, String descricao,
                      String dataInicio, String dataFim, String horaInicio,
                      String horaFim, double custo) {
        this.identificadorManutencao = identificadorManutencao;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.custo = custo;
    }

    public String getIdentificadorManutencao() {
        return identificadorManutencao;
    }

    public void setIdentificadorManutencao(String identificadorManutencao) {
        this.identificadorManutencao = identificadorManutencao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}