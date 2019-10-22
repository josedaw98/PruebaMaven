package pruebasMaven.negocio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity//necesario 
@Table(name="alumno")//recalca que se va a crear una tabla
public class AlumnoBean {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//genera de manera automatica el id
		@Column
		private long idAlumno;
		
		public void setIdAlumno(long idAlumno) {
			this.idAlumno = idAlumno;
		}
		@Column(name="nombre")//nombre de la columna
		private String nombre;
		
		@Column(name="telefono")
		private String telefono;
		
		@Column
		private String ciudad;
		
		@ManyToOne
		@JoinColumn(name="FK_asignatura")
		private AsignaturaBean asignatura;
		
		
		
		
		
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public AsignaturaBean getAsignatura() {
			return asignatura;
		}
		public void setAsignatura(AsignaturaBean asignatura) {
			this.asignatura = asignatura;
		}
		public long getIdAlumno() {
			return idAlumno;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}


}
