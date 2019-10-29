package pruebasMaven.modelo.profesor;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.ConnectionEntityManagerFactory;

public class CreateProfesor {
public void create(ProfesorBean profesor) {
		
	// conecta, comienza la transacción, persiste y cierra
			EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(profesor);
			entityManager.getTransaction().commit();
			entityManager.close();

		
	}

}
