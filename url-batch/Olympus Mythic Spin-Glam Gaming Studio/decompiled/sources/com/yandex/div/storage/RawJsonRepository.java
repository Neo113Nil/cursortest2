package com.yandex.div.storage;

import androidx.annotation.UiThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RawJsonRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\u0003H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepository;", "", "get", "Lcom/yandex/div/storage/RawJsonRepositoryResult;", "ids", "", "", "getAll", "put", "payload", "Lcom/yandex/div/storage/RawJsonRepository$Payload;", "remove", "Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "predicate", "Lkotlin/Function1;", "Lcom/yandex/div/storage/rawjson/RawJson;", "", "Payload", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface RawJsonRepository {
    @UiThread
    @NotNull
    RawJsonRepositoryResult get(@NotNull List<String> ids);

    @UiThread
    @NotNull
    RawJsonRepositoryResult getAll();

    @UiThread
    @NotNull
    RawJsonRepositoryResult put(@NotNull Payload payload);

    @UiThread
    @NotNull
    RawJsonRepositoryRemoveResult remove(@NotNull Function1 predicate);

    /* compiled from: RawJsonRepository.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepository$Payload;", "", "jsons", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "actionOnError", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)V", "getActionOnError", "()Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "getJsons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Payload {

        @NotNull
        private final DivDataRepository.ActionOnError actionOnError;

        @NotNull
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, List list, DivDataRepository.ActionOnError actionOnError, int i, Object obj) {
            if ((i & 1) != 0) {
                list = payload.jsons;
            }
            if ((i & 2) != 0) {
                actionOnError = payload.actionOnError;
            }
            return payload.copy(list, actionOnError);
        }

        @NotNull
        public final List<RawJson> component1() {
            return this.jsons;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        @NotNull
        public final Payload copy(@NotNull List<? extends RawJson> jsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
            return new Payload(jsons, actionOnError);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        public int hashCode() {
            return (this.jsons.hashCode() * 31) + this.actionOnError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }

        @NotNull
        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }

        @NotNull
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }
    }
}
