/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoviaturas2;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String identificadorUsuario;
    private String login;
    private String senha;
    private String perfil;

    public Usuario() {}

    public Usuario(String identificadorUsuario, String login, String senha, String perfil) {
        this.identificadorUsuario = identificadorUsuario;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}