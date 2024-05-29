package ParcialFinalEstructuras;

public class Computador_Portatil {

    String Serial; //no caracteres especiales
    String Marca; //no numeros ni caracteres especiales
    float Tamaño; //pulgadas
    float Precio;
    int Sistema; //submenu 1- Windows 7 2- Windows 10 3- Windows 11
    int Procesador; //submenu 1- AMD Ryzen 2- Intel® Core™ i5

    public Computador_Portatil(String serial, String marca, float tamaño, float precio, int sistema, int procesador) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Sistema = sistema;
        Procesador = procesador;
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

    public float getTamaño() {
        return Tamaño;
    }

    public void setTamaño(float Tamaño) {
        this.Tamaño = Tamaño;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getSistema() {
        return Sistema;
    }

    public void setSistema(int Sistema) {
        this.Sistema = Sistema;
    }

    public int getProcesador() {
        return Procesador;
    }

    public void setProcesador(int Procesador) {
        this.Procesador = Procesador;
    }

}
