package kg.easyit.reactorv1.todo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToDo {
    String id;
    String description;
    LocalDateTime created;
    LocalDateTime modified;
    boolean completed;

    public ToDo(String description) {
        this.description = description;
    }

    public ToDo(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

}
