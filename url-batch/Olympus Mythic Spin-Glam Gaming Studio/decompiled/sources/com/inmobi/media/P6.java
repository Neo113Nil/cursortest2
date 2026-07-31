package com.inmobi.media;

import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* loaded from: classes11.dex */
public abstract class P6 {
    public static final boolean a(String str) {
        return str == null || StringsKt.trim(str).toString().length() == 0 || !(StringsKt.startsWith$default(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, false, 2, (Object) null) || StringsKt.startsWith$default(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u, false, 2, (Object) null));
    }

    public static final void a(HandlerThread handlerThread, String name) {
        Intrinsics.checkNotNullParameter(handlerThread, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            handlerThread.start();
        } catch (InternalError e) {
            e.toString();
        }
    }

    public static final void a(Job job) {
        if (job == null || !job.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, null, 1, null);
    }
}
