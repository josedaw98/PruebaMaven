package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class Start {

	public static void main(String[] args) {

		// creamos asignaturas
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lenagua");

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Mates");

		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("Hisotria");

		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("Filosofia");

		// CREAMOS PORFESORES
		ProfesorBean joseCarlos = new ProfesorBean();
		joseCarlos.setNombre("joseCarlos");

		// CREAMOS ALUMNOS
		AlumnoBean jose = new AlumnoBean();
		jose.setNombre("Luis");
		jose.setTelefono("647265372");
		jose.setCiudad("oviedo");
		

		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setTelefono("624826371");
		maria.setCiudad("Gijon");
		
		
		// AÑADIMOS LOS ALUMNOS A LAS ASIGNATURAS
		filosofia.addAlumno(jose);
		filosofia.addAlumno(maria);
		
		// AÑADIMOS LAS ASIGNATURAS AL PROFESOR
		joseCarlos.addAsignatura(filosofia);
		joseCarlos.addAsignatura(mates);

		// AÑADIMOS LOS PROFESORES A LA BASE DE DATOS
		CreateProfesor crearProfesor = new CreateProfesor();
		crearProfesor.create(joseCarlos);
		
		

		// AÑADIMOS LAS ASIGNATURAS A LA BASE DE DATOS
		CreateAsignatura CreateAsignatura = new CreateAsignatura();
		CreateAsignatura.create(lengua);
		CreateAsignatura.create(mates);
		CreateAsignatura.create(historia);
		CreateAsignatura.create(filosofia);


		// AÑADIMOS LOS ALUMNOS A LA BASE DE DATOS
		CreateAlumno crearAlumno = new CreateAlumno();
		crearAlumno.create(maria);
		crearAlumno.create(jose);
		
		
		
		ProfesorBean nueva = Connection.getEntityManager().find(ProfesorBean.class, 1L);
		System.out.println(nueva);

		Connection.getEntityManager().close();
	}
}
