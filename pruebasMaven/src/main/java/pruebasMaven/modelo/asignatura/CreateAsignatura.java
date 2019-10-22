package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class CreateAsignatura {

	public void create(AsignaturaBean asignatura) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jose.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager() ;
		
		entityManager.getTransaction().begin();//iniciamos la transaccion
		entityManager.persist(asignatura);//le damos el dato a crear
		entityManager.getTransaction().commit();//confirmamos la accion
		entityManager.close();//lo cerramos
		
	}

}
