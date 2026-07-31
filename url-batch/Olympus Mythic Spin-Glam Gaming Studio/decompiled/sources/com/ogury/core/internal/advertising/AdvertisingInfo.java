package com.ogury.core.internal.advertising;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/ogury/core/internal/advertising/AdvertisingInfo;", "", "id", "", "isAdTrackingEnabled", "", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdvertisingInfo {

    @NotNull
    private final String id;
    private final boolean isAdTrackingEnabled;

    public AdvertisingInfo(@NotNull String id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.isAdTrackingEnabled = z;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* renamed from: isAdTrackingEnabled, reason: from getter */
    public final boolean getIsAdTrackingEnabled() {
        return this.isAdTrackingEnabled;
    }
}
