package edu.home;

import edu.home.persistence.migration.MigrationStrategy;
import edu.home.ui.MainMenu;

import java.sql.SQLException;

import static edu.home.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();

    }
}