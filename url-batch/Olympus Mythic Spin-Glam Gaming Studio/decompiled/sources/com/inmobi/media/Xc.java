package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Xc {
    public final String a;
    public final List b;

    public Xc(String str, List trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = str;
        this.b = trackers;
    }
}
