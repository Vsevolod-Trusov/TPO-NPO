package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection getConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MAILDB",
                "root", "qwerty");

       /* PreparedStatement lengthQuery = getConnection.prepareStatement("SELECT TEXT from MAILS where SENDER_ID = ?");
        lengthQuery.setInt(1, 1);

        ResultSet resultSet = lengthQuery.executeQuery();
        List<String> mails = new ArrayList<>();
        while (resultSet.next()) {
            String text = resultSet.getString("TEXT");
            mails.add(text);
            System.out.println(text);
        }
        System.out.println("Short maile: "+ mails.stream().min((s1, s2) -> s1.length() - s2.length()).get());
*/
        //--task2--
        /*PreparedStatement personsInfo = getConnection.prepareStatement("SELECT NAME, SURNAME, THIRDNAME, BIRTHDATE, count(*) COUNT from PERSONS join MAILS on PERSONS.ID = MAILS.SENDER_ID group by MAILS.SENDER_ID");

        ResultSet personsSet = personsInfo.executeQuery();
        List<Person> personsList = new ArrayList<>();
        while (personsSet.next()) {
            String name = personsSet.getString("NAME");
            String surname = personsSet.getString("SURNAME");
            String thirdname = personsSet.getString("THIRDNAME");
            Date birhdate = personsSet.getDate("BIRTHDATE");
            int mailsCount = personsSet.getInt("COUNT");
            Person getPerson = new Person(name, surname, thirdname, birhdate, mailsCount);
            personsList.add(getPerson);
            System.out.println(getPerson.toString());
        }*/

        //--task3--
        /*PreparedStatement anotherPersonsInfo = getConnection.prepareStatement("SELECT NAME, SURNAME, THIRDNAME, BIRTHDATE, count(*) COUNT from PERSONS join MAILS on PERSONS.ID = MAILS.SENDER_ID where MAILS.TOPIC = ? group by MAILS.SENDER_ID");
        anotherPersonsInfo.setString(1, "HELLO");
        ResultSet anotherPersonsSet = anotherPersonsInfo.executeQuery();
        List<Person> anotherPersonsList = new ArrayList<>();
        while (anotherPersonsSet.next()) {
            String name = anotherPersonsSet.getString("NAME");
            String surname = anotherPersonsSet.getString("SURNAME");
            String thirdname = anotherPersonsSet.getString("THIRDNAME");
            Date birhdate = anotherPersonsSet.getDate("BIRTHDATE");
            int mailsCount = anotherPersonsSet.getInt("COUNT");
            Person getPerson = new Person(name, surname, thirdname, birhdate, mailsCount);
            anotherPersonsList.add(getPerson);
            System.out.println(getPerson.toString());
        }*/
//--task4--
        /*PreparedStatement anotherPersonsInfo = getConnection.prepareStatement("SELECT NAME, SURNAME, THIRDNAME, BIRTHDATE, count(*) COUNT from PERSONS join MAILS on PERSONS.ID = MAILS.SENDER_ID where MAILS.TOPIC != ? group by MAILS.SENDER_ID");
        anotherPersonsInfo.setString(1, "HELLO");
        ResultSet anotherPersonsSet = anotherPersonsInfo.executeQuery();
        List<Person> anotherPersonsList = new ArrayList<>();
        while (anotherPersonsSet.next()) {
            String name = anotherPersonsSet.getString("NAME");
            String surname = anotherPersonsSet.getString("SURNAME");
            String thirdname = anotherPersonsSet.getString("THIRDNAME");
            Date birhdate = anotherPersonsSet.getDate("BIRTHDATE");
            int mailsCount = anotherPersonsSet.getInt("COUNT");
            Person getPerson = new Person(name, surname, thirdname, birhdate, mailsCount);
            anotherPersonsList.add(getPerson);
            System.out.println(getPerson.toString());
        }*/

        //--task5--
        PreparedStatement mailInfo = getConnection.prepareStatement("SELECT SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE from MAILS where RECEIVER = ?");
        mailInfo.setInt(1, 1);
        PreparedStatement insertMails = getConnection.prepareStatement("INSERT INTO MAILS (SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE) VALUES (?, ?, ?, ?, ?)");
        ResultSet mailSet = mailInfo.executeQuery();
        while (mailSet.next()) {
            int sender_id = mailSet.getInt("SENDER_ID");
            int receiver = mailSet.getInt("RECEIVER");
            String topic = mailSet.getString("TOPIC");
            Date senderDate = mailSet.getDate("SENDERDATE");
            String text =mailSet.getString("TEXT");
            Mail getMail = new Mail(sender_id, receiver, topic, text, senderDate);
            System.out.println(getMail.toString());
            insertMails.setInt(1, getMail.getSenderId());
            insertMails.setInt(2, getMail.getReceiverId());
            insertMails.setString(3, getMail.getTopic());
            insertMails.setString(4, getMail.getText());
            insertMails.setDate(5, (Date) getMail.getSendDate());
            System.out.println(insertMails.executeUpdate());
        }
    }
}

