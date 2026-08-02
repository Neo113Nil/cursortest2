package com.neptunesoft.gestionbacdz.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.neptunesoft.gestionbacdz.dao.NoteDao;

/* loaded from: classes.dex */
public abstract class DataBase extends RoomDatabase {
    private static DataBase dataBase;

    public abstract NoteDao noteDao();

    public static synchronized DataBase getDataBase(Context context) {
        DataBase dataBase2;
        synchronized (DataBase.class) {
            if (dataBase == null) {
                dataBase = (DataBase) Room.databaseBuilder(context, DataBase.class, "notes_db").build();
            }
            dataBase2 = dataBase;
        }
        return dataBase2;
    }
}
