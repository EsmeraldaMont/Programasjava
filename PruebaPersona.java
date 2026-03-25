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
        p1.setprimerNombre("Carlos");
        p1.setsegundoNombre("Andrés");
        p1.setprimerApellido("García");
        p1.setsegundoApellido("Mendoza");
        p1.setdiaNac(10);
        p1.setmesNac(12);
        p1.setanioNac(1985);
        p1.setgenero("Masculino");
        p1.setestadoCivil("Casado");
        p1.setnumCelular("3159876543");
        p1.setnacionalidad("Colombiana");
        p1.setdireccion("Carrera 50 #20-30");
        p1.setcorreo("carlos.garcia@email.com");
        p1.settipoSangre("A");
        p1.setrh("Positivo");
        
        System.out.println("Luego de utilizar los setters con P1:\n");
        System.out.println("Los datos de la persona 1 son:\n" + p1.toString() + "\n");
        
        // Modificar persona 2 usando setters
        System.out.println("Modificar persona 2 \n");
        
        p2.setprimerNombre("Federico");
        p2.setsegundoNombre("José");
        p2.setprimerApellido("Gómez");
        p2.setsegundoApellido("Pérez");
        p2.setdiaNac(25);
        p2.setmesNac(7);
        p2.setanioNac(1992);
        p2.setgenero("Masculino");
        p2.setestadoCivil("Soltero");
        p2.setnumCelular("3204567890");
        p2.setnacionalidad("Colombiana");
        p2.setcorreo("federico.gomez@email.com");
        
        System.out.println("Luego de utilizar los setters con P2:\n");
        System.out.println("Los datos de la persona 2 son:\n" + p2.toString() + "\n");
        
        // Modificar persona 3 usando setters
        System.out.println(" Modificar persona 3 \n");
        
        p3.setsegundoNombre("Fernanda");
        p3.setsegundoApellido("Martínez");
        p3.setdiaNac(3);
        p3.setmesNac(9);
        p3.setanioNac(1995);
        p3.setgenero("Femenino");
        p3.setestadoCivil("Casada");
        p3.setnumCelular("3019876543");
        p3.setnacionalidad("Colombiana");
        p3.setdireccion("Avenida 68 #45-12");
        p3.setcorreo("maria.lopez@email.com");
        p3.settipoSangre("B");
        p3.setrh("Negativo");
        
        System.out.println("Luego de utilizar los setters con P3:\n");
        System.out.println("Los datos de la persona 3 son:\n" + p3.toString() + "\n");
        
        // Probar getters individuales con persona 4
        System.out.println("Modificar persona 4\n");
        System.out.println("Tipo Documento: " + p4.gettipoDoc());
        System.out.println("Número Documento: " + p4.getnumeroDoc());
        System.out.println("Primer Nombre: " + p4.getprimerNombre());
        System.out.println("Segundo Nombre: " + p4.getsegundoNombre());
        System.out.println("Primer Apellido: " + p4.getprimerApellido());
        System.out.println("Segundo Apellido: " + p4.getsegundoApellido());
        System.out.println("Fecha Nacimiento: " + p4.getdiaNac() + "/" + p4.getmesNac() + "/" + p4.getanioNac());
        System.out.println("Género: " + p4.getgenero());
        System.out.println("Estado Civil: " + p4.getestadoCivil());
        System.out.println("Número Celular: " + p4.getnumCelular());
        System.out.println("Nacionalidad: " + p4.getnacionalidad());
        System.out.println("Dirección: " + p4.getdireccion());
        System.out.println("Correo: " + p4.getcorreo());
        System.out.println("Tipo de Sangre: " + p4.gettipoSangre());
        System.out.println("RH: " + p4.getRh());
        
    } //Fin del metodo principal
}
