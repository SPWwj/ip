package tasks;

import utilities.Parser;

import java.util.Date;

public class Deadline extends ITask {
    private final Date _by;

    public Deadline(String description, Date by) {
        super(description);
        _by = by;
    }
    public Deadline(String description, Date by, boolean isDone) {
        super(description,isDone);
        _by = by;
    }
    @Override
    public String toSaveFormat() {
        return "[D] " + "/by: " + _by + " /content: " + super.toString() ;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " +
                Parser.outputFormat.format(this._by) + ")";
    }
}
