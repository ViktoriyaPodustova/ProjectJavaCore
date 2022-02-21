package Homework1.Obstacles;

public class Obstacles {
    private int runDistance;
    private int swimDistance;
    private int jumpDistance;

    public Obstacles(int runDistance, int swimDistance, int jumpDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpDistance = jumpDistance;
    }

    public int getRunDistance(){return runDistance;}

    public int getSwimDistance(){return swimDistance;}
    public int getJumpDistance(){return jumpDistance;}

}
