package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;

public class Start {

	public static void main(String[] args) {

		/*
		 * ********************************
		 * C R E A N D O    O B J E T O S
		 * ********************************
		 */
		ProfesorBean jose = new ProfesorBean();
		jose.setNombre("Jose");
		
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("lengua");
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("historia");
		
		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("filosofia");

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("mates");
		

		
		
		
		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setCiudad("Oviedo");
		maria.setTelefono("666555444");
		
		AlumnoBean marcos = new AlumnoBean();
		marcos.setNombre("Marcos");
		marcos.setCiudad("Oviedo");
		marcos.setTelefono("666555444");

		
		
		
		/*
		 * **************************************************
		 * A � A D I E N D O    I N F O R M A C I � N
		 * **************************************************
		 */		
		jose.addAsignatura(lengua);
		jose.addAsignatura(filosofia);
		jose.addAsignatura(mates);
		jose.addAsignatura(historia);
		
		
		filosofia.addAlumno(marcos);
		filosofia.addAlumno(maria);
		
		
		
		
		
		/*
		 * **************************************************
		 * P E R S I S T I E N D O    L O S     D A T O S
		 * **************************************************
		 */			
	
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(jose);		
		
		
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		// Esta persistencia da una excepci�n �Por qu�?
		createAsignatura.create(lengua);
		
		// Esto ya no se ejecuta por la excepci�n anterior
		createAsignatura.create(mates);
		createAsignatura.create(historia);
		createAsignatura.create(filosofia);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(marcos);
		createAlumno.create(maria);
	
		
	}
}
