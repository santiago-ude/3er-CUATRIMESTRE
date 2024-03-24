import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        perros perro1 = new perros();

        perro1.setEdad(12);
        perro1.setRaza("Boxer");

        perro1.mostrarDatosPerro(perro1);


    }
}

class perros{

    private String raza;
    private int edad;

    //---------------------------------------------------------------------------------------------------------
    public perros() {
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        perros perros = (perros) o;
        return edad == perros.edad && Objects.equals(raza, perros.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza, edad);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "perros{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
//-------------------------------------------------------------------------


protected void mostrarDatosPerro(perros perro1){

        String razaPerro = perro1.getRaza();
        int edadPerro = perro1.getEdad();

    System.out.println("Es un perro raza " + razaPerro + " y tiene " + edadPerro + " años de edad");


}

}


