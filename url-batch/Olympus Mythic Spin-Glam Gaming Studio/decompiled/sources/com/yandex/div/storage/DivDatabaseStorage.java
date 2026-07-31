package com.yandex.div.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.storage.db.DatabaseOpenHelper;
import com.yandex.div.storage.db.TemplateDao;
import com.yandex.div.storage.db.TemplateDaoImpl;
import com.yandex.div.storage.db.TemplateUsageDao;
import com.yandex.div.storage.db.TemplateUsageDaoImpl;
import com.yandex.div.storage.entity.Template;
import com.yandex.div.storage.entity.TemplateUsage;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivDatabaseStorage.kt */
@PublicApi
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0017J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0006H\u0017J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0017J-\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0017¢\u0006\u0002\u0010$J$\u0010%\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0017J\u001b\u0010'\u001a\u00020\u0019*\u00020\t2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190)H\u0082\bR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/yandex/div/storage/DivDatabaseStorage;", "Lcom/yandex/div/storage/DivTemplateStorage;", "Ljava/io/Closeable;", "context", "Landroid/content/Context;", "databaseName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "database", "Landroid/database/sqlite/SQLiteDatabase;", "getDatabase", "()Landroid/database/sqlite/SQLiteDatabase;", "database$delegate", "Lkotlin/Lazy;", "templateDao", "Lcom/yandex/div/storage/db/TemplateDao;", "getTemplateDao", "()Lcom/yandex/div/storage/db/TemplateDao;", "templateDao$delegate", "templateUsageDao", "Lcom/yandex/div/storage/db/TemplateUsageDao;", "getTemplateUsageDao", "()Lcom/yandex/div/storage/db/TemplateUsageDao;", "templateUsageDao$delegate", "clear", "", "close", "deleteTemplates", "cardId", "readAllTemplates", "", "", "readTemplates", "readTemplatesByIds", "templateId", "", "([Ljava/lang/String;)Ljava/util/Map;", "writeTemplates", "templates", "inTransaction", "block", "Lkotlin/Function0;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivDatabaseStorage implements DivTemplateStorage, Closeable {

    /* renamed from: database$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy database;

    /* renamed from: templateDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy templateDao;

    /* renamed from: templateUsageDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy templateUsageDao;

    /* JADX WARN: Multi-variable type inference failed */
    public DivDatabaseStorage(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public DivDatabaseStorage(@NotNull final Context context, @NotNull final String str) {
        this.database = LazyKt.lazy(new Function0() { // from class: com.yandex.div.storage.DivDatabaseStorage$database$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final SQLiteDatabase mo4828invoke() {
                return new DatabaseOpenHelper(context, str).getWritableDatabase();
            }
        });
        this.templateDao = LazyKt.lazy(new Function0() { // from class: com.yandex.div.storage.DivDatabaseStorage$templateDao$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final TemplateDaoImpl mo4828invoke() {
                SQLiteDatabase database;
                database = DivDatabaseStorage.this.getDatabase();
                return new TemplateDaoImpl(database);
            }
        });
        this.templateUsageDao = LazyKt.lazy(new Function0() { // from class: com.yandex.div.storage.DivDatabaseStorage$templateUsageDao$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final TemplateUsageDaoImpl mo4828invoke() {
                SQLiteDatabase database;
                database = DivDatabaseStorage.this.getDatabase();
                return new TemplateUsageDaoImpl(database);
            }
        });
    }

    public /* synthetic */ DivDatabaseStorage(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "div.db" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase getDatabase() {
        return (SQLiteDatabase) this.database.getValue();
    }

    private final TemplateDao getTemplateDao() {
        return (TemplateDao) this.templateDao.getValue();
    }

    private final TemplateUsageDao getTemplateUsageDao() {
        return (TemplateUsageDao) this.templateUsageDao.getValue();
    }

    @WorkerThread
    @NotNull
    public final Map<String, byte[]> readAllTemplates() {
        List<Template> allTemplates = getTemplateDao().getAllTemplates();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allTemplates, 10)), 16));
        for (Template template : allTemplates) {
            Pair pair = TuplesKt.to(template.getId(), template.getData());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @WorkerThread
    @NotNull
    public Map<String, byte[]> readTemplates(@NotNull String cardId) {
        List<Template> templates = getTemplateDao().getTemplates(cardId);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(templates, 10)), 16));
        for (Template template : templates) {
            Pair pair = TuplesKt.to(template.getId(), template.getData());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @WorkerThread
    @NotNull
    public Map<String, byte[]> readTemplatesByIds(@NotNull String... templateId) {
        List<Template> templatesByIds = getTemplateDao().getTemplatesByIds(ArraysKt.toList(templateId));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(templatesByIds, 10)), 16));
        for (Template template : templatesByIds) {
            Pair pair = TuplesKt.to(template.getId(), template.getData());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @WorkerThread
    public void writeTemplates(@NotNull String cardId, @NotNull Map<String, byte[]> templates) {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateUsageDao().deleteTemplateUsages(cardId);
            for (Map.Entry<String, byte[]> entry : templates.entrySet()) {
                String key = entry.getKey();
                getTemplateDao().insertTemplate(new Template(key, entry.getValue()));
                getTemplateUsageDao().insertTemplateUsage(new TemplateUsage(cardId, key));
            }
            getTemplateDao().deleteUnusedTemplates();
            database.setTransactionSuccessful();
            database.endTransaction();
        } catch (Throwable th) {
            database.endTransaction();
            throw th;
        }
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @WorkerThread
    public void deleteTemplates(@NotNull String cardId) {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateUsageDao().deleteTemplateUsages(cardId);
            getTemplateDao().deleteUnusedTemplates();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @WorkerThread
    public void clear() {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateDao().deleteAllTemplates();
            getTemplateUsageDao().deleteAllTemplateUsages();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getDatabase().close();
    }

    private final void inTransaction(SQLiteDatabase sQLiteDatabase, Function0 function0) {
        sQLiteDatabase.beginTransaction();
        try {
            function0.mo4828invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            InlineMarker.finallyStart(1);
            sQLiteDatabase.endTransaction();
            InlineMarker.finallyEnd(1);
        }
    }
}
