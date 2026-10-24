package at.fhb221606.tasktrack3kapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();


    @GetMapping
    public List<Task> getAllTasks()
    {
        return tasks;
    }

    public TaskController() {
        tasks.add(new Task(1, "Spring Boot lernen", false));
        tasks.add(new Task(2, "REST API verstehen", true));
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id)
    {
        return getAllTasks().stream()
                .filter(task -> task.getId() == (id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        int nextId = tasks.size() + 1;
        task.setId(nextId);
        tasks.add(task);
        return task;
    }
}
