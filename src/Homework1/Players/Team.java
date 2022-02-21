package Homework1.Players;

import Homework1.Obstacles.Obstacles;
import Homework1.Players.Member;

public class Team {
    private String teamName;
    private Member[] members;


    public Team(String teamName, Member[] members) {
        this.teamName = teamName;
        this.members = members;

    }

    public void showAllMembers() {
        for (int i = 0; i < members.length; i++) {
            System.out.println(this.members[i].getName() + "\t");
        }
    }


   public void passAnObstacle (Obstacles obstacles){
        for (int i = 0; i < members.length; i++) {
            if ((this.members[i].getMaxRun()>=obstacles.getRunDistance()) &&
                    (this.members[i].getMaxSwim()>=obstacles.getSwimDistance())
                    && (this.members[i].getMaxJump()>=obstacles.getJumpDistance())) {
                System.out.println(members[i].getName() + " passed the obstacle");
            }
        }

    }

}
