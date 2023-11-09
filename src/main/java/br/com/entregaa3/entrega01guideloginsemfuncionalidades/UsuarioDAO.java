/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entregaa3.entrega01guideloginsemfuncionalidades;
import java.util.Properties;
/**
 *
 * @author 823135401
 */
public class UsuarioDAO {
    private Properties properties;
    
    public UsuarioDAO(Properties properties){
        this.properties = properties;
    }
    
    public Usuário existe(Usuário u) throws Exception{
        //1. Construir uma fábrica de conexões
        var fabrica = new ConnectionFactory(properties);
        //2. Estabelecer uma conexão com o banco
        try(var conexao = fabrica.conectar()){
            //3. Especificar o comando SQL
            String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
            try(var ps = conexao.prepareStatement(sql)){
                //4. Substituir os eventuais placeholders
                ps.setString(1, u.getLogin());
                ps.setString(2, u.getSenha());
                //5. Executar o comando
                try(var rs = ps.executeQuery()){
                    //6. Mover o cursor, verificando se o usuário existe
                    //7. Devolver um objeto usuário, null
                    return rs.next() ? u : null;
                }
            }
            
        }
    }    
}
