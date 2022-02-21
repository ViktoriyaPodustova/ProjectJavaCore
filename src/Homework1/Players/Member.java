package Homework1.Players;

public class Member {
    public String name;
    private int maxRun;
    private int maxSwim;
    private int maxJump;

    public Member(String name, int maxRun, int maxSwim, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }
    public String getName(){
        return name;
    }
    public int getMaxRun(){return maxRun;}

    public int getMaxSwim(){return maxSwim;}
    public int getMaxJump(){return maxJump;}




}
