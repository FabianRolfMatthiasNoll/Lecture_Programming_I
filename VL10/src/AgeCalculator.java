import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1996, 8, 6);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        long minutes = years * 525600 + months * 43800 + days * 1440;
        System.out.println("Minutes: " + minutes);
    }
}