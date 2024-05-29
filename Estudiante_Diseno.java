package ParcialFinalEstructuras;

public class Estudiante_Diseno {

    String Cedula; //no caracteres especiales
    String Nombre; //no numeros ni caracteres especiales
    String Apellido; //no numeros ni caracteres especiales
    String Telefono; //no caracteres especiales
    String Modalidad; //virtual o presencial
    int Asignaturas;
    int Serial;

    public Estudiante_Diseno(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, int serial) {

        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Modalidad = modalidad;
        Asignaturas = asignaturas;
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

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public int getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(int Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    public int getSerial() {
        return Serial;
    }

    public void setSerial(int Serial) {
        this.Serial = Serial;
    }

}
