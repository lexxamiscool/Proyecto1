package proyectoUno;
/*Bruno Fernandes: 5 goals, 6 points in speed, 9 points in assists, 10 points in passing accuracy,
 *  3 defensive involvements. Corresponds to jersey number 8.
Rasmus Hojlund: 12 goals, 8 points in speed, 2 points in assists, 6 points in passing accuracy,
 2 defensive involvements. Corresponds to jersey number 11.
Harry Maguire: 1 goal, 5 points in speed, 1 point in assists, 7 points in passing accuracy,
 9 defensive involvements. Corresponds to jersey number 5.
Alejandro Garnacho: 8 goals, 7 points in speed, 8 points in assists, 6 points in passing accuracy,
 0 defensive involvements. Corresponds to jersey number 17.
Mason Mount: 2 goals, 6 points in speed, 4 points in assists, 8 points in passing accuracy, 
1 defensive involvement. Corresponds to jersey number 7.

 * */
public class Players {
    private String name;
    private Integer goals;
    private Integer speed;
    private Integer assists;
    private Integer accuracy;
    private Integer defensive;
    public Players(String name, Integer goals, Integer speed, Integer assists, Integer accuracy, Integer defensive) {
        super();
        this.name = name;
        this.goals = goals;
        this.speed = speed;
        this.assists = assists;
        this.accuracy = accuracy;
        this.defensive = defensive;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
    }
    public Integer getSpeed() {
        return speed;
    }
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer getAssists() {
        return assists;
    }
    public void setAssists(Integer assists) {
        this.assists = assists;
    }
    public Integer getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }
    public Integer getDefensive() {
        return defensive;
    }
    public void setDefensive(Integer defensive) {
        this.defensive = defensive;
    }
    @Override
    public String toString() {
        return "Players [name=" + name + ", goals=" + goals + ", speed=" + speed + ", assists=" + assists
                + ", accuracy=" + accuracy + ", defensive=" + defensive + "]";
    }
    
}
