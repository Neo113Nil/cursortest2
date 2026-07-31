package com.yandex.div.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.UserDataStore;
import com.safedk.android.analytics.reporters.b;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.DivStorageImpl.CursorDrivenRawDataAndMetadata;
import com.yandex.div.storage.DivStorageImpl.CursorDrivenRawJson;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.database.StorageQueries;
import com.yandex.div.storage.database.StorageSchema;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.templates.RawTemplateData;
import com.yandex.div.storage.templates.Template;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStorageImpl.kt */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000 \u0081\u00012\u00020\u0001:\u0006\u0081\u0001\u0082\u0001\u0083\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\nH\u0012¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0015H\u0013¢\u0006\u0004\b \u0010\u001bJ-\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020\u00062\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\"\"\u00020\u0006H\u0013¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0011*\u00020\nH\u0012¢\u0006\u0004\b(\u0010\u0014J+\u0010,\u001a\u00020$*\u00060)j\u0002`*2\u0006\u0010!\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006H\u0012¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u0002002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0\u0015H\u0013¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u000204*\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0012¢\u0006\u0004\b5\u00106J\u0013\u00109\u001a\u000208*\u000207H\u0012¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020.H\u0017¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020<2\u0006\u0010;\u001a\u00020.2\u0006\u0010?\u001a\u0002042\u0006\u0010@\u001a\u000204H\u0017¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020<2\u0006\u0010;\u001a\u00020.H\u0017¢\u0006\u0004\bC\u0010>J\u0017\u0010D\u001a\u00020<2\u0006\u0010;\u001a\u00020.H\u0017¢\u0006\u0004\bD\u0010>J;\u0010L\u001a\u00020K2\u0006\u0010E\u001a\u00020\u00062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00112\u0006\u0010J\u001a\u00020IH\u0017¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u00020K2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010J\u001a\u00020IH\u0017¢\u0006\u0004\bO\u0010PJ1\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0S2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0017¢\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020V2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0017¢\u0006\u0004\bW\u0010XJ\u0011\u0010Y\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001d0S2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0017¢\u0006\u0004\b[\u0010\\J#\u0010]\u001a\u00020V2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0015H\u0017¢\u0006\u0004\b]\u0010XJ#\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00120S2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0017¢\u0006\u0004\b_\u0010\\J\u0011\u0010`\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b`\u0010ZJ\u001f\u0010b\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0006H\u0016¢\u0006\u0004\be\u0010fJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020'0SH\u0016¢\u0006\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bl\u0010mR \u0010o\u001a\u00020n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u0010t\u001a\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020u8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bv\u0010wR2\u0010{\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040y\u0012\u0004\u0012\u00020z0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0015\u0010\u007f\u001a\u00020z8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl;", "Lcom/yandex/div/storage/DivStorage;", "Landroid/content/Context;", "context", "Lcom/yandex/div/storage/database/DatabaseOpenHelperProvider;", "openHelperProvider", "", "databaseNamePrefix", "<init>", "(Landroid/content/Context;Lcom/yandex/div/storage/database/DatabaseOpenHelperProvider;Ljava/lang/String;)V", "Landroid/database/Cursor;", "", "Lcom/yandex/div/storage/database/StorageException;", b.a, "Lcom/yandex/div/storage/DivStorage$RestoredRawData;", "getRestoredRawData", "(Landroid/database/Cursor;Ljava/util/List;)Lcom/yandex/div/storage/DivStorage$RestoredRawData;", "", "Lcom/yandex/div/storage/templates/RawTemplateData;", "getTemplates", "(Landroid/database/Cursor;)Ljava/util/List;", "Lkotlin/Function1;", "Lcom/yandex/div/storage/RawDataAndMetadata;", "", "predicate", "", "collectsRecordsFor", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "rawJsonIds", "Lcom/yandex/div/storage/rawjson/RawJson;", "collectsRawJsons", "(Ljava/util/Set;)Ljava/util/List;", "collectsRawJsonsIdsFor", "actionDesc", "", "queries", "Lcom/yandex/div/storage/DivStorageErrorException;", "deleteTablesTransaction", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/DivStorage$TemplateReference;", "getTemplateReferences", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cardId", "toStorageException", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "func", "Lcom/yandex/div/storage/database/ReadState;", "readStateFor", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/ReadState;", "columnName", "", "indexOf", "(Landroid/database/Cursor;Ljava/lang/String;)I", "", "Lorg/json/JSONObject;", "toJSONObject", "([B)Lorg/json/JSONObject;", UserDataStore.DATE_OF_BIRTH, "", "onCreate", "(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", "oldVersion", "newVersion", "onUpgrade", "(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", "createTables", "dropTables", NotificationCategory.GROUP_ID_KEY, "divs", "Lcom/yandex/div/storage/templates/Template;", "templatesByHash", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lcom/yandex/div/storage/database/ExecutionResult;", "saveData", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "rawJsons", "saveRawJsons", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "ids", "idsToExclude", "Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "loadData", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "Lcom/yandex/div/storage/DivStorage$RemoveResult;", "remove", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/DivStorage$RemoveResult;", "removeAllCards", "()Lcom/yandex/div/storage/DivStorageErrorException;", "readRawJsons", "(Ljava/util/Set;)Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "removeRawJsons", "templateHashes", "readTemplates", "removeAllTemplates", "id", "isCardExists", "(Ljava/lang/String;Ljava/lang/String;)Z", "templateHash", "isTemplateExists", "(Ljava/lang/String;)Z", "readTemplateReferences", "()Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "dbName", "Ljava/lang/String;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper;", "openHelper", "Lcom/yandex/div/storage/database/DatabaseOpenHelper;", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "statementExecutor", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "getStatementExecutor", "()Lcom/yandex/div/storage/database/StorageStatementExecutor;", "getStatementExecutor$annotations", "()V", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "dataSaveUseCase", "Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "", "Lkotlin/Pair;", "Lcom/yandex/div/storage/database/Migration;", "migrations", "Ljava/util/Map;", "getMigrations", "()Ljava/util/Map;", "defaultDropAllMigration", "Lcom/yandex/div/storage/database/Migration;", "Companion", "CursorDrivenRawDataAndMetadata", "CursorDrivenRawJson", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivStorageImpl implements DivStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SingleTransactionDataSavePerformer dataSaveUseCase;

    @NotNull
    private final String dbName;

    @NotNull
    private final Migration defaultDropAllMigration;

    @NotNull
    private final Map<Pair<Integer, Integer>, Migration> migrations;

    @NotNull
    private final DatabaseOpenHelper openHelper;

    @NotNull
    private final StorageStatementExecutor statementExecutor;

    @VisibleForTesting
    public static /* synthetic */ void getStatementExecutor$annotations() {
    }

    public DivStorageImpl(@NotNull Context context, @NotNull DatabaseOpenHelperProvider databaseOpenHelperProvider, @NotNull String str) {
        String str2;
        if (str.length() == 0) {
            str2 = "div-storage.db";
        } else {
            str2 = str + "-div-storage.db";
        }
        String str3 = str2;
        this.dbName = str3;
        this.openHelper = databaseOpenHelperProvider.provide(context, str3, 3, new DivStorageImpl$openHelper$1(this), new DivStorageImpl$openHelper$2(this));
        this.statementExecutor = new StorageStatementExecutor(new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$statementExecutor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DatabaseOpenHelper.Database mo4828invoke() {
                DatabaseOpenHelper databaseOpenHelper;
                databaseOpenHelper = DivStorageImpl.this.openHelper;
                return databaseOpenHelper.getWritableDatabase();
            }
        });
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = MapsKt.mapOf(TuplesKt.to(TuplesKt.to(2, 3), new Migration() { // from class: com.yandex.div.storage.DivStorageImpl$$ExternalSyntheticLambda1
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.migrations$lambda$0(database);
            }
        }));
        this.defaultDropAllMigration = new Migration() { // from class: com.yandex.div.storage.DivStorageImpl$$ExternalSyntheticLambda2
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(DivStorageImpl.this, database);
            }
        };
    }

    public /* synthetic */ DivStorageImpl(Context context, DatabaseOpenHelperProvider databaseOpenHelperProvider, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, databaseOpenHelperProvider, (i & 4) != 0 ? "" : str);
    }

    @NotNull
    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    @Override // com.yandex.div.storage.DivStorage
    @NotNull
    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database database) {
        try {
            database.execSQL(StorageSchema.CREATE_TABLE_RAW_JSON);
        } catch (SQLException e) {
            throw new SQLException("Create \"raw_json\" table", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl divStorageImpl, DatabaseOpenHelper.Database database) {
        divStorageImpl.dropTables(database);
        divStorageImpl.createTables(database);
    }

    @VisibleForTesting
    public void onCreate(@NotNull DatabaseOpenHelper.Database db) {
        createTables(db);
    }

    @VisibleForTesting
    public void onUpgrade(@NotNull DatabaseOpenHelper.Database db, int oldVersion, int newVersion) {
        KAssert kAssert = KAssert.INSTANCE;
        Integer valueOf = Integer.valueOf(newVersion);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", (Object) valueOf, (Object) 3);
        }
        if (oldVersion == 3) {
            return;
        }
        Migration migration = getMigrations().get(TuplesKt.to(Integer.valueOf(oldVersion), Integer.valueOf(newVersion)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(db);
        } catch (SQLException e) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Migration from " + oldVersion + " to " + newVersion + " throws exception", e);
            }
            this.defaultDropAllMigration.migrate(db);
        }
    }

    @VisibleForTesting
    public void createTables(@NotNull DatabaseOpenHelper.Database db) throws SQLException {
        try {
            db.execSQL(StorageSchema.CREATE_TABLE_CARDS);
            db.execSQL(StorageSchema.CREATE_TABLE_TEMPLATE_REFERENCES);
            db.execSQL(StorageSchema.CREATE_TABLE_TEMPLATES);
            db.execSQL(StorageSchema.CREATE_TABLE_RAW_JSON);
        } catch (SQLException e) {
            throw new SQLException("Create tables", e);
        }
    }

    @VisibleForTesting
    public void dropTables(@NotNull final DatabaseOpenHelper.Database db) throws SQLException {
        new StorageStatementExecutor(new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$dropTables$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DatabaseOpenHelper.Database mo4828invoke() {
                return DatabaseOpenHelper.Database.this;
            }
        }).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public ExecutionResult saveData(@NotNull String groupId, @NotNull List<? extends RawDataAndMetadata> divs, @NotNull List<Template> templatesByHash, @NotNull DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.saveDivData(groupId, divs, templatesByHash, actionOnError);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.saveRawJsons(rawJsons, actionOnError);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.LoadDataResult<DivStorage.RestoredRawData> loadData(@NotNull List<String> ids, @NotNull List<String> idsToExclude) {
        final String sb;
        ReadState readStateFor;
        Cursor cursor;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(ids.size());
        ArrayList arrayList2 = new ArrayList();
        if (ids.isEmpty() && idsToExclude.isEmpty()) {
            sb = null;
        } else if (!ids.isEmpty()) {
            if (!idsToExclude.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("layout_id NOT IN ");
                Companion companion = INSTANCE;
                sb2.append(companion.asSqlList(idsToExclude));
                sb2.append(" AND layout_id IN ");
                sb2.append(companion.asSqlList(ids));
                sb = sb2.toString();
            } else {
                sb = "layout_id IN " + INSTANCE.asSqlList(ids);
            }
        } else {
            sb = "layout_id NOT IN " + INSTANCE.asSqlList(idsToExclude);
        }
        try {
            readStateFor = readStateFor(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$loadData$cardsReadState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Cursor invoke(@NotNull DatabaseOpenHelper.Database database) {
                    return database.query(StorageSchema.TABLE_CARDS, null, sb, null, null, null, null, null);
                }
            });
            try {
                cursor = readStateFor.getCursor();
            } finally {
            }
        } catch (SQLiteDatabaseLockedException e) {
            arrayList2.add(toStorageException$default(this, e, "Exception on load data from storage", null, 2, null));
        } catch (IllegalStateException e2) {
            arrayList2.add(toStorageException$default(this, e2, "Exception on load data from storage", null, 2, null));
        }
        if (cursor.getCount() != 0 && cursor.moveToFirst()) {
            do {
                DivStorage.RestoredRawData restoredRawData = getRestoredRawData(cursor, arrayList2);
                if (restoredRawData != null) {
                    arrayList.add(restoredRawData);
                    linkedHashSet.add(restoredRawData.getGroupId$div_storage_release());
                }
            } while (cursor.moveToNext());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(readStateFor, null);
            return new DivStorage.LoadDataResult<>(arrayList, arrayList2);
        }
        DivStorage.LoadDataResult<DivStorage.RestoredRawData> loadDataResult = new DivStorage.LoadDataResult<>(CollectionsKt.emptyList(), arrayList2);
        CloseableKt.closeFinally(readStateFor, null);
        return loadDataResult;
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.RemoveResult remove(@NotNull Function1 predicate) throws SQLException {
        Set<String> collectsRecordsFor = collectsRecordsFor(predicate);
        StorageStatementExecutor statementExecutor = getStatementExecutor();
        DivDataRepository.ActionOnError actionOnError = DivDataRepository.ActionOnError.SKIP_ELEMENT;
        StorageStatements storageStatements = StorageStatements.INSTANCE;
        return new DivStorage.RemoveResult(collectsRecordsFor, statementExecutor.execute(actionOnError, storageStatements.deleteCardsAndTemplates(collectsRecordsFor), storageStatements.deleteTemplatesWithoutLinksToCards()).getErrors());
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @Nullable
    public DivStorageErrorException removeAllCards() {
        return deleteTablesTransaction("delete all cards", StorageQueries.DELETE_CARDS);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> rawJsonIds) {
        String str = "Read raw jsons with ids: " + rawJsonIds;
        ArrayList arrayList = new ArrayList();
        List<RawJson> emptyList = CollectionsKt.emptyList();
        try {
            emptyList = collectsRawJsons(rawJsonIds);
        } catch (SQLException e) {
            arrayList.add(toStorageException$default(this, e, str, null, 2, null));
        } catch (IllegalStateException e2) {
            arrayList.add(toStorageException$default(this, e2, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(emptyList, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.RemoveResult removeRawJsons(@NotNull Function1 predicate) {
        Set<String> collectsRawJsonsIdsFor = collectsRawJsonsIdsFor(predicate);
        return new DivStorage.RemoveResult(collectsRawJsonsIdsFor, getStatementExecutor().execute(DivDataRepository.ActionOnError.SKIP_ELEMENT, StorageStatements.INSTANCE.deleteRawJsons(collectsRawJsonsIdsFor)).getErrors());
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @NotNull
    public DivStorage.LoadDataResult<RawTemplateData> readTemplates(@NotNull final Set<String> templateHashes) {
        String str = "Read templates with hashes: " + templateHashes;
        ArrayList arrayList = new ArrayList();
        List<RawTemplateData> emptyList = CollectionsKt.emptyList();
        try {
            ReadState readStateFor = readStateFor(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$readTemplates$readState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Cursor invoke(@NotNull DatabaseOpenHelper.Database database) {
                    return database.rawQuery("\n    SELECT t.template_hash, t.template_data\n    FROM templates AS t\n    WHERE t.template_hash in\n  " + DivStorageImpl.INSTANCE.asSqlList(templateHashes), new String[0]);
                }
            });
            try {
                List<RawTemplateData> templates = getTemplates(readStateFor.getCursor());
                CloseableKt.closeFinally(readStateFor, null);
                emptyList = templates;
            } finally {
            }
        } catch (SQLException e) {
            arrayList.add(toStorageException$default(this, e, str, null, 2, null));
        } catch (IllegalStateException e2) {
            arrayList.add(toStorageException$default(this, e2, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(emptyList, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    @Nullable
    public DivStorageErrorException removeAllTemplates() {
        return deleteTablesTransaction("Delete all templates", StorageQueries.DELETE_TEMPLATE_USAGES, "DELETE FROM templates");
    }

    @Override // com.yandex.div.storage.DivStorage
    public boolean isCardExists(@NotNull String id, @NotNull String groupId) throws DivStorageErrorException {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ExecutionResult execute = getStatementExecutor().execute(StorageStatements.INSTANCE.isCardExists(id, groupId, new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$isCardExists$executionResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Ref$BooleanRef.this.element = z;
            }
        }));
        if (!execute.isSuccessful() && !execute.getErrors().isEmpty()) {
            throw toStorageException((Exception) CollectionsKt.first((List) execute.getErrors()), "Check card exists", id);
        }
        return ref$BooleanRef.element;
    }

    @Override // com.yandex.div.storage.DivStorage
    public boolean isTemplateExists(@NotNull String templateHash) throws DivStorageErrorException {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ExecutionResult execute = getStatementExecutor().execute(StorageStatements.INSTANCE.isTemplateExists(templateHash, new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$isTemplateExists$executionResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Ref$BooleanRef.this.element = z;
            }
        }));
        if (!execute.isSuccessful() && !execute.getErrors().isEmpty()) {
            throw toStorageException$default(this, (Exception) CollectionsKt.first((List) execute.getErrors()), "Check template " + templateHash + " exists", null, 2, null);
        }
        return ref$BooleanRef.element;
    }

    @Override // com.yandex.div.storage.DivStorage
    @NotNull
    public DivStorage.LoadDataResult<DivStorage.TemplateReference> readTemplateReferences() {
        DivStorage.LoadDataResult<DivStorage.TemplateReference> loadDataResult;
        try {
            ReadState readStateFor = readStateFor(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$readTemplateReferences$readState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Cursor invoke(@NotNull DatabaseOpenHelper.Database database) {
                    return database.query(StorageSchema.TABLE_TEMPLATE_REFERENCES, null, null, null, null, null, null, null);
                }
            });
            try {
                List<DivStorage.TemplateReference> templateReferences = getTemplateReferences(readStateFor.getCursor());
                CloseableKt.closeFinally(readStateFor, null);
                return new DivStorage.LoadDataResult<>(templateReferences, null, 2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(readStateFor, th);
                    throw th2;
                }
            }
        } catch (SQLException e) {
            loadDataResult = new DivStorage.LoadDataResult<>(CollectionsKt.emptyList(), CollectionsKt.listOf(toStorageException$default(this, e, "Template references", null, 2, null)));
            return loadDataResult;
        } catch (IllegalStateException e2) {
            loadDataResult = new DivStorage.LoadDataResult<>(CollectionsKt.emptyList(), CollectionsKt.listOf(toStorageException$default(this, e2, "Template references", null, 2, null)));
            return loadDataResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DivStorage.RestoredRawData getRestoredRawData(Cursor cursor, List<StorageException> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String string = cursor.getString(indexOf(cursor, StorageSchema.COLUMN_LAYOUT_ID));
        String string2 = cursor.getString(indexOf(cursor, "group_id"));
        int indexOf = indexOf(cursor, StorageSchema.COLUMN_CARD_DATA);
        byte[] blob = cursor.isNull(indexOf) ? null : cursor.getBlob(indexOf);
        int indexOf2 = indexOf(cursor, "metadata");
        byte[] blob2 = cursor.isNull(indexOf2) ? null : cursor.getBlob(indexOf2);
        if (blob == null) {
            list.add(new DivStorageErrorException("DivData is null for card with id " + string + '.', null, string, 2, null));
            return null;
        }
        try {
            jSONObject = toJSONObject(blob);
        } catch (JSONException e) {
            list.add(new DivStorageErrorException("DivData is invalid for card with id " + string, e, string));
            jSONObject = null;
        }
        if (blob2 != null) {
            try {
                jSONObject2 = toJSONObject(blob2);
            } catch (JSONException e2) {
                list.add(new DivStorageErrorException("Metadata is invalid for card with id " + string, e2, string));
            }
            if (jSONObject != null) {
                return null;
            }
            return new DivStorage.RestoredRawData(string, jSONObject, jSONObject2, string2);
        }
        jSONObject2 = null;
        if (jSONObject != null) {
        }
    }

    private List<RawTemplateData> getTemplates(Cursor cursor) throws SQLException {
        if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new RawTemplateData(cursor.getString(indexOf(cursor, StorageSchema.COLUMN_TEMPLATE_HASH)), cursor.getBlob(indexOf(cursor, "template_data"))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    @AnyThread
    private Set<String> collectsRecordsFor(final Function1 predicate) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readData(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRecordsFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ReadState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ReadState readState) {
                Cursor cursor = readState.getCursor();
                if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    return;
                }
                do {
                    DivStorageImpl.CursorDrivenRawDataAndMetadata cursorDrivenRawDataAndMetadata = DivStorageImpl.this.new CursorDrivenRawDataAndMetadata(cursor);
                    if (((Boolean) predicate.invoke(cursorDrivenRawDataAndMetadata)).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawDataAndMetadata.getId());
                    }
                    cursorDrivenRawDataAndMetadata.close();
                } while (cursor.moveToNext());
            }
        }));
        return linkedHashSet;
    }

    @AnyThread
    private List<RawJson> collectsRawJsons(final Set<String> rawJsonIds) throws SQLException {
        ArrayList arrayList = new ArrayList(rawJsonIds.size());
        ReadState readStateFor = readStateFor(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Cursor invoke(@NotNull DatabaseOpenHelper.Database database) {
                return database.rawQuery("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n " + DivStorageImpl.INSTANCE.asSqlList(rawJsonIds), new String[0]);
            }
        });
        try {
            Cursor cursor = readStateFor.getCursor();
            if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(cursor);
                    arrayList.add(new RawJson.Ready(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(readStateFor, null);
            return arrayList;
        } finally {
        }
    }

    @AnyThread
    private Set<String> collectsRawJsonsIdsFor(final Function1 predicate) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readRawJsons(new Function1() { // from class: com.yandex.div.storage.DivStorageImpl$collectsRawJsonsIdsFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ReadState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ReadState readState) {
                Cursor cursor = readState.getCursor();
                if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    return;
                }
                do {
                    DivStorageImpl.CursorDrivenRawJson cursorDrivenRawJson = DivStorageImpl.this.new CursorDrivenRawJson(cursor);
                    if (((Boolean) predicate.invoke(cursorDrivenRawJson)).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawJson.getId());
                    }
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
        }));
        return linkedHashSet;
    }

    @AnyThread
    private DivStorageErrorException deleteTablesTransaction(String actionDesc, String... queries) {
        DatabaseOpenHelper.Database writableDatabase = this.openHelper.getWritableDatabase();
        ArrayList arrayList = new ArrayList(queries.length);
        for (String str : queries) {
            arrayList.add(writableDatabase.compileStatement(str));
        }
        try {
            try {
                writableDatabase.beginTransaction();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SQLiteStatement) it.next()).executeUpdateDelete();
                }
                writableDatabase.setTransactionSuccessful();
                SqlExtensionsKt.endTransactionSilently(writableDatabase);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    SqlExtensionsKt.closeSilently((SQLiteStatement) it2.next());
                }
                SqlExtensionsKt.closeSilently(writableDatabase);
                return null;
            } catch (SQLException e) {
                DivStorageErrorException storageException$default = toStorageException$default(this, e, actionDesc, null, 2, null);
                SqlExtensionsKt.endTransactionSilently(writableDatabase);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    SqlExtensionsKt.closeSilently((SQLiteStatement) it3.next());
                }
                SqlExtensionsKt.closeSilently(writableDatabase);
                return storageException$default;
            }
        } catch (Throwable th) {
            SqlExtensionsKt.endTransactionSilently(writableDatabase);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                SqlExtensionsKt.closeSilently((SQLiteStatement) it4.next());
            }
            SqlExtensionsKt.closeSilently(writableDatabase);
            throw th;
        }
    }

    private List<DivStorage.TemplateReference> getTemplateReferences(Cursor cursor) throws SQLException {
        if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new DivStorage.TemplateReference(cursor.getString(indexOf(cursor, "group_id")), cursor.getString(indexOf(cursor, "template_id")), cursor.getString(indexOf(cursor, StorageSchema.COLUMN_TEMPLATE_HASH))));
        } while (cursor.moveToNext());
        return arrayList;
    }

    static /* synthetic */ DivStorageErrorException toStorageException$default(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toStorageException");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.toStorageException(exc, str, str2);
    }

    private DivStorageErrorException toStorageException(Exception exc, String str, String str2) {
        return new DivStorageErrorException("Unexpected exception on database access: " + str, exc, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivStorageImpl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$CursorDrivenRawDataAndMetadata;", "Lcom/yandex/div/storage/RawDataAndMetadata;", "Ljava/io/Closeable;", "cursor", "Landroid/database/Cursor;", "(Lcom/yandex/div/storage/DivStorageImpl;Landroid/database/Cursor;)V", "getCursor", "()Landroid/database/Cursor;", "cursorInvalid", "", "divData", "Lorg/json/JSONObject;", "getDivData", "()Lorg/json/JSONObject;", "divData$delegate", "Lkotlin/Lazy;", "id", "", "getId", "()Ljava/lang/String;", "metadata", "getMetadata", "metadata$delegate", "close", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class CursorDrivenRawDataAndMetadata implements RawDataAndMetadata, Closeable {

        @NotNull
        private final Cursor cursor;
        private boolean cursorInvalid;

        /* renamed from: divData$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy divData;

        @NotNull
        private final String id;

        /* renamed from: metadata$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy metadata;

        public CursorDrivenRawDataAndMetadata(@NotNull Cursor cursor) {
            this.cursor = cursor;
            String string = cursor.getString(DivStorageImpl.this.indexOf(cursor, StorageSchema.COLUMN_LAYOUT_ID));
            Intrinsics.checkNotNull(string);
            this.id = string;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.divData = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawDataAndMetadata$divData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final JSONObject mo4828invoke() {
                    boolean z;
                    JSONObject jSONObject;
                    z = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.cursorInvalid;
                    if (!z) {
                        jSONObject = r2.toJSONObject(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor().getBlob(r2.indexOf(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor(), StorageSchema.COLUMN_CARD_DATA)));
                        return jSONObject;
                    }
                    throw new IllegalStateException("Data no longer valid!");
                }
            });
            this.metadata = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawDataAndMetadata$metadata$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final JSONObject mo4828invoke() {
                    boolean z;
                    JSONObject jSONObject;
                    z = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.cursorInvalid;
                    if (z) {
                        throw new IllegalStateException("Data no longer valid!");
                    }
                    Cursor cursor2 = DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor();
                    int indexOf = r2.indexOf(DivStorageImpl.CursorDrivenRawDataAndMetadata.this.getCursor(), "metadata");
                    byte[] blob = cursor2.isNull(indexOf) ? null : cursor2.getBlob(indexOf);
                    if (blob == null) {
                        return null;
                    }
                    jSONObject = r2.toJSONObject(blob);
                    return jSONObject;
                }
            });
        }

        @NotNull
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @NotNull
        public JSONObject getDivData() {
            return (JSONObject) this.divData.getValue();
        }

        @Override // com.yandex.div.storage.RawDataAndMetadata
        @Nullable
        public JSONObject getMetadata() {
            return (JSONObject) this.metadata.getValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivStorageImpl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$CursorDrivenRawJson;", "Lcom/yandex/div/storage/rawjson/RawJson;", "Ljava/io/Closeable;", "cursor", "Landroid/database/Cursor;", "(Lcom/yandex/div/storage/DivStorageImpl;Landroid/database/Cursor;)V", "getCursor", "()Landroid/database/Cursor;", "cursorInvalid", "", "data", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "data$delegate", "Lkotlin/Lazy;", "id", "", "getId", "()Ljava/lang/String;", "close", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class CursorDrivenRawJson implements RawJson, Closeable {

        @NotNull
        private final Cursor cursor;
        private boolean cursorInvalid;

        /* renamed from: data$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy data;

        @NotNull
        private final String id;

        public CursorDrivenRawJson(@NotNull Cursor cursor) {
            this.cursor = cursor;
            this.id = cursor.getString(DivStorageImpl.this.indexOf(cursor, StorageSchema.COLUMN_RAW_JSON_ID));
            this.data = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawJson$data$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final JSONObject mo4828invoke() {
                    boolean z;
                    JSONObject jSONObject;
                    z = DivStorageImpl.CursorDrivenRawJson.this.cursorInvalid;
                    if (!z) {
                        jSONObject = r2.toJSONObject(DivStorageImpl.CursorDrivenRawJson.this.getCursor().getBlob(r2.indexOf(DivStorageImpl.CursorDrivenRawJson.this.getCursor(), StorageSchema.COLUMN_RAW_JSON_DATA)));
                        return jSONObject;
                    }
                    throw new IllegalStateException("Data no longer valid!");
                }
            });
        }

        @NotNull
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return (JSONObject) this.data.getValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }
    }

    @AnyThread
    private ReadState readStateFor(final Function1 func) {
        final DatabaseOpenHelper.Database readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new Function0() { // from class: com.yandex.div.storage.DivStorageImpl$readStateFor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                SqlExtensionsKt.closeSilently(DatabaseOpenHelper.Database.this);
            }
        }, new Provider() { // from class: com.yandex.div.storage.DivStorageImpl$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                Cursor readStateFor$lambda$12;
                readStateFor$lambda$12 = DivStorageImpl.readStateFor$lambda$12(DatabaseOpenHelper.Database.this, func);
                return readStateFor$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor readStateFor$lambda$12(DatabaseOpenHelper.Database database, Function1 function1) {
        return (Cursor) function1.invoke(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException("Column '" + str + "' not found in cursor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJSONObject(byte[] bArr) {
        return new JSONObject(new String(bArr, StandardCharsets.UTF_8));
    }

    /* compiled from: DivStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/DivStorageImpl$Companion;", "", "()V", "asSqlList", "", "T", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String asSqlList(Collection<? extends T> collection) {
            return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
        }
    }
}
