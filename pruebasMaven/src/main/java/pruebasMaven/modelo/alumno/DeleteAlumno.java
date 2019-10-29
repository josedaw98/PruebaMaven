package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.ConnectionEntityManagerFactory;

public class DeleteAlumno {
	
public void delete(AlumnoBean alumno) {
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jose.pruebasMaven.H2");
		//EntityManager entityManager = emf.createEntityManager() ;
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();//iniciamos la transaccion
		AlumnoBean alumnoBorrar = entityManager.find(AlumnoBean.class, alumno.getIdAlumno());
		entityManager.remove(alumnoBorrar);;//borramos al alumno
		entityManager.getTransaction().commit();//confirmamos la accion
		//entityManager.close();//lo cerramos
		
	}

}
