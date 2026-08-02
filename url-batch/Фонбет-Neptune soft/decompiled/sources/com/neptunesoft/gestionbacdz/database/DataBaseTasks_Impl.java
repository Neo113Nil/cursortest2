package com.neptunesoft.gestionbacdz.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.neptunesoft.gestionbacdz.dao.TaskDao;
import com.neptunesoft.gestionbacdz.dao.TaskDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class DataBaseTasks_Impl extends DataBaseTasks {
    private volatile TaskDao _taskDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) { // from class: com.neptunesoft.gestionbacdz.database.DataBaseTasks_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `Tasks` (`id_task` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `task` TEXT, `date_time_created` TEXT, `date_time_reminder` TEXT, `checked` INTEGER NOT NULL, `reminded` INTEGER NOT NULL)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'faa76c6e6e08b4265f681c8b77d94742')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `Tasks`");
                List list = DataBaseTasks_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List list = DataBaseTasks_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                DataBaseTasks_Impl.this.mDatabase = db;
                DataBaseTasks_Impl.this.internalInitInvalidationTracker(db);
                List list = DataBaseTasks_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("id_task", new TableInfo.Column("id_task", "INTEGER", true, 1, null, 1));
                hashMap.put("task", new TableInfo.Column("task", "TEXT", false, 0, null, 1));
                hashMap.put("date_time_created", new TableInfo.Column("date_time_created", "TEXT", false, 0, null, 1));
                hashMap.put("date_time_reminder", new TableInfo.Column("date_time_reminder", "TEXT", false, 0, null, 1));
                hashMap.put("checked", new TableInfo.Column("checked", "INTEGER", true, 0, null, 1));
                hashMap.put("reminded", new TableInfo.Column("reminded", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("Tasks", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(db, "Tasks");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "Tasks(com.neptunesoft.gestionbacdz.entities.Task).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "faa76c6e6e08b4265f681c8b77d94742", "717bf1446043684e4adb5ef29ed4d6cb")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Tasks");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `Tasks`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(TaskDao.class, TaskDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.neptunesoft.gestionbacdz.database.DataBaseTasks
    public TaskDao taskDao() {
        TaskDao taskDao;
        if (this._taskDao != null) {
            return this._taskDao;
        }
        synchronized (this) {
            if (this._taskDao == null) {
                this._taskDao = new TaskDao_Impl(this);
            }
            taskDao = this._taskDao;
        }
        return taskDao;
    }
}
