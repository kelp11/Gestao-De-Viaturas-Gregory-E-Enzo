/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;

/**
 *
 * @author aluno
 */
public class Ocorrencia {

    private String identificadorOcorrencia;
    private String tipo;
    private String data;
    private String hora;
    private String local;
    private String descricao;
    private String status;
    private String prioridade;

    public Ocorrencia() {}

    public Ocorrencia(String identificadorOcorrencia, String tipo, String data,
                      String hora, String local, String descricao,
                      String status, String prioridade) {
        this.identificadorOcorrencia = identificadorOcorrencia;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
    }

    public String getIdentificadorOcorrencia() {
        return identificadorOcorrencia;
    }

    public void setIdentificadorOcorrencia(String identificadorOcorrencia) {
        this.identificadorOcorrencia = identificadorOcorrencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}