package Pregunta2;

public abstract class Profesor extends Persona {
//Clase abstracta para las clases concretas ProfesorInterino, ProfesorTitular
	private String IdProfesor; 
 public Profesor () 
  { 
   super();         
   IdProfesor = "Unknown";   
} 

public Profesor (String nombre, String apellidos, int edad, String id) { 
   super(nombre, apellidos, edad);   
   IdProfesor = id; 
}

public void setIdProfesor (String IdProfesor) { 
   this.IdProfesor = IdProfesor;   
}

public String getIdProfesor () { 
   return IdProfesor;   
}

public void mostrarDatos() {
System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " +
getApellidos() + " con Id de profesor: " + getIdProfesor() );   
}

public String toString () { 
 return super.toString().concat(" -IdProfesor: ").concat(IdProfesor); 
 }
abstract public float importeNomina ();  

}