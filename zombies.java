public class zombies{
    private String nombreZombie;
    private int salud;
    private int fechaDeNacimiento;
    private String tipoDeSangre;
    
    public zombies(String n,int s,int f,String t){
        this.nombreZombie=n;
        this.salud=s;
        this.fechaDeNacimiento=f;
        this.tipoDeSangre=t;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getSalud() {
        return salud;
    }

    public String getNombreZombie() {
        return nombreZombie;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNombreZombie(String nombreZombie) {
        this.nombreZombie = nombreZombie;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }
    
    public String toString(){
        return "Nombre: "+nombreZombie+" salud: "+salud+" fecha de nacimiento: "+fechaDeNacimiento+" tipo de sangre: "+tipoDeSangre;
    }
}