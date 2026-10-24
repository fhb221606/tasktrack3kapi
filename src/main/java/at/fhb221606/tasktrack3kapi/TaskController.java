package at.fhb221606.tasktrack3kapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getAllTasks()
    {
        return List.of(
                new Task(1, "Spring Boot lernen", false),
                new Task(2, "Rest API verstehen", true)
        );
    }


    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id)
    {
        return getAllTasks().stream()
                .filter(task -> task.getId() == (id))
                .findFirst()
                .orElse(null);
    }
}
