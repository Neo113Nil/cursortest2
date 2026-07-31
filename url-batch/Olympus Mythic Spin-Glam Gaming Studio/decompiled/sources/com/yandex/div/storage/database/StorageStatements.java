package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.storage.RawDataAndMetadata;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.templates.Template;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: StorageStatements.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b!\u0010 J)\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b.\u0010-J#\u0010/\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatements;", "", "<init>", "()V", "T", "", "", "asSqlList", "(Ljava/util/Collection;)Ljava/lang/String;", "", "Lcom/yandex/div/storage/templates/Template;", "templates", "Lcom/yandex/div/storage/database/StorageStatement;", "writeTemplates", "(Ljava/util/List;)Lcom/yandex/div/storage/database/StorageStatement;", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsons", "Lkotlin/Function1;", "", "onFailedTransactions", "replaceRawJsons", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", NotificationCategory.GROUP_ID_KEY, "Lcom/yandex/div/storage/RawDataAndMetadata;", StorageSchema.TABLE_CARDS, "replaceCards", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "deleteTemplatesWithoutLinksToCards", "()Lcom/yandex/div/storage/database/StorageStatement;", "", "elementIds", "deleteCardsAndTemplates", "(Ljava/util/Set;)Lcom/yandex/div/storage/database/StorageStatement;", "deleteRawJsons", "templateHash", "", "result", "isTemplateExists", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "cardId", "isCardExists", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "Lcom/yandex/div/storage/database/ReadState;", "reader", "readData", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/StorageStatement;", "readRawJsons", "writeTemplatesUsages", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/div/storage/database/StorageStatement;", "dropAllTables", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StorageStatements {

    @NotNull
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    @NotNull
    public final StorageStatement writeTemplates(@NotNull final List<Template> templates) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$writeTemplates$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                SQLiteStatement compileStatement = compiler.compileStatement(StorageQueries.INSERT_TEMPLATE);
                for (Template template : templates) {
                    compileStatement.bindString(1, template.getHash());
                    byte[] bytes = template.getTemplate().toString().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    compileStatement.bindBlob(2, bytes);
                    compileStatement.executeInsert();
                }
            }

            @NotNull
            public String toString() {
                return "Write templates " + CollectionsKt.joinToString$default(templates, null, null, null, 0, null, new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$writeTemplates$1$toString$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final CharSequence invoke(@NotNull Template template) {
                        return template.getId() + '/' + template.getHash();
                    }
                }, 31, null);
            }
        };
    }

    public static /* synthetic */ StorageStatement replaceRawJsons$default(StorageStatements storageStatements, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((List<String>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<String> list2) {
                    throw new SQLException("Insertion failed for raw jsons with ids: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, null, 63, null));
                }
            };
        }
        return storageStatements.replaceRawJsons(list, function1);
    }

    @NotNull
    public final StorageStatement replaceRawJsons(@NotNull final List<? extends RawJson> rawJsons, @NotNull final Function1 onFailedTransactions) {
        return new StorageStatement(rawJsons, onFailedTransactions) { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2
            final /* synthetic */ Function1 $onFailedTransactions;
            final /* synthetic */ List<RawJson> $rawJsons;

            /* renamed from: cardIdsString$delegate, reason: from kotlin metadata */
            @NotNull
            private final Lazy cardIdsString;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$rawJsons = rawJsons;
                this.$onFailedTransactions = onFailedTransactions;
                this.cardIdsString = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return CollectionsKt.joinToString$default(rawJsons, null, null, null, 0, null, new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final CharSequence invoke(@NotNull RawJson rawJson) {
                                return rawJson.getId();
                            }
                        }, 31, null);
                    }
                });
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ArrayList arrayList = new ArrayList();
                SQLiteStatement compileStatement = compiler.compileStatement(StorageQueries.REPLACE_RAW_JSON);
                for (RawJson rawJson : this.$rawJsons) {
                    compileStatement.bindString(1, rawJson.getId());
                    byte[] bytes = rawJson.getData().toString().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    compileStatement.bindBlob(2, bytes);
                    Long valueOf = Long.valueOf(compileStatement.executeInsert());
                    if (valueOf.longValue() >= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(rawJson.getId());
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.$onFailedTransactions.invoke(arrayList);
            }

            @NotNull
            public String toString() {
                return "Replace raw jsons (" + getCardIdsString() + ')';
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString.getValue();
            }
        };
    }

    public static /* synthetic */ StorageStatement replaceCards$default(StorageStatements storageStatements, String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((List<String>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<String> list2) {
                    throw new SQLException("Insertion failed for cards with ids: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, null, 63, null));
                }
            };
        }
        return storageStatements.replaceCards(str, list, function1);
    }

    @NotNull
    public final StorageStatement replaceCards(@NotNull final String groupId, @NotNull final List<? extends RawDataAndMetadata> cards, @NotNull final Function1 onFailedTransactions) {
        return new StorageStatement(cards, onFailedTransactions, groupId) { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2
            final /* synthetic */ List<RawDataAndMetadata> $cards;
            final /* synthetic */ String $groupId;
            final /* synthetic */ Function1 $onFailedTransactions;

            /* renamed from: cardIdsString$delegate, reason: from kotlin metadata */
            @NotNull
            private final Lazy cardIdsString;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$cards = cards;
                this.$onFailedTransactions = onFailedTransactions;
                this.$groupId = groupId;
                this.cardIdsString = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2$cardIdsString$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return CollectionsKt.joinToString$default(cards, null, null, null, 0, null, new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2$cardIdsString$2.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final CharSequence invoke(@NotNull RawDataAndMetadata rawDataAndMetadata) {
                                return rawDataAndMetadata.getId();
                            }
                        }, 31, null);
                    }
                });
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString.getValue();
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                byte[] bArr;
                final ArrayList arrayList = new ArrayList();
                SQLiteStatement compileStatement = compiler.compileStatement(StorageQueries.REPLACE_CARD);
                List<RawDataAndMetadata> list = this.$cards;
                String str = this.$groupId;
                for (RawDataAndMetadata rawDataAndMetadata : list) {
                    final String id = rawDataAndMetadata.getId();
                    Function1 function1 = new Function1() { // from class: com.yandex.div.storage.database.StorageStatements$replaceCards$2$execute$1$errorHandler$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Exception) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Exception exc) {
                            arrayList.add(id);
                            exc.printStackTrace();
                        }
                    };
                    byte[] byteArrayCatching = toByteArrayCatching(rawDataAndMetadata.getDivData(), function1);
                    if (byteArrayCatching != null) {
                        JSONObject metadata = rawDataAndMetadata.getMetadata();
                        if (metadata != null) {
                            bArr = toByteArrayCatching(metadata, function1);
                            if (bArr == null) {
                            }
                        } else {
                            bArr = null;
                        }
                        compileStatement.bindString(1, id);
                        SqlExtensionsKt.bindNullableBlob(compileStatement, 2, byteArrayCatching);
                        SqlExtensionsKt.bindNullableBlob(compileStatement, 3, bArr);
                        compileStatement.bindString(4, str);
                        Long valueOf = Long.valueOf(compileStatement.executeInsert());
                        if ((valueOf.longValue() < 0 ? valueOf : null) != null) {
                            arrayList.add(id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.$onFailedTransactions.invoke(arrayList);
            }

            @NotNull
            public String toString() {
                return "Replace cards (" + getCardIdsString() + ")}";
            }

            private final byte[] toByteArrayCatching(JSONObject jSONObject, Function1 function1) {
                try {
                    byte[] bytes = jSONObject.toString().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    return bytes;
                } catch (ConcurrentModificationException e) {
                    function1.invoke(e);
                    return null;
                }
            }
        };
    }

    @NotNull
    public final StorageStatement deleteTemplatesWithoutLinksToCards() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$deleteTemplatesWithoutLinksToCards$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                compiler.compileStatement(StorageQueries.DELETE_UNUSED_TEMPLATE_REFERENCES).executeUpdateDelete();
                compiler.compileStatement(StorageQueries.DELETE_UNUSED_TEMPLATES).executeUpdateDelete();
            }

            @NotNull
            public String toString() {
                return "Deleting unused templates";
            }
        };
    }

    @NotNull
    public final StorageStatement deleteCardsAndTemplates(@NotNull final Set<String> elementIds) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$deleteCardsAndTemplates$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                String asSqlList;
                String asSqlList2;
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM cards WHERE layout_id IN  ");
                StorageStatements storageStatements = StorageStatements.INSTANCE;
                asSqlList = storageStatements.asSqlList(elementIds);
                sb.append(asSqlList);
                SQLiteStatement compileStatement = compiler.compileStatement(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n    DELETE FROM template_references WHERE group_id IN\n ");
                asSqlList2 = storageStatements.asSqlList(elementIds);
                sb2.append(asSqlList2);
                SQLiteStatement compileStatement2 = compiler.compileStatement(sb2.toString());
                compileStatement.executeUpdateDelete();
                compileStatement2.executeUpdateDelete();
            }

            @NotNull
            public String toString() {
                return "Deleting cards with ids: " + elementIds;
            }
        };
    }

    @NotNull
    public final StorageStatement deleteRawJsons(@NotNull final Set<String> elementIds) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$deleteRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                String asSqlList;
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM raw_json WHERE raw_json_id IN ");
                asSqlList = StorageStatements.INSTANCE.asSqlList(elementIds);
                sb.append(asSqlList);
                compiler.compileStatement(sb.toString()).executeUpdateDelete();
            }

            @NotNull
            public String toString() {
                return "Deleting raw jsons with ids: " + elementIds;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String asSqlList(Collection<? extends T> collection) {
        return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
    }

    @NotNull
    public final StorageStatement isTemplateExists(@NotNull final String templateHash, @NotNull final Function1 result) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$isTemplateExists$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ReadState compileQuery = compiler.compileQuery("SELECT 1 FROM templates WHERE template_hash == '" + templateHash + "' ", new String[0]);
                try {
                    result.invoke(Boolean.valueOf(compileQuery.getCursor().getCount() > 0));
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(compileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Check template '" + templateHash + "' exists in group";
            }
        };
    }

    @NotNull
    public final StorageStatement isCardExists(@NotNull final String cardId, @NotNull final String groupId, @NotNull final Function1 result) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$isCardExists$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ReadState compileQuery = compiler.compileQuery("SELECT 1 FROM cards WHERE layout_id == '" + cardId + "' AND group_id == '" + groupId + '\'', new String[0]);
                try {
                    result.invoke(Boolean.valueOf(compileQuery.getCursor().getCount() > 0));
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(compileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Check card '" + cardId + "' with group '" + groupId + "' exists";
            }
        };
    }

    @NotNull
    public final StorageStatement readData(@NotNull final Function1 reader) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$readData$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ReadState compileQuery = compiler.compileQuery("SELECT * FROM cards", new String[0]);
                try {
                    Function1.this.invoke(compileQuery);
                    CloseableKt.closeFinally(compileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Selecting all div data";
            }
        };
    }

    @NotNull
    public final StorageStatement readRawJsons(@NotNull final Function1 reader) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$readRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ReadState compileQuery = compiler.compileQuery("SELECT * FROM raw_json", new String[0]);
                try {
                    Function1.this.invoke(compileQuery);
                    CloseableKt.closeFinally(compileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Selecting all raw jsons";
            }
        };
    }

    @NotNull
    public final StorageStatement writeTemplatesUsages(@NotNull final String groupId, @NotNull final List<Template> templates) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$writeTemplatesUsages$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                SQLiteStatement compileStatement = compiler.compileStatement(StorageQueries.INSERT_TEMPLATE_USAGE);
                List<Template> list = templates;
                String str = groupId;
                for (Template template : list) {
                    compileStatement.bindString(1, str);
                    compileStatement.bindString(2, template.getId());
                    compileStatement.bindString(3, template.getHash());
                    compileStatement.executeInsert();
                }
            }

            @NotNull
            public String toString() {
                return "Write template usages for " + groupId;
            }
        };
    }

    @NotNull
    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$dropAllTables$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                ArrayList arrayList = new ArrayList();
                ReadState compileQuery = compiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = compileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        CloseableKt.closeFinally(compileQuery, null);
                        return;
                    }
                    do {
                        arrayList.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    } while (cursor.moveToNext());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(compileQuery, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        compiler.compileStatement("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                    }
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Drop all database tables";
            }
        };
    }
}
