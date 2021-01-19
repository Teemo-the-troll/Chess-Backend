import resources.datas.Game;
import resources.datas.User;
import utils.Pair;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("Josef", "123");
        User u2 = new User("Alois", "456");

        Game g = new Game(new Pair<>(u1, u2));
        g.writeMove(new Pair<>(0, 0), new Pair<>(1, 2));
        g.writeMove(new Pair<>(53, 0), new Pair<>(23, 67));
        g.setWinner((byte) 1);

        Game g2 = new Game(new Pair<>(u2, u1));
        g2.writeMove(new Pair<>(124, 0), new Pair<>(0, 35));
        g2.writeMove(new Pair<>(75, 14), new Pair<>(6, 8));
        g2.setWinner((byte) 2);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction entityTransaction = manager.getTransaction();
        entityTransaction.begin();

        manager.persist(u1);
        manager.persist(u2);
        manager.persist(g);
        manager.persist(g2);

        entityTransaction.commit();

        manager.close();
        factory.close();


    }
}
