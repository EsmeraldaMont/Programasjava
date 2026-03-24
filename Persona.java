// para hacer el javadoc, ejecute este comando desde la carpeta donde tiene el codigo:
// path C:\Program Files\Java\jdk1.8.0_162\bin
// javadoc Persona.java

public class Persona {

    // Atributos
    protected String tipoDoc;
    protected int numeroDoc;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected int diaNac;
    protected int mesNac;
    protected int anioNac;
    protected String genero;
    protected String estadoCivil;
    protected String numCelular;
    protected String nacionalidad;
    protected String direccion;
    protected String correo;
    protected String tipoSangre;
    protected String rh;

    // CONSTRUCTORES

    public Persona(String tipoDoc, String primerNombre, String primerApellido) {
    this.tipoDoc = tipoDoc;
    this.primerNombre = primerNombre;
    this.primerApellido = primerApellido;
     }


    
    /**
     * <b>Objetivo:</b> Crear una persona sin datos, con valores vacíos por defecto.<br>
     * <b>Precondición:</b> No se necesita ningún valor para crear la persona.<br>
     * <b>Poscondición:</b> Se crea una persona con todos sus atributos vacíos o en cero.<br>
     **/
    public Persona() {
        this.tipoDoc = "";
        this.numeroDoc = 0;
        this.primerNombre = "";
        this.segundoNombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.diaNac = 0;
        this.mesNac = 0;
        this.anioNac = 0;
        this.genero = "";
        this.estadoCivil = "";
        this.numCelular = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.correo = "";
        this.tipoSangre = "";
        this.rh = "";
    }
    
    /**
     * <b>Objetivo:</b> Crear una persona con su tipo y número de documento.<br>
     * <b>Precondición:</b> Se debe proporcionar un tipo y número de documento válidos.<br>
     * <b>Poscondición:</b> Se crea una persona con tipo y número de documento asignados, los demás atributos quedan vacíos.<br>
     * @param tipoDoc, es el tipo de documento de la persona (CC, TI, CE, etc.).
     * @param numeroDoc, es el número de documento de la persona.
     **/
    public Persona(String tipoDoc, int numeroDoc) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.primerNombre = "";
        this.segundoNombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.diaNac = 0;
        this.mesNac = 0;
        this.anioNac = 0;
        this.genero = "";
        this.estadoCivil = "";
        this.numCelular = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.correo = "";
        this.tipoSangre = "";
        this.rh = "";
    }
    
    /**
     * <b>Objetivo:</b> Crear una persona con sus datos básicos: documento, nombre y apellido.<br>
     * <b>Precondición:</b> Se debe proporcionar tipo de documento, número, primer nombre y primer apellido válidos.<br>
     * <b>Poscondición:</b> Se crea una persona con los datos básicos asignados, los demás atributos quedan vacíos.<br>
     * @param tipoDoc, es el tipo de documento de la persona (CC, TI, CE, etc.).
     * @param numeroDoc, es el número de documento de la persona.
     * @param primerNombre, es el primer nombre de la persona.
     * @param primerApellido, es el primer apellido de la persona.
     **/
    public Persona(String tipoDoc, int numeroDoc, String primerNombre, String primerApellido) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.primerNombre = primerNombre;
        this.segundoNombre = "";
        this.primerApellido = primerApellido;
        this.segundoApellido = "";
        this.diaNac = 0;
        this.mesNac = 0;
        this.anioNac = 0;
        this.genero = "";
        this.estadoCivil = "";
        this.numCelular = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.correo = "";
        this.tipoSangre = "";
        this.rh = "";
    }
    
    /**
     * <b>Objetivo:</b> Crear una persona con todos sus datos.<br>
     * <b>Precondición:</b> Recibir valores correctos para cada dato. <br>
     * <b>Poscondición:</b> La persona queda guardado con esos datos.<br>
     * @param tipoDoc, es el tipo de documento.
     * @param numeroDoc, es el número de documento.
     * @param primerNombre, es el primer nombre.
     * @param segundoNombre, es el segundo nombre.
     * @param primerApellido, es el primer apellido.
     * @param segundoApellido, es el segundo apellido.
     * @param diaNac, es el día de nacimiento.
     * @param mesNac, es el mes de nacimiento.
     * @param anioNac, es el año de nacimiento.
     * @param genero, es el género.
     * @param estadoCivil, es el estado civil.
     * @param numCelular, es el número de celular.
     * @param nacionalidad, es la nacionalidad.
     * @param direccion, es la dirección.
     * @param correo, es el correo electrónico.
     * @param tipoSangre, es el tipo de sangre.
     * @param rh, es el factor RH.
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

    // ANALIZADORES (GETTERS)
    
    /**
     * <b>Objetivo:</b> Obtener el tipo de documento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el tipo de documento.
     * @return tipoDoc String.
     */
    public String gettipoDoc() { return this.tipoDoc; }

    /**
     * <b>Objetivo:</b> Obtener el número de documento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el número de documento.
     * @return numeroDoc int.
     */
    public int getnumeroDoc() { return this.numeroDoc; }

    /**
     * <b>Objetivo:</b> Obtener el primer nombre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el primer nombre.
     * @return primerNombre String.
     */
    public String getprimerNombre() { return this.primerNombre; }

    /**
     * <b>Objetivo:</b> Obtener el segundo nombre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el segundo nombre.
     * @return segundoNombre String.
     */
    public String getsegundoNombre() { return this.segundoNombre; }

    /**
     * <b>Objetivo:</b> Obtener el primer apellido.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el primer apellido.
     * @return primerApellido String.
     */
    public String getprimerApellido() { return this.primerApellido; }

    /**
     * <b>Objetivo:</b> Obtener el segundo apellido.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el segundo apellido.
     * @return segundoApellido String.
     */
    public String getsegundoApellido() { return this.segundoApellido; }

    /**
     * <b>Objetivo:</b> Obtener el día de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el día de nacimiento.
     * @return diaNac int.
     */
    public int getdiaNac() { return this.diaNac; }

    /**
     * <b>Objetivo:</b> Obtener el mes de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el mes de nacimiento.
     * @return mesNac int.
     */
    public int getmesNac() { return this.mesNac; }

    /**
     * <b>Objetivo:</b> Obtener el año de nacimiento.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el año de nacimiento.
     * @return anioNac int.
     */
    public int getanioNac() { return this.anioNac; }

    /**
     * <b>Objetivo:</b> Obtener el género.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el género.
     * @return genero String.
     */
    public String getgenero() { return this.genero; }

    /**
     * <b>Objetivo:</b> Obtener el estado civil.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el estado civil.
     * @return estadoCivil String.
     */
    public String getestadoCivil() { return this.estadoCivil; }

    /**
     * <b>Objetivo:</b> Obtener el número de celular.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el número de celular.
     * @return numCelular String.
     */
    public String getnumCelular() { return this.numCelular; }

    /**
     * <b>Objetivo:</b> Obtener la nacionalidad.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna la nacionalidad.
     * @return nacionalidad String.
     */
    public String getnacionalidad() { return this.nacionalidad; }

    /**
     * <b>Objetivo:</b> Obtener la dirección.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna la dirección.
     * @return direccion String.
     */
    public String getdireccion() { return this.direccion; }

    /**
     * <b>Objetivo:</b> Obtener el correo electrónico.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el correo electrónico.
     * @return correo String.
     */
    public String getcorreo() { return this.correo; }

    /**
     * <b>Objetivo:</b> Obtener el tipo de sangre.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el tipo de sangre.
     * @return tipoSangre String.
     */
    public String gettipoSangre() { return this.tipoSangre; }

    /**
     * <b>Objetivo:</b> Obtener el valor RH.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Retorna el valor RH.
     * @return rh String.
     */
    public String getRh() { return this.rh; }

    /**
     * <b>Objetivo:</b> Mostrar todos los datos de la persona en formato de texto.<br>
     * <b>Precondición:</b> El objeto Persona debe estar creado.<br>
     * <b>Poscondición:</b> Se entrega un texto organizado con toda la información de la persona.<br>
     * @return Un texto con todos los datos de la persona, uno por línea.
     */
    public String toString() {
        String s = "";
        s += "Tipo de Documento: " + this.tipoDoc + "\n";
        s += "Número de Documento: " + this.numeroDoc + "\n";
        s += "Primer Nombre: " + this.primerNombre + "\n";
        s += "Segundo Nombre: " + this.segundoNombre + "\n";
        s += "Primer Apellido: " + this.primerApellido + "\n";
        s += "Segundo Apellido: " + this.segundoApellido + "\n";
        s += "Fecha de Nacimiento: " + this.diaNac + "/" + this.mesNac + "/" + this.anioNac + "\n";
        s += "Género: " + this.genero + "\n";
        s += "Estado Civil: " + this.estadoCivil + "\n";
        s += "Número de Celular: " + this.numCelular + "\n";
        s += "Nacionalidad: " + this.nacionalidad + "\n";
        s += "Dirección: " + this.direccion + "\n";
        s += "Correo Electrónico: " + this.correo + "\n";
        s += "Tipo de Sangre: " + this.tipoSangre + "\n";
        s += "Factor RH: " + this.rh + "\n";
        return s;
    }

    // MODIFICADORES (SETTERS)

    /**
     * <b>Objetivo:</b> Modificar el tipo de documento.<br>
     * <b>Precondición:</b> Recibir un valor válido para tipoDoc.<br>
     * <b>Poscondición:</b> El atributo tipoDoc se actualiza con el nuevo valor.
     * @param tipoDoc, es el nuevo tipo de documento.
     */
    public void setTipoDoc(String tipoDoc) { this.tipoDoc = tipoDoc; }

    /**
     * <b>Objetivo:</b> Modificar el número de documento.<br>
     * <b>Precondición:</b> Recibir un valor válido para numeroDoc.<br>
     * <b>Poscondición:</b> El atributo numeroDoc se actualiza con el nuevo valor.
     * @param numeroDoc, es el nuevo número de documento.
     */
    public void setNumeroDoc(int numeroDoc) { this.numeroDoc = numeroDoc; }

    /**
     * <b>Objetivo:</b> Modificar el primer nombre.<br>
     * <b>Precondición:</b> Recibir un valor válido para primerNombre.<br>
     * <b>Poscondición:</b> El atributo primerNombre se actualiza con el nuevo valor.
     * @param primerNombre, es el nuevo primer nombre.
     */
    public void setprimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    /**
     * <b>Objetivo:</b> Modificar el segundo nombre.<br>
     * <b>Precondición:</b> Recibir un valor válido para segundoNombre.<br>
     * <b>Poscondición:</b> El atributo segundoNombre se actualiza con el nuevo valor.
     * @param segundoNombre, es el nuevo segundo nombre.
     */
    public void setsegundoNombre(String segundoNombre) { this.segundoNombre = segundoNombre; }

    /**
     * <b>Objetivo:</b> Modificar el primer apellido.<br>
     * <b>Precondición:</b> Recibir un valor válido para primerApellido.<br>
     * <b>Poscondición:</b> El atributo primerApellido se actualiza con el nuevo valor.
     * @param primerApellido, es el nuevo primer apellido.
     */
    public void setprimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    /**
     * <b>Objetivo:</b> Modificar el segundo apellido.<br>
     * <b>Precondición:</b> Recibir un valor válido para segundoApellido.<br>
     * <b>Poscondición:</b> El atributo segundoApellido se actualiza con el nuevo valor.
     * @param segundoApellido, es el nuevo segundo apellido.
     */
    public void setsegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }

    /**
     * <b>Objetivo:</b> Modificar el día de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para diaNac (1-31).<br>
     * <b>Poscondición:</b> El atributo diaNac se actualiza con el nuevo valor.
     * @param diaNac, es el nuevo día de nacimiento.
     */
    public void setdiaNac(int diaNac) { this.diaNac = diaNac; }

    /**
     * <b>Objetivo:</b> Modificar el mes de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para mesNac (1-12).<br>
     * <b>Poscondición:</b> El atributo mesNac se actualiza con el nuevo valor.
     * @param mesNac, es el nuevo mes de nacimiento.
     */
    public void setmesNac(int mesNac) { this.mesNac = mesNac; }

    /**
     * <b>Objetivo:</b> Modificar el año de nacimiento.<br>
     * <b>Precondición:</b> Recibir un valor válido para anioNac.<br>
     * <b>Poscondición:</b> El atributo anioNac se actualiza con el nuevo valor.
     * @param anioNac, es el nuevo año de nacimiento.
     */
    public void setanioNac(int anioNac) { this.anioNac = anioNac; }

    /**
     * <b>Objetivo:</b> Modificar el género.<br>
     * <b>Precondición:</b> Recibir un valor válido para genero.<br>
     * <b>Poscondición:</b> El atributo genero se actualiza con el nuevo valor.
     * @param genero, es el nuevo género.
     */
    public void setgenero(String genero) { this.genero = genero; }

    /**
     * <b>Objetivo:</b> Modificar el estado civil.<br>
     * <b>Precondición:</b> Recibir un valor válido para estadoCivil.<br>
     * <b>Poscondición:</b> El atributo estadoCivil se actualiza con el nuevo valor.
     * @param estadoCivil, es el nuevo estado civil.
     */
    public void setestadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    /**
     * <b>Objetivo:</b> Modificar el número de celular.<br>
     * <b>Precondición:</b> Recibir un valor válido para numCelular.<br>
     * <b>Poscondición:</b> El atributo numCelular se actualiza con el nuevo valor.
     * @param numCelular, es el nuevo número de celular.
     */
    public void setnumCelular(String numCelular) { this.numCelular = numCelular; }

    /**
     * <b>Objetivo:</b> Modificar la nacionalidad.<br>
     * <b>Precondición:</b> Recibir un valor válido para nacionalidad.<br>
     * <b>Poscondición:</b> El atributo nacionalidad se actualiza con el nuevo valor.
     * @param nacionalidad, es la nueva nacionalidad.
     */
    public void setnacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    /**
     * <b>Objetivo:</b> Modificar la dirección.<br>
     * <b>Precondición:</b> Recibir un valor válido para direccion.<br>
     * <b>Poscondición:</b> El atributo direccion se actualiza con el nuevo valor.
     * @param direccion, es la nueva dirección.
     */
    public void setdireccion(String direccion) { this.direccion = direccion; }

    /**
     * <b>Objetivo:</b> Modificar el correo electrónico.<br>
     * <b>Precondición:</b> Recibir un valor válido para correo.<br>
     * <b>Poscondición:</b> El atributo correo se actualiza con el nuevo valor.
     * @param correo, es el nuevo correo electrónico.
     */
    public void setcorreo(String correo) { this.correo = correo; }

    /**
     * <b>Objetivo:</b> Modificar el tipo de sangre.<br>
     * <b>Precondición:</b> Recibir un valor válido para tipoSangre.<br>
     * <b>Poscondición:</b> El atributo tipoSangre se actualiza con el nuevo valor.
     * @param tipoSangre, es el nuevo tipo de sangre.
     */
    public void settipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }

    /**
     * <b>Objetivo:</b> Modificar el factor RH.<br>
     * <b>Precondición:</b> Recibir un valor válido para rh.<br>
     * <b>Poscondición:</b> El atributo rh se actualiza con el nuevo valor.
     * @param rh, es el nuevo factor RH.
     */
    public void setrh(String rh) { this.rh = rh; }
}
