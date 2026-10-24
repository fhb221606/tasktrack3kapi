package at.fhb221606.tasktrack3kapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();


    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    public TaskController() {
        tasks.add(new Task(1, "Spring Boot lernen", false));
        tasks.add(new Task(2, "REST API verstehen", true));
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {

        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        int nextId = tasks.size() + 1;
        task.setId(nextId);
        tasks.add(task);
        return task;
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task updatedTask) {

        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(updatedTask.getTitle());
                task.setCompleted(updatedTask.getCompleted());
                return task;
            }
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
    }



}
