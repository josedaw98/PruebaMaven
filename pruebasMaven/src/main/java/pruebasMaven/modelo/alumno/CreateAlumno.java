package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jose.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager() ;
		
		entityManager.getTransaction().begin();//iniciamos la transaccion
		entityManager.persist(alumno);//le damos el dato a crear
		entityManager.getTransaction().commit();//confirmamos la accion
		entityManager.close();//lo cerramos
		
	}

}
