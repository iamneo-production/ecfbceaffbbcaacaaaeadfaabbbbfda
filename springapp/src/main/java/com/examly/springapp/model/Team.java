package com.examly.springapp.model;

@Component("team")
public class Team{
    private Integer teamId = 1;
    private String teamName = "RCB;

    public Team(){

    }

    public Team(Integer teamId, String teamName){
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public void setTeamId(Integer teamId){
        this.teamId = teamId;
    }

    public Integer getTeamId(){
        return teamId;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public String toString(){
        return "TeamId : "+teamId+" Team Name : "+teamName;
    }

    public boolean equals(Object obj){
        Team team2 = (Team) obj;
        if(teamId == team2.teamId){
            return true;
        }else{
            return false;
        }
    }
}