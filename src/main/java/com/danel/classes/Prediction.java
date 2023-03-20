package com.danel.classes;

import com.danel.enums.ResultEnum;

public class Prediction {
    private Match match;
    private Team team;
    private ResultEnum resultEnum;

    public Prediction() {}

    public Prediction(Match match, Team team, ResultEnum resultEnum) {
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
}
