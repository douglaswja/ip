package duke.commands;

import duke.tasks.Task;

/**
 * An implementation of the duke.tasks.Task class that represents duke.commands.Event Tasks.
 * <p>
 * duke.commands.Event tasks are tasks that take a description, track whether they are done or not,
 * and take an /at parameter, specifying the Date & Location of the duke.commands.Event.
 * <p>
 * The duke.commands.Event class is visually represented with the prefix: [E]
 *
 * @author Douglas Wei Jing Allwood
 * @author douglas_allwood@u.nus.edu
 */
public class Event extends Task {
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + this.at + ")";
    }
}