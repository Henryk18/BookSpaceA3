/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entregaa3.entrega01guideloginsemfuncionalidades;

/**
 *
 * @author 823135401
 */
public class Usuario {
    private String login, senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
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
