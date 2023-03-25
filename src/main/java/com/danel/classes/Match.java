package com.danel.classes;

import com.danel.enums.ResultEnum;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Match {
    private Team team1;
    private Team team2;
    private int goalTeam1;
    private int goalTeam2;

    private final String fileName = "result.csv";
    private final Path filePath = Paths.get("src/main/java/com/danel/files/" + fileName);

    private CSVWriter writer;


    public Match(Team team1, int goalTeam1, Team team2, int goalTeam2) throws IOException {
        this.team1 = team1;
        this.goalTeam1 = goalTeam1;
        this.team2 = team2;
        this.goalTeam2 = goalTeam2;
        writer = (CSVWriter) new CSVWriterBuilder(new FileWriter(filePath.toFile()))
                .withSeparator(',')
                .build();
        createFile();
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getGoalTeam1() {
        return goalTeam1;
    }

    public void setGoalTeam1(int goalTeam1) {
        this.goalTeam1 = goalTeam1;
    }

    public int getGoalTeam2() {
        return goalTeam2;
    }

    public void setGoalTeam2(int goalTeam2) {
        this.goalTeam2 = goalTeam2;
    }

    // Creamos el archivo
    private void createFile() throws IOException {
        // Si el archivo no existe, se crea el archivo
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        // Escribimos las columnas en el archivo
        String[] header = "Equipo 1,Cant.Goles 1,Cant.Goles 2,Equipo 2".split(",");
        writer.writeNext(header);
        writer.flush();
    }

     // Agregamos el partido al archivo result
    public void addMatchToFile() throws IOException {
        // Escribimos los datos del partido al final del archivo
        try (BufferedWriter writerMatch = new BufferedWriter(new FileWriter(filePath.toFile(), true))) {
            String matchData = toString();
            writerMatch.write(matchData);
            writerMatch.newLine();
        }
    }

    @Override
    public String toString() {
        return (this.team1.getName() + "," + this.goalTeam1 + "," + this.team2.getName() + "," + this.goalTeam2);
    }

    public ResultEnum result (Team team){
        return ResultEnum.DRAW;
    }
}
