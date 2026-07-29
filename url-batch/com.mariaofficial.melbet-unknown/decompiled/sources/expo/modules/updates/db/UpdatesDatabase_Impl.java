package expo.modules.updates.db;

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
import com.caverock.androidsvg.SVGParser;
import expo.modules.updates.db.dao.AssetDao;
import expo.modules.updates.db.dao.AssetDao_Impl;
import expo.modules.updates.db.dao.JSONDataDao;
import expo.modules.updates.db.dao.JSONDataDao_Impl;
import expo.modules.updates.db.dao.UpdateDao;
import expo.modules.updates.db.dao.UpdateDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatesDatabase_Impl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J*\u0010\u0013\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00150\u00170\u0014H\u0014J\u0016\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00150\u0019H\u0016J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u001a\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0015\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lexpo/modules/updates/db/UpdatesDatabase_Impl;", "Lexpo/modules/updates/db/UpdatesDatabase;", "<init>", "()V", "_updateDao", "Lkotlin/Lazy;", "Lexpo/modules/updates/db/dao/UpdateDao;", "_assetDao", "Lexpo/modules/updates/db/dao/AssetDao;", "_jSONDataDao", "Lexpo/modules/updates/db/dao/JSONDataDao;", "createOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "config", "Landroidx/room/DatabaseConfiguration;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverters", "", "Ljava/lang/Class;", "", "", "getRequiredAutoMigrationSpecs", "", "Landroidx/room/migration/AutoMigrationSpec;", "getAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "updateDao", "assetDao", "jsonDataDao", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesDatabase_Impl extends UpdatesDatabase {
    private final Lazy<UpdateDao> _updateDao = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.db.UpdatesDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            UpdateDao_Impl _updateDao$lambda$0;
            _updateDao$lambda$0 = UpdatesDatabase_Impl._updateDao$lambda$0(UpdatesDatabase_Impl.this);
            return _updateDao$lambda$0;
        }
    });
    private final Lazy<AssetDao> _assetDao = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.db.UpdatesDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AssetDao_Impl _assetDao$lambda$1;
            _assetDao$lambda$1 = UpdatesDatabase_Impl._assetDao$lambda$1(UpdatesDatabase_Impl.this);
            return _assetDao$lambda$1;
        }
    });
    private final Lazy<JSONDataDao> _jSONDataDao = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.db.UpdatesDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            JSONDataDao_Impl _jSONDataDao$lambda$2;
            _jSONDataDao$lambda$2 = UpdatesDatabase_Impl._jSONDataDao$lambda$2(UpdatesDatabase_Impl.this);
            return _jSONDataDao$lambda$2;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateDao_Impl _updateDao$lambda$0(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new UpdateDao_Impl(updatesDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetDao_Impl _assetDao$lambda$1(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new AssetDao_Impl(updatesDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONDataDao_Impl _jSONDataDao$lambda$2(UpdatesDatabase_Impl updatesDatabase_Impl) {
        return new JSONDataDao_Impl(updatesDatabase_Impl);
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate() { // from class: expo.modules.updates.db.UpdatesDatabase_Impl$createOpenHelper$_openCallback$1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
            }

            {
                super(13);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("CREATE TABLE IF NOT EXISTS `updates` (`id` BLOB NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `scope_key` TEXT NOT NULL, `manifest` TEXT NOT NULL, `url` TEXT, `headers` TEXT, `launch_asset_id` INTEGER, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `updates_assets` (`update_id` BLOB NOT NULL, `asset_id` INTEGER NOT NULL, PRIMARY KEY(`update_id`, `asset_id`), FOREIGN KEY(`update_id`) REFERENCES `updates`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_updates_assets_asset_id` ON `updates_assets` (`asset_id`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `assets` (`key` TEXT, `type` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `headers` TEXT, `extra_request_headers` TEXT, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `expected_hash` TEXT, `marked_for_deletion` INTEGER NOT NULL)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_assets_key` ON `assets` (`key`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `json_data` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `scope_key` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_json_data_scope_key` ON `json_data` (`scope_key`)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2331836f27deacc936e75b3f1a360bd')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase db) {
                List list;
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("DROP TABLE IF EXISTS `updates`");
                db.execSQL("DROP TABLE IF EXISTS `updates_assets`");
                db.execSQL("DROP TABLE IF EXISTS `assets`");
                db.execSQL("DROP TABLE IF EXISTS `json_data`");
                list = UpdatesDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase db) {
                List list;
                Intrinsics.checkNotNullParameter(db, "db");
                list = UpdatesDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase db) {
                List list;
                Intrinsics.checkNotNullParameter(db, "db");
                UpdatesDatabase_Impl.this.mDatabase = db;
                db.execSQL("PRAGMA foreign_keys = ON");
                UpdatesDatabase_Impl.this.internalInitInvalidationTracker(db);
                list = UpdatesDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                HashMap hashMap = new HashMap(13);
                hashMap.put("id", new TableInfo.Column("id", "BLOB", true, 1, null, 1));
                hashMap.put("commit_time", new TableInfo.Column("commit_time", "INTEGER", true, 0, null, 1));
                hashMap.put("runtime_version", new TableInfo.Column("runtime_version", "TEXT", true, 0, null, 1));
                hashMap.put("scope_key", new TableInfo.Column("scope_key", "TEXT", true, 0, null, 1));
                hashMap.put("manifest", new TableInfo.Column("manifest", "TEXT", true, 0, null, 1));
                hashMap.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, 1));
                hashMap.put("headers", new TableInfo.Column("headers", "TEXT", false, 0, null, 1));
                hashMap.put("launch_asset_id", new TableInfo.Column("launch_asset_id", "INTEGER", false, 0, null, 1));
                hashMap.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                hashMap.put("keep", new TableInfo.Column("keep", "INTEGER", true, 0, null, 1));
                hashMap.put("last_accessed", new TableInfo.Column("last_accessed", "INTEGER", true, 0, null, 1));
                hashMap.put("successful_launch_count", new TableInfo.Column("successful_launch_count", "INTEGER", true, 0, "0", 1));
                hashMap.put("failed_launch_count", new TableInfo.Column("failed_launch_count", "INTEGER", true, 0, "0", 1));
                HashSet hashSet = new HashSet(1);
                hashSet.add(new TableInfo.ForeignKey("assets", "CASCADE", "NO ACTION", CollectionsKt.listOf("launch_asset_id"), CollectionsKt.listOf("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_updates_launch_asset_id", false, CollectionsKt.listOf("launch_asset_id"), CollectionsKt.listOf("ASC")));
                hashSet2.add(new TableInfo.Index("index_updates_scope_key_commit_time", true, CollectionsKt.listOf((Object[]) new String[]{"scope_key", "commit_time"}), CollectionsKt.listOf((Object[]) new String[]{"ASC", "ASC"})));
                TableInfo tableInfo = new TableInfo("updates", hashMap, hashSet, hashSet2);
                TableInfo read = TableInfo.INSTANCE.read(db, "updates");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "updates(expo.modules.updates.db.entity.UpdateEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("update_id", new TableInfo.Column("update_id", "BLOB", true, 1, null, 1));
                hashMap2.put("asset_id", new TableInfo.Column("asset_id", "INTEGER", true, 2, null, 1));
                HashSet hashSet3 = new HashSet(2);
                hashSet3.add(new TableInfo.ForeignKey("updates", "CASCADE", "NO ACTION", CollectionsKt.listOf("update_id"), CollectionsKt.listOf("id")));
                hashSet3.add(new TableInfo.ForeignKey("assets", "CASCADE", "NO ACTION", CollectionsKt.listOf("asset_id"), CollectionsKt.listOf("id")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_updates_assets_asset_id", false, CollectionsKt.listOf("asset_id"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo2 = new TableInfo("updates_assets", hashMap2, hashSet3, hashSet4);
                TableInfo read2 = TableInfo.INSTANCE.read(db, "updates_assets");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "updates_assets(expo.modules.updates.db.entity.UpdateAssetEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(13);
                hashMap3.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, 1));
                hashMap3.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, new TableInfo.Column(SVGParser.XML_STYLESHEET_ATTR_TYPE, "TEXT", false, 0, null, 1));
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, 1));
                hashMap3.put("headers", new TableInfo.Column("headers", "TEXT", false, 0, null, 1));
                hashMap3.put("extra_request_headers", new TableInfo.Column("extra_request_headers", "TEXT", false, 0, null, 1));
                hashMap3.put("metadata", new TableInfo.Column("metadata", "TEXT", false, 0, null, 1));
                hashMap3.put("download_time", new TableInfo.Column("download_time", "INTEGER", false, 0, null, 1));
                hashMap3.put("relative_path", new TableInfo.Column("relative_path", "TEXT", false, 0, null, 1));
                hashMap3.put("hash", new TableInfo.Column("hash", "BLOB", false, 0, null, 1));
                hashMap3.put("hash_type", new TableInfo.Column("hash_type", "INTEGER", true, 0, null, 1));
                hashMap3.put("expected_hash", new TableInfo.Column("expected_hash", "TEXT", false, 0, null, 1));
                hashMap3.put("marked_for_deletion", new TableInfo.Column("marked_for_deletion", "INTEGER", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_assets_key", true, CollectionsKt.listOf("key"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo3 = new TableInfo("assets", hashMap3, hashSet5, hashSet6);
                TableInfo read3 = TableInfo.INSTANCE.read(db, "assets");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "assets(expo.modules.updates.db.entity.AssetEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(5);
                hashMap4.put("key", new TableInfo.Column("key", "TEXT", true, 0, null, 1));
                hashMap4.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
                hashMap4.put("last_updated", new TableInfo.Column("last_updated", "INTEGER", true, 0, null, 1));
                hashMap4.put("scope_key", new TableInfo.Column("scope_key", "TEXT", true, 0, null, 1));
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                HashSet hashSet7 = new HashSet(0);
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.Index("index_json_data_scope_key", false, CollectionsKt.listOf("scope_key"), CollectionsKt.listOf("ASC")));
                TableInfo tableInfo4 = new TableInfo("json_data", hashMap4, hashSet7, hashSet8);
                TableInfo read4 = TableInfo.INSTANCE.read(db, "json_data");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "json_data(expo.modules.updates.db.entity.JSONDataEntity).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "f2331836f27deacc936e75b3f1a360bd", "b5440ed496eaba333f58c3ce160f54f8")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "updates", "updates_assets", "assets", "json_data");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `updates`");
            writableDatabase.execSQL("DELETE FROM `updates_assets`");
            writableDatabase.execSQL("DELETE FROM `assets`");
            writableDatabase.execSQL("DELETE FROM `json_data`");
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
    protected Map<Class<? extends Object>, List<Class<? extends Object>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(UpdateDao.class, UpdateDao_Impl.INSTANCE.getRequiredConverters());
        hashMap.put(AssetDao.class, AssetDao_Impl.INSTANCE.getRequiredConverters());
        hashMap.put(JSONDataDao.class, JSONDataDao_Impl.INSTANCE.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public UpdateDao updateDao() {
        return this._updateDao.getValue();
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public AssetDao assetDao() {
        return this._assetDao.getValue();
    }

    @Override // expo.modules.updates.db.UpdatesDatabase
    public JSONDataDao jsonDataDao() {
        return this._jSONDataDao.getValue();
    }
}
