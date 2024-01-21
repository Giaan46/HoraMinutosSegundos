package Tp2;

/**
 * crea una clase segundos que incluya los siguientes dos metodos estaticos:
 * -int convertToseconds(int days, int hours, int minutes, int seconds)
 * devuelve el numero total de segundos que hay en los dias,horas, minutos y segundos especificados.
 *
 * -int[] convertToDHMS(int totalSeconds)
 * dados los segundos especificados devuelve el numero de dias,horas,minutosy segundos que
 * representan, lo devuelve en forma de array donde la posicion [0]
 * representa a los dias, la posicion [1] a las horas, la posicion [2]
 *  a los minutos y la posicion [3] a los segundos.
 */
public class Segundos {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;
    public static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    public static final int SECONDS_IN_DAY = HOURS_IN_DAY * SECONDS_IN_HOUR;


    public static int convertToSeconds(int days,int hours, int minutes, int seconds ){
        int totalSeconds = seconds;

        totalSeconds += minutes * SECONDS_IN_MINUTE;
        totalSeconds += hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        totalSeconds += days * SECONDS_IN_DAY;


        return totalSeconds;

    }
    public static int [] convertToDHMS( int totalSeconds){
        int[] dhms = new int[4];// 0=d,1=h,2=m,3=s

        dhms[0] = totalSeconds / SECONDS_IN_DAY; // Division entera
        totalSeconds = totalSeconds % SECONDS_IN_DAY; // Resto

        dhms[1] = totalSeconds / SECONDS_IN_HOUR; //
        totalSeconds = totalSeconds % SECONDS_IN_HOUR;
        dhms[2] = totalSeconds / SECONDS_IN_MINUTE;
        dhms[3] = totalSeconds % SECONDS_IN_MINUTE;

        return dhms;}
}
