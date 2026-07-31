package com.ogury.ad.internal;

import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public abstract class i {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static void a(String adId, Job job) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(job, "job");
        Logger.INSTANCE.d(LogTag.QUALITY, SourceTag.ADS, "Registering cancellation job for adId: " + adId);
        Job job2 = (Job) a.put(adId, job);
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
    }

    public static void b(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Logger.INSTANCE.d(LogTag.QUALITY, SourceTag.ADS, "Unregistering cancellation job for adId: " + adId);
        a.remove(adId);
    }

    public static void a(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Logger.INSTANCE.d(LogTag.QUALITY, SourceTag.ADS, "Cancelling ad quality check for adId: " + adId);
        Job job = (Job) a.remove(adId);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }
}
