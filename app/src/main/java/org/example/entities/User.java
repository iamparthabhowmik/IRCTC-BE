package org.example.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class User {
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("hashed_password")
    private String hashedPassword;
    
    @JsonProperty("tickets_booked")
    private List<Ticket> ticketsBooked;
    
    @JsonProperty("user_id")
    private String userId;

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
