import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
        static Scanner t = new Scanner(System.in);
        static int option = -1;
        static ArrayList<zombies> arrayzombies = new ArrayList<zombies>();
        static ArrayList<ubicaciones> arrayubicaciones = new ArrayList<ubicaciones>();
        static int contadorZombies=0;
        static int contadorUbicaciones=0;
        
    public static void main(String args[]){
        interfaz();
        while(true){
        mostrarMenu();
        option= t.nextInt();
        if (option==0){
            option0();
            break;
        }
        switch(option){
            case 1: option1();
            break;
            case 2: option2();
            break;
            case 3: option3();
            break;
            case 4: option4();
            break;
            case 5: option5();
            break;
            case 6: option6();
            break;
            case 7: option7();
            break;
            case 8: option8();
            break;
            case 9: option9();
            break;
            case 10: option10();
            break;
            case 11: option11();
            break;
            case 12: option12();
            break;
        }
    }
    }
    
    public static void interfaz(){
        System.out.println("Bienvenido al software de la ciudad de Alexandria");
        System.out.println("A continuación se muestran las funciones del programa: ");
        System.out.println();
    }
    
    public static void mostrarMenu(){
            System.out.println("Si ingresa el numero 0 el programa se detiene.");
            System.out.println("Si ingresa el numero 1 se creara un nuevo zombie.");
            System.out.println("Si ingresa el numero 2 se mostrara la informacion de todos los zombies.");
            System.out.println("Si ingresa el numero 3 se mostrara la cantidad de zombies.");
            System.out.println("Si ingresa el numero 4 se mostrara la informacion de los zombies con sangre O+ y AB+.");
            System.out.println("Si ingresa el numero 5 se mostrara la informacion de los zombies que nacieron despues del 2000.");
            System.out.println("Si ingresa el numero 6 se bajara la vida de todos los zombies a la mitad.");
            System.out.println("Si ingresa el numero 7 se creara una ubicacion.");
            System.out.println("Si ingresa el numero 8 se mostrara todas las ubicaciones.");
            System.out.println("Si ingresa el numero 9 se mostrara la ubicacion mas segura.");
            System.out.println("Si ingresa el numero 10 se mostrara todas las ubicaciones en orden de cercania a Alexandria.");
            System.out.println("Si ingresa el numero 11 se mostrara una frase de zombies.");
            System.out.println("Si ingresa el numero 12 matara a los zombies del tipo de sangre que elija.");
            
            System.out.println("Ingrese un numero: ");
    }

    public static void option0(){
        System.out.println("Fin del programa");
    }

    public static void option1(){
        System.out.println("Ingrese el nombre del zombie");
        String nombreZombie = t.next();
        System.out.println("Ingrese la salud del zombie");
        int salud = t.nextInt();
        System.out.println("Ingrese la fecha de nacimiento del zombie");
        int fechaDeNacimiento = t.nextInt();
        System.out.println("Ingrese el tipo de sangre del zombie");
        String tipoDeSangre = t.next().toUpperCase();
                
        zombies z1 = new zombies(nombreZombie,salud,fechaDeNacimiento,tipoDeSangre);
                
        arrayzombies.add(z1);
        contadorZombies++;
    }

    public static void option2(){
        for(int i = 0;i<arrayzombies.size();i++){
                    System.out.println("zombie "+(i+1)+": "+arrayzombies.get(i).toString());
                }
    }

    public static void option3(){
        System.out.println("La cantidad de zombies creados hasta el momento es de: "+contadorZombies);
    }

    public static void option4(){
        for(int j=0;j<arrayzombies.size();j++){
                    if(arrayzombies.get(j).getTipoDeSangre().equals("O+") || arrayzombies.get(j).getTipoDeSangre().equals("AB+")){
                        System.out.println("zombie "+(j+1)+": "+arrayzombies.get(j).toString());
                    }
                }
    }

    public static void option5(){
        for(int j=0;j<arrayzombies.size();j++){
                    if(arrayzombies.get(j).getFechaDeNacimiento()>=2000){
                        System.out.println("zombie "+(j+1)+": "+arrayzombies.get(j).toString());
                    }
        }
    }

    public static void option6(){
        for(int j=0;j<arrayzombies.size();j++){
                    arrayzombies.get(j).setSalud((arrayzombies.get(j).getSalud())/2);
                        System.out.println("zombie "+(j+1)+": "+arrayzombies.get(j).toString());
        }
}

    public static void option7(){
        System.out.println("Ingrese el nombre de la ubicación");
        String nombreUbicacion = t.next();
        System.out.println("Ingrese la distancia a Alexandria de la ubicacion");
        float distancia= t.nextFloat();
        System.out.println("Ingrese la cantidad de zombies de la ubicacion");
        int cantidadZombies = t.nextInt();
                
        ubicaciones u1 = new ubicaciones(nombreUbicacion,distancia,cantidadZombies);
                
        arrayubicaciones.add(u1);
        contadorUbicaciones++;

    }

    public static void option8(){
        for(int k=0;k<arrayubicaciones.size();k++){
                    System.out.println("Ubicacion "+(k+1)+": "+arrayubicaciones.get(k).toString());
        }
    }

    public static void option9(){
        ubicaciones menor = arrayubicaciones.get(0);
                for(int l=1;l<arrayubicaciones.size();l++){
                    if(arrayubicaciones.get(l).getCantidadZombies()<=menor.getCantidadZombies()){
                        menor=arrayubicaciones.get(l);
                    }
                }
        System.out.println("La ubicacion más segura es: "+menor.toString());
    }

    public static void option10(){
        ubicaciones[] arrayubicacionesordenadas = new ubicaciones[arrayubicaciones.size()]; 
        int temporal,guardarm=0;
                for(int n=0;n<arrayubicaciones.size();n++){
                            arrayubicacionesordenadas[n]=arrayubicaciones.get(n);
                }
                for(int l=0;l<arrayubicaciones.size();l++){
                    guardarm=l;
                    ubicaciones menor=arrayubicacionesordenadas[l];
                    ubicaciones ubicacionAnterior = arrayubicacionesordenadas[l];
                    for(int m=l+1;m<arrayubicacionesordenadas.length;m++){
                    if(arrayubicacionesordenadas[m].getDistanciaAlexandria()<menor.getDistanciaAlexandria()){
                        menor=arrayubicacionesordenadas[m];
                        guardarm=m;
                    }
                    }
                    arrayubicacionesordenadas[guardarm]=ubicacionAnterior;
                    arrayubicacionesordenadas[l]=menor;
                }
        System.out.println("Las ubicaciones orden de cercania son:");
        System.out.println();
                for(int k=0;k<arrayubicacionesordenadas.length;k++){
                    System.out.println("Ubicacion "+(k+1)+": "+arrayubicacionesordenadas[k].toString());
                }  
    }

    public static void option11(){
        int numeroAleatorio =(int) Math.random()*5;
            switch(numeroAleatorio){
            case 0:System.out.println("Cerebrooooooossssss");
            break;
            case 1: System.out.println("Te voy a matar");
            break;
            case 2: System.out.println("Estas rodeado de zombies");
            break;
            case 3: System.out.println("Ha llegado tu hora");
            break;
            case 4: System.out.println("El dolor no desaparece");
            break;
            }
    }

    public static void option12(){
        System.out.println("Ingrese el tipo de sangre a matar");
        String matarTipoDeSangre = t.next();
            for(int j=0;j<arrayzombies.size();j++){
                    if(arrayzombies.get(j).getTipoDeSangre().equals(matarTipoDeSangre)){
                        arrayzombies.get(j).setSalud(0);
                        System.out.println("zombie "+(j+1)+": "+arrayzombies.get(j).toString());
                    }
            }
    }
}