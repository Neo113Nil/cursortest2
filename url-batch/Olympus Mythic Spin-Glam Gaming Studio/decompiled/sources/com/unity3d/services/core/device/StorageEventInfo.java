package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Storage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/core/device/StorageEventInfo;", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "value", "<init>", "(Lcom/unity3d/services/core/device/StorageEvent;Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/Object;)V", "getEventType", "()Lcom/unity3d/services/core/device/StorageEvent;", "getStorageType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StorageEventInfo {

    @NotNull
    private final StorageEvent eventType;

    @NotNull
    private final StorageManager.StorageType storageType;

    @Nullable
    private final Object value;

    public static /* synthetic */ StorageEventInfo copy$default(StorageEventInfo storageEventInfo, StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StorageEvent getEventType() {
        return this.eventType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final StorageEventInfo copy(@NotNull StorageEvent eventType, @NotNull StorageManager.StorageType storageType, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new StorageEventInfo(eventType, storageType, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageEventInfo)) {
            return false;
        }
        StorageEventInfo storageEventInfo = (StorageEventInfo) other;
        return this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && Intrinsics.areEqual(this.value, storageEventInfo.value);
    }

    public int hashCode() {
        int hashCode = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }

    public StorageEventInfo(@NotNull StorageEvent eventType, @NotNull StorageManager.StorageType storageType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    @NotNull
    public final StorageEvent getEventType() {
        return this.eventType;
    }

    @NotNull
    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }
}
