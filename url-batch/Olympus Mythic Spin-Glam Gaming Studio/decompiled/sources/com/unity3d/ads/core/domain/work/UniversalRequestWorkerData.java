package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UniversalRequestWorkerData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "", UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "", "<init>", "(Ljava/lang/String;)V", "invoke", "Landroidx/work/Data;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UniversalRequestWorkerData {

    @NotNull
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";

    @NotNull
    private final String universalRequestId;

    public UniversalRequestWorkerData(@NotNull String universalRequestId) {
        Intrinsics.checkNotNullParameter(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    @NotNull
    public final Data invoke() {
        Data build = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
