package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public class Y extends RuntimeException {
    public final InMobiAdRequestStatus a;
    public final V b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus status, V adFetchError) {
        super(status.getMessage());
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adFetchError, "adFetchError");
        this.a = status;
        this.b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.a.getStatusCode() + ", statusMessage=" + this.a.getMessage() + ", adFetchError=" + this.b + ")";
    }
}
