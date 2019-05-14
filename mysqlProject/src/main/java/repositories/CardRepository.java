package repositories;

import connectivity.DatabaseConnection;
import models.Card;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CardRepository {
    private DatabaseConnection connection =
            DatabaseConnection.getInstance();

    public void saveCard(Card card) {
        try {
            PreparedStatement statement = connection.getConnection()
                    .prepareStatement("INSERT INTO card VALUES (NULL,?,?)");

            statement.setString(1, card.getOwner());
            statement.setDouble(2, card.getBalance());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
