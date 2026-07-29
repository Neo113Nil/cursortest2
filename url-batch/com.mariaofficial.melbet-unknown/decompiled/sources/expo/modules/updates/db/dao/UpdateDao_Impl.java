package expo.modules.updates.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.caverock.androidsvg.SVGParser;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.Converters;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.db.enums.UpdateStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateDao_Impl.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 <2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020)H\u0014J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010/\u001a\u00020&2\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0014J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020 H\u0014J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0016J\u001e\u00109\u001a\u00020\u00162\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u001a2\u0006\u0010\"\u001a\u00020#H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lexpo/modules/updates/db/dao/UpdateDao_Impl;", "Lexpo/modules/updates/db/dao/UpdateDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertionAdapterOfUpdateEntity", "Landroidx/room/EntityInsertionAdapter;", "Lexpo/modules/updates/db/entity/UpdateEntity;", "__converters", "Lexpo/modules/updates/db/Converters;", "__deletionAdapterOfUpdateEntity", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "__preparedStmtOfKeepUpdate", "Landroidx/room/SharedSQLiteStatement;", "__preparedStmtOfMarkUpdateWithStatus", "__preparedStmtOf_setUpdateScopeKeyInternal", "__preparedStmtOfSetUpdateCommitTimeInternal", "__preparedStmtOfMarkUpdateAccessedInternal", "__preparedStmtOfIncrementSuccessfulLaunchCountInternal", "__preparedStmtOfIncrementFailedLaunchCountInternal", "insertUpdate", "", "update", "deleteUpdates", "updates", "", "markUpdateFinished", "hasSkippedEmbeddedAssets", "", "keepUpdate", "id", "Ljava/util/UUID;", "markUpdateWithStatus", "status", "Lexpo/modules/updates/db/enums/UpdateStatus;", "_setUpdateScopeKeyInternal", "newScopeKey", "", "setUpdateCommitTimeInternal", "commitTime", "Ljava/util/Date;", "markUpdateAccessedInternal", "lastAccessed", "incrementSuccessfulLaunchCountInternal", "incrementFailedLaunchCountInternal", "loadLaunchableUpdatesForProjectWithStatuses", UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY, "statuses", "loadUpdatesWithId", "loadLaunchAssetForUpdateInternal", "Lexpo/modules/updates/db/entity/AssetEntity;", "updateId", "loadAllUpdates", "loadAllUpdatesWithStatus", "loadAllUpdateIdsWithStatus", "loadRecentUpdateIdsWithFailedLaunch", "markUpdatesWithMissingAssets", "missingAssetIds", "", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdateDao_Impl extends UpdateDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<UpdateEntity> __deletionAdapterOfUpdateEntity;
    private final EntityInsertionAdapter<UpdateEntity> __insertionAdapterOfUpdateEntity;
    private final SharedSQLiteStatement __preparedStmtOfIncrementFailedLaunchCountInternal;
    private final SharedSQLiteStatement __preparedStmtOfIncrementSuccessfulLaunchCountInternal;
    private final SharedSQLiteStatement __preparedStmtOfKeepUpdate;
    private final SharedSQLiteStatement __preparedStmtOfMarkUpdateAccessedInternal;
    private final SharedSQLiteStatement __preparedStmtOfMarkUpdateWithStatus;
    private final SharedSQLiteStatement __preparedStmtOfSetUpdateCommitTimeInternal;
    private final SharedSQLiteStatement __preparedStmtOf_setUpdateScopeKeyInternal;

    @JvmStatic
    public static final List<Class<?>> getRequiredConverters() {
        return INSTANCE.getRequiredConverters();
    }

    public UpdateDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertionAdapterOfUpdateEntity = new EntityInsertionAdapter<UpdateEntity>(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `updates` (`id`,`commit_time`,`runtime_version`,`scope_key`,`manifest`,`url`,`headers`,`launch_asset_id`,`status`,`keep`,`last_accessed`,`successful_launch_count`,`failed_launch_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement statement, UpdateEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindBlob(1, this.__converters.uuidToBytes(entity.getId()));
                Long dateToLong = this.__converters.dateToLong(entity.getCommitTime());
                if (dateToLong == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindLong(2, dateToLong.longValue());
                }
                statement.bindString(3, entity.getRuntimeVersion());
                statement.bindString(4, entity.getScopeKey());
                String jsonObjectToString = this.__converters.jsonObjectToString(entity.getManifest());
                if (jsonObjectToString == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, jsonObjectToString);
                }
                String uriToString = this.__converters.uriToString(entity.getUrl());
                if (uriToString == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, uriToString);
                }
                String stringStringMapToString = this.__converters.stringStringMapToString(entity.getRequestHeaders());
                if (stringStringMapToString == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, stringStringMapToString);
                }
                Long launchAssetId = entity.getLaunchAssetId();
                if (launchAssetId == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindLong(8, launchAssetId.longValue());
                }
                statement.bindLong(9, this.__converters.statusToInt(entity.getStatus()));
                statement.bindLong(10, entity.getKeep() ? 1L : 0L);
                Long dateToLong2 = this.__converters.dateToLong(entity.getLastAccessed());
                if (dateToLong2 == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindLong(11, dateToLong2.longValue());
                }
                statement.bindLong(12, entity.getSuccessfulLaunchCount());
                statement.bindLong(13, entity.getFailedLaunchCount());
            }
        };
        this.__deletionAdapterOfUpdateEntity = new EntityDeletionOrUpdateAdapter<UpdateEntity>(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `updates` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement statement, UpdateEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindBlob(1, this.__converters.uuidToBytes(entity.getId()));
            }
        };
        this.__preparedStmtOfKeepUpdate = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET keep = 1 WHERE id = ?;";
            }
        };
        this.__preparedStmtOfMarkUpdateWithStatus = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET status = ? WHERE id = ?;";
            }
        };
        this.__preparedStmtOf_setUpdateScopeKeyInternal = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET scope_key = ? WHERE id = ?;";
            }
        };
        this.__preparedStmtOfSetUpdateCommitTimeInternal = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET commit_time = ? WHERE id = ?;";
            }
        };
        this.__preparedStmtOfMarkUpdateAccessedInternal = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET last_accessed = ? WHERE id = ?;";
            }
        };
        this.__preparedStmtOfIncrementSuccessfulLaunchCountInternal = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET successful_launch_count = successful_launch_count + 1 WHERE id = ?;";
            }
        };
        this.__preparedStmtOfIncrementFailedLaunchCountInternal = new SharedSQLiteStatement(__db) { // from class: expo.modules.updates.db.dao.UpdateDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE updates SET failed_launch_count = failed_launch_count + 1 WHERE id = ?;";
            }
        };
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void insertUpdate(UpdateEntity update) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUpdateEntity.insert((EntityInsertionAdapter<UpdateEntity>) update);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void deleteUpdates(List<UpdateEntity> updates) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUpdateEntity.handleMultiple(updates);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void markUpdateFinished(UpdateEntity update, boolean hasSkippedEmbeddedAssets) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.__db.beginTransaction();
        try {
            super.markUpdateFinished(update, hasSkippedEmbeddedAssets);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected void keepUpdate(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfKeepUpdate.acquire();
        acquire.bindBlob(1, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfKeepUpdate.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected void markUpdateWithStatus(UpdateStatus status, UUID id) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id, "id");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkUpdateWithStatus.acquire();
        acquire.bindLong(1, this.__converters.statusToInt(status));
        acquire.bindBlob(2, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfMarkUpdateWithStatus.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void _setUpdateScopeKeyInternal(UUID id, String newScopeKey) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newScopeKey, "newScopeKey");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOf_setUpdateScopeKeyInternal.acquire();
        acquire.bindString(1, newScopeKey);
        acquire.bindBlob(2, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOf_setUpdateScopeKeyInternal.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void setUpdateCommitTimeInternal(UUID id, Date commitTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(commitTime, "commitTime");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetUpdateCommitTimeInternal.acquire();
        Long dateToLong = this.__converters.dateToLong(commitTime);
        if (dateToLong == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindLong(1, dateToLong.longValue());
        }
        acquire.bindBlob(2, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetUpdateCommitTimeInternal.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected void markUpdateAccessedInternal(UUID id, Date lastAccessed) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lastAccessed, "lastAccessed");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkUpdateAccessedInternal.acquire();
        Long dateToLong = this.__converters.dateToLong(lastAccessed);
        if (dateToLong == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindLong(1, dateToLong.longValue());
        }
        acquire.bindBlob(2, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfMarkUpdateAccessedInternal.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected void incrementSuccessfulLaunchCountInternal(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementSuccessfulLaunchCountInternal.acquire();
        acquire.bindBlob(1, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfIncrementSuccessfulLaunchCountInternal.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public void incrementFailedLaunchCountInternal(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementFailedLaunchCountInternal.acquire();
        acquire.bindBlob(1, this.__converters.uuidToBytes(id));
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfIncrementFailedLaunchCountInternal.release(acquire);
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected List<UpdateEntity> loadLaunchableUpdatesForProjectWithStatuses(String scopeKey, List<? extends UpdateStatus> statuses) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String string;
        UpdateDao_Impl updateDao_Impl = this;
        String str2 = "getString(...)";
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM updates WHERE scope_key = ");
        newStringBuilder.append("?");
        newStringBuilder.append(" AND (successful_launch_count > 0 OR failed_launch_count < 1) AND status IN (");
        int size = statuses.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(");");
        String sb = newStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire(sb, size + 1);
        acquire.bindString(1, scopeKey);
        Iterator<? extends UpdateStatus> it = statuses.iterator();
        int i = 2;
        while (it.hasNext()) {
            acquire.bindLong(i, updateDao_Impl.__converters.statusToInt(it.next()));
            i++;
        }
        updateDao_Impl.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(updateDao_Impl.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commit_time");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runtime_version");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "scope_key");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "manifest");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "headers");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "launch_asset_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "keep");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "last_accessed");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "successful_launch_count");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "failed_launch_count");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    byte[] blob = query.getBlob(columnIndexOrThrow);
                    int i3 = columnIndexOrThrow;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID bytesToUuid = updateDao_Impl.__converters.bytesToUuid(blob);
                    Date longToDate = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)));
                    if (longToDate == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    String string2 = query.getString(columnIndexOrThrow3);
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Intrinsics.checkNotNullExpressionValue(string3, str2);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str = string3;
                        string = null;
                    } else {
                        str = string3;
                        string = query.getString(columnIndexOrThrow5);
                    }
                    String str3 = str2;
                    JSONObject stringToJsonObject = updateDao_Impl.__converters.stringToJsonObject(string);
                    if (stringToJsonObject == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.".toString());
                    }
                    UpdateEntity updateEntity = new UpdateEntity(bytesToUuid, longToDate, string2, str, stringToJsonObject, updateDao_Impl.__converters.stringToUri(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), updateDao_Impl.__converters.stringToStringStringMap(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    if (query.isNull(columnIndexOrThrow8)) {
                        updateEntity.setLaunchAssetId(null);
                    } else {
                        updateEntity.setLaunchAssetId(Long.valueOf(query.getLong(columnIndexOrThrow8)));
                    }
                    updateEntity.setStatus(updateDao_Impl.__converters.intToStatus(query.getInt(columnIndexOrThrow9)));
                    updateEntity.setKeep(query.getInt(columnIndexOrThrow10) != 0);
                    Date longToDate2 = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)));
                    if (longToDate2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    updateEntity.setLastAccessed(longToDate2);
                    int i4 = i2;
                    updateEntity.setSuccessfulLaunchCount(query.getInt(i4));
                    int i5 = columnIndexOrThrow13;
                    updateEntity.setFailedLaunchCount(query.getInt(i5));
                    arrayList.add(updateEntity);
                    updateDao_Impl = this;
                    i2 = i4;
                    columnIndexOrThrow13 = i5;
                    columnIndexOrThrow = i3;
                    str2 = str3;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected List<UpdateEntity> loadUpdatesWithId(UUID id) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String string;
        UpdateDao_Impl updateDao_Impl = this;
        String str2 = "getString(...)";
        Intrinsics.checkNotNullParameter(id, "id");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM updates WHERE id = ?;", 1);
        acquire.bindBlob(1, updateDao_Impl.__converters.uuidToBytes(id));
        updateDao_Impl.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(updateDao_Impl.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commit_time");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runtime_version");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "scope_key");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "manifest");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "headers");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "launch_asset_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "keep");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "last_accessed");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "successful_launch_count");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "failed_launch_count");
                int i = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    byte[] blob = query.getBlob(columnIndexOrThrow);
                    int i2 = columnIndexOrThrow;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID bytesToUuid = updateDao_Impl.__converters.bytesToUuid(blob);
                    Date longToDate = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)));
                    if (longToDate == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    String string2 = query.getString(columnIndexOrThrow3);
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Intrinsics.checkNotNullExpressionValue(string3, str2);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str = string3;
                        string = null;
                    } else {
                        str = string3;
                        string = query.getString(columnIndexOrThrow5);
                    }
                    String str3 = str2;
                    JSONObject stringToJsonObject = updateDao_Impl.__converters.stringToJsonObject(string);
                    if (stringToJsonObject == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.".toString());
                    }
                    UpdateEntity updateEntity = new UpdateEntity(bytesToUuid, longToDate, string2, str, stringToJsonObject, updateDao_Impl.__converters.stringToUri(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), updateDao_Impl.__converters.stringToStringStringMap(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    if (query.isNull(columnIndexOrThrow8)) {
                        updateEntity.setLaunchAssetId(null);
                    } else {
                        updateEntity.setLaunchAssetId(Long.valueOf(query.getLong(columnIndexOrThrow8)));
                    }
                    updateEntity.setStatus(updateDao_Impl.__converters.intToStatus(query.getInt(columnIndexOrThrow9)));
                    updateEntity.setKeep(query.getInt(columnIndexOrThrow10) != 0);
                    Date longToDate2 = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)));
                    if (longToDate2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    updateEntity.setLastAccessed(longToDate2);
                    int i3 = i;
                    updateEntity.setSuccessfulLaunchCount(query.getInt(i3));
                    int i4 = columnIndexOrThrow13;
                    updateEntity.setFailedLaunchCount(query.getInt(i4));
                    arrayList.add(updateEntity);
                    updateDao_Impl = this;
                    i = i3;
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow = i2;
                    str2 = str3;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected AssetEntity loadLaunchAssetForUpdateInternal(UUID updateId) {
        RoomSQLiteQuery roomSQLiteQuery;
        AssetEntity assetEntity;
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT assets.* FROM assets INNER JOIN updates ON updates.launch_asset_id = assets.id WHERE updates.id = ?;", 1);
        acquire.bindBlob(1, this.__converters.uuidToBytes(updateId));
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "key");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, SVGParser.XML_STYLESHEET_ATTR_TYPE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "headers");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "extra_request_headers");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "metadata");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "download_time");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "relative_path");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hash");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "hash_type");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "expected_hash");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "marked_for_deletion");
            if (query.moveToFirst()) {
                roomSQLiteQuery = acquire;
                try {
                    AssetEntity assetEntity2 = new AssetEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                    assetEntity2.setId(query.getLong(columnIndexOrThrow3));
                    assetEntity2.setUrl(this.__converters.stringToUri(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)));
                    assetEntity2.setHeaders(this.__converters.stringToJsonObject(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                    assetEntity2.setExtraRequestHeaders(this.__converters.stringToJsonObject(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
                    assetEntity2.setMetadata(this.__converters.stringToJsonObject(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    assetEntity2.setDownloadTime(this.__converters.longToDate(query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8))));
                    if (query.isNull(columnIndexOrThrow9)) {
                        assetEntity2.setRelativePath(null);
                    } else {
                        assetEntity2.setRelativePath(query.getString(columnIndexOrThrow9));
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        assetEntity2.setHash(null);
                    } else {
                        assetEntity2.setHash(query.getBlob(columnIndexOrThrow10));
                    }
                    assetEntity2.setHashType(this.__converters.intToHashType(query.getInt(columnIndexOrThrow11)));
                    if (query.isNull(columnIndexOrThrow12)) {
                        assetEntity2.setExpectedHash(null);
                    } else {
                        assetEntity2.setExpectedHash(query.getString(columnIndexOrThrow12));
                    }
                    assetEntity2.setMarkedForDeletion(query.getInt(columnIndexOrThrow13) != 0);
                    assetEntity = assetEntity2;
                } catch (Throwable th) {
                    th = th;
                    query.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            } else {
                roomSQLiteQuery = acquire;
                assetEntity = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return assetEntity;
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public List<UpdateEntity> loadAllUpdates() {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String string;
        UpdateDao_Impl updateDao_Impl = this;
        String str2 = "getString(...)";
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM updates;", 0);
        updateDao_Impl.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(updateDao_Impl.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commit_time");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runtime_version");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "scope_key");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "manifest");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "headers");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "launch_asset_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "keep");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "last_accessed");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "successful_launch_count");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "failed_launch_count");
                int i = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    byte[] blob = query.getBlob(columnIndexOrThrow);
                    int i2 = columnIndexOrThrow;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID bytesToUuid = updateDao_Impl.__converters.bytesToUuid(blob);
                    Date longToDate = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)));
                    if (longToDate == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    String string2 = query.getString(columnIndexOrThrow3);
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Intrinsics.checkNotNullExpressionValue(string3, str2);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str = str2;
                        string = null;
                    } else {
                        str = str2;
                        string = query.getString(columnIndexOrThrow5);
                    }
                    JSONObject stringToJsonObject = updateDao_Impl.__converters.stringToJsonObject(string);
                    if (stringToJsonObject == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.".toString());
                    }
                    UpdateEntity updateEntity = new UpdateEntity(bytesToUuid, longToDate, string2, string3, stringToJsonObject, updateDao_Impl.__converters.stringToUri(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), updateDao_Impl.__converters.stringToStringStringMap(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    if (query.isNull(columnIndexOrThrow8)) {
                        updateEntity.setLaunchAssetId(null);
                    } else {
                        updateEntity.setLaunchAssetId(Long.valueOf(query.getLong(columnIndexOrThrow8)));
                    }
                    updateEntity.setStatus(updateDao_Impl.__converters.intToStatus(query.getInt(columnIndexOrThrow9)));
                    updateEntity.setKeep(query.getInt(columnIndexOrThrow10) != 0);
                    Date longToDate2 = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)));
                    if (longToDate2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    updateEntity.setLastAccessed(longToDate2);
                    int i3 = i;
                    updateEntity.setSuccessfulLaunchCount(query.getInt(i3));
                    int i4 = columnIndexOrThrow13;
                    updateEntity.setFailedLaunchCount(query.getInt(i4));
                    arrayList.add(updateEntity);
                    updateDao_Impl = this;
                    i = i3;
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow = i2;
                    str2 = str;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public List<UpdateEntity> loadAllUpdatesWithStatus(UpdateStatus status) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String string;
        UpdateDao_Impl updateDao_Impl = this;
        String str2 = "getString(...)";
        Intrinsics.checkNotNullParameter(status, "status");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM updates WHERE status = ?;", 1);
        acquire.bindLong(1, updateDao_Impl.__converters.statusToInt(status));
        updateDao_Impl.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(updateDao_Impl.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commit_time");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runtime_version");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "scope_key");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "manifest");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "headers");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "launch_asset_id");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "keep");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "last_accessed");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "successful_launch_count");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "failed_launch_count");
                int i = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    byte[] blob = query.getBlob(columnIndexOrThrow);
                    int i2 = columnIndexOrThrow;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID bytesToUuid = updateDao_Impl.__converters.bytesToUuid(blob);
                    Date longToDate = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)));
                    if (longToDate == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    String string2 = query.getString(columnIndexOrThrow3);
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Intrinsics.checkNotNullExpressionValue(string3, str2);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str = string3;
                        string = null;
                    } else {
                        str = string3;
                        string = query.getString(columnIndexOrThrow5);
                    }
                    String str3 = str2;
                    JSONObject stringToJsonObject = updateDao_Impl.__converters.stringToJsonObject(string);
                    if (stringToJsonObject == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.".toString());
                    }
                    UpdateEntity updateEntity = new UpdateEntity(bytesToUuid, longToDate, string2, str, stringToJsonObject, updateDao_Impl.__converters.stringToUri(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), updateDao_Impl.__converters.stringToStringStringMap(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    if (query.isNull(columnIndexOrThrow8)) {
                        updateEntity.setLaunchAssetId(null);
                    } else {
                        updateEntity.setLaunchAssetId(Long.valueOf(query.getLong(columnIndexOrThrow8)));
                    }
                    updateEntity.setStatus(updateDao_Impl.__converters.intToStatus(query.getInt(columnIndexOrThrow9)));
                    updateEntity.setKeep(query.getInt(columnIndexOrThrow10) != 0);
                    Date longToDate2 = updateDao_Impl.__converters.longToDate(query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)));
                    if (longToDate2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.".toString());
                    }
                    updateEntity.setLastAccessed(longToDate2);
                    int i3 = i;
                    updateEntity.setSuccessfulLaunchCount(query.getInt(i3));
                    int i4 = columnIndexOrThrow13;
                    updateEntity.setFailedLaunchCount(query.getInt(i4));
                    arrayList.add(updateEntity);
                    updateDao_Impl = this;
                    i = i3;
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow = i2;
                    str2 = str3;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public List<UUID> loadAllUpdateIdsWithStatus(UpdateStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT id FROM updates WHERE status = ?;", 1);
        acquire.bindLong(1, this.__converters.statusToInt(status));
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                arrayList.add(this.__converters.bytesToUuid(blob));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    public List<UUID> loadRecentUpdateIdsWithFailedLaunch() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT id FROM updates WHERE failed_launch_count > 0 ORDER BY commit_time DESC LIMIT 5;", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                arrayList.add(this.__converters.bytesToUuid(blob));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // expo.modules.updates.db.dao.UpdateDao
    protected void markUpdatesWithMissingAssets(List<Long> missingAssetIds, UpdateStatus status) {
        Intrinsics.checkNotNullParameter(missingAssetIds, "missingAssetIds");
        Intrinsics.checkNotNullParameter(status, "status");
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE updates SET status = ");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (SELECT DISTINCT update_id FROM updates_assets WHERE asset_id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, missingAssetIds.size());
        newStringBuilder.append("));");
        String sb = newStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(sb);
        compileStatement.bindLong(1, this.__converters.statusToInt(status));
        Iterator<Long> it = missingAssetIds.iterator();
        int i = 2;
        while (it.hasNext()) {
            compileStatement.bindLong(i, it.next().longValue());
            i++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    /* compiled from: UpdateDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lexpo/modules/updates/db/dao/UpdateDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Ljava/lang/Class;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final List<Class<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
