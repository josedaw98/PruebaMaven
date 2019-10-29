package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.ConnectionEntityManagerFactory;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {
		
		// recoge la entity, abre la transacción, persiste y la cierra
					EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
					
					entityManager.getTransaction().begin();
					entityManager.persist(alumno);
					entityManager.getTransaction().commit();
					entityManager.close();
	}

}
