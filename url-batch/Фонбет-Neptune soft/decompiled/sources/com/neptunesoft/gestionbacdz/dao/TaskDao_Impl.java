package com.neptunesoft.gestionbacdz.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.neptunesoft.gestionbacdz.entities.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class TaskDao_Impl implements TaskDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Task> __deletionAdapterOfTask;
    private final EntityInsertionAdapter<Task> __insertionAdapterOfTask;

    public TaskDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) { // from class: com.neptunesoft.gestionbacdz.dao.TaskDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Tasks` (`id_task`,`task`,`date_time_created`,`date_time_reminder`,`checked`,`reminded`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Task task) {
                supportSQLiteStatement.bindLong(1, task.getId_task());
                if (task.getTask() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, task.getTask());
                }
                if (task.getDate_time_created() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, task.getDate_time_created());
                }
                if (task.getDate_time_reminder() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, task.getDate_time_reminder());
                }
                supportSQLiteStatement.bindLong(5, task.isChecked() ? 1L : 0L);
                supportSQLiteStatement.bindLong(6, task.isReminded() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) { // from class: com.neptunesoft.gestionbacdz.dao.TaskDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `Tasks` WHERE `id_task` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Task entity) {
                statement.bindLong(1, entity.getId_task());
            }
        };
    }

    @Override // com.neptunesoft.gestionbacdz.dao.TaskDao
    public void insertTask(final Task task) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTask.insert((EntityInsertionAdapter<Task>) task);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.TaskDao
    public void deleteTask(final Task task) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfTask.handle(task);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.TaskDao
    public List<Task> getAllTasks() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from (SELECT * FROM Tasks ORDER BY id_task DESC) as tasks ORDER BY tasks.checked ASC,tasks.id_task DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_task");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "task");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date_time_created");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "date_time_reminder");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "checked");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "reminded");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                Task task = new Task();
                task.setId_task(query.getInt(columnIndexOrThrow));
                task.setTask(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                task.setDate_time_created(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                task.setDate_time_reminder(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                boolean z = true;
                task.setChecked(query.getInt(columnIndexOrThrow5) != 0);
                if (query.getInt(columnIndexOrThrow6) == 0) {
                    z = false;
                }
                task.setReminded(z);
                arrayList.add(task);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.TaskDao
    public List<Task> getAllTasksReminder() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from tasks where tasks.checked = 0 and tasks.reminded = 0 and tasks.date_time_reminder NOT NULL", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_task");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "task");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date_time_created");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "date_time_reminder");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "checked");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "reminded");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                Task task = new Task();
                task.setId_task(query.getInt(columnIndexOrThrow));
                task.setTask(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                task.setDate_time_created(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                task.setDate_time_reminder(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                boolean z = true;
                task.setChecked(query.getInt(columnIndexOrThrow5) != 0);
                if (query.getInt(columnIndexOrThrow6) == 0) {
                    z = false;
                }
                task.setReminded(z);
                arrayList.add(task);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.TaskDao
    public Task getLastTast() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from Tasks where id_task = (SELECT MAX(id_task)  FROM Tasks)", 0);
        this.__db.assertNotSuspendingTransaction();
        Task task = null;
        String string = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_task");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "task");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date_time_created");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "date_time_reminder");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "checked");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "reminded");
            if (query.moveToFirst()) {
                Task task2 = new Task();
                task2.setId_task(query.getInt(columnIndexOrThrow));
                task2.setTask(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                task2.setDate_time_created(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow4)) {
                    string = query.getString(columnIndexOrThrow4);
                }
                task2.setDate_time_reminder(string);
                task2.setChecked(query.getInt(columnIndexOrThrow5) != 0);
                task2.setReminded(query.getInt(columnIndexOrThrow6) != 0);
                task = task2;
            }
            return task;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
