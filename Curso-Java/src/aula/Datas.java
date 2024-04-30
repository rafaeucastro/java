package aula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Datas {
    public static void main(String[] args) {
        diferencaDataAteJava7();
        diferencaDataAteJava8();
        diferencaDataAteJava8ComTempo();
    }

    public static void diferencaDataAteJava8(){
        System.out.println("\n- - - Java 8");

        LocalDate data1 = LocalDate.of(2019, 01, 01);
        LocalDate data2 = LocalDate.of(2019, 02, 01);

        Period periodo = Period.between(data1, data2);

        System.out.println(periodo.getMonths());
    }

    public static void diferencaDataAteJava8ComTempo(){
        System.out.println("\n- - - Java 8 com Tempo");

        LocalDateTime data1 = LocalDateTime.of(2019, 01, 01, 6, 30);
        LocalDateTime data2 = LocalDateTime.of(2019, 01, 01, 8, 30);

        Duration duration = Duration.between(data1, data2);
        long diff = ChronoUnit.HOURS.between(data1, data2);

        System.out.println(duration.toHours());
        System.out.println(diff);
    }

    public static void diferencaDataAteJava7() {
        System.out.println("\n- - - Java 7");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date first = sdf.parse("01/02/2019");
            Date second = sdf.parse("01/03/2019");

            long diffEmMil = Math.abs(first.getTime() - second.getTime());
            long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
            int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));

            System.out.println(diff);
            System.out.println(dias);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
