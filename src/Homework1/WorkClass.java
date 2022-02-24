package Homework1;

import Homework1.Obstacles.Course;
import Homework1.Obstacles.Obstacles;
import Homework1.Players.Member;
import Homework1.Players.Team;

public class WorkClass {
    public static void main(String args[]){
        Member player1 = new Member("Ivan", 10, 5, 3);
        Member player2 = new Member("Ira", 5, 3, 2);
        Member player3 = new Member("Roma", 15, 10, 6);
        Member player4 = new Member("Liza", 6, 4, 3);

        Member player5 = new Member("Dima", 20, 9, 5);
        Member player6 = new Member("Gleb", 10, 8, 3);
        Member player7 = new Member("Kirill", 16, 10, 6);
        Member player8 = new Member("Boris", 11, 5, 3);

        Member[] membersTeam1 = {player1, player2, player3, player4};
        Member[] membersTeam2 = {player5, player6, player7, player8};

        Team team1 = new Team("Losers", membersTeam1);
        Team team2 = new Team("Winners", membersTeam2);


        int[ ] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]=i+1);
        }

//_____________________________________________________________________________________

        Obstacles trak1 = new Obstacles(10,5,2);
        //Obstacles trak2 = new Obstacles(5,2,1);
        Obstacles[] obstacles = {trak1};
        Course course = new Course("Trak", obstacles);
//_______________________________________________________________________________________
        team1.showAllMembers();
        System.out.println("______________");
        course.doIT(team1);
        System.out.println("*********************");
        team2.showAllMembers();
        System.out.println("______________");
        course.doIT(team2);
    }

    private static class String {
    }

    private static class System {
    }
}
