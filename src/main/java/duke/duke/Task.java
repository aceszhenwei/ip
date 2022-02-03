package duke.duke;
import java.io.Serializable;

public class Task implements Serializable {
    protected String name;
    protected boolean isDone;
    protected final String mark = "[X]";
    protected final String unmarked = "[ ]";

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public String getName() {
        return this.name;
    }

    public void setMarked() {
        this.isDone = true;
    }

    public void setUnmarked() {
        this.isDone = false;
    }

    public String isDone() {
        if (this.isDone) {
            return mark;
        } else {
            return unmarked;
        }
    }

    @Override
    public String toString() {
        return isDone() + " " + getName();
    }
}
