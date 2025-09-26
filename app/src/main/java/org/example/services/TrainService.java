package org.example.services;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.entities.Train;
import org.example.entities.User;

import com.fasterxml.jackson.core.type.TypeReference;

public class TrainService {
    private static final String TRAIN_LIST_PATH = "app/src/main/java/org/example/localDB/trains.json";
    private User user;
    public TrainService(User user) {
        this.user = user;
    }

    private List<Train> allTrains;
    ObjectMapper objectMapper = new ObjectMapper();

    private void loadAvailableRoutes() throws IOException {
        // Logic to load available routes between stations
        File trains = new File(TRAIN_LIST_PATH);
        allTrains = objectMapper.readValue(trains, new TypeReference<List<Train>>() {});
    }

    
}
