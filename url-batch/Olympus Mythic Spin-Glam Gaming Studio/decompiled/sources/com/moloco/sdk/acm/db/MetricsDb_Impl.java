package com.moloco.sdk.acm.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public final class MetricsDb_Impl extends MetricsDb {
    public volatile d d;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `events`");
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) MetricsDb_Impl.this).mDatabase = supportSQLiteDatabase;
            MetricsDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(6);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            hashMap.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            hashMap.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0, null, 1));
            hashMap.put("data", new TableInfo.Column("data", "INTEGER", false, 0, null, 1));
            hashMap.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("events", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "events");
            if (tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "events(com.moloco.sdk.acm.db.EventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `events`");
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
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, e.c());
        return hashMap;
    }

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public d b() {
        d dVar;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new e(this);
                }
                dVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
