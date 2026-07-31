package com.yandex.div.storage;

import androidx.annotation.AnyThread;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivDataRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\u0003H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository;", "", "get", "Lcom/yandex/div/storage/DivDataRepositoryResult;", "ids", "", "", "getAll", "put", "payload", "Lcom/yandex/div/storage/DivDataRepository$Payload;", "remove", "Lcom/yandex/div/storage/DivDataRepositoryRemoveResult;", "predicate", "Lkotlin/Function1;", "Lcom/yandex/div/storage/RawDataAndMetadata;", "", "ActionOnError", "DivDataWithMeta", "Payload", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DivDataRepository {

    /* compiled from: DivDataRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "", "(Ljava/lang/String;I)V", "ABORT_TRANSACTION", "SKIP_ELEMENT", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ActionOnError {
        ABORT_TRANSACTION,
        SKIP_ELEMENT
    }

    @AnyThread
    @NotNull
    DivDataRepositoryResult get(@NotNull List<String> ids);

    @AnyThread
    @NotNull
    DivDataRepositoryResult getAll();

    @AnyThread
    @NotNull
    DivDataRepositoryResult put(@NotNull Payload payload);

    @AnyThread
    @NotNull
    DivDataRepositoryRemoveResult remove(@NotNull Function1 predicate);

    /* compiled from: DivDataRepository.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$DivDataWithMeta;", "", "id", "", "divData", "Lcom/yandex/div2/DivData;", "metadata", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lcom/yandex/div2/DivData;Lorg/json/JSONObject;)V", "getDivData", "()Lcom/yandex/div2/DivData;", "getId", "()Ljava/lang/String;", "getMetadata", "()Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DivDataWithMeta {

        @NotNull
        private final DivData divData;

        @NotNull
        private final String id;

        @Nullable
        private final JSONObject metadata;

        public DivDataWithMeta(@NotNull String str, @NotNull DivData divData, @Nullable JSONObject jSONObject) {
            this.id = str;
            this.divData = divData;
            this.metadata = jSONObject;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final DivData getDivData() {
            return this.divData;
        }

        @Nullable
        public final JSONObject getMetadata() {
            return this.metadata;
        }
    }

    /* compiled from: DivDataRepository.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$Payload;", "", "divs", "", "Lcom/yandex/div/storage/RawDataAndMetadata;", "templates", "", "", "Lorg/json/JSONObject;", "sourceType", "actionOnError", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)V", "getActionOnError", "()Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "getDivs", "()Ljava/util/List;", "getSourceType", "()Ljava/lang/String;", "getTemplates", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Payload {

        @NotNull
        private final ActionOnError actionOnError;

        @NotNull
        private final List<RawDataAndMetadata> divs;

        @Nullable
        private final String sourceType;

        @NotNull
        private final Map<String, JSONObject> templates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, List list, Map map, String str, ActionOnError actionOnError, int i, Object obj) {
            if ((i & 1) != 0) {
                list = payload.divs;
            }
            if ((i & 2) != 0) {
                map = payload.templates;
            }
            if ((i & 4) != 0) {
                str = payload.sourceType;
            }
            if ((i & 8) != 0) {
                actionOnError = payload.actionOnError;
            }
            return payload.copy(list, map, str, actionOnError);
        }

        @NotNull
        public final List<RawDataAndMetadata> component1() {
            return this.divs;
        }

        @NotNull
        public final Map<String, JSONObject> component2() {
            return this.templates;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        @NotNull
        public final Payload copy(@NotNull List<? extends RawDataAndMetadata> divs, @NotNull Map<String, ? extends JSONObject> templates, @Nullable String sourceType, @NotNull ActionOnError actionOnError) {
            return new Payload(divs, templates, sourceType, actionOnError);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.divs, payload.divs) && Intrinsics.areEqual(this.templates, payload.templates) && Intrinsics.areEqual(this.sourceType, payload.sourceType) && this.actionOnError == payload.actionOnError;
        }

        public int hashCode() {
            int hashCode = ((this.divs.hashCode() * 31) + this.templates.hashCode()) * 31;
            String str = this.sourceType;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.actionOnError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(divs=" + this.divs + ", templates=" + this.templates + ", sourceType=" + this.sourceType + ", actionOnError=" + this.actionOnError + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@NotNull List<? extends RawDataAndMetadata> list, @NotNull Map<String, ? extends JSONObject> map, @Nullable String str, @NotNull ActionOnError actionOnError) {
            this.divs = list;
            this.templates = map;
            this.sourceType = str;
            this.actionOnError = actionOnError;
        }

        @NotNull
        public final List<RawDataAndMetadata> getDivs() {
            return this.divs;
        }

        public /* synthetic */ Payload(List list, Map map, String str, ActionOnError actionOnError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ActionOnError.ABORT_TRANSACTION : actionOnError);
        }

        @NotNull
        public final Map<String, JSONObject> getTemplates() {
            return this.templates;
        }

        @Nullable
        public final String getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final ActionOnError getActionOnError() {
            return this.actionOnError;
        }
    }
}
