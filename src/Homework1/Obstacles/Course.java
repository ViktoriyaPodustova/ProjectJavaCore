package Homework1.Obstacles;

import Homework1.Players.Member;
import Homework1.Players.Team;

public class Course {
    private String trackName;
    private Obstacles[] obstacles;

    public Course(String trackName, Obstacles[] obstacles) {
        this.trackName = trackName;
        this.obstacles = obstacles;
    }
public void doIT (Team team){
 for (int i=0; i< obstacles.length;i++){
        team.passAnObstacle(this.obstacles[i]);
 }
}
}
