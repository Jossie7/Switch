public class Funcion3 {
    public static void main(String[] args){
        int dia=4;
        switch(dia){
            case 1: dia=1;
                System.out.println("Hoy es lunes");
                break;
            case 2: dia=2;
                System.out.println("Hoy es martes");
                break;
            case 3: dia=3;
                System.out.println("Hoy es miércoles");
                break;
            case 4: dia=4;
                System.out.println("Hoy es jueves");
                break;
            case 5: dia=5;
                System.out.println("Hoy es viernes");
                break;
            default:
                System.out.println("Hoy es fin de semana");
                break;
        }
    }
}
