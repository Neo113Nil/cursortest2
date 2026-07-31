package com.mobilefuse.sdk.controllers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Placement.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/controllers/ParsedPlacementId;", "", "placemenId", "", "isTestMode", "", "(Ljava/lang/String;Z)V", "()Z", "getPlacemenId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final /* data */ class ParsedPlacementId {
    private final boolean isTestMode;

    @NotNull
    private final String placemenId;

    public static /* synthetic */ ParsedPlacementId copy$default(ParsedPlacementId parsedPlacementId, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedPlacementId.placemenId;
        }
        if ((i & 2) != 0) {
            z = parsedPlacementId.isTestMode;
        }
        return parsedPlacementId.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlacemenId() {
        return this.placemenId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public final ParsedPlacementId copy(@NotNull String placemenId, boolean isTestMode) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        return new ParsedPlacementId(placemenId, isTestMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedPlacementId)) {
            return false;
        }
        ParsedPlacementId parsedPlacementId = (ParsedPlacementId) other;
        return Intrinsics.areEqual(this.placemenId, parsedPlacementId.placemenId) && this.isTestMode == parsedPlacementId.isTestMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.placemenId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isTestMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "ParsedPlacementId(placemenId=" + this.placemenId + ", isTestMode=" + this.isTestMode + ")";
    }

    public ParsedPlacementId(@NotNull String placemenId, boolean z) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        this.placemenId = placemenId;
        this.isTestMode = z;
    }

    @NotNull
    public final String getPlacemenId() {
        return this.placemenId;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }
}
