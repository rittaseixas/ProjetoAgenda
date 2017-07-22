package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Classe responsável por iniciar uma conexão com o banco de dados
public class BDConnect {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String SERVER = "localhost";
    static final String USERNAME = "root";
    static final String SENHA = "";
    static final String DB = "agenda";
    static final String URL = "jdbc:mysql://" + SERVER + "/" + DB;
    static Connection connection = null;

    public static Connection getConnection() {
        //Método responsável por retornar a conexão com o banco
        if (connection == null) {
            try {
                //se a conexão for nula, cria uma nova conexão com o banco
                connection = DriverManager.getConnection(URL, USERNAME, SENHA);
            } catch (SQLException ex) {
                //Se a conexão não for bem sucedida, uma mensagem é mostrada ao usuário
                JOptionPane.showMessageDialog(null, "Erro ao estabelecer a conexão com o banco de dados");
            }
        }
        return connection;
    }
}
