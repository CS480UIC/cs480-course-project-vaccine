package init.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user.domain.User;

import java.sql.ResultSet;

public class InitDao {
    
    
    public void initDB()  {
    	String MySQL_user = "root"; //TODO change user
    	
    	/**
    	 * password of your username to connect to the database
    	 */
    	String MySQL_password = "111"; //TODO change password
        Statement statement;
        PreparedStatement preparedStatement;
        String sqlstmt;
        //ResultSet resultSet;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connect = DriverManager
                      .getConnection("jdbc:mysql://localhost:3306/vaccine", MySQL_user, MySQL_password);
            
        statement = connect.createStatement();
        statement.executeUpdate("DROP TABLE IF EXISTS test");
        statement.executeUpdate("DROP TABLE IF EXISTS vaccine_order");
        statement.executeUpdate("DROP TABLE IF EXISTS person");
        statement.executeUpdate("DROP TABLE IF EXISTS zip_code");
        statement.executeUpdate("DROP TABLE IF EXISTS state");
        statement.executeUpdate("DROP TABLE IF EXISTS country");
        statement.executeUpdate("DROP TABLE IF EXISTS vaccine");

        
        statement = connect.createStatement();
        sqlstmt = "CREATE TABLE vaccine (\r\n"
                + "vaccine_name VARCHAR(20), \r\n"
                + "temperature float NOT NULL,\r\n"
                + "vaccine_quantity int NOT NULL,\r\n"
                + "Cost Double NOT NULL, \r\n"
                + "PRIMARY KEY (vaccine_name)\r\n"
                + ")";
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into vaccine (vaccine_name, temperature, vaccine_quantity, cost) value (\"Covid_19\", 4, 5000, 1000)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine (vaccine_name, temperature, vaccine_quantity, cost) value (\"Malaria\", 15, 2000, 1234)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine (vaccine_name, temperature, vaccine_quantity, cost) value (\"Measles\", -8, 439478, 3737)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine (vaccine_name, temperature, vaccine_quantity, cost) value (\"Hepatitis_A\", -20, 1999, 999)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine (vaccine_name, temperature, vaccine_quantity, cost) value (\"Mumps\", -2, 292929, 100)");
        preparedStatement.executeUpdate();
        
        
        statement = connect.createStatement();        
        sqlstmt = "CREATE TABLE country (\r\n"
                + "country_id Smallint NOT NULL, \r\n"
                + "vaccine_name VARCHAR(20) ,\r\n"
                + "country_name VARCHAR(50) NOT NULL, \r\n"
                + "population INTEGER NOT NULL, \r\n"
                + "cost INTEGER NOT NULL, \r\n"
                + "percentage_vaccinated float NOT NULL, \r\n"
                + "PRIMARY KEY (country_id, vaccine_name),\r\n"
                + "foreign key (vaccine_name) references vaccine(vaccine_name) \r\n"
                + "on delete cascade on update cascade \r\n"
                + ")";
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into country (country_id, vaccine_name, country_name, population, cost, percentage_vaccinated) value (12, \"Covid_19\", \"India\", 1382000, 1234, 88)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
        		.prepareStatement("insert into country (country_id, vaccine_name, country_name, population, cost, percentage_vaccinated) value (23, \"Malaria\", \"USA\", 9292922, 2344, 45)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
        		.prepareStatement("insert into country (country_id, vaccine_name, country_name, population, cost, percentage_vaccinated) value (45, \"Hepatitis_A\", \"China\", 453029, 350, 90)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
        		.prepareStatement("insert into country (country_id, vaccine_name, country_name, population, cost, percentage_vaccinated) value (77, \"Covid_19\", \"NZ\", 8923982, 98, 99)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
        		.prepareStatement("insert into country (country_id, vaccine_name, country_name, population, cost, percentage_vaccinated) value (4, \"Measles\", \"Australia\", 898989, 34, 67)");
        preparedStatement.executeUpdate();
        
        
        
        statement = connect.createStatement();  
        sqlstmt = "CREATE TABLE vaccine_order (\r\n"
                + "order_id mediumint, \r\n"
                + "vaccine_name VARCHAR(20),\r\n"
                + "country_id smallint,\r\n"
                + "quantity Integer not null,\r\n"
                + "order_date date not null,\r\n"
                + "Primary key(order_id, vaccine_name), \r\n"
                + "foreign key (country_id, vaccine_name) references country(country_id, vaccine_name) on delete cascade on update cascade,\r\n"
                + "foreign key (vaccine_name) references vaccine(vaccine_name) on delete cascade on update cascade\r\n"
                + ")";
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into vaccine_order value (\"123\", \"Covid_19\", 12, 200,	\"2020-09-20\")");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine_order value (\"122\", \"Malaria\", 23, 1000,	\"2010-08-10\")");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine_order value (\"999\", \"Hepatitis_A\", 45, 200,	\"2020-01-22\")");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine_order value (\"989\", \"Measles\", 4, 92,	\"2017-04-15\")");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into vaccine_order value (\"9987\", \"Covid_19\", 77, 930,	\"2020-09-20\")");
        preparedStatement.executeUpdate();
        
        
        statement = connect.createStatement();        
        sqlstmt = "CREATE TABLE state (\r\n"
                + "state_id smallint not null, \r\n"
                + "vaccine_name varchar(50),\r\n"
                + "country_id smallint, \r\n"
                + "state_name varchar(50),\r\n"
                + "population bigint not null,\r\n"
                + "percentage float4,\r\n"
                + "PRIMARY KEY(state_id,vaccine_name), \r\n"
                + "foreign key (country_id, vaccine_name) \r\n"
                + "references country(country_id,vaccine_name) \r\n"
                + "on delete cascade on update cascade \r\n"
                + ")";
        
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into state value (1, \"Covid_19\", 12, \"Jharkhand\",	15640321, 16.32)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into state value (2, \"Malaria\",	23,	\"Illinois\", 63516544,	48.91)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into state value (2, \"Hepatitis_A\",	45, \"Guangdong\", 1651321,	97.15)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into state value (3,	\"Measles\", 4,	\"Victoria\", 654987351, 56.15)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into state value (7, \"Covid_19\", 77, \"Auckland\", 9846516,	34.25)");
        preparedStatement.executeUpdate();
        
        statement = connect.createStatement();        
        sqlstmt = "CREATE TABLE zip_code (\r\n"
                + "zip_code mediumint, \r\n"
                + "vaccine_name varchar(50), \r\n"
                + "state_id smallint not null,  \r\n"
                + "percentage float4 not null, \r\n"
                + "num_vaccination_center smallint not null, \r\n"
                + "PRIMARY KEY(zip_code,vaccine_name), \r\n"
                + "foreign key (state_id,vaccine_name) \r\n"
                + "references state(state_id,vaccine_name) \r\n"
                + "on delete cascade on update cascade \r\n"
                + ")";
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into zip_code value (60607, \"Covid_19\",	1,	56.19,	31)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into zip_code value (60607, \"Measles\", 3, 37.45, 19)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into zip_code value (10101, \"Covid_19\", 7, 15.79, 64)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into zip_code value (10101, \"Malaria\", 2, 98.15, 64)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into zip_code value (90947, \"Hepatitis_A\", 2, 97.45, 31)");
        preparedStatement.executeUpdate();
        
        
        statement = connect.createStatement();        
        sqlstmt = "CREATE TABLE person (\r\n"
                + "person_id varchar(50),\r\n"
                + "vaccine_name varchar(50), \r\n"
                + "person_zip_code mediumint not null,  \r\n"
                + "person_name varchar(50),\r\n"
                + "person_age smallint,\r\n"
                + "vaccine_received boolean, \r\n"
                + "PRIMARY KEY(person_id,vaccine_name),\r\n"
                + "foreign key (person_zip_code,vaccine_name)\r\n"
                + "references zip_code(zip_code,vaccine_name)\r\n"
                + "on delete cascade on update cascade\r\n"
                + ")";
        statement.executeUpdate(sqlstmt);
        
        preparedStatement = connect
                .prepareStatement("insert into person value (123456789,	\"Covid_19\", 60607, \"Nobel priset\", 56, 0)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into person value (123456789, \"Measles\", 60607,	\"Nobel priset\", 56, 1)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into person value (123456780, \"Covid_19\", 10101, \"Nobel priset\", 56, 1)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into person value (234567891,	\"Malaria\", 10101,	\"Alan Turing\", 34, 0)");
        preparedStatement.executeUpdate();
        preparedStatement = connect
                .prepareStatement("insert into person value (234567891,	\"Hepatitis_A\", 90947,	\"Alan Turing\", 34, 1)");
        preparedStatement.executeUpdate();
        
        
        } catch(SQLException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        
}
