import resources.datas.Game;
import resources.datas.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class TestCteni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory( "TestPersistence" );
        EntityManager entitymanager = factory.createEntityManager( );
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Game> from = criteriaQuery.from(Game.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        TypedQuery<Object> typedQuery = entitymanager.createQuery(select);
        List<Object> resultlist = typedQuery.getResultList();

        for (Object o : resultlist) {
            ((Game) o ).print();
        }

        entitymanager.close( );
        factory.close( );

    }
}
