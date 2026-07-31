package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BackgroundWorker.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "workManager", "Landroidx/work/WorkManager;", "getWorkManager", "()Landroidx/work/WorkManager;", "invoke", "", "T", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "universalRequestWorkerData", "Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BackgroundWorker {

    @NotNull
    public static final String TAG = "UnityAdsBackgroundWorker";

    @NotNull
    private final WorkManager workManager;

    public BackgroundWorker(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(applicationContext);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        this.workManager = workManager;
    }

    @NotNull
    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        Intrinsics.checkNotNullParameter(universalRequestWorkerData, "universalRequestWorkerData");
        Intrinsics.reifiedOperationMarker(4, "T");
        WorkRequest build = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(ListenableWorker.class).setInputData(universalRequestWorkerData.invoke())).addTag(TAG)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        getWorkManager().enqueue((OneTimeWorkRequest) build);
    }
}
