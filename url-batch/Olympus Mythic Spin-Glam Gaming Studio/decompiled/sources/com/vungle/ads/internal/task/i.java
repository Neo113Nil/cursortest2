package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class i implements n {
    public final int a(f jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.e() - 2)) + 10);
    }
}
