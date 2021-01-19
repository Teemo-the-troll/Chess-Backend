package resources.dataManagement;

import resources.datas.Game;
import resources.datas.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistEnt {
    public static void persistGame(User us) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction entityTransaction = manager.getTransaction();
        entityTransaction.begin();

        manager.persist(us);

        entityTransaction.commit();

        manager.close();
        factory.close();
    }

    public static void persistGame(Game ga) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction entityTransaction = manager.getTransaction();
        entityTransaction.begin();

        manager.persist(ga);

        entityTransaction.commit();

        manager.close();
        factory.close();
    }
}
