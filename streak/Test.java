import java.time.LocalDate;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        LocalDate dato1 = LocalDate.now();
        LocalDate dato2 = LocalDate.of(2025, Month.JANUARY, 16);
        if (dato1.plusDays(1).isEqual(dato2)){
            System.out.println("Suksess!");
        }
    }
} 
