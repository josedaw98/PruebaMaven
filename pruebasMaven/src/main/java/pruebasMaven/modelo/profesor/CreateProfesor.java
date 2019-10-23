package pruebasMaven.modelo.profesor;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class CreateProfesor {
public void create(ProfesorBean profesor) {
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jose.pruebasMaven.H2");
		//EntityManager entityManager = emf.createEntityManager() ;
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();//iniciamos la transaccion
		entityManager.persist(profesor);//le damos el dato a crear
		entityManager.getTransaction().commit();//confirmamos la accion
		//entityManager.close();//lo cerramos
		
	}

}
