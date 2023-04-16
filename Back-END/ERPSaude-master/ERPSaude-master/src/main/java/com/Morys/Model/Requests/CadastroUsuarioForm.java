package com.Morys.model.Requests;


public class CadastroUsuarioForm {

    private String email;
    private String login;
    private String senha;

    public CadastroUsuarioForm(String email, String login, String senha) {
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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



}
