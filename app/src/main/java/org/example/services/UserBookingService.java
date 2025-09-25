package org.example.services;

import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.example.utils.UserServiceUtil;

public class UserBookingService {
    private static final String USER_FILE_PATH = "app/src/main/java/org/example/localDB/users.json";
    private User user;
    private List<User> usersList;
    private ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(USER_FILE_PATH);
        usersList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser(){
        Optional<User> foundUser = usersList.stream().filter(user1 -> {
            return user1.getUsername().equalsIgnoreCase(user.getUsername()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try {
            usersList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        } catch (IOException e) {
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException {
        File usersFile = new File(USER_FILE_PATH);
        objectMapper.writeValue(usersFile, usersList);
    }

    public void fetchBooking(){
        user.printBookedTickets();
    }

    public Boolean cancelBookedTickets(String ticketId){
        // 
        return Boolean.FALSE;
    }
}
