package practice;
import model.Candidate;
import java.util.function.Predicate;
public class CandidateValidator implements Predicate<Candidate> {
    public static final int ages = 35;
    public static final String Ukr = "Ukraininan";
    public static final String tire = "-";
    public static final int num = 0;
    public static final int numb = 1;
    public static final int startYears = 10;
    @Override
    public boolean test(Candidate candidate) {
        return Candidate.getAge() > ages &&
                Candidate.isAllowedToVote() &&
                Ukr.equals(Candidate.getNationality()) &&
                getPeriodsInUkr(Candidate.getPeriodsInUkr());
    }
    private boolean getPeriodsInUkr(String periods) {
        String[] years = periods.split(tire);
        if (years.length == 2) {
            try {
                int startYear = Integer.parseInt(years[num]);
                int endYear = Integer.parseInt(years[numb]);
                return (endYear - startYear) >= startYears;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}