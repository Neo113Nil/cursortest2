package com.mobilefuse.sdk.service;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseServices.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/service/ServicesInitError;", "", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final /* data */ class ServicesInitError {

    @NotNull
    private final String reason;

    public static /* synthetic */ ServicesInitError copy$default(ServicesInitError servicesInitError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesInitError.reason;
        }
        return servicesInitError.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final ServicesInitError copy(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ServicesInitError(reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ServicesInitError) && Intrinsics.areEqual(this.reason, ((ServicesInitError) other).reason);
        }
        return true;
    }

    public int hashCode() {
        String str = this.reason;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ServicesInitError(reason=" + this.reason + ")";
    }

    public ServicesInitError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }
}
