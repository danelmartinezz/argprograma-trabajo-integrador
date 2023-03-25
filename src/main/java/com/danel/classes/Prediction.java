package com.danel.classes;

import com.danel.enums.ResultEnum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Prediction {
    private Match match;
    private Team team;
    private ResultEnum resultEnum;

    public Prediction(Match match, Team team, ResultEnum resultEnum) throws IOException {
        createFile();
        this.match = match;
        this.team = team;
        this.resultEnum = resultEnum;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }

    public int points() {
        return 1;
    }

    // Creamos el archivo
    private void createFile() throws IOException {
        String fileName = "prediction.csv";
        Path filePath = Paths.get("src/main/java/com/danel/files/" + fileName);
        // Si el archivo no existe, se crea el archivo
        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

    }

}
