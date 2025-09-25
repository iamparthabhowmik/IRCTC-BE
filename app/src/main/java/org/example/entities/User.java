package org.example.entities;
import java.util.List;
public class User {
    private String name;
    private String userId;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;

    public User(String name, String userId, String password, String hashedPassword, List<Ticket> ticketsBooked) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
    }

    public User(){}

    public String getUsername() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void printBookedTickets() {
        for (Ticket ticket : ticketsBooked) {
            System.out.println(ticket.getTicketInfo());
        }
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setTicketBooked(List<Ticket> tickets){
        this.ticketsBooked = tickets;
    }
}
