package API.User;

import resources.datas.User;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class LoggedUser implements Serializable {
    private User loggedUser;

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
