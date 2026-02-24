public class Persona {

    // Atributos
    private String tipoDoc;
    private int numeroDoc;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int diaNac;
    private int mesNac;
    private int anioNac;
    private String genero;
    private String estadoCivil;
    private String numCelular;
    private String nacionalidad;
    private String direccion;
    private String correo;
    private String tipoSangre;
    private String rh;

    /**
     * <b>Objetivo:</b> Crear una persona con todos sus datos.<br>
     * <b>Precondición:</b> Recibir valores válidos para cada atributo.<br>
     * <b>Poscondición:</b> Se inicializa un objeto Persona con los datos proporcionados.
     */
    public Persona(String tipoDoc, int numeroDoc, String primerNombre, String segundoNombre,
                   String primerApellido, String segundoApellido, int diaNac, int mesNac, int anioNac,
                   String genero, String estadoCivil, String numCelular, String nacionalidad,
                   String direccion, String correo, String tipoSangre, String rh) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.numCelular = numCelular;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.correo = correo;
        this.tipoSangre = tipoSangre;
        this.rh = rh;
    }

    // --- Getters con documentación ---

    /**
     * <b>Objetivo:</b> Obtener el tipo de documento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el tipo de documento.
     */
    public String getTipoDoc() { return this.tipoDoc; }

    /**
     * <b>Objetivo:</b> Obtener el número de documento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el número de documento.
     */
    public int getNumeroDoc() { return this.numeroDoc; }

    /**
     * <b>Objetivo:</b> Obtener el primer nombre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el primer nombre.
     */
    public String getPrimerNombre() { return this.primerNombre; }

    /**
     * <b>Objetivo:</b> Obtener el segundo nombre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el segundo nombre.
     */
    public String getSegundoNombre() { return this.segundoNombre; }

    /**
     * <b>Objetivo:</b> Obtener el primer apellido.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el primer apellido.
     */
    public String getPrimerApellido() { return this.primerApellido; }

    /**
     * <b>Objetivo:</b> Obtener el segundo apellido.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el segundo apellido.
     */
    public String getSegundoApellido() { return this.segundoApellido; }

    /**
     * <b>Objetivo:</b> Obtener el día de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el día de nacimiento.
     */
    public int getDiaNac() { return this.diaNac; }

    /**
     * <b>Objetivo:</b> Obtener el mes de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el mes de nacimiento.
     */
    public int getMesNac() { return this.mesNac; }

    /**
     * <b>Objetivo:</b> Obtener el año de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el año de nacimiento.
     */
    public int getAnioNac() { return this.anioNac; }

    /**
     * <b>Objetivo:</b> Obtener el género.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el género.
     */
    public String getGenero() { return this.genero; }

    /**
     * <b>Objetivo:</b> Obtener el estado civil.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el estado civil.
     */
    public String getEstadoCivil() { return this.estadoCivil; }

    /**
     * <b>Objetivo:</b> Obtener el número de celular.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el número de celular.
     */
    public String getNumCelular() { return this.numCelular; }

    /**
     * <b>Objetivo:</b> Obtener la nacionalidad.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna la nacionalidad.
     */
    public String getNacionalidad() { return this.nacionalidad; }

    /**
     * <b>Objetivo:</b> Obtener la dirección.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna la dirección.
     */
    public String getDireccion() { return this.direccion; }

    /**
     * <b>Objetivo:</b> Obtener el correo electrónico.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el correo electrónico.
     */
    public String getCorreo() { return this.correo; }

    /**
     * <b>Objetivo:</b> Obtener el tipo de sangre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el tipo de sangre.
     */
    public String getTipoSangre() { return this.tipoSangre; }

    /**
     * <b>Objetivo:</b> Obtener el factor RH.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el factor RH.
     */
    public String getRh() { return this.rh; }

    // --- Setters con documentación ---

    /**
     * <b>Objetivo:</b> Modificar el tipo de documento.<br>
     * <b>Precondición:</b> Recibir un valor válido para tipoDoc.<br>
     * <b>Poscondición:</b> El atributo tipoDoc se actualiza con el nuevo valor.
     */
    public void setTipoDoc(String nuevoTipoDoc) { this.tipoDoc = nuevoTipoDoc; }

    /**
     * <b>Objetivo:</b> Modificar el número de documento.<br>
     * <b>Precondición:</b> Recibir un valor válido para numeroDoc.<br>
     * <b>Poscondición:</b> El atributo numeroDoc se actualiza con el nuevo valor.
     */
    public void setNumeroDoc(int nuevoNumeroDoc) { this.numeroDoc = nuevoNumeroDoc; }

    /**
     * <b>Objetivo:</b> Modificar el primer nombre.<br>
     * <b>Precondición:</b> Recibir un valor válido para primerNombre.<br>
     * <b>Poscondición:</b> El atributo primerNombre se actualiza con el nuevo valor.
     */
    public void setPrimerNombre(String nuevoPrimerNombre) { this.primerNombre = nuevoPrimerNombre; }

    /**
     * <b>Objetivo:</b> Modificar el segundo nombre.<br>
     * <b>Precondición:</b> Recibir un valor válido para segundoNombre.<br>
     * <b>Poscondición:</b> El atributo segundoNombre se actualiza con el nuevo valor.
     */
    public void setSegundoNombre(String nuevoSegundoNombre) { this.segundoNombre = nuevoSegundoNombre; }

    /**
     * <b>Objetivo:</b> Modificar el primer apellido.<br>
     * <b>Precondición:</b> Recibir un valor válido para primerApellido.<br>
     * <b>Poscondición:</b> El atributo primerApellido se actualiza con el nuevo valor.
     */
    public void setPrimerApellido(String nuevoPrimerApellido) { this.primerApellido = nuevoPrimerApellido; }

    /**
     * <b>Objetivo:</b> Modificar el segundo apellido.<br>
     * <b>Precondición:</b> Recibir un valor válido para segundoApellido.<br>
     * <b>Poscondición:</b> El atributo segundoApellido se actualiza con el nuevo valor.
     */
    public void setSegundoApellido(String nuevoSegundoApellido) { this.segundoApellido = nuevoSegundoApellido; }

    /**
     * <b>Objetivo:</b> Modificar el día de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para diaNac (1-31).<br>
     * <b>Poscondición:</b> El atributo diaNac se actualiza con el nuevo valor.
     */
    public void setDiaNac(int nuevoDiaNac) { this.diaNac = nuevoDiaNac; }

    /**
     * <b>Objetivo:</b> Modificar el mes de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para mesNac (1-12).<br>
     * <b>Poscondición:</b> El atributo mesNac se actualiza con el nuevo valor.
     */
    public void setMesNac(int nuevoMesNac) { this.mesNac = nuevoMesNac; }

    /**
     * <b>Objetivo:</b> Modificar el año de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para anioNac.<br>
     * <b>Poscondición:</b> El atributo anioNac se actualiza con el nuevo valor.
     */
    public void setAnioNac(int nuevoAnioNac) { this.anioNac = nuevoAnioNac; }

    /**
     * <b>Objetivo:</b> Modificar el género.<br>
     * <b>Precondición:</b> Recibir un valor válido para genero.<br>
     * <b>Poscondición:</b> El atributo genero se actualiza con el nuevo valor.
     */
    public void setGenero(String nuevoGenero) { this.genero = nuevoGenero; }

    /**
     * <b>Objetivo:</b> Modificar el estado civil.<br>
     * <b>Precondición:</b> Recibir un valor válido para estadoCivil.<br>
     * <b>Poscondición:</b> El atributo estadoCivil se actualiza con el nuevo valor.
     */
    public void setEstadoCivil(String nuevoEstadoCivil) { this.estadoCivil = nuevoEstadoCivil; }

    /**
     * <b>Objetivo:</b> Modificar el número de celular.<br>
     * <b>Precondición:</b> Recibir un valor válido para numCelular.<br>
     * <b>Poscondición:</b> El atributo numCelular se actualiza con el nuevo valor.
     */
    public void setNumCelular(String nuevoNumCelular) { this.numCelular = nuevoNumCelular; }

    /**
     * <b>Objetivo:</b> Modificar la nacionalidad.<br>
     * <b>Precondición:</b> Recibir un valor válido para nacionalidad.<br>
     * <b>Poscondición:</b> El atributo nacionalidad se actualiza con el nuevo valor.
     */
    public void setNacionalidad(String nuevaNacionalidad) { this.nacionalidad = nuevaNacionalidad; }

    /**
     * <b>Objetivo:</b> Modificar la dirección.<br>
     * <b>Precondición:</b> Recibir un valor válido para direccion.<br>
     * <b>Poscondición:</b> El atributo direccion se actualiza con el nuevo valor.
     */
    public void setDireccion(String nuevaDireccion) { this.direccion = nuevaDireccion; }

    /**
     * <b>Objetivo:</b> Modificar el correo electrónico.<br>
     * <b>Precondición:</b> Recibir un valor válido para correo.<br>
     * <b>Poscondición:</b> El atributo correo se actualiza con el nuevo valor.
     */
    public void setCorreo(String nuevoCorreo) { this.correo = nuevoCorreo; }

    /**
     * <b>Objetivo:</b> Modificar el tipo de sangre.<br>
     * <b>Precondición:</b> Recibir un valor válido para tipoSangre.<br>
     * <b>Poscondición:</b> El atributo tipoSangre se actualiza con el nuevo valor.
     */
    public void setTipoSangre(String nuevoTipoSangre) { this.tipoSangre = nuevoTipoSangre; }

    /**
     * <b>Objetivo:</b> Modificar el factor RH.<br>
     * <b>Precondición:</b> Recibir un valor válido para rh.<br>
     * <b>Poscondición:</b> El atributo rh se actualiza con el nuevo valor.
     */
    public void setRh(String nuevoRh) { this.rh = nuevoRh; }
}
  