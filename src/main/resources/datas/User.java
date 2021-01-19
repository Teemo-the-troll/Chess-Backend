package resources.datas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String username;

    private String password;

    private Long points;

    private Long gamesPlayed;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 800L;
        this.gamesPlayed = 0L;
    }

    public void mutatePoints(Long points) {
        this.points += points;
    }

    public Long getPoints() {
        return this.points;
    }

    public void addGamesPlayed() {
        this.gamesPlayed++;
    }

    public Long getGamesPlayed() {
        return this.gamesPlayed;
    }

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean is(User other) {
        return this.username.equals(other.username) && this.password.equals(other.password);
    }


    public void print() {
        System.out.println(getId());
        System.out.println(getUsername());
        System.out.println(getPoints());
    }
}
