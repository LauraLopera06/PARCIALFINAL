package ParcialFinalEstructuras;

public class Estudiante_Ingenieria {
    
    String Cedula; //no caracteres especiales
    String Nombre; //no numeros ni caracteres especiales
    String Apellido; //no numeros ni caracteres especiales
    String Telefono; //no caracteres especiales
    int Semestre;
    float Promedio;
    String Serial; //no caracteres especiales

    public Estudiante_Ingenieria (String cedula, String nombre, String apellido, String telefono, int semestre, float promedio, String serial){
        
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Semestre = semestre;
        Promedio = promedio;
        Serial = serial;
        
    } 
      
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }
    
}
