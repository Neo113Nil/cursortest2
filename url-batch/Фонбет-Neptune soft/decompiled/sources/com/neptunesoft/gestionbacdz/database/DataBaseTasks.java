package com.neptunesoft.gestionbacdz.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.neptunesoft.gestionbacdz.dao.TaskDao;

/* loaded from: classes.dex */
public abstract class DataBaseTasks extends RoomDatabase {
    private static DataBaseTasks dataBaseTasks;

    public abstract TaskDao taskDao();

    public static synchronized DataBaseTasks getDataBase(Context context) {
        DataBaseTasks dataBaseTasks2;
        synchronized (DataBaseTasks.class) {
            if (dataBaseTasks == null) {
                dataBaseTasks = (DataBaseTasks) Room.databaseBuilder(context, DataBaseTasks.class, "tasks_db").build();
            }
            dataBaseTasks2 = dataBaseTasks;
        }
        return dataBaseTasks2;
    }
}
