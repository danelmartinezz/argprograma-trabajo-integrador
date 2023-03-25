package com.danel;

import com.danel.classes.Match;
import com.danel.classes.Prediction;
import com.danel.classes.Team;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        Team argentina = new Team("Argentina", "Seleccion Argentina");
        Team francia = new Team("Francia", "Seleccion Francesa");
        Team brasil = new Team("Brasil", "Seleccion Brasileña");
        Team croacia = new Team("Croacia", "Seleccion Croata");

        Match match1 = new Match(argentina, 3, francia, 0);
        Match match2 = new Match(francia, 1, argentina, 0);
        Match match3 = new Match(brasil, 3, croacia, 3);
        match1.addMatchToFile();
        match2.addMatchToFile();
        match3.addMatchToFile();
    }
}
