package com.neptunesoft.gestionbacdz.dao;

import com.neptunesoft.gestionbacdz.entities.Task;
import java.util.List;

/* loaded from: classes.dex */
public interface TaskDao {
    void deleteTask(Task task);

    List<Task> getAllTasks();

    List<Task> getAllTasksReminder();

    Task getLastTast();

    void insertTask(Task task);
}
