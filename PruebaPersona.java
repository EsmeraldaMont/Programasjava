// Para hacer el javadoc, ejecute este comando desde la carpeta donde tiene el codigo:
// path C:\Program Files\Java\jdk1.8.0_162\bin
// javadoc TestPersona.java

public class TestPersona {
    
    /**
     * <b>Objetivo:</b> Probar que la clase Persona funciona correctamente.<br>
     * <b>Precondición:</b> La clase Persona debe estar creada y lista para usar.<br>
     * <b>Poscondición:</b> Se crean varias personas, se modifican y se muestran sus datos en pantalla para verificar que todo funciona.<br>
     */
    public static void main(String[] args) {
        
        // Crear persona 1 con constructor vacío
        Persona p1 = new Persona();
        
        // Crear persona 2 con constructor de dos parámetros (tipoDoc y numeroDoc)
        Persona p2 = new Persona("CC", 12345678);
        
        // Crear persona 3 con constructor de cuatro parámetros (tipoDoc, numeroDoc, primerNombre, primerApellido)
        Persona p3 = new Persona("TI", 87654321, "María", "López");
        
        // Crear persona 4  (todos los atributos)
        Persona p4 = new Persona(
            "CE",               // tipoDoc
            45678912,         // numeroDoc
            "Pedro",       // primerNombre
            "Escamoso",    // segundoNombre
            "Ramírez",   // primerApellido
            "Hernández", // segundoApellido
            15,                   // diaNac
            5,                     // mesNac
            1990,                 // anioNac
            "Masculino",           // genero
            "Soltero",        // estadoCivil
            "3001234567",      // numCelular
            "Colombiana",    // nacionalidad
            "Calle 12#45-67",  // direccion
            "pedro.escamoso@email.com", // correo
            "O",                  // tipoSangre
            "Positivo"               // rh
        );
        
        System.out.println("Datos de las personas\n");
        System.out.println("Los datos de la persona 1 son:\n" + p1.toString() + "\n");
        System.out.println("Los datos de la persona 2 son:\n" + p2.toString() + "\n");
        System.out.println("Los datos de la persona 3 son:\n" + p3.toString() + "\n");
        System.out.println("Los datos de la persona 4 son:\n" + p4.toString() + "\n");
        
        // Modificar persona 1 usando setters
        System.out.println("Modificar datos con setters\n");
        
        p1.setTipoDoc("CC");
        p1.setNumeroDoc(98765432);
        p1.setPrimerNombre("Carlos");
        p1.setSegundoNombre("Andrés");
        p1.setPrimerApellido("García");
        p1.setSegundoApellido("Mendoza");
        p1.setDiaNac(10);
        p1.setMesNac(12);
        p1.setAnioNac(1985);
        p1.setGenero("Masculino");
        p1.setEstadoCivil("Casado");
        p1.setNumCelular("3159876543");
        p1.setNacionalidad("Colombiana");
        p1.setDireccion("Carrera 50 #20-30");
        p1.setCorreo("carlos.garcia@email.com");
        p1.setTipoSangre("A");
        p1.setRh("Positivo");
        
        System.out.println("Luego de utilizar los setters con P1:\n");
        System.out.println("Los datos de la persona 1 son:\n" + p1.toString() + "\n");
        
        // Modificar persona 2 usando setters
        System.out.println("Modificar persona 2 \n");
        
        p2.setPrimerNombre("Federico");
        p2.setSegundoNombre("José");
        p2.setPrimerApellido("Gómez");
        p2.setSegundoApellido("Pérez");
        p2.setDiaNac(25);
        p2.setMesNac(7);
        p2.setAnioNac(1992);
        p2.setGenero("Masculino");
        p2.setEstadoCivil("Soltero");
        p2.setNumCelular("3204567890");
        p2.setNacionalidad("Colombiana");
        p2.setCorreo("federico.gomez@email.com");
        
        System.out.println("Luego de utilizar los setters con P2:\n");
        System.out.println("Los datos de la persona 2 son:\n" + p2.toString() + "\n");
        
        // Modificar persona 3 usando setters
        System.out.println(" Modificar persona 3 \n");
        
        p3.setSegundoNombre("Fernanda");
        p3.setSegundoApellido("Martínez");
        p3.setDiaNac(3);
        p3.setMesNac(9);
        p3.setAnioNac(1995);
        p3.setGenero("Femenino");
        p3.setEstadoCivil("Casada");
        p3.setNumCelular("3019876543");
        p3.setNacionalidad("Colombiana");
        p3.setDireccion("Avenida 68 #45-12");
        p3.setCorreo("maria.lopez@email.com");
        p3.setTipoSangre("B");
        p3.setRh("Negativo");
        
        System.out.println("Luego de utilizar los setters con P3:\n");
        System.out.println("Los datos de la persona 3 son:\n" + p3.toString() + "\n");
        
        // Probar getters individuales con persona 4
        System.out.println("Modificar persona 4\n");
        System.out.println("Tipo Documento: " + p4.getTipoDoc());
        System.out.println("Número Documento: " + p4.getNumeroDoc());
        System.out.println("Primer Nombre: " + p4.getPrimerNombre());
        System.out.println("Segundo Nombre: " + p4.getSegundoNombre());
        System.out.println("Primer Apellido: " + p4.getPrimerApellido());
        System.out.println("Segundo Apellido: " + p4.getSegundoApellido());
        System.out.println("Fecha Nacimiento: " + p4.getDiaNac() + "/" + p4.getMesNac() + "/" + p4.getAnioNac());
        System.out.println("Género: " + p4.getGenero());
        System.out.println("Estado Civil: " + p4.getEstadoCivil());
        System.out.println("Número Celular: " + p4.getNumCelular());
        System.out.println("Nacionalidad: " + p4.getNacionalidad());
        System.out.println("Dirección: " + p4.getDireccion());
        System.out.println("Correo: " + p4.getCorreo());
        System.out.println("Tipo de Sangre: " + p4.getTipoSangre());
        System.out.println("RH: " + p4.getRh());
        
    } //Fin del metodo principal
}
