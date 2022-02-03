package duke.duke;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;

public class Event extends Task {

    protected String time;

    public Event(String name, String time) {
        super(name);
        this.time = time;
    }

    /**
     * Converts a date that starts in the format of YYYY-MM-DD, and formats
     * it to DD Mon YYYY.
     *
     * @param dueDate Date in format of YYYY-MM-DD
     * @return Formatted date
     */

    public String convertDate(String dueDate) {
        try {
            LocalDate date = LocalDate.parse(dueDate);
            String year = String.valueOf(date.getYear());
            String month = date.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            String day = String.valueOf(date.getDayOfMonth());
            return month + " " + day + " " + year;
        } catch (DateTimeParseException e) {
            return dueDate;
        }
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + convertDate(this.time) + ")";
    }
}
