package com.neptunesoft.gestionbacdz.database;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.neptunesoft.gestionbacdz.dao.NoteDao;
import com.neptunesoft.gestionbacdz.dao.NoteDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class DataBase_Impl extends DataBase {
    private volatile NoteDao _noteDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) { // from class: com.neptunesoft.gestionbacdz.database.DataBase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `Notes` (`id_note` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `date_time` TEXT, `subtitle` TEXT, `note_content` TEXT, `image_path` TEXT, `color` TEXT, `web_link` TEXT)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c208f06973ce182d654a18968cbaf62')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `Notes`");
                List list = DataBase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List list = DataBase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                DataBase_Impl.this.mDatabase = db;
                DataBase_Impl.this.internalInitInvalidationTracker(db);
                List list = DataBase_Impl.this.mCallbacks;
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
                HashMap hashMap = new HashMap(8);
                hashMap.put("id_note", new TableInfo.Column("id_note", "INTEGER", true, 1, null, 1));
                hashMap.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                hashMap.put("date_time", new TableInfo.Column("date_time", "TEXT", false, 0, null, 1));
                hashMap.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
                hashMap.put("note_content", new TableInfo.Column("note_content", "TEXT", false, 0, null, 1));
                hashMap.put("image_path", new TableInfo.Column("image_path", "TEXT", false, 0, null, 1));
                hashMap.put(TypedValues.Custom.S_COLOR, new TableInfo.Column(TypedValues.Custom.S_COLOR, "TEXT", false, 0, null, 1));
                hashMap.put("web_link", new TableInfo.Column("web_link", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("Notes", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(db, "Notes");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "Notes(com.neptunesoft.gestionbacdz.entities.Note).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "6c208f06973ce182d654a18968cbaf62", "213830e1750e4d7bdf9a8bf855d4b570")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Notes");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `Notes`");
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
        hashMap.put(NoteDao.class, NoteDao_Impl.getRequiredConverters());
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

    @Override // com.neptunesoft.gestionbacdz.database.DataBase
    public NoteDao noteDao() {
        NoteDao noteDao;
        if (this._noteDao != null) {
            return this._noteDao;
        }
        synchronized (this) {
            if (this._noteDao == null) {
                this._noteDao = new NoteDao_Impl(this);
            }
            noteDao = this._noteDao;
        }
        return noteDao;
    }
}
