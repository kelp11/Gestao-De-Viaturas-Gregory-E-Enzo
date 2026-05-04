/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */

import java.util.List;
import java.util.ArrayList;

public class Viatura {

    private String identificadorViatura;
    private String tipo;
    private String prefixo;
    private String placa;
    private String modelo;
    private int ano;
    private String status;
    private double quilometragem;
    private String localizacao;

    private Usuario usuario;
    private List<Manutencao> manutencoes;
    private List<Ocorrencia> ocorrencias;

    public Viatura() {
        manutencoes = new ArrayList<>();
        ocorrencias = new ArrayList<>();
    }

    public Viatura(String identificadorViatura, String tipo, String prefixo, String placa,
                   String modelo, int ano, String status, double quilometragem, String localizacao) {
        this();
        this.identificadorViatura = identificadorViatura;
        this.tipo = tipo;
        this.prefixo = prefixo;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.status = status;
        this.quilometragem = quilometragem;
        this.localizacao = localizacao;
    }

    public String getIdentificadorViatura() {
        return identificadorViatura;
    }

    public void setIdentificadorViatura(String identificadorViatura) {
        this.identificadorViatura = identificadorViatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(List<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
}