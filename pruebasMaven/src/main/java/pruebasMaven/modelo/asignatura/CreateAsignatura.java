package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.util.ConnectionEntityManagerFactory;

public class CreateAsignatura {
	/**
	 * Crea una persistencia de un objeto asignatura
	 * @param asignatura
	 */

	public void create(AsignaturaBean asignatura) {

			// recoge la entity, abre la transacción, persiste y la cierra
			EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(asignatura);
			entityManager.getTransaction().commit();
			entityManager.close();
		
		
	}

}
