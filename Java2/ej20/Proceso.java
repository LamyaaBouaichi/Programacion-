public class Proceso {

    public void pasoUno() {

	System.out.println("Iniciando proceso...");

    }

    public void pasoDos() {

	pasoUno();	

	System.out.println( "Proceso completado.");

    }


    public static void main (String[] args) {

	Proceso proceso = new Proceso();
	proceso.pasoDos();

    }  

}