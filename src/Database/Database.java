package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:banco.db";

        try {
            // Criação da conexão
            Connection connection = DriverManager.getConnection(url);

            // Criação de uma instrução SQL para criar a primeira tabela
            String sqlTabela1 = "CREATE TABLE IF NOT EXISTS produtos (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nome TEXT NOT NULL UNIQUE," +
            "marca TEXT NOT NULL," +
            "modelo TEXT NOT NULL," +
            "quantidade INTEGER NOT NULL," +
            "preco FLOAT NOT NULL," +
            "detalhes TEXT NOT NULL);";
            Statement statement = connection.createStatement();
            statement.execute(sqlTabela1);

            // Lembre-se de fechar os recursos
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
