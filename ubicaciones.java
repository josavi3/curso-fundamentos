public class ubicaciones{
    private String nombreUbicacion;
    private float distanciaAlexandria;
    private int cantidadZombies;
    
    public ubicaciones(String n,float d,int c){
        this.nombreUbicacion=n;
        this.distanciaAlexandria=d;
        this.cantidadZombies=c;
    }

    public float getDistanciaAlexandria() {
        return distanciaAlexandria;
    }

    public int getCantidadZombies() {
        return cantidadZombies;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setCantidadZombies(int cantidadZombies) {
        this.cantidadZombies = cantidadZombies;
    }

    public void setDistanciaAlexandria(float distanciaAlexandria) {
        this.distanciaAlexandria = distanciaAlexandria;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }
    
    public String toString(){
        return "Nombre: "+nombreUbicacion+" distancia a Alexandría: "+distanciaAlexandria+" cantidad de zombies: "+cantidadZombies;
    }
}