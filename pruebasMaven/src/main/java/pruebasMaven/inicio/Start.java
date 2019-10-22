package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class Start {

	public static void main(String[] args) {
		
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lenagua");
		
		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Mates");
		
		CreateAsignatura CreateAsignatura = new CreateAsignatura();
		CreateAsignatura.create(lengua);
		CreateAsignatura.create(mates);
		
		
		AlumnoBean jose2 = new AlumnoBean();
		jose2.setNombre("Luis");
		jose2.setTelefono("3454534543");
		jose2.setCiudad("oviedo");
		jose2.setAsignatura(lengua);
		
		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setTelefono("546347523");
		maria.setCiudad("Gijon");
		maria.setAsignatura(lengua);
		
		CreateAlumno crearAlumno = new CreateAlumno();
		crearAlumno.create(maria);
		
		/*
		AlumnoBean jose = new AlumnoBean();
		jose.setId(3L);
		
		DeleteAlumno delete = new DeleteAlumno();
		delete.delete(jose);
		*/
	}

}
