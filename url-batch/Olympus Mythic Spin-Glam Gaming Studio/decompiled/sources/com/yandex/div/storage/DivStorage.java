package com.yandex.div.storage;

import androidx.annotation.AnyThread;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.templates.RawTemplateData;
import com.yandex.div.storage.templates.Template;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivStorage.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u00041234J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH&J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H'J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011H&J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H'J\u001c\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\n0\"H'J\n\u0010$\u001a\u0004\u0018\u00010%H'J\n\u0010&\u001a\u0004\u0018\u00010%H'J\u001c\u0010'\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\"H'J4\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00142\u0006\u0010-\u001a\u00020.H'J\u001e\u0010/\u001a\u00020)2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010-\u001a\u00020.H'R*\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorage;", "", "migrations", "", "Lkotlin/Pair;", "", "Lcom/yandex/div/storage/database/Migration;", "getMigrations", "()Ljava/util/Map;", "isCardExists", "", "id", "", NotificationCategory.GROUP_ID_KEY, "isTemplateExists", "templateHash", "loadData", "Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "Lcom/yandex/div/storage/DivStorage$RestoredRawData;", "ids", "", "idsToExclude", "readRawJsons", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsonIds", "", "readTemplateReferences", "Lcom/yandex/div/storage/DivStorage$TemplateReference;", "readTemplates", "Lcom/yandex/div/storage/templates/RawTemplateData;", "templateHashes", "remove", "Lcom/yandex/div/storage/DivStorage$RemoveResult;", "predicate", "Lkotlin/Function1;", "Lcom/yandex/div/storage/RawDataAndMetadata;", "removeAllCards", "Lcom/yandex/div/storage/DivStorageErrorException;", "removeAllTemplates", "removeRawJsons", "saveData", "Lcom/yandex/div/storage/database/ExecutionResult;", "divs", "templatesByHash", "Lcom/yandex/div/storage/templates/Template;", "actionOnError", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "saveRawJsons", "rawJsons", "LoadDataResult", "RemoveResult", "RestoredRawData", "TemplateReference", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DivStorage {
    @NotNull
    Map<Pair<Integer, Integer>, Migration> getMigrations();

    boolean isCardExists(@NotNull String id, @NotNull String groupId) throws DivStorageErrorException;

    boolean isTemplateExists(@NotNull String templateHash) throws DivStorageErrorException;

    @AnyThread
    @NotNull
    LoadDataResult<RestoredRawData> loadData(@NotNull List<String> ids, @NotNull List<String> idsToExclude);

    @AnyThread
    @NotNull
    LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> rawJsonIds);

    @NotNull
    LoadDataResult<TemplateReference> readTemplateReferences();

    @AnyThread
    @NotNull
    LoadDataResult<RawTemplateData> readTemplates(@NotNull Set<String> templateHashes);

    @AnyThread
    @NotNull
    RemoveResult remove(@NotNull Function1 predicate);

    @AnyThread
    @Nullable
    DivStorageErrorException removeAllCards();

    @AnyThread
    @Nullable
    DivStorageErrorException removeAllTemplates();

    @AnyThread
    @NotNull
    RemoveResult removeRawJsons(@NotNull Function1 predicate);

    @AnyThread
    @NotNull
    ExecutionResult saveData(@NotNull String groupId, @NotNull List<? extends RawDataAndMetadata> divs, @NotNull List<Template> templatesByHash, @NotNull DivDataRepository.ActionOnError actionOnError);

    @AnyThread
    @NotNull
    ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError);

    /* compiled from: DivStorage.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/storage/DivStorage$RestoredRawData;", "", "id", "", "divData", "Lorg/json/JSONObject;", "metadata", NotificationCategory.GROUP_ID_KEY, "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)V", "getDivData", "()Lorg/json/JSONObject;", "getGroupId$div_storage_release", "()Ljava/lang/String;", "getId", "getMetadata", "component1", "component2", "component3", "component4", "component4$div_storage_release", "copy", "equals", "", "other", "hashCode", "", "toString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RestoredRawData {

        @NotNull
        private final JSONObject divData;

        @NotNull
        private final String groupId;

        @NotNull
        private final String id;

        @Nullable
        private final JSONObject metadata;

        public static /* synthetic */ RestoredRawData copy$default(RestoredRawData restoredRawData, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restoredRawData.id;
            }
            if ((i & 2) != 0) {
                jSONObject = restoredRawData.divData;
            }
            if ((i & 4) != 0) {
                jSONObject2 = restoredRawData.metadata;
            }
            if ((i & 8) != 0) {
                str2 = restoredRawData.groupId;
            }
            return restoredRawData.copy(str, jSONObject, jSONObject2, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final JSONObject getDivData() {
            return this.divData;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        @NotNull
        /* renamed from: component4$div_storage_release, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        @NotNull
        public final RestoredRawData copy(@NotNull String id, @NotNull JSONObject divData, @Nullable JSONObject metadata, @NotNull String groupId) {
            return new RestoredRawData(id, divData, metadata, groupId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestoredRawData)) {
                return false;
            }
            RestoredRawData restoredRawData = (RestoredRawData) other;
            return Intrinsics.areEqual(this.id, restoredRawData.id) && Intrinsics.areEqual(this.divData, restoredRawData.divData) && Intrinsics.areEqual(this.metadata, restoredRawData.metadata) && Intrinsics.areEqual(this.groupId, restoredRawData.groupId);
        }

        public int hashCode() {
            int hashCode = ((this.id.hashCode() * 31) + this.divData.hashCode()) * 31;
            JSONObject jSONObject = this.metadata;
            return ((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + this.groupId.hashCode();
        }

        @NotNull
        public String toString() {
            return "RestoredRawData(id=" + this.id + ", divData=" + this.divData + ", metadata=" + this.metadata + ", groupId=" + this.groupId + ')';
        }

        public RestoredRawData(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull String str2) {
            this.id = str;
            this.divData = jSONObject;
            this.metadata = jSONObject2;
            this.groupId = str2;
        }

        public /* synthetic */ RestoredRawData(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, jSONObject, (i & 4) != 0 ? null : jSONObject2, str2);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final JSONObject getDivData() {
            return this.divData;
        }

        @Nullable
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final String getGroupId$div_storage_release() {
            return this.groupId;
        }
    }

    /* compiled from: DivStorage.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0096\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003J/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/storage/DivStorage$LoadDataResult;", "T", "", "restoredData", "", "errors", "Lcom/yandex/div/storage/database/StorageException;", "(Ljava/util/List;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getRestoredData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static /* data */ class LoadDataResult<T> {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final List<T> restoredData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadDataResult copy$default(LoadDataResult loadDataResult, List list, List list2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
            }
            if ((i & 1) != 0) {
                list = loadDataResult.getRestoredData();
            }
            if ((i & 2) != 0) {
                list2 = loadDataResult.getErrors();
            }
            return loadDataResult.copy(list, list2);
        }

        @NotNull
        public final List<T> component1() {
            return getRestoredData();
        }

        @NotNull
        public final List<StorageException> component2() {
            return getErrors();
        }

        @NotNull
        public final LoadDataResult<T> copy(@NotNull List<? extends T> restoredData, @NotNull List<? extends StorageException> errors) {
            return new LoadDataResult<>(restoredData, errors);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) other;
            return Intrinsics.areEqual(getRestoredData(), loadDataResult.getRestoredData()) && Intrinsics.areEqual(getErrors(), loadDataResult.getErrors());
        }

        public int hashCode() {
            return (getRestoredData().hashCode() * 31) + getErrors().hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(@NotNull List<? extends T> list, @NotNull List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }

        @NotNull
        public List<T> getRestoredData() {
            return this.restoredData;
        }

        public /* synthetic */ LoadDataResult(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
        }

        @NotNull
        public List<StorageException> getErrors() {
            return this.errors;
        }
    }

    /* compiled from: DivStorage.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/DivStorage$RemoveResult;", "", "ids", "", "", "errors", "", "Lcom/yandex/div/storage/database/StorageException;", "(Ljava/util/Set;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RemoveResult {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final Set<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RemoveResult copy$default(RemoveResult removeResult, Set set, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                set = removeResult.ids;
            }
            if ((i & 2) != 0) {
                list = removeResult.errors;
            }
            return removeResult.copy(set, list);
        }

        @NotNull
        public final Set<String> component1() {
            return this.ids;
        }

        @NotNull
        public final List<StorageException> component2() {
            return this.errors;
        }

        @NotNull
        public final RemoveResult copy(@NotNull Set<String> ids, @NotNull List<? extends StorageException> errors) {
            return new RemoveResult(ids, errors);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) other;
            return Intrinsics.areEqual(this.ids, removeResult.ids) && Intrinsics.areEqual(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return (this.ids.hashCode() * 31) + this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(@NotNull Set<String> set, @NotNull List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }

        @NotNull
        public final Set<String> getIds() {
            return this.ids;
        }

        public /* synthetic */ RemoveResult(Set set, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        @NotNull
        public final List<StorageException> getErrors() {
            return this.errors;
        }
    }

    /* compiled from: DivStorage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/storage/DivStorage$TemplateReference;", "", NotificationCategory.GROUP_ID_KEY, "", "templateId", "templateHash", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getTemplateHash", "getTemplateId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TemplateReference {

        @NotNull
        private final String groupId;

        @NotNull
        private final String templateHash;

        @NotNull
        private final String templateId;

        public static /* synthetic */ TemplateReference copy$default(TemplateReference templateReference, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = templateReference.groupId;
            }
            if ((i & 2) != 0) {
                str2 = templateReference.templateId;
            }
            if ((i & 4) != 0) {
                str3 = templateReference.templateHash;
            }
            return templateReference.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTemplateHash() {
            return this.templateHash;
        }

        @NotNull
        public final TemplateReference copy(@NotNull String groupId, @NotNull String templateId, @NotNull String templateHash) {
            return new TemplateReference(groupId, templateId, templateHash);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateReference)) {
                return false;
            }
            TemplateReference templateReference = (TemplateReference) other;
            return Intrinsics.areEqual(this.groupId, templateReference.groupId) && Intrinsics.areEqual(this.templateId, templateReference.templateId) && Intrinsics.areEqual(this.templateHash, templateReference.templateHash);
        }

        public int hashCode() {
            return (((this.groupId.hashCode() * 31) + this.templateId.hashCode()) * 31) + this.templateHash.hashCode();
        }

        @NotNull
        public String toString() {
            return "TemplateReference(groupId=" + this.groupId + ", templateId=" + this.templateId + ", templateHash=" + this.templateHash + ')';
        }

        public TemplateReference(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.groupId = str;
            this.templateId = str2;
            this.templateHash = str3;
        }

        @NotNull
        public final String getGroupId() {
            return this.groupId;
        }

        @NotNull
        public final String getTemplateId() {
            return this.templateId;
        }

        @NotNull
        public final String getTemplateHash() {
            return this.templateHash;
        }
    }
}
