package ParcialFinalEstructuras;

public class Tabla_Grafica {
    
    String Serial; //no caracteres especiales
    String Marca; //no numeros ni caracteres especiales
    float Tamaño; //pulgadas
    float Precio;
    int Almacenamiento; //submenu 1- 256GB 2- 512GB 3- 1TB
    float Peso; //kilogramos

    public Tabla_Grafica(String serial, String marca, float tamaño, float precio, int almacenamiento, float peso) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Almacenamiento = almacenamiento;
        Peso = peso;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getTamano() {
        return Tamaño;
    }

    public void setTamaño(float Tamano) {
        this.Tamaño = Tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
}
